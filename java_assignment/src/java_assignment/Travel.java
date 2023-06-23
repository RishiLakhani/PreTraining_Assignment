package java_assignment;

public class Travel {
	public static void main(String[] args) {
		Air a = new Air();
		Water w = new Water();
		Land l = new Land();
		a.mode();
		a.vehicles();
		a.numberOfWheels();
		System.out.println();
		w.mode();
		w.vehicles();
		w.numberOfWheels();
		System.out.println();
		l.mode();
		l.vehicles();
		l.numberOfWheels();
	}
}
