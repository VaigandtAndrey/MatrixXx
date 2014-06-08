package com.epam.vaigandt;

import java.io.IOException;

public class MatrixRunner {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Matrix first = new Matrix(1, 2);
        MatrixUtil.fill(first);
        MatrixUtil.print(first);
        Matrix second = new Matrix(2, 3);
        MatrixUtil.fill(second);
        MatrixUtil.print(second);
        Matrix finalMatrix = first.multiply(second);
        MatrixUtil.print(finalMatrix);

    }
}
