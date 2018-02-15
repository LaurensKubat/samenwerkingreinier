#include <stdio.h>

int main(int argc, char *argv[]) {
  int acount = 0, ccount = 0, gcount = 0, tcount = 0;
  FILE *fp = fopen("genome.txt", "r");
  int in;
  while ((in = fgetc(fp)) !=EOF){
    if (in != 'A' || in != 'C' || in != 'G' || in != 'T' || in != '\n')
      printf("woops");
      return -1;
    if (in == 'A'){
      acount++;
    }
    if (in == 'C'){
      ccount++;
    }
    if (in == 'G'){
      gcount++;
    }
    if (in == 'T'){
      tcount++;
    }
    printf("loop");
  }
  printf("%d", acount);
  return 0;
}
  
