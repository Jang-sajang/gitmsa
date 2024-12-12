<template>
  <div class="w-screen">
    <div class="w-full flex">
      <p class="bg-black">appvue</p>
      <RouterLink to="/questionboard">문의 게시판가기</RouterLink>
      <RouterLink to="/mypage">마이페이지</RouterLink>
      <RouterLink to="/labvue">실험실</RouterLink>
    </div>
    <div class="flex"><router-view></router-view></div>
  </div>
</template>

<script setup></script>

<style lang="scss" scoped></style>
