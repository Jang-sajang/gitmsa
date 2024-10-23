<template>
  <div class="text-center">
    <div class="flex justify-center">
      <img src="../images/LOGO.PNG" alt="#" class="w-1/6 max-md:w-28">
    </div>
    <div class="h-64 flex flex-col justify-center items-center">
      <ol>
        <ul>
          <p>
            아이디
            <input
              class="bg-slate-200 h-8"
              type="text"
              name="userid"
              id="userid"
              v-model="userid"
            />
          </p>
        </ul>
        <ul>
          <p>
            비밀번호
            <input
              class="bg-slate-200 p-2 my-2"
              type="password"
              name="password"
              id="password"
              v-model="password"
            />
          </p>
        </ul>
      </ol>
      <div class="m-2 my-5">
        <p v-if="loginError">{{ loginError }}</p>
        <input
          @click="LoginSequence"
          class="border-black rounded border-2 bg-gray-200 hover:opacity-30 hover:bg-gray-300 cursor-pointer"
          type="submit"
          value="로그인"
        />
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import axios from 'axios'
import { useRouter } from 'vue-router';

const userid = ref('')
const password = ref('')

const loginError = ref('')
const router = useRouter();

// const errorMessage = ref('') // 에러 메시지를 저장할 변수

const LoginSequence = async () => {
  try {
    // 백엔드로 보낼 데이터

    const response = await axios.get(
      `http://192.168.67:8080/sign/login?userid=${userid.value}&password=${password.value}`
    )
    if (response) {
      const token = response.data
      localStorage.setItem("access_token",token)
      console.log('로그인 성공, 토큰:'+ token)
      router.push({path:'mypage'}) // 안된다
    } else {
    console.log('로그인실패 ' + response)
    loginError.value = '로그인 실패'
    }
  } catch (error) {
    console.error('error' + error)
    loginError.value = '로그인 에러'
  }
}
// 로그인 유지
const onMounted = (() => {
  // Axios 요청 시 토큰을 헤더에 자동으로 추가
  axios.interceptors.request.use(
    (config) => {
      const token = localStorage.getItem('access_token')
      if (token) {
        config.headers.Authorization = `Bearer ${token}` // 토큰을 Bearer 형태로 추가
      }
      return config
    },
    (error) => {
      return Promise.reject(error)
    }
  )
})

</script>

<style lang="scss" scoped></style>
