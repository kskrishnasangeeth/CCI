//Implement an algorithm to determine if a string has all unique characters. What if
//you can not use additional data structures?

for (i=0;i<255;i++){
    arr[i]=false;
}
function check(str){
    for (i=0;i<str.length;i++){
        if (arr[str.charCodeAt(i)]==true){
            return false;
        }
        arr[str.charCodeAt(i)]=true;
    }
    return true;
}
console.log(check("abcdefgh"));//true
console.log(check("aa"));//false
