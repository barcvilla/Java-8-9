/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch02.objects.inheritance.ex1;

/**
 *
 * @author PC
 */
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-333-333", 5000, .04, 300);
        
        //obtenemos info del empleado
        System.out.println("Informacion de Empleado obtenida por los metodos get");
        
        System.out.printf("%n%s %s%n", "First name is ", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is ", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security number is ", employee.getSocialSecurityName());
        
        System.out.printf("%s %.2f%n", "Gross sales is ", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is ", employee.getCommisionRate());
        System.out.printf("%s %.2f%n", "Base salary is ", employee.getBaseSalary());
        
        employee.setBaseSalary(1000);
        
        System.out.printf("%n%s: %n%n%s%n", "Updated employee information obtained by toString", employee);
    }
}
