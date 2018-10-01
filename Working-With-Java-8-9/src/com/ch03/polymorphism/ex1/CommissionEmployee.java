/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch03.polymorphism.ex1;
/**
 * 
 * @author PC
 */
public class CommissionEmployee{
    private String firstName;
    private String lastName;
    private String socialSecurityName;
    private double grossSales;
    private double commisionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityName, double grossSales, double commisionRate) {
        
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
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityName = socialSecurityName;
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
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
    
    //calculamos las ganancias
    public double earnings()
    {
        return getCommisionRate() * getGrossSales();
    }
    
    // retornamos una representacion String del objeto CommisionEmployee
    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "CommissionEmployee", getFirstName(), getLastName(), "Social Security number", getSocialSecurityName(), 
                "gross sales", getGrossSales(), "commission rate", getCommisionRate());
    }
    
}
