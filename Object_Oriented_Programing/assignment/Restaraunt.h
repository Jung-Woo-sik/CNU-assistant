#ifndef RESTARAUNT_H
#define RESTARAUNT_H

#include <string>
#include <iostream>
#include "Building.h"

using namespace std;

class Restaraunt: public Building
{
	private:
		int capacity;

	public:
		Restaraunt(string, int, int, double, int);
		//parameters: name, squareFootage, stories, assessmentValue, capacity
		void setCapacity(int);
		int getCapacity();
		void print();
};

#endif
