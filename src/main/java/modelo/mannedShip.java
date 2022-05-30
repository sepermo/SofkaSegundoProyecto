
package modelo;

public class mannedShip extends spacecraft{
    
     public mannedShip(int velocidad){
        super(velocidad);
        this.potencia = 32000*5;
        this.peso = 2460 ;
        this.tripulacion =0;
        this.pesoTripulacion = 0;
        this.tipoCombustible = "hidrógeno líquido";
        this.cargaCombustible = 250;
        this.carga = 170;
    }
     
    public void maxCarga(){
        if(carga>150){
            System.out.println("la nave sobrepasa su capacidad maxima de carga");
        }else{
            System.out.println("la nave cuenta con la carga adecuada para el despegue");
        }
    }
}
