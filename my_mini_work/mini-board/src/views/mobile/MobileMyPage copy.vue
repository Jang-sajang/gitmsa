<template>
  <div class="w-[360px] h-[640px] border">
    <!--사이드바-->
    <MobileTopBar></MobileTopBar>
    <!-- 상단 알람바, 내용-->
    <div class="flex m-4 justify-between">
      <div class="mr-4">
        <img src="/src/image/usericon.png" alt="" class="border rounded-full w-20" />
      </div>
      <div class="w-[220px]">
        <span>이름 : {{ name }} </span><br />
        <span>전화번호 : {{ number }} </span><br />
        <span>e-mail : {{ email }} </span>
      </div>
    </div>
    <div class="flex justify-end items-center">
      <button
        class="px-3 py-1 mr-10 text-sm text-blue-600 bg-blue-50 border border-blue-200 rounded-md shadow-sm hover:bg-blue-100 hover:text-blue-700 active:shadow-inner focus:outline-none focus:ring-2 focus:ring-blue-300 focus:ring-offset-2 transition duration-300"
      >
        내 정보 수정
      </button>
    </div>
    <hr class="w-11/12 mx-auto my-4" />
    <!-- 내 강좌 -->
    <p>내 강좌</p>
    <div class="flex border mx-auto w-2/3 rounded-md">
      <div class="bg-slate-500 w-[3rem] text-white text-center text-">강좌</div>
      <div class="">
        파이썬 기초 - IT기초 <br />
        <p class="text-xs text-end">종료일 :</p>
      </div>
    </div>
  </div>
</template>

<script setup>
import MobileTopBar from '@/components/MobileTopBar.vue'
import axios from 'axios'
import { onMounted, ref } from 'vue'

const name = ref('')
const number = ref()
const email = ref('')

const fetchUserData = async () => {
  try {
    const response = await axios.get('http://192.168.0.111:8080/user/select/1') // API 엔드포인트를 실제 값으로 변경
    const userData = response.data // API가 반환하는 JSON 형식
    name.value = userData.name
    number.value = userData.number
    email.value = userData.email
    console.log(userData)
  } catch (error) {
    console.error('Error fetching user data:', error)
  }
}

onMounted(() => {
  fetchUserData()
})
</script>

<style lang="scss" scoped></style>
