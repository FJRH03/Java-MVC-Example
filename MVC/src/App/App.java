package App;

//@author: Francisco Ramirez

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.VISTA;

public class App {
    
    public static void main(String[] args) {
        
        Modelo mod = new Modelo();
        VISTA view = new VISTA();
        
        Controlador ctrl = new Controlador(view, mod);
        ctrl.iniciar();
        view.setVisible(true);
        
                
        
    }
    
}
