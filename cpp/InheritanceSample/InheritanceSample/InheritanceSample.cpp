#include "pch.h"
#include <iostream>
#include <ostream>
#include <string>
#include <typeinfo>
#include "pchar.h"

using namespace std;

class A {
public:
	A (void) : SomeInt(0) { }
	virtual ~A(void) { }

	const wchar_t* Id(void) const { return L"A"; }

	virtual const wchar_t* VirtId(void) const { return L"A"; }

	int GetSomeInt(void) const { return SomeInt; }

	int SomeInt;
};

class B1 : virtual public A {
public:
	B1(void) :
		A(),
		m_fValue(10.0f) {
		SomeInt = 10;
	}

	virtual ~B1(void) { }

	const wchar_t* Id(void) const { return L"B1"; }

	virtual const wchar_t* VirtId(void) const override {
		return L"B1";
	}

	const wchar_t* Conflict(void) const { return L"B1::Conflict()"; }

private:
	float m_fValue;
};

class B2 : virtual public A {
public:
	B2(void) : A() { }
	virtual ~B2(void) { }

	const wchar_t* Id(void) const { return L"B2"; }

	virtual const wchar_t* VirtId(void) const override {
		return L"B2";
	}

	const wchar_t* Conflict(void) const { return L"B2::Conflict()"; }
};

class B3 : public A {
public:
	B3(void) : A() { }
	virtual ~B3(void) { }

	const wchar_t* Id(void) const { return L"B3"; }

	virtual const wchar_t* VirtId(void) const override {
		return L"B3";
	}

	const wchar_t* Conflict(void) const { return L"B3::Conflict()"; }
};

class VirtualClass : virtual public B1, virtual public B2 {
public:
	VirtualClass(void):
		B1(),
		B2(),
		m_id(L"VirtualClass") { }

	virtual ~VirtualClass(void) { }

	const wchar_t* Id(void) const { return m_id.c_str(); }

	virtual const wchar_t* VirtId(void) const override {
		return m_id.c_str();
	}

private:
	wstring m_id;
};

class NonVirtualClass : public B1, public B3 {
public:
	NonVirtualClass(void) :
		B1(),
		B3(),
		m_id(L"NonVirtualClass") { }

	virtual ~NonVirtualClass(void) { }

	const wchar_t* Id(void) const { return m_id.c_str(); }

	virtual const wchar_t* VirtId(void) const override {
		return m_id.c_str();
	}

private:
	wstring m_id;
};

void DemonstrateNonVirtualInheritance(void) {
	NonVirtualClass nvC = NonVirtualClass();

	nvC.B1::SomeInt = 20;
	nvC.B3::SomeInt = 20;

	B1& nvCB1 = nvC;
	B3& nvCB3 = nvC;

	A& nvcAfromB1 = nvCB1;
	A& nvcAfromB3 = nvCB3;

	wcout << L"B1::SomeInt = " << nvCB1.SomeInt << endl <<
		L"B3::SomeInt = " << nvCB3.SomeInt << endl << endl;

	++nvCB1.SomeInt;
	nvCB3.SomeInt += 20;

	wcout << L"B1::SomeInt = " << nvCB1.SomeInt << endl <<
		L"B3::SomeInt = " << nvCB3.SomeInt << endl << endl;

	wcout <<
		typeid(nvC).name() << endl <<
		nvC.Id() << endl <<
		nvC.VirtId() << endl <<
		nvC.B3::Conflict() << endl <<
		nvC.B1::Conflict() << endl <<
		endl <<

		typeid(nvCB3).name() << endl <<
		nvCB3.Id() << endl <<
		nvCB3.VirtId() << endl <<
		nvCB3.Conflict() << endl <<
		endl <<

		typeid(nvCB1).name() << endl <<
		nvCB1.Id() << endl <<
		nvCB1.VirtId() << endl <<
		nvCB1.Conflict() << endl <<
		endl;
}

void DemonstrateVirtualInheritance(void) {
	VirtualClass vC = VirtualClass();

	vC.SomeInt = 20;

	A& vCA = vC;
	B1& vCB1 = vC;
	B2& vCB2 = vC;

	wcout <<
		L"B1::SomeInt = " << vCB1.SomeInt << endl <<
		L"B2::SomeInt = " << vCB2.SomeInt << endl <<
		endl;

	++vCB1.SomeInt;
	vCB2.SomeInt += 20;

	wcout <<
		L"B1::SomeInt = " << vCB1.SomeInt << endl <<
		L"B2::SomeInt = " << vCB2.SomeInt << endl <<
		endl;

	wcout <<
		typeid(vC).name() << endl <<
		vC.Id() << endl <<
		vC.VirtId() << endl <<
		vC.B2::Id() << endl <<
		vC.B2::VirtId() << endl <<
		vC.B1::Id() << endl <<
		vC.B1::VirtId() << endl <<
		vC.A::Id() << endl <<
		vC.A::VirtId() << endl <<
		vC.B2::Conflict() << endl <<
		vC.B1::Conflict() << endl <<
		vC.GetSomeInt() << endl <<
		endl <<

		typeid(vCB2).name() << endl <<
		vCB2.Id() << endl <<
		vCB2.VirtId() << endl <<
		vCB2.Conflict() << endl <<
		endl <<

		typeid(vCB1).name() << endl <<
		vCB1.Id() << endl <<
		vCB1.VirtId() << endl <<
		vCB1.GetSomeInt() << endl <<
		vCB1.Conflict() << endl <<
		endl <<

		typeid(vCA).name() << endl <<
		vCA.Id() << endl <<
		vCA.VirtId() << endl <<
		vCA.GetSomeInt() << endl <<
		endl;
}

int main()
{
    std::cout << "Hello World!\n"; 
}
