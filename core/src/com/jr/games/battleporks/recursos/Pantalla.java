package com.jr.games.battleporks.recursos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.jr.games.battleporks.BattlePorks;

public class Pantalla implements Screen {
	/*
	 * Recursos generales
	 */
	protected BattlePorks juego;
	protected Stage stage;
	protected AssetManager manejador;
	protected String[][] recursos;
	protected OrthographicCamera camara;
	private float R,G,B;
	protected float w;
	protected float h;
	//private Box2DDebugRenderer render;
	protected Vector2 gravedad;
	protected boolean dormir;
	//public World mundo;
	public Pantalla(BattlePorks game,Vector2 gravity, boolean sleep) {
		juego = game;
		manejador = game.manejador;
		gravedad = gravity;
		dormir = sleep;
	}
	public void setRGB(int r, int g, int b){
		R = r/100f;
		G = g/100f;
		B = b/100f;
	}
	@Override
	public void render(float delta) {
		//Gdx.gl.glClearColor(R, G, B, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camara.update();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		camara = new OrthographicCamera(w/100,h/100);
		stage = new Stage(new ExtendViewport(w, h, camara));
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
