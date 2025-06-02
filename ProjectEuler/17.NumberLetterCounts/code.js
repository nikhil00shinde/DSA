//If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//If all the numbers from 1 to given limit inclusive were written out in words, how many letters would be used?


let numberLetterCounts = (limit) => {
	let count = 0;
	for(let i = 1; i <= limit; i++){
		count += calculateValue(i);
	}
	return count;
}

let calculateValue = (n) => {
	n += "";
	let len = n.length;
	let ans = 0;
	let flag = false;

	for(let i = 0; i < len; i++){
		let str = "";
		let pos = len  - i;

		let num = n[i] - '0';

		if(pos == 4){
			str += diff[num] + diff["000"];
			flag = true;
		}else if(pos == 3){
			let substr = n.substring(i+1);
			if(substr == "00"){
				str += diff[num]+diff["00"];
				flag = true;
			}else{
				str += diff[num]+diff["00"]+"and"
			}
		}else if(pos == 2){
			let substr = parseInt(n.substring(i));

			if(substr <= 19 && num != 0){
				str += diff[substr];
				flag = true;
			}else if(substr >= 20){
				let nn = num+"0";
				str += diff[parseInt(nn)];
			}
		}else{
			if(num != 0) str += diff[num];
		}

		ans += str.length;
		if(flag) break;
	}

	return ans;
}

let diff = {
 1: "one",
 2: "two",
 3: "three",
 4: "four",
 5: "five",
 6: "six",
 7: "seven",
 8: "eight",
 9: "nine",
 10:"ten",
 11: "eleven",
 12: "twelve",
 13: "thirteen",
 14: "fourteen",
 15: "fifteen",
 16: "sixteen",
 17: "seventeen",
 18: "eighteen",
 19: "nineteen",
 20: "twenty",
 30: "thirty",
 40: "forty",
 50: "fifty",
 60: "sixty",
 70: "seventy",
 80: "eighty",
 90: "ninety",
 "00": "hundred",
 "000": "thousand"
}

console.log("Result is : "+numberLetterCounts(1000));
