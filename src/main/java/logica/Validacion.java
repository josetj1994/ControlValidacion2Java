/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import gui.TBAutoValidador;

/**
 *
 * @author JoséGonzálezIzquierd
 */
public class Validacion {
    TBAutoValidador tbAutoValidador;

    public Validacion(){
    }
    
        public void Validar(TBAutoValidador tbAutoValidador) {
        switch(tbAutoValidador.TipoValidacion){
            case("CP"):
                if(tbAutoValidador.getIntroduce().getText().length()==5){
                   tbAutoValidador.getMensaje().setText("Codigo Postal Correcto");
                   tbAutoValidador.Correcto=true;
                }
                else{
                    tbAutoValidador.getMensaje().setText("Codigo Postal Erroneo");
                    tbAutoValidador.Correcto=false;
                }
                break;
            case("DNI"):
                if(tbAutoValidador.getIntroduce().getText().length()==9){
                    tbAutoValidador.getMensaje().setText("DNI Correcto");
                    tbAutoValidador.Correcto=true;
                }
                else{
                    tbAutoValidador.getMensaje().setText("DNI Erroneo");
                    tbAutoValidador.Correcto=false;
                }
                break;
            default:
                tbAutoValidador.getMensaje().setText("Debe introducir un tipo de validacion");
        }
        if(tbAutoValidador.Correcto==true){
            tbAutoValidador.MensajeComprobacion="Todo Correcto";
            System.out.println(tbAutoValidador.MensajeComprobacion);
        }
        else{
            tbAutoValidador.MensajeComprobacion=tbAutoValidador.getMensaje().getText();
            System.out.println(tbAutoValidador.MensajeComprobacion); 
        }
    }
}
