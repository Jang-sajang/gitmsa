console.log("ㅎㅎㅎ");

//1 false값에 대해서
const f1 = undefined;
const f2 = null;
const f3 = 0;
const f4 = -0;
const f5 = NaN; //not a number 숫자로 표기할 수 없음
const f6 = "";

const result = f4 && "result";
console.log(result);

//2 truthy 값에 대해
class A {
  a;
  constructor(a) {
    this.a = a;
  }
}

const t1 = "result";
const t2 = 123;
const t3 = [];
const t4 = {}; // 리터널 객체표현식
const t5 = () => {};
const t6 = new A(20); // 리터널객체와 클래스A에 a넣는것과 같다

const result2 = t1 && "result222";
console.log(result2);

function printName(test) {
  if (test) {
    console.log(`${test} 출력된다`);
  } else {
    console.log(test + "출력안된다");
  }
}
printName(f5);
printName(t5);

function aa(a) {
  if (a) {
    console.log(a);
  }
}

aa({ a: 10, b: 20 });
