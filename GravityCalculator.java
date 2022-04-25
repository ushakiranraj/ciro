public class GravityCalculator
{
    public static void main(String[] arguments) {
        double gravity = 9.81;
        double t=10.0;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        double a=0.5*gravity*t*t+(initialVelocity)+initialPosition;
        System.out.println("The object's position after " +t +" seconds is " +a + " m.");
    }
}
