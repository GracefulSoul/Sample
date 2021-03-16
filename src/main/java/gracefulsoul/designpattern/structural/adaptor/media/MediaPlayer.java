package gracefulsoul.designpattern.structural.adaptor.media;

import gracefulsoul.designpattern.structural.adaptor.media.audio.AudioType;

public interface MediaPlayer {

	public void play(AudioType audioType, String fileName);

}
