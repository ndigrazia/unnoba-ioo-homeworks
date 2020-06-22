/*
 * Recordar que clases abstractas no se instancian (no puedo realizar new Figura())
 */
public abstract class Figura
{
    //Constantes
    public static final int ROJO = 0;
    public static final int AZUL = 1;
    public static final int AMARILLO = 2;
    
    //TODO Agregar los colores que crea necesarios.
    
    private int color;
    
    public Figura(int color)
    {
        this.color = color;
    }
    
    public void setColor(int color) {
         this.color = color;
    }
    public int getColor() {
         return color;
    }

    public abstract void pintar();
    
    public abstract double area();
    
}
