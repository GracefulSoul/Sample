package gracefulsoul.blog.paradigm.oop.inheritance;

public class Media {
	public String name;
	public Media(String name) {
		this.name = name;
	}
	public void play() {
		System.out.printf("The media(%s) is played.%n", this.name);
	}
	public void play(String place) {
		System.out.printf("The media(%s) is played in %s.%n", this.name, place);
	}
}
