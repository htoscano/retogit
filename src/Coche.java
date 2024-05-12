public class Coche {
    private String modelo, matricula;
    private int cv, velocidad;
    private double km;

    public Coche (){

        this.modelo = "Sin especificar";
        this.matricula = "0000AAA";
        this.cv = 0;
        this.velocidad = 0;
        this.km = 0.0;
    }

    public Coche (String modelo, String matricula, int cv){
this.modelo = modelo;
this.matricula = matricula;
this.cv = cv;
this.velocidad = 0;
this.km = 0.0;
    }


    public void acelerar(int velocidadAcelerar){
        if(velocidad >= 180){
            System.out.println("Velocidad máxima alcanzada.");
            this.velocidad = 180;
        }else{
            this.velocidad += velocidadAcelerar;
            this.km = velocidad * (cv * (Math.random()*11));
        }

    }

    public void frenar(int velocidadFrenar) {
        if (velocidad > 0) {
            if (velocidad > velocidadFrenar) {
                velocidad = velocidad - velocidadFrenar;
            } else {
                System.out.println("La velocidad de frenada no puede ser mauor que la velocidad inicial.");
            }

        } else {
            System.out.println("Velocidad mínima alcanzada.");
        }
    }

      public void parar (){
         this.velocidad = 0;
        }


     public void resetear(){
this.velocidad = 0;
this.km = 0;
        }

     public void mostrarDatos(){
            System.out.println("Modelo: " +modelo);
            System.out.println("Matricula: " +matricula);
            System.out.println("Velocidad: " +velocidad);
            System.out.println("Cv: " +cv);
            System.out.println("Km: " +km);
        }

     public String getModelo (){
         return modelo;
        }
     public String getMatricula() {
        return matricula;
     }

     public int getVelocidad(){
        return velocidad;
     }
     public double getKm(){
        return km;
     }
     public int getCv(){
        return cv;
    }

    public void setModelo(String modelo){
this.modelo = modelo;
    }
    public void setMatricula(String matricula){
this.matricula = matricula;
    }
    public void setVelocidad(int velocidad){
this.velocidad = velocidad;
    }
    public void setCv(int cv){
this.cv = cv;
    }
    public void setKm(int km){
this.km = km;
    }

    }

