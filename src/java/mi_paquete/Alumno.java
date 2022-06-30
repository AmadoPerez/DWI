/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_paquete;

/**
 *
 * @author Privado
 */
public class Alumno 
{
    private String matricula,nombre,apellidoP,apellidoM;
    private int ddi,dwi,ecbd;
    private double prom;
    
 public Alumno()
 {
     matricula=apellidoP=apellidoM=nombre="";
     ddi=dwi=ecbd=0;
     prom=0.0;
 }
 public Alumno(String matricula,String nombre,String apellidoP,String apellidoM,int ddi,int dwi,int ecbd)
 {
     
     this.matricula=matricula;
     this.nombre=nombre;
     this.apellidoP=apellidoP;
     this.apellidoM=apellidoM;
     this.ddi=ddi;
     this.dwi=dwi;
     this.ecbd=ecbd;
     
 }
  public void setMatricula(String matricula)
 {
     this.matricula=matricula;
 }
   public void setNombre(String nombre)
 {
     this.nombre=nombre;
 }
    public void setApellidoP(String apellidoP)
 {
     this.apellidoP=apellidoP;
 }
     public void setApellidoM(String apellidoM)
 {
     this.apellidoM=apellidoM;
 }
      public void setDdi(int ddi)
 {
     this.ddi=ddi;
 }
     public void setDwi(int dwi)
 {
     this.dwi=dwi;
 }
     public void setEcbd(int ecbd)
 {
     this.ecbd=ecbd;
 }
 public double getProm()
 {
     prom=(ddi+dwi+ecbd)/3;
     return prom;
 }
 public String getMatricula()
 {
     return matricula;
 }
 public String getNombre()
 {
     return nombre;
 }
 public String getApellidoP()
 {
     return apellidoP;
 }
 public String getApellidoM()
 {
     return apellidoM;
 }
 public int getDdi()
 {
     return ddi;
 }
 public int getDwi()
 {
     return dwi;
 }
 public int getEcbd()
 {
     return ecbd;
 
}
}