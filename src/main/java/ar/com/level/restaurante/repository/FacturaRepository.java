package ar.com.level.restaurante.repository;

import ar.com.level.restaurante.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {
}
