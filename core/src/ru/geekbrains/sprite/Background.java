package ru.geekbrains.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.math.Rect;

public class Background {

    private TextureRegion region;
    private Rect worldBounds;

    public Background(Texture texture) {
        this.region = new TextureRegion(texture);
        this.worldBounds = new Rect();
    }

    public void resize(Rect worldBounds) {
        this.worldBounds.setSize(worldBounds.getWidth(), worldBounds.getHeight());
        this.worldBounds.setLeft(worldBounds.getLeft());
        this.worldBounds.setBottom(worldBounds.getBottom());
    }

    public void draw(SpriteBatch batch) {
        batch.draw(
                region,
                worldBounds.getLeft(), worldBounds.getBottom(),
                worldBounds.getWidth(), worldBounds.getHeight()
        );
    }
}
