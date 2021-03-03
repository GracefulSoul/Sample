package gracefulsoul.paradigm.oop.solid.dip;

public class WrongComputer {

	private final LCDMonitor monitor;
	private final MechanicalKeyBoard keyboard;
	private final GamingMouse mouse;

	public WrongComputer() {
		this.monitor = new LCDMonitor();
		this.keyboard = new MechanicalKeyBoard();
		this.mouse = new GamingMouse();
	}

}
