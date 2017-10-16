public class Main {

    public static void main(String[] args) {
	// write your code here
        Car civic = new Car("Honda", 5, 4, true);

        civic.startEngine();
        civic.showInformation();
        civic.move(5, 45);
        civic.accelerate(10);
        civic.accelerate(20);
    }
}
