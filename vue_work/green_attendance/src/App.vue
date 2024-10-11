<template>
  <nav class="relative mx-0">
    <div class="flex justify-between">
      <div class="flex items-center space-x-4 z-10">
        <div class="text-white mx-2 text-xl p-2"><RouterLink to="/">LOGO</RouterLink></div>
      </div>
      <div class="flex items-center text-white z-10">
        <div class="mr-2"><RouterLink to="/loginview">| 로그인</RouterLink></div>
        <div class="mr-20"><RouterLink to="/join">| 회원가입</RouterLink></div>
      </div>
      <div class="absolute inset-0 bg-gradient-to-t from-blue-200 h-40">
        <img class="-z-30 h-40 w-full" src="../src/images/wbar_t.jpg" alt="" />
      </div>
    </div>
  </nav>

  <div class="m-5">
    <div class="h-24"></div>
    <div class="relative w-full h-20"></div>
    <div class="z-10">
      <div class="mx-2"></div>
      <div class="mx-2"></div>
    </div>
    <div class="flex">
      <RouterView />
    </div>
  </div>
</template>

<script setup></script>

<style lang="scss" scoped></style>
