<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>

    <div class="p-5 bg-slate-500 text-white text-3xl">

      <nav class="flex space-x-5">
        <div>
        <RouterLink to="/">Home</RouterLink>
        </div>
        <div>
        <RouterLink to="/User">User</RouterLink>
        </div>
        <div class="group relative">
                  <RouterLink to="/FreeBoardList">FreeBoardList</RouterLink>
            <div class="hidden group-hover:block absolute bg-slate-600 rounded p-5">
              <div>
        <RouterLink to="/FreeBoardList">FreeBoardList</RouterLink>
        </div>
        <div>
        <RouterLink to="/FreeBoardInput">FreeBoardInput</RouterLink>
        </div>
          </div>
        </div>
        

      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>

</style>
