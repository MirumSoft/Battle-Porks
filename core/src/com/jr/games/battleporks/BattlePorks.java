package com.jr.games.battleporks;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.jr.games.battleporks.recursos.Pantalla;
import com.jr.games.battleporks.screens.PantallaMenu;

public class BattlePorks extends Game {
	
	public SpriteBatch batch;
	public AssetManager manejador;
	
	public Pantalla Menu;
	
	@Override
	public void create () {
		
		/*
		 * Recursos generales para el juego
		 * batch ->	SpriteBatch encargado de mostrar todos los graficos en el juego
		 * manejador ->	AssetManager que moderara la carga de recursos para cada pantalla
		 */
		
		manejador = new AssetManager();
		batch = new SpriteBatch();
		/*
		 * Pantallas del juego
		 * Menu ->	Primer pantalla a mostrar con los botones para navegar entre
		 * 			las pantallas de opciones y jugar
		 */
		
		Menu = new PantallaMenu(this,new Vector2(0, -9.8f),true);
		
		setScreen(Menu);
	}
}
