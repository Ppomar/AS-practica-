
 
public class Practica {
    
    public static void main(String args[]) {
    String Nombre, Apellido;
    double cal1,cal2,cal3,cal4,promedio;
    Nombre=LeerVariable.leerTexto("Ingresar Nombre(s): ");
    Apellido=LeerVariable.leerTexto("Ingresar Apellidos: ");
    cal1=LeerVariable.leerReal("Ingresar Calificacion 1: ");
    cal2=LeerVariable.leerReal("Ingresar Calificacion 2: ");
    cal3=LeerVariable.leerReal("Ingresar Calificacion 3: ");
    cal4=LeerVariable.leerReal("Ingresar Calificacion 4: ");
    promedio=(cal1+cal2+cal3+cal4)/4;
    	System.out.print("Estudiante: "+Nombre+" "+Apellido+" "+"Su premedio es de: "+promedio);
    }
}
