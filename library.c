#include <stdlib.h>
#include <stdio.h>
     
/*void read(int n) {
    scanf("%d",&n); 
    return n;
}

void print(bool b){
 if(b){
    printf("YES");
 }else{
    printf("NO");
 }
}*/
     
int read() {
    int n;
    scanf("%d",&n); 
    return n;
}

int printInt(int a) {
        printf("%d\n", a);
        return 0;
}

int iexp(int a, int b) {
        int ret = 1;
        for (int i = 0; i < b; i++) {
                ret *= a;
        }
        return ret;
}
