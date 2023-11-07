/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S15_16_02;

/**
 *
 * @author Usuario23
 */
public class Main_S05_16 {
    public static void main(String[] args) {
        Profesor_16 prof = new Profesor_16();
        Bombero_16 bom = new Bombero_16();
        Carro_16 car = new Carro_16();
        Fruta_16 frut = new Fruta_16();
        
        prof.id = 23;
        prof.cargos = "docente";
        prof.apellidos = "Quispe Mamani";
        prof.edad = 56;
        
        
        prof.getNombre();
        prof.getApellidos();
        prof.getCargos();
        prof.getId();
        prof.getEdad();
        
        bom.nombre = "Pedri";
        bom.apellidos = "Patroclo";
        bom.cargos = "vigilante";
        bom.id = 12;
        bom.edad = 25;
        
       
        bom.getNombre();
        bom.getApellidos();
        bom.getId();
        bom.getEdad();
        bom.getCargos();
        
        
        car.marca = "Totoya";
        car.modelo = "Tesla";
        car.placa = "S2de34";
        car.km = "345";
        car.color = "negro";
        
                
        car.getMarca();
        car.getColor();
        car.getKm();
        car.getPlaca();
        car.getModelo();
        
        frut.getNombres();
        frut.getTipo();
        frut.getCantidad();
        frut.getColor();
    }
}
