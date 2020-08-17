package com.bip;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class DataParsher {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ClassLoader classLoader = DataParsher.class.getClassLoader();
	    String filePath = classLoader.getResource("data.csv").getFile();
		final CsvToBean<Student> beans = new CsvToBeanBuilder<Student>(new FileReader(filePath))
				.withType(Student.class).withIgnoreQuotations(true).withThrowExceptions(false) // 1
				.build();

		final List<Student> students = beans.parse();
		students.stream().forEach((user) -> {
			System.out.println(user);
		});

		beans.getCapturedExceptions().stream().forEach((exception) -> {
			System.out.println(exception);
		});
		
		Map<String, List<Student>> studentGroupData = students.stream().collect(Collectors.groupingBy(Student::getDepartment));
		System.out.println(studentGroupData);
	}
}
