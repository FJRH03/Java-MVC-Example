package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.VISTA;

 //@author Javs
 
public class Controlador implements ActionListener{

    //CAMPOS DE CLASE
    private VISTA view;
    private Modelo model;
    
    public Controlador (VISTA view, Modelo model){
        this.view=view;
        this.model=model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumUno(Integer.parseInt(view.txtNum1.getText()));
        model.setNumDos(Integer.parseInt(view.txtNum2.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResul()));
    }
    
    
}
