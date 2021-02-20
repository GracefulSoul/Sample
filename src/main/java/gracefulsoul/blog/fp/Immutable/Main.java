package gracefulsoul.blog.fp.Immutable;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
		Musician musician = new Musician("George Winston");
		System.out.println(musician.getName());
		// Using reflection.
		Field name = musician.getClass().getDeclaredField("name");
		name.setAccessible(true);
		name.set(musician, "Steve Barakatt");
		// Change name.
		System.out.println(musician.getName());
	}
}
