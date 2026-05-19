package com.example.MicroClienteV2.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

public class EnvioDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotNull(message = "El ID del envío es obligatorio")
        private Integer id_envio;

        @NotNull(message = "La venta es obligatoria")
        private Venta venta;

        @NotNull(message = "El cliente es obligatorio")
        private Cliente cliente;

        @NotNull(message = "El proveedor es obligatorio")
        private Proveedor proveedor;

        @NotNull(message = "La ruta de entrega es obligatoria")
        private RutaEntrega ruta;

        @NotNull(message = "Debe indicar el estado del envío")
        private Boolean estado;

        @NotNull(message = "La fecha de despacho es obligatoria")
        private Date fecha_despacho;

        @NotNull(message = "La fecha estimada de entrega es obligatoria")
        private Date fecha_entrega_est;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Integer id_envio;
        private Venta venta;
        private Cliente cliente;
        private Proveedor proveedor;
        private RutaEntrega ruta;
        private Boolean estado;
        private Date fecha_despacho;
        private Date fecha_entrega_est;
    }
}