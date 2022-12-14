package idat.edu.pe.curisinche.reserva.service;

import java.util.List;

import idat.edu.pe.curisinche.reserva.dto.ReservaDTO;

public interface ReservaService {
	List<ReservaDTO> listar();
	void guardar(ReservaDTO dto);
}
