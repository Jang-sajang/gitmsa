//import express from 'express'; -> 가능한데 패키지json에서 "type" :"module" 넣어줘야함
const express = require('express');

const app = express();

app.get('/',(req,res)=>{
    res.send('hello');
})
app.get('/aa',(req,res)=>{
    const name = "홍길동";
    const age = 20;
    res.send({name,age});
})
app.post("/save",(req,res)=>{
    console.log("save 온다")
    res.json({"status":200})
})

app.listen(3000,()=>{
    console.log("3000번으로 서버 시작")
})