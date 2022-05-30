
package modelo;

public class shuttleVehicle extends spacecraft{
    
    public shuttleVehicle(int velocidad){
        super(velocidad);
        this.potencia = 32000*5;
        this.peso = 2900 ;
        this.tripulacion = 4;
        this.pesoTripulacion = 60;
        this.tipoCombustible = "hidrógeno líquido";
        this.cargaCombustible = 287;
        this.carga = 118;
    }
    
    public void maxPasajeros(){
        if(tripulacion==4 || tripulacion<4){
            System.out.println("la nave cuenta con la capacidad adecuada de pasajeros");
        }
         if(tripulacion>4){
            System.out.println("la nave supera el maximo de pasajeros");
        }
    }
    
    
}
