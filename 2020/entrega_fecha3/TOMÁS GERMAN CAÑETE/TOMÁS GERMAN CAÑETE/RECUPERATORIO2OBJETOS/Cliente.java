public class Cliente
{
    private Persona persona;
    private Institucion institucion;
    private boolean espersona;
    private int IDcliente;

    public Cliente(int IDcliente){
        setIDCliente(IDcliente);
    }
    public void setIDCliente(int IDcliente){
    this.IDcliente=IDcliente;
    }
    public void addInstitucion(Institucion institucion){
    this.institucion=institucion;
    this.espersona=false;
    }
    public void addPersona(Persona persona){
    this.persona=persona;
    this.espersona=true;
    }
    public Persona getPersona(){return this.persona;}
    public Institucion getInstitucion(){return this.institucion;}
    public boolean getEsPersona(){return this.espersona;}
    
}
