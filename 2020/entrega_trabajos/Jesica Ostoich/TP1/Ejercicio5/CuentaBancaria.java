
public class CuentaBancaria
{
//ATRIBUTOS
private String titular;
private String banco;
private int numeroCuenta;
private int fechaCreacion;
private int IDtitular;
private String ciudadTitular;
private String direccionCalle;
private int direccionNum;
private String direccion;

//ATRIBUTOS EN FUNCION DEL USUARIO
public int fechaUltExtraccion;
public float saldo=0;


public void DepositarDinero(float nuevo){
    saldo=nuevo+saldo;
}
public void ExtraerDinero(float extraccion, int fecha){
    saldo=extraccion-saldo;
    fechaUltExtraccion=fecha;
}

//SETTERS
public void SetNombreTitular(String nombre){
    titular=nombre;
    
}

public void SetFechaCeacion(int fecha){
    fechaCreacion=fecha;
}

public void SetNombreBanco(String bancoNom){
    banco=bancoNom;
}

public void SetIDtitular(int ID){
    IDtitular=ID;
}

public void SetCiudad(String ciudTitular){
    ciudadTitular=ciudTitular;
}

public void SetDireccion(String dire, int num){
    direccionCalle=dire;
    direccionNum=num;
    direccion= dire+num;
}

public void SetNroCuenta(int numero){
    numeroCuenta=numero;
}

//GETTERS

public float GetConsultaSaldo(){
    return saldo;

}
public String GetTitularNombre(){
    return titular;
}
public String GetBancoNombre(){
    return banco;
}
public int GetNumeroCuent(){
    return numeroCuenta;
}
public int GetfechaCreacion(){
    return fechaCreacion;
}
public int GetIDdeTitular(){
    return IDtitular;
}
public String GetCiudad(){
    return ciudadTitular;
}
public String GetDireccionDeTitular(){
    return direccion;
}

    }


