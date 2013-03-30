package ch.checkbit.sonarspeaker;

import java.util.Random;

public class MainSpeaker {

	public static void main(String[] args) {
		System.out.println("Started..");

		Voice voiceKevin16 = new Voice("kevin16");

		String[] goodThingsToSay = new String[] { "Good job folks!",
				"Well done, fellows!",
				"Ahoy! I I captain! Land on the horizon.",
				"All is sunshine rainbow candy cotton and unicorns." };

		while (true) {

			try {
				Random r = new Random();
				int rand = r.nextInt(goodThingsToSay.length);
				voiceKevin16.say(goodThingsToSay[rand]);
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
