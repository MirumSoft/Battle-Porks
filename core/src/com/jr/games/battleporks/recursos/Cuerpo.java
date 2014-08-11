package com.jr.games.battleporks.recursos;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.Shape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Cuerpo extends Actor{
	/*
	 * Recursos Generales
	 */
	private ArrayList<Body> cuerpos;
	private ArrayList<Sprite> texturas;
	private ArrayList<Fixture> fixture;
	private Vector2 velocidad;
	private Vector2 posicion;
	private BodyDef bodyDef;
	private FixtureDef fixtureDef;
	private BodyDef.BodyType type;
	private PolygonShape shape;
	private Vector2[] vertices;
	private float densidad;
	private float friccion;
	private float restitucion;
	
	public void crear(World mundo) {
		bodyDef = new BodyDef();
		bodyDef.type = type;
		bodyDef.position.set(posicion);
		
		cuerpos = new ArrayList<Body>();
		cuerpos.add(mundo.createBody(bodyDef));
		
		shape = new PolygonShape();
		shape.set(vertices);
		
		fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = densidad;
		fixtureDef.friction = friccion;
		fixtureDef.restitution = restitucion;
		
		fixture = new ArrayList<Fixture>();
		fixture.add(cuerpos.get(0).createFixture(fixtureDef));
		
		shape.dispose();
		
	}
	public Cuerpo(){
	}
	public void caminar(float mover){
		
	}
	public ArrayList<Sprite> getTexturas() {
		return texturas;
	}
	public void setTexturas(ArrayList<Sprite> texturas) {
		this.texturas = texturas;
	}
	public Vector2 getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Vector2 velocidad) {
		this.velocidad = velocidad;
	}
	public Vector2 getPosicion() {
		return posicion;
	}
	public void setPosicion(Vector2 posicion) {
		this.posicion = posicion;
	}
	public FixtureDef getFixtureDef() {
		return fixtureDef;
	}
	public void setFixtureDef(FixtureDef fixtureDef) {
		this.fixtureDef = fixtureDef;
	}
	public BodyDef.BodyType getType() {
		return type;
	}
	public void setType(BodyDef.BodyType type) {
		this.type = type;
	}
	public PolygonShape getShape() {
		return shape;
	}
	public void setShape(PolygonShape shape) {
		this.shape = shape;
	}
	public Vector2[] getVertices() {
		return vertices;
	}
	public void setVertices(Vector2[] vertices) {
		this.vertices = vertices;
	}
	public float getDensidad() {
		return densidad;
	}
	public void setDensidad(float densidad) {
		this.densidad = densidad;
	}
	public float getFriccion() {
		return friccion;
	}
	public void setFriccion(float friccion) {
		this.friccion = friccion;
	}
	public float getRestitucion() {
		return restitucion;
	}
	public void setRestitucion(float restitucion) {
		this.restitucion = restitucion;
	}

}
