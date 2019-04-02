#include "pch.h"
#include <iostream>
#include <ostream>
#include <string>
#include <iomanip>
#include "Vehicle.h"
#include "VehicleCondition.h"
#include "pchar.h"

using namespace Inventory;
using namespace std;

int _pmain(int, _pchar)
{
	auto vehicle = Vehicle(VehicleCondition::Excellent, 325844942.65);
	auto condition = vehicle.GetVehicleCondition();
	wcout << L"The Vehicle is in " << GetVehicleConditionString(condition).c_str() << L" Condition. Its basis is $" << setw(10) << setprecision(2) << setiosflags(ios:fixed) << vehicle.GetBasis() << L"." << endl;
}
