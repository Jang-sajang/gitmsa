function aa(callback) {
  setTimeout(() => {
    console.log("콜백함수 호출 합니다");
    callback();
  }, 3000);
}

function bb(callback) {
  setTimeout(() => {
    console.log("콜백콜백함수 호출합니다");
    callback();
  }, 4000);
}

function cc(callback) {
    setTimeout(() => {
      console.log("callback콜백콜백함수 호출합니다");
      callback();
    }, 4000);
  }

aa(() => {
  console.log("aaa");
  bb(() => {
    console.log("bbb");
    cc(() => {
      console.log("ccc");
    });
  });
});
