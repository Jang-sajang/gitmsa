export default {
    a: 10,
    b: function () {
        console.log('test')
    }
};

export const aa = {
    z: 10,
    zz: 20,
    zzz: function () { console.log("test"); }
};

export const bb = () => {
    console.log("bb");
}
// 반환형이 없음. 자바스크립트 컴파일러가 자동으로 해줌. 괄호안에 let a, let b 도 let 안적음
export const cc = function () { }