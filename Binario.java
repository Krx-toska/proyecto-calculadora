package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Binario {

    public static ArrayList<String> toBinary(List<String> expresion){
        ArrayList<String> expresionEnBinario = new ArrayList<String>();
        String numerosTemp = "", toBinaryTemp = "";
        int number;
        String operadores = "+-x/^()";
        for (int i = 0; i < expresion.size(); i++) {
            if (operadores.contains(expresion.get(i))) {
                number = Integer.parseInt(numerosTemp);
                toBinaryTemp = Integer.toBinaryString(number);
                for (int j = 0; j < toBinaryTemp.length(); j++) {
                    expresionEnBinario.add(toBinaryTemp.substring(j, j+1));
                }
                expresionEnBinario.add(expresion.get(i));
                numerosTemp = "";
            }else{
                numerosTemp += expresion.get(i);
            }
        }
        number = Integer.parseInt(numerosTemp);
        toBinaryTemp = Integer.toBinaryString(number);
        for (int j = 0; j < toBinaryTemp.length(); j++) {
            expresionEnBinario.add(toBinaryTemp.substring(j, j+1));
        }
        return expresionEnBinario;
    }

    public static ArrayList<String> toDecimal(List<String> expresion){
        ArrayList<String> expresionEnDecimal = new ArrayList<String>();
        String binaryTemp = "", toNumberTemp = "";
        int number;
        String operadores = "+-x/^()";
        for (int i = 0; i < expresion.size(); i++) {
            if (operadores.contains(expresion.get(i))) {
                number = Integer.parseInt(binaryTemp,2);
                toNumberTemp = String.valueOf(number);
                for (int j = 0; j < toNumberTemp.length(); j++) {
                    expresionEnDecimal.add(toNumberTemp.substring(j, j+1));
                }
                expresionEnDecimal.add(expresion.get(i));
                binaryTemp = "";
            }else{
                binaryTemp += expresion.get(i);
            }
        }
        number = Integer.parseInt(binaryTemp,2);
        toNumberTemp = String.valueOf(number);
        for (int j = 0; j < toNumberTemp.length(); j++) {
            expresionEnDecimal.add(toNumberTemp.substring(j, j+1));
        }
        return expresionEnDecimal;
    }
    
}
