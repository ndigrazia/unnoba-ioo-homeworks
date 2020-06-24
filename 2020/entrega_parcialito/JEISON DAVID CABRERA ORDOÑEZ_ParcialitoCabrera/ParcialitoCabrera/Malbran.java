import java.util.*;
public class Malbran
{
    private Vector<Resultado> vResultados= new Vector<Resultado>();
    private Vector<Institucion> vInstituciones=new Vector<Institucion>();
    private Director director;
    public Vector getVInstituciones(){
        return vInstituciones;
    }
    public Vector getVResultados(){
        return vResultados;
    }
    public void setDirector(Director director){
        this.director=director;
    }
    public Director getDirector(){
        return director;
    }
}
