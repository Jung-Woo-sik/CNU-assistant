#include <iostream>
#include <string>

using namespace std;

template < typename T>
class MyArrayList {

    public:
        MyArrayList(){
            mass = new T[DEFAULT_CAPACITY];
            capacity = DEFAULT_CAPACITY;
            size = 0;
        }
        MyArrayList(int x) {
            if(x > 0)
            {
                capacity = x;
                size = 0;
                mass = new T[capacity];
            }
        }
        bool addElement(T const &x) {
            mass[size++] = x;
            return true;
        }
        
        void printIt() {
            cout << " { ";
            for(int i = 0; i < size; i++)
            {
                if(i == size -1 )
                {
                    cout << mass[i] << " }" << endl << endl;
                    return;        
                }
                cout << mass[i] << ", ";
            }
        }


    private:
        const static int DEFAULT_CAPACITY = 10;
        T * mass;
        int capacity = 0;
        int size = 0;

};




