package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Alumno;

public interface AlumnoService {

	public Alumno saveAlumno(Alumno alumno);
	
	public List<Alumno> getAlumnoList();
}
