//package com.company;
public class Main {

    public  void main(String[] args)
    {
        //ejercicio:1
        int a=1;
        int b=1;
        int c=3;
        int  resultado=sumarNumeros(a,b,c);
        System.out.println("el resultado de"+a+"+"+b+"+"+c+"es igual a "+resultado);
        //ejercicio:2
        Coche miCoche=new Coche();
        System.out.println("el auto tiene "+miCoche.puertas+"puertas");
    }
     public int sumarNumeros(int num1,int num2,int num3){

            return (num1+num2+num3);
    }
     class Coche{
       public int puertas=5;
       public void aumentarCantPuertas(){
            this.puertas++;
       }
    }
}