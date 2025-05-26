//The triangle number sequence is the representation of the numbers in the form of equilateral triangle arranged in a series or sequence.
//
// what is the value of the first triangle number to have over 500 divisors?

let divisibleTriangleNumber = (n) => {
	let nd = 0;
	let ans = 0;
	let a = 1;

	while(nd <= 500){
		let sum = (a*(a+1))/2;
		nd = getFactor(sum);
		ans = sum;
		a++;
	}
	return ans;
}


let getFactor = (k) =>{
	let ans = 0;

	for(let i = 1; i * i <= k; i++){
		if(k%i == 0) ans += 2;
	}
	return ans;
}


console.log("Result is : ",divisibleTriangleNumber(500))
