<script setup>
const myarr = [{ age: 20, name: "홍길동" }, { age: 30, name: "박길동" }, { age: 40, name: "김길동" }];
</script>

<template>
  <h1>안녕 vue</h1>
  <div> {{ myarr }} </div>

  <div v-for="item in myarr" v-bind:key="item">
    <h1>나이 : {{ item.age }} 이름: {{ item.name }}</h1>
  </div>
</template>

<style scoped>
</style>
