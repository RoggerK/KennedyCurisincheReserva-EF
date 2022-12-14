package idat.edu.pe.curisinche.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.curisinche.reserva.model.Reserva;

@Repository
public interface ResevarRepository extends JpaRepository<Reserva, Integer> {

}
