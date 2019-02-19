import controller.AutoFactory;

public class AutoRun {
    public static void main(String[] args) {
        AutoFactory af = new AutoFactory();
        af.addAuto("BMW","X5", 250000);
        af.addAuto("Audi","A6", 200000);
        af.addAuto("VW","Passat", 150000);
        af.addAuto("Opel","Insignia", 100000);
        af.addEqipment(1,"Skóra naturalna", 10000);
        af.addEqipment(1,"opony zimowe", 2000);
        af.addEqipment(10,"opony zimowe", 2000);
        af.deleteAutoById(2);
        af.getAllAutos();
//        System.out.println(af.getAutosList());
//        System.out.println(af.searchById(1));
    }
}
