<template>
  <div>
    <h1 class="text-3xl">안녕 tailwind</h1>
    <div class="bg-slate-400">
      <router-link class="text-slate-700 hover:text-gray-200 px-4" to="/">Home</router-link>
      <router-link class="text-slate-700 hover:text-gray-200 px-4" to="/insert">INSERT</router-link>
      <router-link class="text-slate-700 hover:text-gray-200 px-4" to="/select">Select</router-link>
      <router-link class="text-slate-700 hover:text-gray-200 px-4" to="/update">UPDATE</router-link>
      <router-link class="text-slate-700 hover:text-gray-200 px-4" to="/delete">DELETE</router-link>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  setup() {
    return {};
  }
};
</script>

<style lang="scss" scoped></style>
