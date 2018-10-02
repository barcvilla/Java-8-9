/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch03.polymorphism.abstracts.ex1;

/**
 *
 * @author PC
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityName, double grossSales, double commisionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityName, grossSales, commisionRate);
        if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("");
        }
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    //calculamos ganancias,override metodo earnings en CommissionEmployee
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base-salary", getBaseSalary());
    }
}
