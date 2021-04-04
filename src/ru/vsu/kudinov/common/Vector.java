package ru.vsu.kudinov.common;

public class Vector
{
    private double x;
    private double y;
    private double z;

    public Vector (double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getZ()
    {
        return z;
    }

    public double calculateLengthOfVector()
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector calculateSumOfVectors(Vector vector)
    {
        double xCoordinate = getX() + vector.getX();
        double yCoordinate = getY() + vector.getY();
        double zCoordinate = getZ() + vector.getZ();

        return new Vector(xCoordinate, yCoordinate, zCoordinate);
    }

    public Vector calculateDifferenceOfVectors(Vector vector)
    {
        double xCoordinate = getX() - vector.getX();
        double yCoordinate = getY() - vector.getY();
        double zCoordinate = getZ() - vector.getZ();

        return new Vector(xCoordinate, yCoordinate, zCoordinate);
    }

    public Vector calculateProductOfVectorByNumber(double number)
    {
        double xCoordinate = getX() * number;
        double yCoordinate = getY() * number;
        double zCoordinate = getZ() * number;

        return new Vector(xCoordinate, yCoordinate, zCoordinate);
    }

    public double calculateScalarProductOfVectors(Vector vector)
    {
        return getX() * vector.getX() + getY() * vector.getY() + getZ() * vector.getZ();
    }

    public Vector calculateVectorProductOfVectors(Vector vector)
    {
        double xCoordinate = getY() * vector.getZ() - getZ() * vector.getY();
        double yCoordinate = getZ() * vector.getX() - getX() * vector.getZ();
        double zCoordinate = getX() * vector.getY() - getY() * vector.getX();

        return new Vector(xCoordinate, yCoordinate, zCoordinate);
    }

    public double calculateCos(Vector vector)
    {
        return calculateScalarProductOfVectors(vector) / (calculateLengthOfVector() * vector.calculateLengthOfVector());
    }

    public double calculateProjectionOfVector(Vector vector)
    {
        return calculateScalarProductOfVectors(vector) / vector.calculateLengthOfVector();
    }
}
