/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectosena.medicamentos.controller;

import com.proyectosena.medicamentos.modelo.medicamento;
import com.proyectosena.medicamentos.services.mediservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/medicamentos") 
@CrossOrigin("*")
public class Medicontroller {
    @Autowired
     private  mediservices mediservices;
    
    @PostMapping("/nuevo")//ME DIRIGE A LA OPCION DE CREAR EL NUEVO
    public medicamento newMedicamentos(@RequestBody medicamento newMedicamentos){
        
        return this.mediservices.newMedicamentos(newMedicamentos);
}
    //CONFIGURACION DE LAS OPCIONES DEL REPOSITORIO
    @GetMapping("/mostrar")
    public Iterable<medicamento> getAll(){
        return mediservices.getAll();
    }
    @PostMapping("/modificar")
    public medicamento updateMedicamentos(@RequestBody medicamento Medicamentos){
        return this.mediservices.modifymedicamento(Medicamentos);
    }
    @PostMapping("medi/{id}")
    //public Boolean deletemedicamento(@PathVariable Long idcodigo){
    //    return this.mediservices.deletemedicamento(idcodigo);
    
   public void deletemedicamento(@PathVariable Long idcodigo){
       this.mediservices.deletemedicamento(idcodigo);
   }
}