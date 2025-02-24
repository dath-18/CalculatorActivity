package mx.uv.fiee.iinf.poo.calculator;

public class Calculator<T extends Number> {

    private T[] lista;

    public Calculator(T[] listado) {
        lista = listado;
    }

    //Funcion con un tipo específico
//    Calculator(Double[] doubleNums) {
//        lista = (T[]) doubleNums;
//    }
//    Calculator(Integer[] intNums) {
//        lista = (T[]) intNums;
//    }
//    Calculator(Float[] floNums) {
//        lista = (T[]) floNums;
//    }
    public double average() {
        double sum = 0;
        for (int i = 0; i < lista.length; i++) {
            sum += lista[i].doubleValue();
        }
        return sum / lista.length;
    }
}
