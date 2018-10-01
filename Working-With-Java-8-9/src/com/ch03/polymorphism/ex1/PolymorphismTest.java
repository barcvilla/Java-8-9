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
public class PolymorphismTest {

    public static void main(String[] args) {
        //asignamos un referencia superclass a una varible superclase
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jone", "222-22-2222", 10000, .06);

        //asignamos una referencia subclase a un variable subclase
        BasePlusCommissionEmployee basePlusCommissionEmployee
                = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        //Invocamos toString en el objeto superclase usando la variable superclase
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call CommissionEmployee's toString with superclass reference ", ",to superclass object", commissionEmployee.toString());
        
        //Invocamos toString methos on subclass object usando subclass variable
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass", "reference to subclass object", basePlusCommissionEmployee.toString());
        
        //invocamos toString sobre un objeto subclass usando una variable superclass
        CommissionEmployee commissionEmployee1 = basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n", 
                "Call BasePlusCommissionEmployee's toString with superClass", "reference to subclass object", commissionEmployee1.toString());
    }
}
