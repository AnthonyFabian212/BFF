package facturacion.bffweb.customer;

    import java.util.List;
    import org.springframework.cloud.openfeign.FeignClient;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;

    @FeignClient(name = "bff.producto", url = "http://localhost:8082/api/producto")
    public interface ProductoClient {

        @GetMapping("/{id}/")
        ProductoDTO findById(@PathVariable("id") Long id);

        @GetMapping("/")
        List<ProductoDTO> findAll();

        @PostMapping("/") 
        ProductoDTO save(ProductoDTO entity);

        @DeleteMapping("/{id}/")
        void deleteById(@PathVariable("id")  Long id);

        @PutMapping("/{id}/")
        ProductoDTO update(@PathVariable("id")  Long id, ProductoDTO entity);


    }
