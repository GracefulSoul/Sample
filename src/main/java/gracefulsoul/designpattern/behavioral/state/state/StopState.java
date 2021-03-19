package gracefulsoul.designpattern.behavioral.state.state;

import gracefulsoul.designpattern.behavioral.state.context.Context;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Stop State";
	}

}
