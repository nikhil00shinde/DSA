// How many sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

//Learned - Zeller Congruence to calculate the day of particular date (by providing the date, YYYY, MM, DD)
//Also learned about leap year --> n%4 == 0 && n%100 != 0 || n%400 == 0
//parseInt() --> return the floating point numbers

let countingSundays = (fy, ly) => {
	let ans = 0;
	for(let i = fy; i <= ly; i++){
		for(let j = 1; j <= 12; j++){
			let mnt = months[j];

			if(j == 2 && ((i%4 == 0 && i%100 != 0) || i%400 == 0)){
				mnt++;
			}
			let h = zellercongruence(1,j,i);
			if(h == 1) ans++;
		}
	}
	return ans;
}


const day = ["Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri"];


let zellercongruence = (day, month, year) => {
	if(month == 1){
		month = 13;
		year--;
	}

	if(month == 2){
		month = 14;
		year--;
	}


	let q = day;
	let m = month;
	let k = year%100;
	let j = Math.floor(year/100);
	let h = q + Math.floor(13 * (m+1)/5) + k + Math.floor(k/4) + Math.floor(j/4) + 5*j;

	return h%7;
}

const months = {
  1: 31,
  2: 28,
  3: 31,
  4: 30,
  5: 31,
  6: 30,
  7: 31,
  8: 31,
  9: 30,
  10: 31,
  11: 30,
  12: 31,
}

console.log("Result is : "+countingSundays(1901,2000));
