package ar.com.level.restaurante.service;

import ar.com.level.restaurante.dto.Response;
import ar.com.level.restaurante.model.Producto;
import ar.com.level.restaurante.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    public Response findAll(){
        Response response = new Response();
        List<Producto> productos = productoRepository.findAll();
        response.setData(productos);
        return response;
    }


    public Response save(Producto producto) {
        Response response = new Response();
        response.setData(productoRepository.save(producto));
        return response;
    }
}
