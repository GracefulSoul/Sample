package gracefulsoul.paradigm.oop.solid.srp;

import java.time.LocalDateTime;

public class Music {

	private String name;
	private String artist;
	private LocalDateTime releaseDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	// This code is violate the single responsibility principle.
	public void playMusic() {
		System.out.printf("The song(%s) is playing now.", this.name);
	}

}
