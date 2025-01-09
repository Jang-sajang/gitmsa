const arr1 = [
  { name: "홍길동", age: 20 },
  { name: "김길동", age: 30 },
  { name: "이길동", age: 40 },
];
//forEach는 arr1 안에 있는 것들은 하나씩 출력해준다
arr1.forEach(obj =>{
    console.log(obj);
})

const arr2 = [...arr1, {name:"박길동",age:42},];
console.log(arr2);

const arr3 = [...arr2, '하이','고등어'];
console.log(arr3);

const findobj = arr1.find(obj => {
    if(obj.name=="홍길동" && obj.age==20){
        return obj
    }
});

console.log(findobj);
