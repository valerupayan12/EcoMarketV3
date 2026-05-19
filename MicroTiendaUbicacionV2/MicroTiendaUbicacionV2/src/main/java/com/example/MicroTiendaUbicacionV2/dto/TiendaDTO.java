package com.example.MicroTiendaUbicacionV2.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ClienteDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotBlank(message = "la tienda es obligatorio")
        @Size(min = 3, max = 10, message = "El ID debe tener entre 3 y 10 caracteres")
        private int id_Tienda;

        @NotBlank(message = "El nombre es obligatorio")
        @Pattern(regexp = "^[\\w\\sáéíóúÁÉÍÓÚñÑ]{2,}\\s+[\\w\\sáéíóúÁÉÍÓÚñÑ]{2,}.*$",
                 message = "El nombre debe contener al menos 2 palabras")
        private String nombre;

        @NotBlank(message = "la dirccion es obligatorio")
        @Pattern(regexp = "^[\\w\\sáéíóúÁÉÍÓÚñÑ]{2,}\\s+[\\w\\sáéíóúÁÉÍÓÚñÑ]{2,}.*$",
                 message = "la direccion debe contener al menos 2 palabras")
        private Sring direccion;

        @NotNull(message = "El ID del género es obligatorio")
        private Long generoId;
    }

    /**
     * La respuesta incluye el GeneroDTO completo obtenido desde ms-genero via Feign.
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private int id_Tienda;
        private String nombre;
        private String direccion;
        private String region;
        private Comuna comuna;
        private String direccion;
        private GeneroDTO genero; //objeto obtenido consultando microservicio genero
    }

}
