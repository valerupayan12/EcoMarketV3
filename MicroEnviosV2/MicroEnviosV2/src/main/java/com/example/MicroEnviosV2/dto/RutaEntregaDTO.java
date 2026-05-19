package com.example.MicroClienteV2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class RutaEntregaDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotNull(message = "El ID de la ruta es obligatorio")
        private Integer id_ruta;

        @NotBlank(message = "El nombre de la ruta es obligatorio")
        @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
        private String nombre;

        @NotBlank(message = "La descripción es obligatoria")
        @Size(min = 5, max = 255, message = "La descripción debe tener entre 5 y 255 caracteres")
        private String descripcion;

        @NotBlank(message = "El tipo de ruta es obligatorio")
        @Size(min = 3, max = 50, message = "El tipo debe tener entre 3 y 50 caracteres")
        private String tipo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Integer id_ruta;
        private String nombre;
        private String descripcion;
        private String tipo;
    }
}