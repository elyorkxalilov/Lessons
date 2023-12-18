package MyCosts;

public class MyCosts {

    String username;
    int money;

    public MyCosts(String username, int money){
        this.username = username;
        this.money = money;
    }
    void showInfo() {
        System.out.println(username);
        System.out.println(money);
    }

    int getNowMoney() {
        return money;
    }
    void spendMoney(int newmoney) {
        this.money = newmoney;
        showInfo();
    }
    void addMoney(int addSumm){
        this.money = addSumm;
        showInfo();
    }

}
