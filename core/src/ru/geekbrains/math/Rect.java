package ru.geekbrains.math;

public class Rect {
    private float left, bottom, width, height;

    public Rect() {
        this(0, 0, 1, 1);
    }

    public Rect(float left, float bottom, float width, float height) {
        this.left = left;
        this.bottom = bottom;
        this.width = width;
        this.height = height;
    }

    public void setSize(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public void setLeft(float left) {
        this.left = left;
    }

    public void setBottom(float bottom) {
        this.bottom = bottom;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getLeft() {
        return left;
    }

    public float getBottom() {
        return bottom;
    }
}