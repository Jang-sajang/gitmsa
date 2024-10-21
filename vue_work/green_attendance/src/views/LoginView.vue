<template>
  <div class="text-center">
    <h1 class="mt-10">LOGO</h1>
    <div>
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
import { ref } from 'vue'
import axios from 'axios'

const userid = ref('')
const password = ref('')
const errorMessage = ref('') // 에러 메시지를 저장할 변수

const LoginSequence = async () => {
  try {
    // 백엔드로 보낼 데이터

    const response = await axios.get(
      `http://192.168.67:8080/sign/login?userid=${userid.value}&password=${password.value}`
    )
    if (response) {
      console.log(response.data)
    } else {
      errorMessage.value = '로그인에 실패했습니다. 다시 시도하세요.'
    }
  } catch (error) {
    errorMessage.value = '서버와의 통신에 문제가 발생했습니다.'
    console.error(error)
  }
}
</script>

<style lang="scss" scoped></style>
