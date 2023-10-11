
const str = "Reverse the strig and words also";
console.log("before reverse ",str)

let reversedStr = str.split(' ')
                 .map(word=>word.split('').reverse().join(''))
                 .join(' ');


console.log(reversedStr);