package br.com.escambo.controller;

import br.com.escambo.model.RetornoTipoTaxa;
import br.com.escambo.model.RetornoTransferencia;
import br.com.escambo.model.RetornoTransferencias;
import br.com.escambo.model.Transferencia;
import br.com.escambo.service.TransferenciaService;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/transferencia")
public class TransferenciaController {

    private TransferenciaService transferenciaService =  new TransferenciaService();

    @RequestMapping(value = "/nova", produces ="application/json", consumes = "application/json",method = RequestMethod.POST)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    public RetornoTransferencia novaTransferencia(@RequestBody Transferencia transferencia){
       return transferenciaService.novaTransferencia(transferencia);
    }

    @RequestMapping(value = "/listar", produces ="application/json", method = RequestMethod.GET)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    public RetornoTransferencias listaTransferencia(){
        return new RetornoTransferencias(transferenciaService.obterTransferencias());
    }


    @RequestMapping(value = "/listarTipoTaxa", produces ="application/json", method = RequestMethod.GET)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    public RetornoTipoTaxa listarTipoTaxa(){
        return new RetornoTipoTaxa(transferenciaService.listarTipoTaxa());
    }
}
