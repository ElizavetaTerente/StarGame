package ru.geekbrains.base;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.math.Rect;

public class Sprite {

    protected TextureRegion region;
    protected final Vector2 pos = new Vector2(); // position of center
    protected float height;
    protected float aspect;

    public Sprite(TextureRegion region) {
        this.region = region;
    }

    public void draw(SpriteBatch batch) {
        float width = height * aspect;
        batch.draw(
                region,
                pos.x - width / 2,
                pos.y - height / 2,
                width,
                height
        );
    }

    public void setHeightProportion(float height) {
        this.height = height;
        float regionWidth = region.getRegionWidth();
        float regionHeight = region.getRegionHeight();
        this.aspect = regionWidth / regionHeight;
    }

    public void resize(Rect worldBounds) {
        // Optional: to be overridden
    }

    public void update(float delta) {
        // Optional: to be overridden
    }

    public boolean touchDown(Vector2 touch, int pointer, int button) {
        // Optional: to be overridden
        return false;
    }

    public boolean touchUp(Vector2 touch, int pointer, int button) {
        // Optional: to be overridden
        return false;
    }

    public boolean touchDragged(Vector2 touch, int pointer) {
        // Optional: to be overridden
        return false;
    }
}
