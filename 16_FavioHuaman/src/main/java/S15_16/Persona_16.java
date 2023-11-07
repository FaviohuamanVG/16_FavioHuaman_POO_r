package S15_16;

public class Persona_16 {
    //atributos
    int edad;
    String nombre;
    String apellidos;
    int id;
    
    public void persona(String c){
        System.out.println("Hola soy " + c);
    }
    
    public void persona(int a, String b){
        System.out.println("Soy "+b+" mi edad es: " +a);
    }
    
    public void persona(String b, String a){
        System.out.println("Soy "+a + " mi apellido es: " +b);
    }
    
    public void persona(int c, int a){
        System.out.println("Mi id es: " +c+ " y mi edad es " +a);
    }
}
