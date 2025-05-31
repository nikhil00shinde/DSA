//how much such routes are there through a given gridSize, only being able t0 move to the right and down.


let latticePaths = (n) => {
	let dp = [];
	for(let i = 0; i <= n; i++){
		dp[i] = [];
		for(let j = 0; j <= n; j++){
			dp[i][j] = -1;
		}
	}

	return calculatePath(n,n,dp);
}

let calculatePath = (n,m,dp) =>{
	if(n < 0 || m < 0) return 0;

	if(dp[n][m] != -1) return dp[n][m];

	if(n == 0 && m == 0) return 1;


	let left = calculatePath(n,m-1,dp);
	let up   = calculatePath(n-1,m,dp);

	dp[n][m] = left + up;
	return dp[n][m];
}


console.log("Result is : ",latticePaths(20))
