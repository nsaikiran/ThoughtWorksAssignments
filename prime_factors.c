# include <stdio.h>
# include <stdlib.h>
# include <math.h>

int* primes 	 = NULL;
int* primefactors= NULL;

int SIZ	=BUFSIZ;
int LEN	=0;

enum boolean {
	FALSE,
	TRUE
	};

void generate_primes(int range){
	primes		= (int*) malloc(SIZ);
	primes[0]	= 2;
	primes[1]	= 3;
	
	LEN 		= 2;
	int isprime	= TRUE;
	int num		= 4;

	for ( ;num<=range;++num){
		isprime	=TRUE;
		for (int index	=0;primes[index] <= sqrt(num) && index<LEN;++index) {
			if (! (num%primes[index])) isprime=FALSE;
			if (isprime == FALSE) break;
			}
		//printf("? %d- %d\n",num,isprime);
		if (isprime == TRUE)
			primes[LEN++]=num;
		
		//This part can be useful if we use long int or higher range of integers.
		if (LEN >= SIZ){
			SIZ+=SIZ;
			primes=(int*) realloc(primes,SIZ);
			}
		}
	}

int* generate(void){
	int num;
	scanf("%d",&num);
	generate_primes(sqrt(num));
	int* prime_factors=(int*)malloc(sqrt(num));
	int len=0;
	//printf("%d %d \n",LEN,(int)sqrt(num));
	for (int index=0;index<LEN;++index)
		if (! (num%primes[index])) prime_factors[len++]=primes[index];
	prime_factors[len]=-1;	//we will insert -1 to mark the end of valid data.
	free(primes);//FREE the allocated
	return prime_factors;
	}

int main(void) {
	int* prime_factors=generate();
	int index=0;
	while ( prime_factors[index]!= -1) printf("%d, ",prime_factors[index++]);
	printf("\n");
	return EXIT_SUCCESS;
	}



