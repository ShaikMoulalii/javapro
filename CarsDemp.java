public class CarsDemp
{
    public static void main(String[] args)
    {
        System.out.println("Change Maruthi Alto K10 Car gear to 2 and increase the speed to 100");
        cars maruthiAltok10 = new cars();
        maruthiAltok10.changeGear(2);
        maruthiAltok10.speedUp(100);
        maruthiAltok10.printStates();
        System.out.println("------------------------------");
        System.out.println("Change Swift Car gear to 3 and increase the speed to 200");
        cars swift = new cars();
        swift.changeGear(3);
        swift.speedUp(200);
        swift.printStates();
        System.out.println("Change Swift Car gear to 1 and apply break and decrease the speed from 200 to 150");
        swift.changeGear(1);
        swift.applyBrakes(50);
        swift.printStates();
    }
}
