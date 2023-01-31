package facturacion.bffweb.customer;

import lombok.Data;

@Data
public class ProductoDTO {
    private String nombre;
    private String codigo;
    private double precio;
}
