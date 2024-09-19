<template>
  <div>
    <h1 class="h1-red">TheFreeBoard</h1>
    <div class="p-5">
      title = {{ title }} contet = {{ content }}
      <input
        type="text"
        v-model="title"
        placeholder="Enter your title here"
        class="m-4 w-11/12 p-3 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent text-gray-700 placeholder-gray-400 bg-white"
      />
      <textarea
        v-model="content"
        class="m-4 w-11/12 h-40 p-4 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-400 focus:border-transparent resize-none text-gray-700 placeholder-gray-400 bg-white"
        placeholder="Enter Content here"
      ></textarea>
    </div>
    <button
      class="relative inline-block px-8 py-3 font-bold text-white bg-gradient-to-r from-pink-500 via-red-500 to-yellow-500 rounded-lg shadow-lg hover:shadow-2xl hover:bg-gradient-to-l focus:outline-none focus:ring-4 focus:ring-yellow-300 transition-all duration-300 ease-in-out transform hover:scale-105"
      @click="save"
    >
      <span class="absolute inset-0 bg-white opacity-20 rounded-lg blur-md"></span>
      <span class="relative"> 버튼</span>
    </button>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const title = ref('')
const content = ref('')

const router = useRouter()

const save = () => {
  const data = {
    title: title.value,
    content: content.value
  }
  // console.log(data);
  axios
    .post('http://localhost:8080/freeboard', data)
    .then((res) => {
      console.log(res)
      alert('저장하였습니다.')
      router.push({ name: 'FreeBoardList' })
    })
    .catch((e) => {
      console.log(e)
      alert('에러' + e.response.data.message)
    })
}
</script>

<style scoped></style>
