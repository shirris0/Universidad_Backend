package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Alumno;
import com.example.demo.repository.AlumnoRepository;
import com.example.demo.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	AlumnoRepository alumnoRepository;
	
	
	@Override
	public Alumno saveAlumno(Alumno alumno) {
		Alumno alumnoGuardado = alumnoRepository.save(alumno);
				
		return alumnoGuardado;
		
	}
	
	@Override
	public List<Alumno> getAlumnoList(){
		
		List<Alumno> list = alumnoRepository.findAll();
		
		return list;
	}
}
