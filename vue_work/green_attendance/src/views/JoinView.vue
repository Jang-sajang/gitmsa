<template>
  <div class="container mx-auto bg-white p-8 rounded shadow-md">
    <h1 class="text-3xl font-bold mb-4 text-center">GREENART COMPUTER ACADEMY</h1>
    <form>
      <div class="mb-4">
        <label for="id" class="block text-gray-700 text-sm font-bold mb-2">아이디</label>
        <input
          type="text"
          id=""
          v-model="nickname"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-4">
        <label for="password" class="block text-gray-700 text-sm font-bold mb-2">비밀번호</label>
        <input
          type="password"
          id=""
          v-model="password"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-4">
        <label for="name" class="block text-gray-700 text-sm font-bold mb-2">이름</label>
        <input
          type="text"
          id=""
          v-model="name"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-4">
        <label for="phoneNumber" class="block text-gray-700 text-sm font-bold mb-2">전화번호</label>
        <input
          type="text"
          id=""
          v-model="phoneNumber"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-4">
        <label for="email" class="block text-gray-700 text-sm font-bold mb-2">이메일</label>
        <input
          type="email"
          id=""
          v-model="email"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-6">
        <label class="block text-gray-700 text-sm font-bold mb-2">관리자 여부</label>
        <input type="checkbox" id="" class="mr-2" />
      </div>
      <button
        @click="joinuser"
        class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
        type="button"
      >
        회원가입
      </button>
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()

const nickname = ref('')
const password = ref('')
const name = ref('')
const email = ref('')
const phoneNumber = ref('')
const isAdmin = ref(false)

const joinuser = async () => {
  const data = {
    nickname: nickname.value,
    password: password.value,
    name: name.value,
    email: email.value,
    phonenumber: phoneNumber.value,
    isAdmin: isAdmin.value
  }
  await insertUser(data)
}

async function insertUser(data) {
  try {
    const res = await axios.post(`http://192.168.94:8080/user/insert`, data)
    console.log(res)

    router.push({ name: 'loginview' }) //왜안돼지
  } catch (e) {
    console.log(e)
    alert('에러')
  }
}
</script>

<style lang="scss" scoped></style>
