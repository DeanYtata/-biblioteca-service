package com.uniminuto.biblioteca.controller;

import com.uniminuto.biblioteca.dto.LibroCreateDto;
import com.uniminuto.biblioteca.dto.LibroResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @PostMapping
    public LibroResponseDto crearLibro(@RequestBody LibroCreateDto libroDto) {

        // Simulamos que se guarda en base de datos
        Long idGenerado = 1L;

        return new LibroResponseDto(
                idGenerado,
                libroDto.getTitulo(),
                libroDto.getAutor(),
                libroDto.getIsbn()
        );
    }
}