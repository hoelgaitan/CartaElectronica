package ar.com.level.restaurante.controller;

import ar.com.level.restaurante.dto.Response;
import ar.com.level.restaurante.model.Producto;
import ar.com.level.restaurante.service.ProductoService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@RequestMapping("/productos")
@CrossOrigin(origins = "*")
@RestController
public class ProductoController {
    private static final Logger LOG = LoggerFactory.getLogger(ProductoController.class); // logs

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<Response> list() {
        Response response = productoService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Response> create(@Valid @RequestBody Producto producto) {
        Response response = productoService.save(producto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
  //  @GetMapping("/{id}")
   // public ResponseEntity<Response> getProductoById(@PathVariable())

}
