package Entidades;

import Service.ServiceCine;
import Service.Utilitarios;

public class CineMain {

    public static Utilitarios op = new Utilitarios();

    public static void main(String[] args) {
        ServiceCine cine = new ServiceCine();
        cine.crearEspectadores();
        int menu = 0;
        do {
            menu = op.Mensajeint("Menu Cine\n1-Crear Cartelera\n2-Crear Sala de cine\n3-Mostar peliculas en cartelera\n4-Boleteria\n5-Mostrar Salas \n6-salir");
            switch (menu) {
                case 1:                        
                    cine.CrearCartelera();
                    break;
                case 2:
                    cine.crearCine();
                    break;
                case 3:
                    cine.MostarCartelera();
                    break;
                case 4: cine.Boleteria();break;
                case 5 :cine.MostrarSalas(op.Mensajeint("Sala a mostrar\n1-Atlas\n2-Corrientes\3-Armenia"));break;
                case 6: System.exit(0);
                default:
                    op.Mensaje("Ingreso una opcion no valida");
            }
        } while (menu != 6);
    }
}
