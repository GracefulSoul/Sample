package gracefulsoul.designpattern.behavioral.observer.observer;

import gracefulsoul.designpattern.behavioral.observer.subject.Subject;

public abstract class Observer {

	protected Subject subject;

	public abstract void update();

}