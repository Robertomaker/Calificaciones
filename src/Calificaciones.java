//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calificaciones {
    public static void main(String[] args) {

        String nombre = "nombre";
        int[] calificaciones = new int[5];
        calificaciones[0] = 50;
        calificaciones[1] = 60;
        calificaciones[2] = 70;
        calificaciones[3] = 80;
        calificaciones[4] = 90;
System.out.println(nombre);


        // Calculo del promedio
        double suma = 0, promedio;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);

        // calificacion
        promedio= 70;
        if (promedio <= 50){
            System.out.println("La calificacion es una F");
        }else if(promedio >= 51 && promedio <=  60 ){
            System.out.println("La calificacion es una E");
        }else if(promedio >= 61 && promedio <=  70 ){
            System.out.println("La calificacion es una D");
        }else if(promedio >= 71 && promedio <=  80 ) {
            System.out.println("La calificacion es una C");
        }else if(promedio >= 81 && promedio <=  90 ) {
            System.out.println("La calificacion es una B");
        }else if(promedio >= 91 && promedio <=  100 ) {
            System.out.println("La calificacion es una A");
        }
        // Imprimir resultados
System.out.print(nombre + ",");
        System.out.print("Calificacion 1 = 50, Calificacion 2 = 60, Calificacion 3 = 70, Calificacion 4 = 80, Calificacion 5 = 90" + ",");
    }
}