package pg.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
import pg.edu.uce.pa.paquete.impl.Pedido;

@ApplicationScoped 
public class VerificarSeguridadInternet implements VerificarSeguridad {

    @Override
    public void verificar(Pedido pedido) {
       
        System.out.println("[Internet] verificando seguridad de manera local....");

    }

}
