package Paquete1;
import Paquete2.Class3;
import Paquete2.Class4;
import Paquete3.Class5;
import Paquete3.Class6;


public class Class2 {
    public static void main(String[] args) {
      Class1 clas = new Class1();
      Class3 clas2 = new Class3();
      Class4 clas3 = new Class4();
      Class5 clas5 = new Class5();
      Class6 clas4 = new Class6();
      
     int j = clas.b = 12;
     String c = clas2.b = "Hola";
     String v = clas3.b = "Profesor";
     int a = clas4.c = 1;
     float f = clas5.b = 2f;
      
        System.out.println(j);
        System.out.println(c);
        System.out.println(v);
        System.out.println(a);
        System.out.println(f);
    }
}
