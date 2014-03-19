#include <stdio.h>
int main(char** args) {
    char strings[][10]= {"abc","bcd","efg"};
    int i = 0;
    for(; i < sizeof(strings)/sizeof(char*); i++) {
        puts(strings[i]);
        reverse(strings[i]);
        puts(strings[i]);
    }
    return 0;
}
void reverse(char* s) {
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

