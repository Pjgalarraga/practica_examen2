package pg.edu.uce.pa.paquete.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import pg.edu.uce.pa.paquete.extensiones.VerificarSeguridad;

@ApplicationScoped 
public class Auditoria {

    @Inject 
    CalcularDescuentoService calcularDescuentoService;

    public void auditar(Pedido pedido, VerificarSeguridad verificarSeguridad){

        System.out.println("------------------------------------");
        System.out.println("Iniciando auditoria del pedido...");
        verificarSeguridad.verificar(pedido);
        
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Monto inicial: " + pedido.getMonto());

     pedido.setMonto(   calcularDescuentoService.total(pedido.getMonto()));

     System.out.println("Monto final: " + pedido.getMonto());

     System.out.println("------------------------------------------");
    }

}
