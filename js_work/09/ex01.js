import readline from 'readline';

const myobj = {
    input: process.stdin,
    output: process.stdout
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

let num1l
let num2;

rl.question('num1 입력', res => {
    console.log(`res = ${res}`);
    rl.close();
})
rl.question('num1 입력', res => {
    console.log(`res = ${res}`);
    num2 = Number(res);
    rl.close();

})