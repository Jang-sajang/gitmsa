<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>

    <div class="wrapper">

      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/TheFreeBoard">FreeBoard</RouterLink>
        <RouterLink to="/TheUser">User</RouterLink>

      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>

</style>
