//What is the smallest positve number that is evenly divisible by all of the number from 1 to n?


let smallestMult = (n)=>{
	//for these I have used sieve of eartosthenes --> which is used to tell the prime number by calculating multiple of each number number 
	
	let arr = []

	for(let i = 0; i <= n; i++){
		arr.push(i)
	}

	for(let i = 2; i <= n; i++){
		for(let j = i+1; j <= n; j++){
			if(arr[j]%arr[i] == 0) arr[j] = arr[j]/arr[i]
		}
	}

	let ans = 1
	for(let i = 1; i <= n; i++){
		ans *= arr[i]
	}

	return ans
}

console.log("Result is: "+smallestMult(20))
