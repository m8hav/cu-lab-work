#include <iostream>
using namespace std;

// April 17, 2023

// Creating a template function greaterElement that finds the greater element
// between two given elements of any given datatype


template <typename T>
T greaterElement(T a, T b){
    return (a > b) ? a : b;
}

int main(){

    cout << greaterElement<int>(3, 7) << endl;
    cout << greaterElement<char>('c', 'j') << endl;
    cout << greaterElement<double>(7.234, 2.943) << endl;

    return 0;
}