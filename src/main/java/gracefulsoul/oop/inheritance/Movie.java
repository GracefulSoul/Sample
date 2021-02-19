package gracefulsoul.oop.inheritance;

public class Movie extends Media {
	public Movie(String name) {
		super(name);
	}
	@Override
	public void play() {
		System.out.printf("The movie(%s) is played.%n", this.name);
	}
	@Override
	public void play(String place) {
		System.out.printf("The media(%s) is played in %s.%n", this.name, place);
	}
}
