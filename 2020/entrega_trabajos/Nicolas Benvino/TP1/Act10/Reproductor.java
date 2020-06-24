public class Reproductor{
    
    //   --- Atriburos descriptivos ---
    
    private int cantidadCanciones;
    
    //   --- Atributos funcionales ---
    
    private int volumen, cancionActual;
    private boolean estado=false;
    
    //   --- Contructor ---

    public Reproductor(int cantidadCanciones){
        this.cantidadCanciones = cantidadCanciones;
    } // Instancia la cantidad de canciones
    
    //   --- Operaciones ---
    
    public void Prender(){
        if (estado == false){
            estado = true;
            volumen = 50;
            cancionActual = 1;
        }
    } // Si el dispositivo esta apagado, lo prende, reproduce la primer cancion de la lista y pone el volumen a la mitad.
    
    public void Apagar(){
        if (estado==true) 
            estado = false;
    } // Apaga el dispositivo si esta prendido
    
    public void SubirVolumen(){
        if (volumen < 100)
            volumen++;
    } // Sube el volumen, maximo 100
    
    public void BajarVolumen(){
        if (volumen > 0)
            volumen--;
    } // Baja el volumen, minimo 0
    
    public void PasarCancion(){
        if (estado == true){
            if (cancionActual < cantidadCanciones)
                cancionActual++;
            else
                cancionActual = 1;
        }
    } // Pasa a la siguiente cancion, si esta en la ultima vuelve al inicio.
    
    public void VolverCancion(){
        if (estado == true){
            if (cancionActual != 1)
                cancionActual--;
            else
                cancionActual = cantidadCanciones;
        }
    } // Vuelve a la cancion anterior, si esta en la primera pasa a la ultima.
    
    //   --- Getters ---
    
    public int getCantidadCanciones(){
        return cantidadCanciones;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public int getCancionActual(){
        return cancionActual;
    }
    
    public boolean getEstado(){
        return estado;
    }
}