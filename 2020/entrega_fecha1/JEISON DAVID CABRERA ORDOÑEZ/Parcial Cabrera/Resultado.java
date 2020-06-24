import java.util.*;
public class Resultado
{
    private Date fechaResultado;
    private Institucion miInstitucion;
    private Test miTest;
    private boolean positivo;
    public void setFechaResultado(Date fechaResultado){
        this.fechaResultado=fechaResultado;
    }
    public void setMiInstitucion(Institucion miInstitucion){
        this.miInstitucion=miInstitucion;
    }
    public void setTest(Test test){
        this.miTest=test;
    }
    public void setPositivo(boolean positivo){
        this.positivo=positivo;
    }
    public Date getFechaResultado(){
        return fechaResultado;
    }
    public Institucion getMiInstitucion(){
        return miInstitucion;
    }
    public Test getMiTest(){
        return miTest;
    }
    public boolean getPositivo(){
        return positivo;
    }
}
