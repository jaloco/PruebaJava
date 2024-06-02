package main;

import java.util.Arrays;

public class IntegerSet {
    private boolean[] conjunto; 

    public IntegerSet() {
        conjunto = new boolean[101]; 
    }

    public IntegerSet union(IntegerSet otroSet) {
        IntegerSet resultado = new IntegerSet();
        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = this.conjunto[i] || otroSet.conjunto[i];
        }
        return resultado;
    }

    public IntegerSet interseccion(IntegerSet otroSet) {
        IntegerSet resultado = new IntegerSet();
        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = this.conjunto[i] && otroSet.conjunto[i];
        }
        return resultado;
    }

    public void insertaElemento(int elemento) {
        if (elemento >= 0 && elemento <= 100) {
            conjunto[elemento] = true;
        }
    }

    public void eliminaElemento(int elemento) {
        if (elemento >= 0 && elemento <= 100) {
            conjunto[elemento] = false;
        }
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) {
                if (!first) {
                    sb.append(" ");
                }
                sb.append(i);
                first = false;
            }
        }
        return sb.toString();
    }

    public boolean igualA(IntegerSet otroSet) {
        return Arrays.equals(this.conjunto, otroSet.conjunto);
    }
}
