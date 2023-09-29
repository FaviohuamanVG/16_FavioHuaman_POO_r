/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_16_FavioHuaman;

/**
 *
 * @author Carlos
 */
public class Auto {
    public String marca;
    public String modelo;
    public int anio;

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInformacion() {
        System.out.println("Información del Auto:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}
