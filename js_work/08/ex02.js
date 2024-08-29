import { aa } from './myclass.js'

console.log(aa);
console.log(aa.a);
console.log(aa.b);

aa.b();
const { a, b } = aa;
console.log(`a = ${a}`);
console.log(`b = ${b}`); // 객체분할

const [index1, index2] = bb;
console.log(`index1 = ${index2}`)
console.log(`asdf = ${asdf}`)
s