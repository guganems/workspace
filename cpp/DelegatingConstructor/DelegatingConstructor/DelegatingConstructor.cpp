#include <iostream>
#include <ostream>

using namespace std;

class SomeClass {
public:
	SomeClass(void) : SomeClass(10) {
		wcout << L"Running SomeClass::SomeCLass(void)." << endl;
	}

	SomeClass(int value) :
		m_value(value) {
		wcout << L"Running SomeClass:SomeClass(int)." << endl;
	}

	int GetValue(void) { return m_value; }

private:
	int m_value;
};

int main(int argc, char* argv[])
{
	SomeClass someC;
	wcout << L"SomeClass::GetValue() = " << someC.GetValue() << endl;

	return 0;
}
