package Modelo;

 //@author Javs

public class Modelo {

    public int getNumUno() {
        return numUno;
    }

    public void setNumUno(int numUno) {
        this.numUno = numUno;
    }

    public int getNumDos() {
        return numDos;
    }

    public void setNumDos(int numDos) {
        this.numDos = numDos;
    }

    public int getResul() {
        return resul;
    }

    public void setResul(int resul) {
        this.resul = resul;
    }
    
    //METODO OPERACION MULTIPLICAR
    public int multiplicar(){
        this.resul=this.numUno * this.numDos;
        return this.resul;
    }
    
    
    
    //CAMPOS DE CLASE
        private int numUno;
        private int numDos;
        private int resul;
    
}
