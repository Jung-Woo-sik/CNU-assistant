#include "Sundae.h"
#include <string>
#include <iostream>

using namespace std;

Sundae::Sundae(double cost, bool type, int numberOfScoops, string dessertName)
	: IceCream(type, numberOfScoops, dessertName)
{
	dessertItem::setName(dessertName);
	IceCream::setType(type);
	IceCream::setNumberOfScoops(numberOfScoops);
	setCostOfTopping(cost);
}//end constructor

void Sundae::setCostOfTopping(double cost)
{
	costOfTopping = cost;
}//end function setCostOfTopping

double Sundae::getCostOfTopping()
{
	return costOfTopping;
}//end function getCostOfTopping

void Sundae::print()
{
	dessertItem::print();
	cout << IceCream::getNumberOfScoops() << " scoops" << endl;
	cout << "+ " << getCostOfTopping() << " toppings" << endl; 
}//end function print

double Sundae::getCost()
{
	return IceCream::getCost() + getCostOfTopping();

}
