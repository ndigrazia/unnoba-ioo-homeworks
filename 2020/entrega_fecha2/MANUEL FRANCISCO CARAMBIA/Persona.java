/**
 * Abstract class Persona - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Persona
{
    private int DNI;
    private String nombre;
    private String apellido;
    
    
    public int getDNI(){
       return DNI;
   }
   
   public void setDNI(int DNI){
       this.DNI=DNI;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void setNombre (String nombre){
       this.nombre=nombre;
   }
   
   public String getApellido(){
       return apellido;
   }
   
   public void setApellido (String apellido){
       this.apellido=apellido;
   }
   

}
