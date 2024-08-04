public class Triangle {
    double a;
    double b;
    double c;

    public double area () {
        double Perimeter = (a + b + c) / 2;
        return Math.sqrt(Perimeter * (Perimeter - a) * (Perimeter - b) * (Perimeter - c));
    }
}
