//find the sum of all primes below n

let printSummation = (n)=>{
    let ans = 0;
	for(let i = 2; i < n; i++){
		if(isPrime(i)) ans += i
	}
	return ans;
}


let isPrime = (n) =>{
	for(let i = 2; i * i <= n; i++){
		if(n%i == 0) return false;
	}

	return true;
}


console.log("Result is : "+printSummation(2000000));
