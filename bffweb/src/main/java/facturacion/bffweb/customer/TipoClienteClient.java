package facturacion.bffweb.customer;

    import java.util.List;
    import org.springframework.cloud.openfeign.FeignClient;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;

    @FeignClient(name = "bff.tipocliente", url = "http://localhost:8000/api/tipopersona")
    public interface TipoClienteClient {

        @GetMapping("/{id}/")
        TipoClienteDTO findById(@PathVariable("id") Long id);

        @GetMapping("/")
        List<TipoClienteDTO> findAll();

        @PostMapping("/") 
        TipoClienteDTO save(TipoClienteDTO entity);

        @DeleteMapping("/{id}/")
        void deleteById(@PathVariable("id")  Long id);

        @PutMapping("/{id}/")
        TipoClienteDTO update(@PathVariable("id")  Long id, TipoClienteDTO entity);


    }