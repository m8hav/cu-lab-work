#include <iostream>
using namespace std;

// April 17, 2023

// Creating a template class Stack that implements the stack functionality
// with elements of any given datatype


template <typename T>
class Stack{
    int top;
    int size;
    T * arr;

    public:
    Stack(int size){
        this->size = size;
        top = -1;
        arr = new T[size];
    }
    void push(T a){
        if (top == size-1){
            cout << "Stack Overflow" << endl;
        }
        else {
            top++;
            arr[top] = a;
        }
    }
    T pop(){
        if (top == -1) {
            cout << "Stack Underflow" << endl;
            return -1;
        }
        else {
            return arr[top--];
        }
    }
    void show(){
        if (top == -1){
            cout << "Stack is empty" << endl;
        }
        for (int i = 0; i <= top; i++){
            cout << arr[i] << " ";
        }
        cout << endl;
    }
    void clear(){
        top = -1;
    }
    bool isEmpty(){
        if (top == -1) return true;
        else return false;
    }
    bool isFull(){
        if (top == size-1) return true;
        else return false;
    }
};

int main(){

    cout << endl;

    Stack <float> s(5);
    s.push(7.3856);
    s.push(4.3856);
    s.push(8.3856);
    s.push(2.3856);
    s.push(9.3856);
    cout << "Stack after pushing 5 elements:" << endl;
    s.show();
    cout << endl;

    cout << "Checking if stack full" << endl;
    cout << s.isFull() << endl;
    cout << endl;
    
    cout << "Pushing another element after stack full:" << endl;
    s.push(1.12746);
    cout << endl;

    cout << "Popping last 2 elements:" << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << endl;

    cout << "Stack after popping 2 elements:" << endl;
    s.show();
    cout << endl;

    s.clear();
    cout << "Stack after clearing:" << endl;
    s.show();
    cout << endl;

    cout << "Checking if stack empty" << endl;
    cout << s.isEmpty() << endl;
    cout << endl;

    cout << "Popping after clearing elements:" << endl;
    cout << s.pop() << endl;
    cout << endl;

    return 0;
}