package com.jr.games.battleporks.screens;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.World;
import com.jr.games.battleporks.BattlePorks;
import com.jr.games.battleporks.recursos.Cuerpo;
import com.jr.games.battleporks.recursos.Pantalla;

public class PantallaMenu extends Pantalla {

	World mundo;
	Box2DDebugRenderer render;
	public PantallaMenu(BattlePorks game, Vector2 gravity, boolean sleep) {
		super(game, gravity, sleep);
		
	}
	public void show(){

		super.show();
		
		mundo = new World(gravedad,dormir);
		render = new Box2DDebugRenderer();
		
		setRGB(0, 0, 0);
		
		// Create our body definition
		BodyDef groundBodyDef =new BodyDef();  
		// Set its world position
		groundBodyDef.position.set(new Vector2(4, 2));  

		// Create a body from the defintion and add it to the world
		Body groundBody = mundo.createBody(groundBodyDef);  

		// Create a polygon shape
		PolygonShape groundBox = new PolygonShape();  
		// Set the polygon shape as a box which is twice the size of our view port and 20 high
		// (setAsBox takes half-width and half-height as arguments)
		groundBox.setAsBox(camara.viewportWidth, 10.0f);
		// Create a fixture from our polygon shape and add it to our ground body  
		groundBody.createFixture(groundBox, 0.0f); 
		// Clean up after ourselves
		groundBox.dispose();
		
		/*Cuerpo prueba = new Cuerpo();
		prueba.setType(BodyType.StaticBody);
		prueba.setPosicion(new Vector2(100, 100));
		
		Vector2[] vertices = new Vector2[5];
		
		vertices[0] = new Vector2(0, 0);
		vertices[1] = new Vector2(4, 0);
		vertices[2] = new Vector2(3, 4);
		vertices[3] = new Vector2(5, 2);
		vertices[4] = new Vector2(3, 0);
		
		prueba.setVertices(vertices);
		prueba.setDensidad(0.2f);
		prueba.setFriccion(0.2f);
		prueba.setRestitucion(0.2f);
		
		prueba.crear(mundo);
		*/

	}
	public void render(float delta) {
		super.render(delta);
		mundo.step(delta, 8, 6);
		render.render(mundo, camara.combined);
	}
}
