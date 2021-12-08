////Program to check whether a substring is present in a given string.
//
//Input Format
//
//Take a string from the user.
//Take substring to check in the given string.
//Constraints
//
//String length should not exceed 10000.
//Output Format
//
//It should print 1 if found and if not then print 0.
//Sample Input 0
//
//Hello, How are you?
//you
//Sample Output 0
//
//1
//Sample Input 1
//
//Hackerrank is good platform.
//bad
//Sample Output 1
//
//0
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char str1[10000];
    char str2[10000];
    int f=0;
    gets(str1);
    gets(str2);
    for(int i=0;str1[i]!='\0';i++){
        if(str2[0]==str1[i]){
            if(strncmp(str1+i,str2,strlen(str2))==0){
                f=1;
                break;
            }
        }
    }
    if (f==1){
        printf("1");
    }else{
        printf("0");
    }
    
   
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
