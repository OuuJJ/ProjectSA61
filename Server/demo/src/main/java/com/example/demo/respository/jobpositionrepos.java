package com.example.demo.respository;

import  com.example.demo.entity.Job_position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public
interface jobpositionrepos extends JpaRepository< Job_position, Long> {

}