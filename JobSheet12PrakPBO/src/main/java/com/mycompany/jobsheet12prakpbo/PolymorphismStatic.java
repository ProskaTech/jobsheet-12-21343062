/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet12prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class PolymorphismStatic {
    public static void main(String[] args){
        //memanggil metode perimeter dengan satu argumen
        System.out.println("Sisi Persegi adalah         : 4\nKeliling Persegi adalah     :"
                + CompileTime.keliling(4) + "\n");
        //memanggil metode perimeter dengan dua argumen
        System.out.println("Sisi Persegi Panjang adalah         : 10, 13\nKeliling Perseg Panjang adalah      :" 
                + CompileTime.keliling(10,13));
    }
}