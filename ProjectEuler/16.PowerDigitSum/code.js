//what is the sum of the digits of the number 2^{exponent}?
//2^15 == 32768 and the sum of its digits is 3+2+7+6+8 = 26

let powerDigitSum = (exponent) => {
	let i = 2;
	let ans = "2";
	while(i <= exponent){
		ans = multiply(ans);
		i++;
	}

	let sum = 0;
	for(i = 0; i < ans.length; i++){
		sum += ans[i] - '0';
	}
	return sum;
}

let multiply = (num) => {
	let ans = "";

	let carrier = 0;
	for(let i = num.length - 1; i >= 0; i--){
		let k = num[i] - '0';
		k = k*2 + carrier;
		carrier = parseInt(k/10);
		let r = k%10;
		ans += r;
	}

	if(carrier != 0) ans += carrier;
	return ans.split('').reverse().join('');
} 

console.log("Result is : "+powerDigitSum(1000));
