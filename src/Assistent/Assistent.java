package Assistent;

public class Assistent {

    int addTwoNumber(int a, int b) {
        return a + b;
    }
    int pow(int a, int b) {
        int daraja = 1;
        for (int i = 0; i < b; i++) {
            daraja *= a;
        }
        return daraja;
    }
    int abs(int a) {
        if (a > 0)  return a;
        return a * (-1);
    }
    int getWholeSection(double a){
        if (a>=0) return (int) (a);
        return (int) a-1;
    }
}