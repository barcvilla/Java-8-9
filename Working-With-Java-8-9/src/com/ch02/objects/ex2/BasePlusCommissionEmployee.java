/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch02.objects.ex2;

/**
 * BasePlusCommissionEmployee representa un empleado que recibe un salarui base ademas de la comision
 * @author PC
 */
public class BasePlusCommissionEmployee{
    private String firstName;
    private String lastName;
    private String socialSecurityName;
    private double grossSales;
    private double commisionRate;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityName, double grossSales, double commisionRate, double baseSalary) {
        //Si grossSales es invalido lanzar una excepcion
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross Sales debe ser >= 0.0");
        }
        
        //Si commissionRate es invalido lanzar una excepcion
        if(commisionRate <= 0.0 || commisionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission debe ser > 0.0 y < 1.0");
        }
        
        //si baseSalary es invalido lanzamos un excepcion
        if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityName = socialSecurityName;
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
        this.baseSalary = baseSalary;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityName() {
        return socialSecurityName;
    }

    public void setSocialSecurityName(String socialSecurityName) {
        this.socialSecurityName = socialSecurityName;
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
        if(commisionRate < 0.0 || commisionRate > 1.0)
        {
            throw new IllegalArgumentException("Commission rate debe ser > 0.0 y < 1.0");
        }
        this.commisionRate = commisionRate;
    }
    
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    public void setBaseSalary(double baseSalary)
    {
       if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
       this.baseSalary = baseSalary;
    }
    
    //calculamos las ganancias
    public double earnings()
    {
        return baseSalary + (commisionRate * grossSales);
    }
    
    // retornamos una representacion String del objeto CommisionEmployee
    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "CommissionEmployee", firstName, lastName, "Social Security number", socialSecurityName, 
                "gross sales", grossSales, "commission rate", commisionRate, "Base salary", baseSalary);
    }
    
}
