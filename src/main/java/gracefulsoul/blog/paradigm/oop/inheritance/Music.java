package gracefulsoul.blog.paradigm.oop.inheritance;

public class Music extends Media {
	public Music(String name) {
		super(name);
	}
	@Override
	public void play() {
		System.out.printf("The music(%s) is played.%n", this.name);
	}
	@Override
	public void play(String place) {
		System.out.printf("The music(%s) is played in %s.%n", this.name, place);
	}
}
