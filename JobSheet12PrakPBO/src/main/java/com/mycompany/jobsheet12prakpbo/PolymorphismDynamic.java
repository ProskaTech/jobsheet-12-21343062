/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet12prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class PolymorphismDynamic {
    public static void main(String[] args){
        //creating variable of Bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah     :" +B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah     :" +B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah :" +B.sukuBunga());
    }
}