#ifndef SUNDAE_H
#define SUNDAE_H

#include "Icecream.h"
#include <string>

using namespace std;

class Sundae: public IceCream
{
	private:
		double costOfTopping;

	public:
		Sundae(double, bool, int, string);
		//parameters: costOfTopping, type, numberOfScoops, dessertName
		void setCostOfTopping(double);
		double getCostOfTopping();
		void print();
		double getCost();
};


#endif
