package ar.com.level.restaurante.controller;

import ar.com.level.restaurante.dto.Response;
import ar.com.level.restaurante.model.Factura;
import ar.com.level.restaurante.model.Producto;
import ar.com.level.restaurante.service.FacturaService;
import ar.com.level.restaurante.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RequestMapping("/facturas")
@CrossOrigin(origins = "*")
@RestController
public class FacturaController {

    private static final Logger LOG = LoggerFactory.getLogger(ar.com.level.restaurante.controller.ProductoController.class); // logs

        @Autowired
        private FacturaService facturaService;

        @GetMapping
        public ResponseEntity<Response> list() {
            Response response = facturaService.findAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

        @PostMapping()
        public ResponseEntity<Response> create(@Valid @RequestBody Factura factura) {
            Response response = facturaService.save(factura);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
}
