package ru.khasang.rgbcircles;

/**
 * Created by igor on 20.10.15.
 */
public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void redraw();

    void showMessage(String text);
}
