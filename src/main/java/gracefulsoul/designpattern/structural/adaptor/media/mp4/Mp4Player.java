package gracefulsoul.designpattern.structural.adaptor.media.mp4;

import gracefulsoul.designpattern.structural.adaptor.media.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// Do nothing.
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name : " + fileName);
	}

}
