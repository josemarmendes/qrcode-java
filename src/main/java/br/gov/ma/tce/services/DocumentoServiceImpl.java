package br.gov.ma.tce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.ma.tce.modelo.Documento;
import br.gov.ma.tce.repositorio.DocumentoRepositorio;

@Service("documentoService")
public class DocumentoServiceImpl implements DocumentoService{
	
	@Autowired
	private DocumentoRepositorio documentoRepositorio;

	@Override
	public Iterable<Documento> findAll() {
		return documentoRepositorio.findAll();
		
	}

	@Override
	public String findById() {
		return documentoRepositorio.findById();
	}

	

}
