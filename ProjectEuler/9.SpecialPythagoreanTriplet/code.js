//There exists exactly one pythogorean triplet for which a + b + c = 1000. Find the product abc
// A pythagorean triplet is set of three natural numbers, a < b < c for which, a^2 + b^2 = c^2
let specialPythagoreanTriplet = (n) => {
	let sumOfabc = n;
        
	for(let i = 1; i <= 1000; i++){
		for(let j = i+1; j <= 1000; j++){
			for(let k = j+1; k <= 1000; k++){
				let sa = i*i;
				let sb = j*j;
				let sc = k*k;
				if((sa + sb) == sc && (i+j+k) == 1000){
					sumOfabc = i*j*k;
					//console.log("1 time")
}
			}
		}
	}
return sumOfabc
}


console.log("Result is : ", specialPythagoreanTriplet(1000));

