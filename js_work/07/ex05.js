const doA = (a, b = 20, c = 30) => {
    console.log(`a = ${a}`);
    console.log(`b = ${b}`);
    console.log(`c = ${c}`);
}

doA();

// 둘다 똑같은 함수 선언 방식이다. 근데 아래걸 더 많이 씀
function doB() { }
const doC = function () { }

const doC_ = function () { } //여기에서 this onlick > button this는 버튼 태그가 됨 
const doD = () => { }   // 여기에서 this > window 객체가 this가 됩니다.