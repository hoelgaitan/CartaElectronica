package ar.com.level.restaurante.service;


import ar.com.level.restaurante.dto.Response;
import ar.com.level.restaurante.model.Factura;
import ar.com.level.restaurante.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;
    public Response findAll(){
        Response response = new Response();
        List<Factura> facturas = facturaRepository.findAll();
        response.setData(facturas);
        return response;

    }

    public Response save (Factura factura){
        Response response = new Response();
        response.setData(facturaRepository.save(factura));
        return response;
    }

}
