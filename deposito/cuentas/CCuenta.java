package cuentas;
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    //métodos getter
    public String getNombre(){
    	return this.nombre;
    }
    
    public String getCuenta(){
    	return this.cuenta;
    }
    
    public double getSaldo(){
    	return this.saldo;
    }
    
    public double getTipoInterés(){
    	return this.tipoInterés;
    }
    
    //Metodos setter
    void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    void setCuenta (String cuenta) {
    	this.cuenta= cuenta;
    }
    
    void setSaldo (double saldo) {
    	this.saldo= saldo;
    }
    
    void setTipoInterés(double tipoInterés) {
    	this.tipoInterés= tipoInterés;
    }
}

