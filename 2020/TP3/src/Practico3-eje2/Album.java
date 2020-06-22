import java.util.List;
import java.util.ArrayList;

public class Album
{
    private List<Foto> fotos = new ArrayList<Foto>();
    
    private String nombre;

    //TODO Agregar atributos que consideren
    
    //Constructor defecto
    public Album(String nombre)
    {
        this.nombre = nombre;
    }

    public void agregarFoto(Foto foto){
       fotos.add(foto);
    }
    
    public void borrarFoto(Foto foto){
        fotos.remove(foto);
    }

    public void borrarFotos(){
        fotos.clear();
    }

    /**
     * Uso:
     * Album a = new Album();
     * a.setDescripcion("Mi Album");
     * 
     * List<Foto> anexos = new ArrayList<Foto>();
     * 
     * Foto f1 = new Foto("Mi Foto");
     * anexos.add(f1);
     * 
     * Foto f2 = new Foto("Mi Foto");
     * anexos.add(f2);
     * 
     * a.agregarFotos(anexos);
     */
    public void agregarFotos(List<Foto> fotos){
        fotos.addAll(fotos);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    //TODO Agregar las operaciones que consideren
}
