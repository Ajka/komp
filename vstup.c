extern def void print(int i);
extern def int read();

def int primes(int n){
    for(int i:=2;i*i<=n;i+=2) {
        if(n%i==0){
            ret 0;
        } 
    }
    ret 1;
}

 
      int p:=0;
      int isPrime:=0; 
      p:=read();

      if (p >= 2) {
	    int k:=2;
            print(k);
            for (int i := 3; i <=p; i+=1) {
                isPrime:=primes(i);
                if(isPrime==1){
                   print(i);
                }
            }
      }

