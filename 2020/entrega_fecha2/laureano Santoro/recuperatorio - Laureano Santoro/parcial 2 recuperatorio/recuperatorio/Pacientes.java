import java.util.Date; 

public class Pacientes extends Persona
{
    
    private Date fechaIngreso;
    private Localidad localidadProviene;
    private Salas salaAlojado;
    
    private void setLocalidad(Localidad localidadProviene){
    
       this.localidadProviene= localidadProviene;
       
      }
    
    private Localidad getLocalidad(){
    
        return localidadProviene;
    }
    
    private void setfechaIngreso(Date fechaIngreso){
    
        this.fechaIngreso= fechaIngreso;
    }
    
    private Date getfechaIngreso(){
    
        return fechaIngreso;
    }
    
    private void setSala(Salas salaAlojado){
       
        this.salaAlojado= salaAlojado;
    }
    
    private Salas getSala(){
        
        return salaAlojado;
    }
   
    
   }

