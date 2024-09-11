/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectosena.medicamentos.services;

import com.proyectosena.medicamentos.modelo.medicamento;

/**
 *
 * @author User
 */
public interface mediservices {
    medicamento newmedicamentos(medicamento newmedicamento);
    Iterable<medicamento> getAll();
    medicamento modifymedicamento(medicamento medicamento);
    Boolean deletemedicamento(Long idcodigo);
    
    public medicamento newMedicamento(medicamento newMedicamento);
    
}
