/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectosena.medicamentos.repository;

import com.proyectosena.medicamentos.modelo.medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface Medinterface  extends JpaRepository <medicamento,Long> {
    
}
