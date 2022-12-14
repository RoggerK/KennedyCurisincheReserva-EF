package idat.edu.pe.curisinche.reserva.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.curisinche.reserva.dto.ReservaDTO;
import idat.edu.pe.curisinche.reserva.model.Reserva;
import idat.edu.pe.curisinche.reserva.repository.ResevarRepository;

@Service
public class ReservaServiceImpl implements ReservaService {
	@Autowired
	private ResevarRepository repository;

	@Override
	public List<ReservaDTO> listar() {
		return repository.findAll().stream()
						.map(r -> new ReservaDTO(r.getIdReserva(), r.getCosto()))
						.collect(Collectors.toList());
	}

	@Override
	public void guardar(ReservaDTO dto) {
		Reserva reserva = new Reserva(0, dto.getCos());
		repository.save(reserva);
	}
	
}
