#ifndef HOUSE_H
#define HOUSE_H

#include <string>
#include <iostream>
#include "Building.h"

using namespace std;

class House: public Building
{
	private:
		int beds;
		int baths;

	public:
		House(string, int, int, double, int, int);
		//parameters: name, squareFootage, stories, assessmentValue, beds, baths
		void setBeds(int);
		void setBaths(int);
		int getBeds();
		int getBaths();
		void print();
};

#endif
