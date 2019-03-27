#pragma once
#include <string>

namespace Inventory {
	enum class VehicleCondition;

	class Vehicle {
	public:
		Vehicle(VehicleCondition condition, double pricePaid);

		~Vehicle(void);

		void setVehicleCondition(VehicleCondition condition);

		double GetBasis(void) { return m_basis; };

	private:
		VehicleCondition m_condition;
		double m_basis;
	};
}