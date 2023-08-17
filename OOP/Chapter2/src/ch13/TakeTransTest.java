package ch13;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Thomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus200 = new Bus(200);

        studentJ.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        studentT.takeSubway(greenSubway);

        studentJ.showInfo();
        studentT.showInfo();
        greenSubway.showSubwayInfo();
        bus200.showBusInfo();
        bus100.showBusInfo();
    }

}
