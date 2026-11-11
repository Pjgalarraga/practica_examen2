package pg.edu.uce.pa.paquete.impl;

import jakarta.enterprise.context.Dependent;
import pg.edu.uce.pa.paquete.interceptores.ValidarPedido;

@Dependent 
public class CalcularDescuentoService {

    @ValidarPedido 
    public double total(double monto){

        if(monto>100.00){

           double descuento = monto * 0.10;
           
           return monto - descuento;
           

        }else{
            return monto;
        }

    }

}
