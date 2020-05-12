package br.gov.ma.tce.services;

import br.gov.ma.tce.modelo.Documento;

public interface DocumentoService {
	
	public Iterable<Documento> findAll();

	public String findById();

	
}
