package MyCosts;

public class Main_MyCosts {
    public static void main(String[] args) {

        MyCosts myCosts = new MyCosts("Dollor",100);
        myCosts.showInfo();
        myCosts.getNowMoney();
        myCosts.spendMoney(20);
        myCosts.addMoney(120);
    }
}
