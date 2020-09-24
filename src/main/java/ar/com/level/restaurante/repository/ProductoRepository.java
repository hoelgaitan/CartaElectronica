package ar.com.level.restaurante.repository;

import ar.com.level.restaurante.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
