#include "dessertItem.h"
#include <string>
#include <iostream>

using namespace std;

dessertItem::dessertItem(string dessertName)
{
	setName(dessertName);
} //end constructor

string dessertItem::getName()
{
	return dessertName;
} //end function getName

void dessertItem::setName(string name)
{
	dessertName = name;
} //end function setName

void dessertItem::print()
{
	cout << dessertName << endl;
}
