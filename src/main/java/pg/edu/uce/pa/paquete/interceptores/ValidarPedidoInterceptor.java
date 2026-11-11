package pg.edu.uce.pa.paquete.interceptores;

import javax.naming.InitialContext;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import pg.edu.uce.pa.paquete.impl.Pedido;

@ValidarPedido 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION)
public class ValidarPedidoInterceptor {

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception{

        double pedidoMonto = (Double)context.getParameters()[0];

        if(pedidoMonto<=0){
            throw new IllegalArgumentException("El monto no puede ser menor a 0");

        }else{
            System.out.println("Monto validado........");
            Object metodo = context.proceed();  
       
            return metodo;
        }


    }



}
