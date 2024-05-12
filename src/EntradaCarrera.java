public class EntradaCarrera {
    public static void main (String []args){
int km = 100000;

        Coche coche1 = new Coche("Seat", "0123ABC", 200);
        Coche coche2 = new Coche("Peugeot", "0112ACD", 150);
        Coche cocheVacio = null;

        do{
            coche1.acelerar(50);
            coche2.acelerar(60);

            System.out.printf("El coche 1 lleva %.2f km\n" ,coche1.getKm());
            System.out.printf("El coche 2 lleva %.2f km\n" ,coche2.getKm());


        }while(coche1.getKm() <= km && coche2.getKm() <= km);

         if (coche1.getKm() > coche2.getKm()){
             System.out.println("Coche 1 ganador.");
         }
        if (coche2.getKm() > coche1.getKm()){
            System.out.println("Coche 2 ganador.");
         }

    }
}
