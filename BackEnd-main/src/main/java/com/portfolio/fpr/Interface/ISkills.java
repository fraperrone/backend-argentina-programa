/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.fpr.Interface;

import com.portfolio.fpr.Entity.Skills;
import java.util.List;


public interface ISkills {
    
    //guardar skills
    public void saveSkills(Skills skills);
    
    /// buscar skills
    public Skills findSkills(Long id);
    
    //traer skills
    public List<Skills> getSkills();
}
