package com.example.MicroClienteV2.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

public class CuponDescuentoDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotNull(message = "El ID del cupón es obligatorio")
        private Integer id_cupon_descuento;

        @NotNull(message = "El código del cupón es obligatorio")
        private Integer codigo;

        @Min(value = 0, message = "El descuento porcentual no puede ser menor a 0")
        @Max(value = 100, message = "El descuento porcentual no puede ser mayor a 100")
        private Integer descuento_pct;

        @Min(value = 0, message = "El descuento en monto no puede ser negativo")
        private Integer descuento_monto;

        @NotNull(message = "La fecha de expiración es obligatoria")
        private Date fecha_expiracion;

        @NotNull(message = "Debe indicar si el cupón está activo")
        private Boolean activo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Integer id_cupon_descuento;
        private Integer codigo;
        private Integer descuento_pct;
        private Integer descuento_monto;
        private Date fecha_expiracion;
        private Boolean activo;
    }
}