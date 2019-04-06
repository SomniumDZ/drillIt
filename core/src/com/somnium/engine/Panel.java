package com.somnium.engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.somnium.objects.GameObject;

import java.util.ArrayList;

public class Panel {
    private ArrayList<GameObject> children;

    public Panel() {
        this.children = new ArrayList<>();
    }

    public void update(){
        children.forEach(GameObject::update);
    }

    public void render(SpriteBatch batch){
        children.forEach(gameObject -> render(batch));
    }

    public ArrayList<GameObject> getChildren() {
        return children;
    }

    public void dispose() {
        children.forEach(GameObject::dispose);
    }
}
