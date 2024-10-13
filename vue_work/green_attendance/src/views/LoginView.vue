<template>
  <div>
    <h1>로그인 페이지</h1>
    <div>
      <ol>
        <ul>
          <p>아이디 <input class="bg-slate-200 p-2 my-1" type="text" name="" id="" v-model="id" /></p>
        </ul>
        <ul>
          <p>비밀번호 <input class="bg-slate-200 p-2 my-1" type="password" name="" id="" v-model="password"/></p>
        </ul>
      </ol>
      <div class="m-2">
        <input
          @click="LoginSequence"
          class="border-black rounded border-2 my-5 bg-gray-200 hover:opacity-30 hover:bg-gray-300 cursor-pointer"
          type="submit"
          value="로그인"
        
        />
      </div>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const id = ref('')
const password = ref('')

const LoginSequence= () =>{

  const data = {
    id: id.value,
    password: password.value,

  }

  console.log('id = ' + id.value),
  console.log('password = ' + password.value)

  
}

</script>

<style lang="scss" scoped></style>
