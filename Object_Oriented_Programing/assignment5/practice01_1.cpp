#include <iostream>

using namespace std;

int main(){
	int num1, num2;
	cout << "input 2 number: ";
	cin >> num1 >> num2;

	if(num2==0)
		cout << "The divisor can not be zero. Please restart the program" << endl;
	else{
		cout << "quotient : " << num1/num2;
		cout << "remainder : " <<num1%num2 << endl;
	}

	return 0;
}

