let sumSquareDifference = (n)=>{
	let sumOfSquares = (n*(n+1)*(2*n + 1))/6
	let sumOfNumber = (n*(n+1))/2
	sumOfNumber *= sumOfNumber
	return sumOfNumber - sumOfSquares 
}

console.log("Result is : ", sumSquareDifference(100))
