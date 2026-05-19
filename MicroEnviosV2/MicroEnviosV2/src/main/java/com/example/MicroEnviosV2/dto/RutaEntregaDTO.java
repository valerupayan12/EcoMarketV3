
package com.example.MicroClienteV2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
        private String nombre;

        @NotBlank(message = "La descripción es obligatoria")
        private String descripcion;

        @NotBlank(message = "El tipo de ruta es obligatorio")
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