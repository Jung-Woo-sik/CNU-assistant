#include <iostream>

using namespace std;

int main(){
	int num1, num2;
	cout << "input 2 number : ";
	cin >> num1 >> num2;

	try{
		if(num2==0)
			throw num2;
		cout << "quotient : " << num1/num2 << endl;
		cout << "remainder : " <<num1%num2 << endl;
	}
	catch(int expn){
		cout << "The divisor can nat be" << expn <<"." << endl;
		cout << "Please restat the program" << endl;
	}
	return 0;
}
