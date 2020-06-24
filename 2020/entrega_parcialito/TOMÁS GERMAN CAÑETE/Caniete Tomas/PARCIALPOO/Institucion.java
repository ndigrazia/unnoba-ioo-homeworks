import java.util.ArrayList;
import java.util.List;
public class Institucion
{
   private Localidad localidad;
   private List<Tecnicos> tecnicos = new ArrayList<Tecnicos>();
   private List<Resultado> resultados = new ArrayList<Resultado>();
   private String nombreInstitucion;
    public Institucion(String nombreInstitucion, Localidad localidad)
    {
       setNombreInstitucion(nombreInstitucion);
       setLocalidadInstitucion(localidad);
    }
    public void setLocalidadInstitucion(Localidad localidad){
    this.localidad=localidad;
    }
    public void setNombreInstitucion(String nombreInstitucion)
    {
        this.nombreInstitucion=nombreInstitucion;
    }
    public String getNombreInstitucion(){
        return nombreInstitucion;
    }
    public Localidad getLocalidadInstitucion(){
        return localidad;
    }
    
    public void agregarTecnico(Tecnicos tecnico){
    tecnicos.add(tecnico);
    }
    public void agregarResultado(Resultado resultado){
    resultados.add(resultado);
    }
    public void borrarTecnico(Tecnicos tecnico){
    tecnicos.remove(tecnico);
    }
    public void borrarResultado(Resultado resultado){
    resultados.remove(resultado);
    }
    public void contarResultados(boolean resultado)
    {
        if(resultado==true)
        {
            int positivos=0;
              for(Resultado f:resultados)
          {
              if(f.getResultado()==true){positivos+=1;}
            }
            System.out.println("cantidad de resultados positivos de la institucion: "+positivos);
        }
        else
        {
            int negativos=0;
            for(Resultado f:resultados)
          {
              if(f.getResultado()==false){negativos+=1;}
            }
            System.out.println("cantidad de resultados negativos de la institucion: "+negativos);
        }
    }

}
