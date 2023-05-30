package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alumno;
import com.example.demo.service.AlumnoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	
	@Autowired
	private AlumnoService alumnoService;
	
	
	@GetMapping("/getList/")
	public ResponseEntity<List<Alumno>> getEmployeeById() {
	    List<Alumno> alumnosList = alumnoService.getAlumnoList();
	    return ResponseEntity.ok().body(alumnosList);
	}
	
	
	@PostMapping("/save")
	public Alumno createEmployee(@RequestBody Alumno alumno) {		
		Alumno a = alumnoService.saveAlumno(alumno);
		
	    return a;
	}
	
	
}
