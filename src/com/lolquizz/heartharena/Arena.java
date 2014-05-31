package com.lolquizz.heartharena;
import screen.AbstractScreen;
import screen.ArenaSimulatorScreen;
import screen.HeroSelectScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class Arena extends Game {
	
	public static final String TITLE = "Hearth Arena" , VERSION = "0.0.0";
	public final AbstractScreen HEROSELECT, ARENASIMULATOR;
	int i = 0;
	
	public Arena() {
		HEROSELECT = new HeroSelectScreen(this);
		ARENASIMULATOR = new ArenaSimulatorScreen(this);
	}
	
	@Override
	public void create() {
		
//		There are 3 ways to call render() method back in a non-continous render() scenario:
//		1. If there are input events (touch screen, keyboard, mouse, etc) to process
//		2. A call to Gdx.graphics.requestRendering()
//		3. A call to Gdx.app.postRunnable()
		Gdx.graphics.setContinuousRendering(false);
		Gdx.graphics.requestRendering();
		
		
		Gdx.app.log(TITLE, "create()");
		setScreen(HEROSELECT);
	}

	@Override
	public void dispose() {
		super.dispose();
		Gdx.app.log(TITLE, "dispose()");

	}

	@Override
	public void render() {
		super.render();	
		Gdx.app.log(TITLE, "render()");
        
        i++;
		System.out.println(i);

	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		Gdx.app.log(TITLE, "resize()");

	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}