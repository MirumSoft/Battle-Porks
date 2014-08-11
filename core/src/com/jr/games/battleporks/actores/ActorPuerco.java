package com.jr.games.battleporks.actores;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ActorPuerco extends Actor {
	Sprite puerco;
	Color color;
	public ActorPuerco(Sprite pork) {
		puerco = pork;
	}
	public void rotar(float rotar){
		puerco.rotate(rotar);
	}
	@Override
	public void draw(Batch batch, float alpha){
		color = getColor();
		batch.setColor(color.r, color.g, color.b, color.a*alpha);
			puerco.draw(batch);
	}
	public void update(){
		puerco.setCenter(getCenterX(), getCenterY());
		puerco.setPosition(getX(), getY());
		puerco.setColor(color);
	}
	
}
