import java.util.Date;

public class Tarea
{
   private Date vencimiento;
   private int prioridad;
   private Persona responsable;
   private String descripcion;
   
   // Getter y Setter de vencimiento
    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    // Getter y Setter de prioridad
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    // Getter y Setter de responsable
    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    // Getter y Setter de descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}