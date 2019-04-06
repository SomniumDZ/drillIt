package com.somnium.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GameObject extends Sprite {
    public GameObject(Texture texture) {
        super(texture);
    }

    public abstract void update();

    public void render(SpriteBatch batch){

    }

    public void dispose() {
        getTexture().dispose();
    }
}
