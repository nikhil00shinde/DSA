//Collatz Sequence --> all starting number finish at 1
// n = n/2 (n is even)
// n = (3*n + 1) (n is odd)




let longestCollatzSequence = (limit) => {
	let dp = [0,0];

	for(let i = 2; i <= limit; i++){
		calculateLength(dp,i);
	}

	let ans = 0;
	let max = 0;

	for(let i = 0; i <= limit; i++){
		if(dp[i] > max){
			max = dp[i];
			ans = i;
		}
	}
	return ans;
}


let calculateLength = (dp,n) =>{
	let count = 0;
	while(n > 1){
		if(typeof dp[n] != 'undefined'){
			count += dp[n];
			break;
		}

		if(n%2 == 0){
			n = n/2;
		}else{
			n = 3*n + 1
		}
		count++;
	}
	dp.push(count);
}


console.log("Result is : ",longestCollatzSequence(1000000));
