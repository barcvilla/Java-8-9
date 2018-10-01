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
public class CommissionEmployee extends Employee {
    
    private double grossSales;
    private double commisionRate;
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityName, double grossSales, double commisionRate)
    {
        super(firstName, lastName, socialSecurityName);
        
        //Si commissionRate es invalido lanzar una excepcion
        if(commisionRate <= 0.0 || commisionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission debe ser > 0.0 y < 1.0");
        }
        
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales debe ser >= 0");
        }
        
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales debe ser >= 0");
        }
        
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        if(commisionRate <= 0.0 || commisionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission debe ser > 0.0 y < 1.0");
        }
        
        this.commisionRate = commisionRate;
    }
    
    @Override
    public double earnings() {
        return getCommisionRate() * getGrossSales();
    }
    
    @Override
    
    public String toString()
    {
        return String.format("%s: %s%n%s: $%.2f; %s: %.2f", "commission employee", super.toString(),
                "gross sales", getGrossSales(), "commission rate", getCommisionRate());
    }
    
}
