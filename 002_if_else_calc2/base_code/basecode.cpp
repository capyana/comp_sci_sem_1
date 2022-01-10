// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Please enter an integer"<<endl;
	int a;
	cin>>a;
	cout<<"Please enter a second integer"<<endl;
	int b;
	cin>>b;
	cout<<"Please enter an operation:+,-,*,/"<<endl;
	char kevin;
	cin>>kevin;
	char add;
	add='+';
	char sub;
	sub='-';
	char mult;
	mult='*';
	char divi;
	divi='/';
	if( kevin ==add){
		cout<<a+b;
	}
		else if (kevin== sub){
			cout<<a-b;
		}
			else if(kevin==mult){
				cout<<a*b;
			}
			else if(kevin==divi){
				cout<<a/b;
			}
				
			
			int zoe = 7;
	}	
	