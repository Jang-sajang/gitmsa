//호이스팅 : 한번 쭉 코드 읽고 미리 메모리를 올려놓고 읽음
// >> 그래서 앞뒤 순서 상관없음
//var = 호이스팅가능 / const let = 안됨
const person = {
    age:20,
    name:"홍길동",
    gender : "남자"
}

function fuc({person,name,gender}){
console.log(`나이는 ${person.age}`);
console.log(`이름은 ${name}`);
console.log(`성별은 ${gender}`);
}
//fuc안에 person 주고 pserson.age도 되고
//fuc안에 age 주고 age 바로 호출도 된다. <이렇게 씀

fuc(person)

