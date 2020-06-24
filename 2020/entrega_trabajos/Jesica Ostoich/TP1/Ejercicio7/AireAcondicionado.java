
public class AireAcondicionado
{
    //ATRIBUTOS
    
    private String marca;
    private String modelo;
    private boolean intensidad;
    private int precio;
    private int maxTemperatura= 27;
    private int minTemperatura=15;
    
    public boolean encendido;
    public String color;
    public int TemperaturaActual=15;
    
    void encender(){
        encendido= true;
    }
    void apagar(){
        encendido=false;
    }
    void intensidadAlta(){
        intensidad=true;
    }
    void intensidadBaja(){
        intensidad=false;
    }
    void SubirTemperatura(){
        if ((TemperaturaActual<maxTemperatura) && (encendido==true)){
            TemperaturaActual++;
        }
    }
    void BajarTemperatura(){
        if ((TemperaturaActual>minTemperatura) && (encendido==true)){
            TemperaturaActual--;
        }
    }
    
    //SETTERS
    public void SetMarcaAC(String nombreMarca){
        marca=nombreMarca;
    }
    
    public void SetModeloAC(String nombreModelo){
        modelo=nombreModelo;
    }
    
    public void SetColorAC(String colorDeAC){
        color=colorDeAC;
    }
    
    //GETTERS
    public int GetTemperaturaActual(){
        return TemperaturaActual;
    }
    
    public boolean GetACEncendido(){
        return encendido;
    }
   
    
    
            
}
