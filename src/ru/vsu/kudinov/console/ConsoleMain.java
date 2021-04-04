package ru.vsu.kudinov.console;

import ru.vsu.kudinov.common.Vector;

public class ConsoleMain {

    public static void main(String[] args)
    {
        Vector v1 = new Vector(1, 4, 0);
        Vector v2 = new Vector(4, 2, 4);

        printResult(v1.calculateSumOfVectors(v2));
        printResult(v1.calculateDifferenceOfVectors(v2));
        System.out.println(v1.calculateLengthOfVector());
        printResult(v1.calculateProductOfVectorByNumber(2));
        System.out.println(v1.calculateScalarProductOfVectors(v2));
        System.out.println(v1.calculateCos(v2));
        System.out.println(v1.calculateProjectionOfVector(v2));
    }

    private static void printResult(Vector vector)
    {
        StringBuilder finalVector = new StringBuilder();
        finalVector.append("x: " + vector.getX() + " ");
        finalVector.append("y: " + vector.getY() + " ");
        finalVector.append("z: " + vector.getZ());
        System.out.println(finalVector.toString());
    }

}
