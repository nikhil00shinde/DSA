// Find the sum of the digits in the number 100!

let sumFactorialDigits = (n) => {
	let start = "1";

	for(let i = 1; i <= n; i++){
		let str = i.toString();
		start = multiply(start,i+"");
                console.log(start,i)

	}
	return start;
}


let multiply = (a,b) => {
	let ans = "0";
	let k = 0;
	for(let i = a.length-1; i >= 0; i--){
			let fm = parseInt(a[i]);
			let carry = 0;
			let sans = "";
			b = b.toString();
			for(let j = b.length-1; j >= 0; j--){
                              let sm = parseInt(b[j]);
				
			      let temp = sm*fm + carry;
			       carry = parseInt(temp/10);
			      let digit = parseInt(temp%10);

			      if(j == 0){
					digit = temp.toString().split('').reverse().join('')
					carry = 0	
			      }
			      sans += digit;
			}
			let ll = 0;
			sans = sans.split('').reverse().join('')
			while(ll < k){
				sans += '0';
				ll++;
			}
			k++;
			//console.log(sans)
			ans = add(ans,sans)
	}
	return ans.toString();	
}

let add = (a,b) =>{
	let n = a.length;
	let m = b.length;
	let carry = 0;
	let ans = ""
	let ia = n - 1;
	let ib = m - 1;

	while(ia >= 0 || ib >= 0){
		let ae = 0;
		let be = 0;
		if(ia >= 0) ae = parseInt(a[ia]);
		if(ib >= 0) be = parseInt(b[ib]);
		let ne = ae + be + carry;
		//console.log(ae,be)
		carry = parseInt(ne/10);
		let nae = parseInt(ne%10);
		//console.log(carry,nae)
		//console.log("------------")
		ans += nae;
		ia--;
		ib--;
	}
	if(carry > 0) ans += carry
	return ans.split("").reverse().join("");
}


//console.log(multiply("19","5432"))
let num = sumFactorialDigits(100);

let ans  = 0;

for(let i = 0; i < num.length; i++){
	ans += parseInt(num[i])
}

console.log(ans)

