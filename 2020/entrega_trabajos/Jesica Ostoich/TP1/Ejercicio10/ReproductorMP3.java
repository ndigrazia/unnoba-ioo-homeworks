

public class ReproductorMP3
{
    //ATRIBUTOS
    private String color;
    private float precio;
    private String marca;
    private String modelo;
   
    //ATRIBUTOS EN FUNCION DEL USUARIO
    public int volumenMax=15;
    public int volumenMin=0;
    public int volumenActual=10;
    public int maxCanciones=10;
    public int cancionActual=1;
    public boolean encendido;
    
    //OPERACIONES
    void SubirVolumen(){
        if((volumenActual<volumenMax) && (encendido==true)){
            volumenActual++;
        }
    }
    
    void BajarVolumen(){
        if ((volumenActual>volumenMin) && (encendido==true)){
            volumenActual--;
        }
    }
    
    void encender(){
        encendido=true;
    }
    
    void apagar(){
        encendido=false;
    }
    
    void CambiarCancion(){
        if ((cancionActual<maxCanciones) && (encendido==true)){
            cancionActual++;
        }
    }
    
    void retrocederCancion(){
        if ((cancionActual>1) && (encendido==true)){
            cancionActual--;
        }
    }
    
    //SETTERS
    public void SetcolorMP3(String colorMP3){
        color=colorMP3;
    }
    public void SetmarcaMP3(String marcaMP3){
        marca=marcaMP3;
    }
    public void SetmodeloMP3(String modeloMP3){
        modelo=modeloMP3;
    }
    public void SetprecioMP3(int precioMP3){
        precio=precioMP3;
    }
    
    //GETTERS
    
    public boolean Getencendido(){
        return encendido;
    }
    public int GetCancionActual(){
        return cancionActual;
    }
    
}
