package br.gov.ma.tce.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.ma.tce.services.DocumentoService;
import br.gov.ma.tce.util.ZxingUtil;

@Controller
@RequestMapping("documento")
public class DocumentoController {

	@Autowired
	private DocumentoService documentoService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("documentos", documentoService.findAll());
		
		return "documento/index";
	}

	@RequestMapping(value = "qrcode/{id}", method = RequestMethod.GET)
	public void qrcode(@PathVariable("id") String id, String url, HttpServletResponse response) throws Exception {
		
		url = documentoService.findById();
		
		response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(ZxingUtil.getQRCodeImage( url, id, 200, 200));
		outputStream.flush();
		outputStream.close();
	}


}
