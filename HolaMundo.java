import java.util.Scanner;

public class HolaMundo {
  public static void main(String[] args){
    System.out.println("Hola Luisa");

    System.out.print("Como van las cosas");
    System.out.print(10);
    System.out.print(10.5);
    System.out.print('A');

    System.out.printf(" Aqui va una cadena: %s","Luisa");
   System.out.printf(" Aqui va un entero: %s",10);
   System.out.printf(" Mi nombe es %s y tengo %s años","Luisa",26);

   var entrada = new Scanner(System.in);

   System.out.println(" Por favor ingrese su  nombre");
   var entero = entrada.nextLine();
   entrada.close();
}
}