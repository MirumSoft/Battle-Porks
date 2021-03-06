package com.jr.games.battleporks.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jr.games.battleporks.BattlePorks;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 768;
		config.height = 512;
		new LwjglApplication(new BattlePorks(), config);
	}
}
