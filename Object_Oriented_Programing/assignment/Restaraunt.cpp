#include <string>
#include <iostream>
#include "Building.h"
#include "Restaraunt.h"

using namespace std;

Restaraunt::Restaraunt(string name, int squareFootage, int stories, double assessmentValue, int capacity)
	:Building(name, squareFootage, stories, assessmentValue)
{
	setCapacity(capacity);
}
//end constructor

void Restaraunt::setCapacity(int c)
{
	capacity = c;
}
//end mutator setCapacity

int Restaraunt::getCapacity()
{
	return capacity;
}
//end accessor getCapacity

void Restaraunt::print()
{
	Building::print();
	cout << "Capacity: " << getCapacity() << endl;
}
