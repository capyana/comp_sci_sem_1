// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char sym;
	int x;
	string y;
	cout<<"Please enter your symbol";
	cin>>sym;
	cout<<"How many times?"<<endl;
	cin>>x;
	cout<<"Vertical or horizontal? (v or h)"<<endl;
	cin>>y;
	if(y=="h"){
			int i;
for(i = 0;i < x; i++){
	cout<<sym;
}
	}
else if(y=="v"){
		int i;
for(i = 0;i < x; i++){
	cout<<sym<<endl;
}
}
}





		
