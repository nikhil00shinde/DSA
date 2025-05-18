//The largest palindrome made from the product of two 2-digits number is 9009=91*99

let largestPalindromeProduct = (n) => {
	let small = 1
	let largest = 9

	let place = 10
	for(let i = 2; i <= n; i++){
		small *= 10
		largest += 9*place
		place *= 10
	}
        let max = 1
	for(let i = small; i <= largest; i++){
		for(let j = small; j <= largest; j++){
			if(isPalindrome(i*j)){
				max = Math.max(i*j,max)
			}
		}
	}

	return max
}

let isPalindrome = (n)=>{
	let str = n.toString()
	let i = 0
	let j = str.length - 1

	while(i < j){
	  if(str[i] != str[j]) return false
	  i++
	  j--
	}
	return true
}


console.log("Result is : ",largestPalindromeProduct(2))
