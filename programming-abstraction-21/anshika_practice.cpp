// #include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Shape {
    private:
    int width;
    int height;

    protected:
    int area;

    public:
    int z = 10;

    Shape(int w, int h)
    {
        width = w;
        height = h;
    }
    ~Shape(){}

    int getArea(){
        return width*height;
    }
    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }
};
class Square : public Shape {
    
};

int main(){

    cout << "start" << endl;

    int w, h;
    cin >> w >> h;

    Shape s(w, h);

    cout << s.z << endl;
    s.z = 20;
    cout << s.z << endl;
    cout << s.getArea() << endl;
    cout << s.getWidth() << endl;
    cout << s.getHeight() << endl;
    
    delete &s;
}