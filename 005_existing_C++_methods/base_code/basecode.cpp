// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Please enter your symbol"<<endl;
	char sym;
	cin>>sym;
	cout<<"How many times?"<<endl;
	int x;
	cin>>x;
	cout<<"Vertical,horizontal, or diagonal? (v,h, or d)"<<endl;
	char y;
	cin>>y;
	if(y=='h'){
		int i;
		for(i = 0;i < x; i++){
	cout<<sym;
		}
	}
		else if(y=='v'){
		int i;
	for(i = 0;i < x; i++){
		cout<<sym<<endl;
	}
	}
	else if(y=='d'){
		for(int i= 1; i<100;i++){
			gotoxy(20, i+4);
			cout<<" "<<;
			gotoxy(20, i+5);
			cout<<sym<<endl;
		}
	
		}
	}
	
