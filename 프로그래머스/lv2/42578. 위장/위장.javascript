function solution(clothes) {
    var answer = 1;
    const obj = {};

    for (let  i = 0; i < clothes.length; i++){
        obj[clothes[i][1]] = (obj[clothes[i][1]] || 0) + 1;
    }
    // console.log(obj);
    for (let key in obj){
        console.log(`${answer} ${obj[key]+1}`);

        answer =  answer * (obj[key]+1);

    }
    return answer - 1;
}