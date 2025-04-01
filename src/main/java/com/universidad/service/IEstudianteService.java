package com.universidad.service;

import java.util.List;

import com.universidad.dto.EstudianteDTO;

public interface IEstudianteService {
    
    List<EstudianteDTO> obtenerTodosLosEstudiantes();
    EstudianteDTO obtenerPorId(Long id);
    EstudianteDTO crearEstudiante(EstudianteDTO estudianteDTO);
    EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO);
    void eliminarEstudiante(Long id);
}
