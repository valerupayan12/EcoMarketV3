


package com.example.MicroClienteV2.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ProveedorDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotNull(message = "El ID del proveedor es obligatorio")
        private Integer id_proveedor;

        @NotBlank(message = "El nombre es obligatorio")
        @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
        private String nombre;

        @NotBlank(message = "El teléfono es obligatorio")
        @Size(min = 8, max = 15, message = "El teléfono debe tener entre 8 y 15 caracteres")
        private String telefono;

        @NotBlank(message = "El email es obligatorio")
        @Email(message = "El formato del email no es válido")
        @Size(min = 5, max = 100, message = "El email debe tener entre 5 y 100 caracteres")
        private String email;

        @NotNull(message = "La comuna es obligatoria")
        private Comuna comuna;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Integer id_proveedor;
        private String nombre;
        private String telefono;
        private String email;
        private Comuna comuna;
    }
}