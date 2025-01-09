const doA = () => {
  const promis = new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("good");
      reject("not good");
    }, 3000);
  });
  return promis;
};

console.log(promis);

promis
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.log(error);
  });
