package facturacion.bffweb.customer;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class FacturaDTO {
    private String numeroFactura;
    private LocalDate fecha;
    private Long clienteId;
    private BigDecimal total;
}
