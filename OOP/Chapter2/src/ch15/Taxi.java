package ch15;

public class Taxi {
    int profit;
    String name;

    public Taxi(String name){
        this.name = name;
    }

    public void take(int amount){
        this.profit += amount;
    }

    public void showTaxiInfo(){
        System.out.println(name + "택시 수입은 " + profit + " 입니다.");
    }

}
