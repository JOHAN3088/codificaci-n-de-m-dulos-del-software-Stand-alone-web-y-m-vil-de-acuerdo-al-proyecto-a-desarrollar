/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectosena.medicamentos.services;

import com.proyectosena.medicamentos.modelo.medicamento;
import com.proyectosena.medicamentos.repository.Medinterface;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class mediservimplement implements mediservices {
     @Autowired
    private Medinterface Medin;

    @Override
    public medicamento newmedicamentos(medicamento newmedicamento) {
        return Medin.save(newmedicamento);
    }

    @Override
    public Iterable<medicamento> getAll() {
       return this.Medin.findAll();
    }

    @Override
    public medicamento modifymedicamento(medicamento medicamento) {
       Optional<medicamento> medicamentoEncontrado= this.Medin.findById(medicamento.getIdcodigo());
        if (medicamentoEncontrado.get()!=null){
            medicamentoEncontrado.get().setNombre(medicamento.getNombre());
            medicamentoEncontrado.get().setGramaje(medicamento.getGramaje());
            medicamentoEncontrado.get().setCaracteristicas(medicamento.getCaracteristicas());
            medicamentoEncontrado.get().setExistencias(medicamento.getExistencias());
       
        }
        return null;
    }

    @Override
    public Boolean deletemedicamento(Long idcodigo) {
      this. Medin.deleteById(idcodigo);
        return true;
    }

    @Override
    public medicamento newMedicamento(medicamento newMedicamento) {
        return null;
    }
    
}
