package com.jr.games.battleporks.actores;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ActorFuente extends Actor {
	BitmapFont fuente;
	String texto;
	public ActorFuente(BitmapFont font){
		fuente = font;

	}
	public void setTexto(String text){
		texto = text;
	}
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		Color color = getColor();
		batch.setColor(color.r, color.g, color.b, color.a*parentAlpha);
		fuente.draw(batch, texto, getX(), getY());
	}

}
