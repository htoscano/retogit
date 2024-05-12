public class Entrada {
    public static void main (String []args){

Coche coche1 = new Coche();
Coche coche2 = new Coche("Seat", "0111BBB", 130);
Coche cocheVacio = null;

        System.out.println("Datos del coche 1: ");
    coche1.mostrarDatos();
        System.out.println("Datos del coche 2: ");
    coche2.mostrarDatos();

    coche1.setModelo("BMW");
    coche1.setMatricula("1234BBB");
    coche1.setCv(240);
    coche1.setKm(10000);
    coche1.setVelocidad(100);

        coche2.setModelo("Mercedes");
        coche2.setMatricula("1221ACB");
        coche2.setCv(190);
        coche2.setKm(5000);
        coche2.setVelocidad(130);



        System.out.println("Datos del coche 1 modificado: ");
        coche1.mostrarDatos();
        System.out.println("Datos del coche 2 modificado");
        coche2.mostrarDatos();


        coche1.acelerar((int)(Math.random()*21));
        coche2.acelerar((int)(Math.random()*21));

        System.out.println("Nueva velocidad coche 1: " +coche1.getVelocidad());
        System.out.println("Nueva velocidad coche 2: " +coche2.getVelocidad());

        if (coche1.getKm() > coche2.getKm()) {
            System.out.printf("El coche 1 es el ganador, habiendo recorrido: %.2f km.\n", coche1.getKm());
        }else if ((coche1.getKm() < coche2.getKm())){
            System.out.printf("El coche 2 es el ganador, habiendo recorrido: %.2f km.\n", coche2.getKm());
        }



    }

}


