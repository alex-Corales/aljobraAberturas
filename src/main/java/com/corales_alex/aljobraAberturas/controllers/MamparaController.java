package com.corales_alex.aljobraAberturas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corales_alex.aljobraAberturas.models.MamparaModel;
import com.corales_alex.aljobraAberturas.services.IMamparaService;

@RestController
@RequestMapping("/mamparas")
public class MamparaController {
    
    @Autowired
    private IMamparaService iMamparaService;

    @PostMapping("/crear")
    public String saveMampara(@RequestBody MamparaModel mampara){
        iMamparaService.saveMampara(mampara);
        return "La mampara se guardo con exito";
    } 

    @GetMapping("/")
    @ResponseBody
    public List<MamparaModel> getAllMamparas(){
        return iMamparaService.getAllMamparas();
    }

    @GetMapping("/{idMampara}")
    @ResponseBody
    public MamparaModel getMamparaModel(@PathVariable Long idMampara){
        return iMamparaService.getMampara(idMampara);
    }

    @DeleteMapping("/eliminar/{idMampara}")
    public String deleteMampara(@PathVariable Long idMampara){
        return "La mampara se elimino con exito";
    }

    @PutMapping("/modificar/{idMampara}")
    public String updateMampara(@PathVariable Long idMampara, @RequestBody MamparaModel mamparaNueva){
        iMamparaService.updateMampara(idMampara, mamparaNueva);
        return "La mampara se modifico con exito";
    }

}
