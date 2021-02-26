package gracefulsoul.blog.paradigm.oop.inheritance;

/*public class Main {
	public static void main(String[] args) {
		Media media = new Movie("Green Book");
		media.play();
		media = new Music("Graceful Ghost");
		media.play();
	}
}*/

public class Main {
	public static void main(String[] args) {
		Media media = new Music("Graceful Ghost");
		media.play("the Seoul Arts Center");
	}
}
