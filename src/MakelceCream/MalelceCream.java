package MakelceCream;

import MathAssistent.MathAssistent;

public class MalelceCream {

    int milk;
    int sugar;

    public MalelceCream(int milk, int sugar) {
        this.milk = milk;
        this.sugar = sugar;
    }

    void addMilk(int a) {
        milk += a;
    }

    void addSugar(int b) {
        sugar += b;
    }

    int maxIceamCreamCount(int a, int b) {
        int a1 = milk / a;
        int b1 = sugar / b;
        if (a1 < b1) return a1;
        return b1;
    }

    void showInfo() {
        System.out.println("hozir milk => " + milk);
        System.out.println("hozir sugar => " + sugar);
    }

    void makeIceCream(int a, int b, int count) {
        if ((a * count <= milk) && (b * count <= sugar)) {
            System.out.println("milk qoldig`i => " + (milk - a * count));
            System.out.println("sugar qoldig`i => " + (sugar - a * count));
        } else {
            System.out.println("countta muzqaymoq tayyorlab bo`lmaqydi");
        }
    }
}
