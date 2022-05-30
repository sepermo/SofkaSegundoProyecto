
package modelo;

public abstract class spacecraft {
    public int velocidad;
    public int potencia;
    public int peso;
    public int tripulacion;
    public int pesoTripulacion;
    public String tipoCombustible;
    public int cargaCombustible;
    public int carga;

    public spacecraft(int velocidad) {
        this.velocidad = velocidad;
        this.potencia = 0;
        this.peso = 0;
        this.tripulacion = 0;
        this.pesoTripulacion = 0;
        this.tipoCombustible = null;
        this.cargaCombustible = 0;
        this.carga = 0;
    }

    public void velocidadDeEscape(){
    if(velocidad > 11.2){
        System.out.println("la nave logro despegar");
    }else{
        System.out.println("la nave no logro despegar");
    }
    }

    public void combustibleMin(){
        if(cargaCombustible < 270){
            System.out.println("la nave cuenta con el combustible minimo para despegar");
        }else{
            System.out.println("la nave no cuenta con el combustible minimo para despegar");
        }
    }

}
