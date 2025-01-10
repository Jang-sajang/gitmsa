import { useState } from 'react'
import './App.css'

function App() {
//ref();

const doA = () =>{
  return [10, ()=>{console.log("doA")}]
}

const [aa, setAA] = useState(10);

const clickA = ()=>{
  console.log("눌렀니")
  setAA(aa+1);
}

console.log("렌더링")
console.log(bb);
console.log(bbb);

  return (
    <>
      <h1>깔끔</h1>
      <h1>{aa}</h1>
      <button onClick={clickA}> 누르면 aa증가</button>
    </>
  )
}

export default App
