package com.somnium;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.somnium.world.World;

public class Core extends ApplicationAdapter {
	SpriteBatch batch;
	World currentWorld;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		currentWorld = new World();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		currentWorld.update();
		currentWorld.render(batch);
	}
	
	@Override
	public void dispose () {
	    currentWorld.dispose();
		batch.dispose();
	}
}
