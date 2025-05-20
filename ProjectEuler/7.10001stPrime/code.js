//what is the 10001st prime number?

let nthPrime = (n) => {
	//we can use the sieve erath. or normal way by using sqaure root way
        let start = 2;
	while(n > 0){
		if(isPrime(start)){
			n--;
		//	console.log(start)
		}
	  start++;
	}
   return start-1;
}

let isPrime = (n) =>{

	for(let i = 2; i*i <= n; i++){
		if(n%i == 0) return false;
	}
	return true;
}

console.log("Result is : "+nthPrime(10001));
