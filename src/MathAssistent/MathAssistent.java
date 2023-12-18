package MathAssistent;

public class MathAssistent {

    int number;

    public MathAssistent(int number){
        this.number = number;
    }
    int pow(int degree) {
        int daraja = 1;
        for (int i = 0; i < degree; i++) {
            daraja *= number;
        }
        return daraja;
    }

    int summDegreeNumber() {
        int summ = 0;
        while (number > 0) {
            summ += number % 10;;
            number /= 10;
        }
        return summ;
    }
}
