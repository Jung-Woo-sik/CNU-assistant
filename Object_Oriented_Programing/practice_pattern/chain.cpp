#include <iostream>

using namespace std;

class Handler
{
	public:
		Handler(Handler *pHandle) : pHandler(pHandle) {}
		~Handler(){if(pHandler) delete pHandler;}

	public:
		virtual void handleRequest(int i){
			if(pHandler != NULL){
				pHandler->handleRequest(i);
			}
		}

	private:
		Handler *pHandler;
};

class ConcreteHandler1: public Handler
{
	public:
		ConcreteHandler1(Handler *pHandle) : Handler(pHandle) {}

	public:
		void handleRequest(int i) override
		{
			if (i % 2 == 0)
				cout << "even number" << endl;
			else
				Handler::handleRequest(i);
		}
};

class ConcreteHandler2: public Handler
{
	public:
		ConcreteHandler2(Handler *pHandle) : Handler(pHandle) {}

	public:
		void handleRequest(int i) override
		{
			if (i % 2 != 0)
				cout << "odd number" << endl;
			else
				Handler::handleRequest(i);
		}
};

int main(int argc, char* argv[])
{
	Handler *pHandler = new ConcreteHandler1(new ConcreteHandler2(NULL));

	pHandler -> handleRequest(25);

	delete pHandler;

	return 0;
}
