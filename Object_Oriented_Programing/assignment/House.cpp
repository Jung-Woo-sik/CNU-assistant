#include <string>
#include <iostream>
//#include "Building.h"
#include "House.h"

using namespace std;

House::House(string name, int squareFootage, int stories, double assessmentValue, int beds, int baths)
	:Building(name, squareFootage, stories, assessmentValue)
{
	setBeds(beds);
	setBaths(baths);
}
//end constructor

void House::setBeds(int b)
{
	beds = b;
}
//end mutator setBeds

void House::setBaths(int b)
{
	baths = b;
}
//end mutator setBaths

int House::getBeds()
{
	return beds;
}
//end accessor getBeds

int House::getBaths()
{
	return baths;
}
//end accessor getBaths

void House::print()
{
	Building::print();
	cout << "Bedrooms: " << getBeds() << endl;
	cout << "Baths: " << getBaths() << endl;
}
