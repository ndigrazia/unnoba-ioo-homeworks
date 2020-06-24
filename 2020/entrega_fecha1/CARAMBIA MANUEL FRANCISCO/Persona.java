public class Persona
{
    private int Dni;
    private String nombre;
  
    public void getDni(int unDni){
        this.Dni=unDni;
    }
    
    public int setDni(){
        return this.Dni;
    }
    public void getNombre(String unNombre){
        this.nombre=unNombre;
    }
    
    public String setNombre(){
        return this.nombre;
    }
    
    
}
