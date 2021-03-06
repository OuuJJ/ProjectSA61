package com.example.demo;

import com.example.demo.respository.*;
import com.example.demo.entity.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.io.StreamCorruptedException;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(departmentrepos Departmentrepos) {
		return args -> {

			Departmentrepos.save(new department("ขาย"));
			Departmentrepos.save(new department("จัดของ"));
			Departmentrepos.save(new department("ส่งของ"));
			Departmentrepos.findAll().forEach(System.out::println);
		};
	}

}

