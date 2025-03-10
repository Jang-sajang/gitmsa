//전개 연산자
//...arr

const arr1 = [1,2,3];
const arr2 = [4,arr1,5,6]; //[ 4, [ 1, 2, 3 ], 5, 6 ]

const arr3 = [4,...arr1,5,6]; //[ 4, 1, 2, 3, 5, 6 ]


console.log(arr1);
console.log(arr2);
console.log(arr3);

arr3[0] = 10;

console.log("arr1 = " + arr1);
console.log("arr3 = " + arr3);

const obj1 = {
    a:10,
    b:20
}
const obj2={
    ...obj1,
    b:30,
    c:40
}

console.log(obj1)
console.log(obj2)