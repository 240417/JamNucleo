/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.jamnucleo;

import java.util.List;
import mx.itson.jam.nucleo.execepciones.*;

/**
 *
 * @author medin
 */
public class Operacion {
    
    public int sumar(int a, int b){
    return a+b;
}
    public double calcularIVA(double importe, double tasaIVA) throws ImpuestoException {
        if(tasaIVA !=8 || tasaIVA !=16){
            throw new ImpuestoException("La tasa de IVA solo puede ser del 8% o del 16%");
        }
        
        return(importe * (tasaIVA/100));
    }
    
    public int sumaNumeros(List<Integer> num) throws CapacidadException {
        if(num.isEmpty()){
            throw new CapacidadException("La lista esta vacia");
        }
        if(num.size()>10){
            throw new CapacidadException("La lista no puede ser mayor a 10 numeros");
        }
        int resultado = 0;
        for(int a =0 ; a< num.size(); a++){
        resultado += num.get(a);
        }
        
        return(resultado);
    }
}
