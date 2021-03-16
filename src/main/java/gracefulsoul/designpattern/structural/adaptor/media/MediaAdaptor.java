package gracefulsoul.designpattern.structural.adaptor.media;

import gracefulsoul.designpattern.structural.adaptor.media.audio.AudioType;
import gracefulsoul.designpattern.structural.adaptor.media.mp4.Mp4Player;
import gracefulsoul.designpattern.structural.adaptor.media.vlc.VlcPlayer;

public class MediaAdaptor implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdaptor(AudioType audioType) {
		switch (audioType) {
			case VLC:
				advancedMediaPlayer = new VlcPlayer();
				break;
			case MP4:
				advancedMediaPlayer = new Mp4Player();
				break;
			default:
				break;
		}
	}

	@Override
	public void play(AudioType audioType, String fileName) {
		switch (audioType) {
			case VLC:
				advancedMediaPlayer.playVlc(fileName);
				break;
			case MP4:
				advancedMediaPlayer.playMp4(fileName);
				break;
			default:
				break;
		}
	}

}
