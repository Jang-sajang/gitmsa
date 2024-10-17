<template>
<div class="absolute w-1/2"><SideBar></SideBar></div>
  <div>
    <h1 class="mx-40">| 학생용 (VacationForm)</h1>
    <div class="w-1/2 mx-auto">
      <h1 class="pt-10 text-blue-900">휴가 신청서 제출</h1>
      <hr class="border-t border-gray-300" />
      
      <div>
        <p class="py-6 text-blue-900">1. 휴가를 시작하는 날짜와 끝나는 날짜 기입</p>
        <div class="inline-flex">
          <label for="StartDate" class="mr-3">시작 날짜</label>
          <input class="border-2 border-slate-600" type="date" name="StartDate" id="" />
        </div>
        <div class="inline-flex">
          <label for="EndDate" class="mx-3">끝나는 날짜</label>
          <input class="border-2 border-slate-600" type="date" name="EndDate" id="" />
        </div>
        <div>
          <p class="py-6 text-blue-900">2. 휴가 사유를 입력해 주세요.</p>
          <textarea
            id="message"
            v-model="message"
            rows="5"
            class="w-full p-4 text-gray-700 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:border-transparent transition-all ease-in-out duration-300 resize-none"
            placeholder="Write your message here"
          ></textarea>
        </div>
        <div class="py-2">
          <p class="py-2">3. 수강중인 강좌와 본인 이름, 전화번호를 입력하세요</p>
          <label for="" class="flex">수강중인 강좌</label>
          <input type="text" name="" id="" class="border">
          <label for="" class="flex">이름</label>
          <input type="text" name="" id="" class="border ">
          <label for="" class="flex">전화번호</label>
          <input type="text" name="" id="" class="border ">
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import SideBar from '@/component/SideBar.vue';
</script>

<style lang="scss" scoped></style>