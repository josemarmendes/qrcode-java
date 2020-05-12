package br.gov.ma.tce.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.ma.tce.modelo.Documento;

@Repository("documentoRepositorio")
public interface DocumentoRepositorio extends CrudRepository<Documento, String>{
	
	@Query("SELECT d.url FROM Documento d")
	public String findById();
}
