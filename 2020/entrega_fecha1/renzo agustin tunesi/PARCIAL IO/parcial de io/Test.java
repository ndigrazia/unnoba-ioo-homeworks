import java.util.Date;

public abstract class Test{
   private Persona persona;
   private Date fechaInicio;
   
   public void setPersona(Persona persona){
       this.persona = persona;
    }
    
   public Persona getPersona(){
       return persona;
    }
   
   public void set(Date fechaInicio){
       this.fechaInicio =fechaInicio;
    }
    
   public Date get(){
       return fechaInicio;
    }
   
    public abstract float calcularTiempo();
}