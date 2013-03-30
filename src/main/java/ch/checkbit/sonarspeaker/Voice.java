package ch.checkbit.sonarspeaker;

import com.sun.speech.freetts.VoiceManager;

class Voice {
	private String name;
	private com.sun.speech.freetts.Voice systemVoice;

	public Voice(String name) {
		this.name = name;
		this.systemVoice = VoiceManager.getInstance().getVoice(this.name);
//		com.sun.speech.freetts.Voice[] voices = VoiceManager.getInstance()
//				.getVoices();
//		for (int i = 0; i < voices.length; i++) {
//			System.out.println(voices[i].getName());
//		}
		this.systemVoice.allocate();
	}

	public void say(String[] thingsToSay) {
		for (int i = 0; i < thingsToSay.length; i++) {
			this.say(thingsToSay[i]);
		}
	}

	public void say(String thingToSay) {
		this.systemVoice.speak(thingToSay);
	}

	public void dispose() {
		this.systemVoice.deallocate();
	}
}