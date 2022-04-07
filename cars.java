
public class cars
{
    int gear = 1;
    int speed = 0;
    void changeGear(int newValue)
    {
        gear = newValue;
    }
    void speedUp(int increment)
    {
        speed = speed + increment;
    }
    void applyBrakes(int decrement)
    {
        speed = speed - decrement;
    }
    void printStates()
    {
        System.out.println( "gear:" + gear+" speed:" + speed );
        System.out.println("hlo world");
    }
}