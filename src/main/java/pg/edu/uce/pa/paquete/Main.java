package pg.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import pg.edu.uce.pa.paquete.extensiones.VerificarSeguridadInternet;
import pg.edu.uce.pa.paquete.extensiones.VerificarSeguridadLocal;
import pg.edu.uce.pa.paquete.impl.Auditoria;
import pg.edu.uce.pa.paquete.impl.Pedido;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    Auditoria auditoria;

    @Inject
    VerificarSeguridadLocal verificarSeguridadLocal;

    @Inject
    VerificarSeguridadInternet verificarSeguridadInternet;

    public static void main(String[] args) {

        Quarkus.run(Main.class, args);

    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("Iniciando Quarkus.....");

        Pedido p1 = new Pedido(1, "Pedro", 99.10, false);
        Pedido p2 = new Pedido(2, "Carlos", 150.4, false);
        try {

            auditoria.auditar(p1, verificarSeguridadLocal);
            auditoria.auditar(p2, verificarSeguridadInternet);
        } catch (Exception e) {
            e.getMessage();
        }

        return 0;
    }

}
