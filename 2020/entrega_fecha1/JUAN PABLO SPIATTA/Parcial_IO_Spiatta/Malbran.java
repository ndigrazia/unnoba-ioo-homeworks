import java.util.*;
public class Malbran
{
    private String director;
    private Institucion[] listaInstituciones = new Institucion[1000];
    private int i = 0;
    //Metodos
    public void agregarInstitucion(Institucion institucion)
    {
        if(this.listaInstituciones[i].getNombre() == institucion.getNombre())
        {
            System.out.println("Ya esta en la lista");
        }
        else
        {
            this.listaInstituciones[i] = institucion;
        }
    }
}
