int x:=2;
int y:=3;
def int add(int a,int b){
	int c := a + b;	
	ret c;
}
add(x,y+1);

def int pr(int x){
	int i:=1;
	while (i - 10) {
      	  i := i + 1;	
	}
	ret x+i;
}
int t:=15;

for(int i:=0;i*i<25;i+=1){
int k :=i-10;
pr(k);
}
pr(t);

