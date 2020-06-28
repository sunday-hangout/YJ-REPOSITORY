function solution(s) {
    s = s.toLowerCase();

    let strArr = s.split(' ').map(word => {
        let arr = word.split('')
        
        if(arr[0] != null)
            arr[0] = arr[0].toUpperCase();
        return arr.join('');
    }).join(' ');

    return strArr;
}
/*
// 틀린 코드
function solution(s) {
    s = s.toLowerCase();


    let strArr = s.split(" ").map(word => {
        let arr = '';
        if(word.length > 0) {
            arr = word.split('');
            arr[0] = arr[0].toUpperCase();
        }
        return arr.join('');
    }).join(' ');

    return strArr;    
}
*/



// Test
const str1 = '3people unFollowed me';
const str2 = 'for the last week';

console.log(solution(str1) === '3people Unfollowed Me')
console.log(solution(str2) === 'For The Last Week')
