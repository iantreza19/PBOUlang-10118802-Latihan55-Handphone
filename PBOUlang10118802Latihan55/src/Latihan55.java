/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan55 {

    protected static String manufacture;
    protected static String operatingSystem;
    protected static String model;
    protected static int harga;
    
    public static void main(String[] args) {
        // TODO code application logic here
    Handphone handphone = new Handphone(manufacture, operatingSystem, model, harga);
    handphone.displayProduct();
    }
    
}
