public class Complex {
    private double real;
    private double imaginary;
 
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
 
    // copy constructor
    Complex(Complex other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }
 
    double getReal() { return real; }
    double getImaginary() { return imaginary; }
 
    // (a + bi) + (c + di) = (a+c) + (b+d)i
    Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }
 
    // (a + bi) - (c + di) = (a-c) + (b-d)i
    Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }
 
    // (a + bi)(c + di) = (ac - bd) + (ad + bc)i
    Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }
 
    // magnitude (distance from origin on the complex plane)
    double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
 
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            // avoids printing something ugly like "3.0 + -2.0i"
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}
 
