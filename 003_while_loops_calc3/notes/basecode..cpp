// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
int x=0;
char quit ='x';

while(true){
	cout<<"you've been gnomed";
	cin>>quit;
	if(quit == 'q'){
		break;
	}
	if(x == 100){
		break;
	}
	x = x + 1;
	//x++
}
}
