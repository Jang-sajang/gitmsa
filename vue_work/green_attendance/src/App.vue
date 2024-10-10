<template>
  <div class="text-5xl bg-slate-300">그린 출석 관리 시스템</div>
  <div class="flex m-5">
    <div class="mx-2">
      <RouterLink to="/loginview">로그인</RouterLink>
    </div>
    <div class="mx-2">
      <RouterLink to="/join">회원가입</RouterLink>
    </div>
  </div>
  <RouterView />
</template>

<script setup></script>

<style lang="scss" scoped></style>
