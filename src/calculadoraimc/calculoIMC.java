/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

/**
 *
 * @author João Vitor
 */
public class calculoIMC {

    public double imc(double altura, int peso) {
        return peso / (altura * altura);
    }

    public String imc(double imc) {
        if (imc <= 18.5) {
            return "Magreza";
        } else if (imc <= 24.9) {
            return "Normal";
        } else if (imc <= 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
