#include <string>
#include <iostream>
#include <iomanip>

#include "Building.h"
#include "House.h"
#include "School.h"
#include "Restaraunt.h"

using namespace std;

int main()
{
	cout << fixed << setprecision(2);

	Building b("Flea Market", 30000, 2, 1000000);
	b.print();

	House h("Sunset Ridge", 2400, 1, 140000, 3, 2);
	h.print();

	School s("Oakview Elementary", 20000, 1, 2000000, 40);
	s.print();

	Restaraunt r("Red Lobster", 5000, 2, 500000, 200);
	r.print();
}
