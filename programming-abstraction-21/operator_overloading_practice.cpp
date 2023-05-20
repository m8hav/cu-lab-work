#include <iostream>
using namespace std;

class Complex {
    public:
    int real;
    int imag;
    // public:
    Complex(){
        real = 0;
        imag = 0;
    }
    Complex(int r, int i){
        real = r;
        imag = i;
    }
    ~ Complex(){
        cout << "Complex destructor called" << endl;
    }
    void show_complex(){
        cout << real << " + " << imag << "i" << endl;
    }
    // Complex operator + (Complex c){
    //     int nr = real + c.real;
    //     int ni = imag + c.imag;
    //     return Complex(nr, ni);
    // }
};

void increment(Complex * c, int inc){
    (*c).real += inc;
    (*c).imag += inc;
}


int main(){
    
    // {
        // Complex c1(1, 2);
        // c1.show_complex();

        // increment(&c1, 6);
        // c1.show_complex();
    // }

    // // Complex c1();
    
    // Complex * c4 = new Complex();
    // (*c4).show_complex();

    // Complex c2(3, 4);
    // c2.show_complex();

    // Complex c3 = c1 + c2;
    // c3.show_complex();
    
    // (c1 + c2 + c1).show_complex();

    // int a = 23 + 45;

    // 4 + 6i;

    int arr[10];                     // implicit declaration
    int * arr2 = new int[10];        // explicit declaration

    
    // cout << "before return" << endl;

    cout << "\"word\"\%";

    return 0;
}