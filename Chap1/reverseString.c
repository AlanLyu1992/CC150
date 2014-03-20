#include <stdio.h>
void reverse(char* s);
int main(char** args) {
    char strings[][10]= {"","a","abc","bcd","efg"};
    int i = 0;
    int m = sizeof(strings);
    int n = sizeof(char*);
    printf("%d %d", m, n);
    for(; i < m/10; i++) {
        puts(strings[i]);
        reverse(strings[i]);
        puts(strings[i]);
    }
    //reverse(s);
    return 0;
}
void reverse(char* s) {
    //char* s = str;
    char* end = s;
    char temp;
    if(s){
        while(*end) {
            end++;
        }
        end--;
        while(s < end) {
            temp = *end;
            *end-- = *s;
            *s++ = temp;
        }
    }
}

