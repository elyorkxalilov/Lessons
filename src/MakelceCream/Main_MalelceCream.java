package MakelceCream;

import MathAssistent.MathAssistent;

public class Main_MalelceCream {
    public static void main(String[] args) {

        MalelceCream malelceCream = new MalelceCream(20, 30);
        System.out.println("add milk => ");
        malelceCream.addMilk(15);
        System.out.println("add sugar => ");
        malelceCream.addSugar(20);
        System.out.print("bitta muzqaymoq uchun a litr sut, b kg shakar kerek bo`ladi \n hozir shuncha muzqaymoq tayyorlash mumkin => ");
        System.out.println(malelceCream.maxIceamCreamCount(10, 15));
        System.out.print("hozir shuncha maxsulot bor => ");
        malelceCream.showInfo();
        System.out.print("countta tayyorlash mumkinmi => ");
        malelceCream.makeIceCream(10, 15, 2);

    }
}
