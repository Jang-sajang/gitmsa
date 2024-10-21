<template>
  <div class="absolute"><SideBar /></div>
  <div class="min-w-80 max-w-2xl w-3/4 mx-auto bg-white p-8 rounded shadow-md">
    <h1 class="text-3xl font-bold mb-4 text-center">GREENART COMPUTER ACADEMY</h1>
    <form @submit.prevent="joinuser">
      <!-- 아이디 입력 -->
      <div class="mb-4">
        <label for="userid" class="block text-gray-700 text-sm font-bold mb-2"
          >아이디
          <p class="text-red-500 inline">*</p></label
        >
        <input
          type="text"
          id="userid"
          placeholder="아이디를 입력하세요"
          v-model="userid"
          @blur="checkId"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
        <!-- 중복 확인 메시지 -->
        <!-- <p v-if="idError" class="text-red-500 text-sm">{{ idError }}</p> -->
        <!-- <p v-if="idAvailable" class="text-green-500 text-sm">사용 가능한 아이디입니다.</p> -->
      </div>

      <!-- 입력 항목들 -->
      <div class="mb-4">
        <label for="password" class="block text-gray-700 text-sm font-bold mb-2"
          >비밀번호
          <p class="text-red-500 inline">*</p>
        </label>
        <input
          type="password"
          id="password"
          placeholder="비밀번호를 입력하세요"
          v-model="password"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-4">
        <label for="name" class="block text-gray-700 text-sm font-bold mb-2"
          >이름
          <p class="text-red-500 inline">*</p>
        </label>
        <input
          type="text"
          id="name"
          placeholder="이름을 입력하세요"
          v-model="name"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-4">
        <label for="phoneNumber" class="block text-gray-700 text-sm font-bold mb-2"
          >전화번호
          <p class="text-red-500 inline">*</p>
        </label>
        <input
          type="text"
          id="phoneNumber"
          placeholder="010-0000-0000"
          v-model="phoneNumber"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-4">
        <label for="email" class="block text-gray-700 text-sm font-bold mb-2">이메일</label>
        <input
          type="email"
          id="email"
          placeholder="[선택] email@naver.com"
          v-model="email"
          class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
        />
      </div>
      <div class="mb-6">
        <label for="role" class="block text-gray-700 text-sm font-bold mb-2">관리자 여부</label>
        <input type="radio" name="role" id="role-1" v-model="role" checked />
        <label for="role-1" class="p-1 pr-3">학생</label>
        <input type="radio" name="role" id="role-2" v-model="role" />
        <label for="role-2" class="p-1 pr-3">선생</label>
        <input type="radio" name="role" id="role-3" v-model="role" />
        <label for="role-3" class="p-1 pr-3">관리자</label>
      </div>
      <button
        @click="joinuser"
        class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
        type="button"
      >
        회원가입
      </button>
      <!-- :disabled="!IdAvailable"
      >
        회원가입 -->
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'
import SideBar from '@/component/SideBar.vue'

const router = useRouter()

const userid = ref('')
const password = ref('')
const name = ref('')
const email = ref('')
const phoneNumber = ref('')
const role = ref('')
// const lecture = ref('')

// // 중복 확인 상태
// const idAvailable = ref(false) // 아이디가 사용 가능한지 여부
// const idError = ref('') // 오류 메시지

// const checkId = async () => {
//   // 아이디가 비어있을 경우
//   if (!userid.value) {
//     idError.value = '아이디를 입력해 주세요.'
//     idAvailable.value = false
//     return
//   }

//   try {
//     const response = await axios.post('http://192.168.67:8080/check-id', { userid: userid.value })

//     // 서버에서 중복 여부를 반환한다고 가정
//     if (response.data.exists) {
//       idError.value = '이미 사용 중인 아이디입니다.'
//       idAvailable.value = false
//     } else {
//       idError.value = ''
//       idAvailable.value = true
//     }
//   } catch (error) {
//     console.log(error)
//     idError.value = '아이디 중복 확인에 실패했습니다.'
//     idAvailable.value = false
//   }
// }

const joinuser = async () => {
  const data = {
    userid: userid.value,
    password: password.value,
    name: name.value,
    email: email.value,
    phoneNumber: phoneNumber.value,
    role: role.value
    // lecture: lecture.value
  }

  try {
    const res = await axios.post('http://192.168.67:8080/sign/signin', data)
    console.log(res)
    router.push({ name: 'loginview' })
  } catch (e) {
    console.log(e)
    alert('에러')
  }
}
</script>
