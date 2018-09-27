/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch02.objects.ex1;

/**
 *
 * @author PC
 */
public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-222-222", 10000, .06);
        
        //obtenemos info del empleado
        System.out.println("Informacion de Empleado obtenida por los metodos get");
        
        System.out.printf("%n%s %s%n", "First name is ", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is ", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security number is ", employee.getSocialSecurityName());
        
        System.out.printf("%s %.2f%n", "Gross sales is ", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is ", employee.getCommisionRate());
        
        employee.setGrossSales(5000);
        employee.setCommisionRate(.01);
        
        System.out.printf("%n%s: %n%n%s%n", "Updated employee information obtained by toString", employee);
    }
}
