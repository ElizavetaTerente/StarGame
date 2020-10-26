package ru.geekbrains.math;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class MatrixUtils {
    public static void calcTransitionMatrix(Matrix4 mat, Rect from, Rect to) {
        // Dummy implementation
        mat.idt(); // identity matrix
    }

    public static void calcTransitionMatrix(Matrix3 mat, Rect from, Rect to) {
        mat.idt();
    }
}
