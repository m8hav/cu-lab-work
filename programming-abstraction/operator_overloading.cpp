#include <iostream>
using namespace std;

// April 17, 2023

// Creating a class Complex that implements the functionality of complex numbers
// and overloads the + and - operators to add and subtract two complex numbers


class Complex{

    // Data Members
    float real, imag;

    public:
    // Default Constructor
    Complex(){
        this->real = 0;
        this->imag = 0;
    }
    // Parameterized Constructor
    Complex(float real, float imag){
        this->real = real;
        this->imag = imag;
    }
    // Copy Constructor
    Complex(Complex &c){
        this->real = c.real;
        this->imag = c.imag;
    }
    // Member Functions for adding and subtracting two Complex objects
    Complex add(Complex c){
        Complex temp(0, 0);
        temp.real = this->real + c.real;
        temp.imag = this->imag + c.imag;
        return temp;
    }
    Complex sub(Complex c){
        Complex temp(0, 0);
        temp.real = this->real - c.real;
        temp.imag = this->imag - c.imag;
        return temp;
    }
    // Operator Overloading for adding and subtracting two Complex objects
    Complex operator +(Complex c){
        Complex temp(0, 0);
        temp.real = this->real + c.real;
        temp.imag = this->imag + c.imag;
        return temp;
    }
    Complex operator -(Complex c){
        Complex temp(0, 0);
        temp.real = this->real - c.real;
        temp.imag = this->imag - c.imag;
        return temp;
    }
    // Operator Overloading pre increment and pre decrement operators
    void operator ++(){
        this->real++;
        this->imag++;
    }
    void operator --(){
        this->real--;
        this->imag--;
    }
    // Operator Overloading post increment and post decrement operators
    // use int in bracket no matter the datatype to indicate post operation
    void operator ++(int){
        this->real++;
        this->imag++;
    }
    void operator --(int){
        this->real--;
        this->imag--;
    }
    void show(){
        cout << real << " + " << imag << "i" << endl;
    }
};


int main(){

    cout << endl;

    // Creating two Complex objects
    Complex c1(3.37, 4.938);
    c1.show();
    Complex c2(5.408, 6.039);
    c2.show();

    // add member function
    Complex c3 = c1.add(c2);
    c3.show();
    // subtract member function
    Complex c4 = c1.sub(c2);
    c4.show();
    
    // + operator overloading
    Complex c5 = c1 + c2;
    c5.show();
    // - operator overloading
    Complex c6 = c1 - c2;
    c6.show();

    // adding multiple Complex objects using + operator overloading
    Complex c7 = c1 + c2 + c3 + c4 + c5 + c6;
    c7.show();

    // subtracting multiple Complex objects using - operator overloading
    Complex c8 = c1 - c2 - c3 - c4 - c5 - c6;
    c8.show();

    // pre incrementing Complex object
    ++c1;
    c1.show();
    // post incrementing Complex object
    c2++;
    c2.show();

    return 0;
}