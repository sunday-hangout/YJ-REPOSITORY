function solution(land) {
    let maxIdx = land[0].indexOf(Math.max(...land[0]));
    let max = Math.max(land[0]);
    let sum = max;

    for(let i=1; i<land.length; i++) {
        maxIdx = land[i].filter(ele => ele != maxIdx).indexOf(Math.max(...land[i].filter(ele => ele != maxIdx)));
        sum += Math.max(...land[i].filter(ele => ele != maxIdx));
    }
    console.log(sum)
    return sum;
}

solution([[1,2,3,5],[5,6,7,8],[4,3,2,1]])