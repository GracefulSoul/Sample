package gracefulsoul.paradigm.oop.solid.dip;

public class Computer {

	private final Monitor monitor;
	private final KeyBoard keyboard;
	private final Mouse mouse;

	public Computer(Monitor monitor, KeyBoard keyboard, Mouse mouse) {
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

}
