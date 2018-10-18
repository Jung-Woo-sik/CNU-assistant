#include "Icecream.h"
#include <string>
#include <iostream>

using namespace std;

IceCream::IceCream(bool type, int scoops, string dessertName)
	: dessertItem(dessertName)
{
	dessertItem::setName(dessertName);
	setNumberOfScoops(scoops);
	setType(type);
}//end constructor

void IceCream::setNumberOfScoops(int scoops)
{
	numberOfScoops = scoops;
}//end function setNumberOfScoops

int IceCream::getNumberOfScoops()
{
	return numberOfScoops;
}//end function getNumberOfScoops

void IceCream::setType(bool type)
{
	isCone = type;
}//end function setType

bool IceCream::getType()
{
	return isCone;
}//end function getType

void IceCream::print()
{
	dessertItem::print();
	cout << numberOfScoops << " scoops";
	if(isCone)
		cout << " + cone" << endl;
	else cout << endl;
}//end function print

double IceCream::getCost()
{
	double cost = numberOfScoops * 1.00;
	if(isCone)
		cost += .50;
	return cost;
}
