<template>
  <div class="relative">
    <!-- Toggle Button -->
    <button
      @click="toggleSidebar"
      class="fixed top-4 left-4 z-50 p-2 text-white bg-blue-600 rounded-md shadow-md focus:outline-none md:hidden"
    >
      <span v-if="!isSidebarOpen">\u2630</span>
      <!-- Menu icon -->
      <span v-else>&times;</span>
      <!-- Close icon -->
    </button>

    <!-- Sidebar -->
    <div
      :class="{
        'translate-x-0': isSidebarOpen,
        '-translate-x-full': !isSidebarOpen,
      }"
      class="fixed inset-y-0 left-0 z-40 w-64 bg-gray-800 text-white transform transition-transform duration-300 ease-in-out md:translate-x-0"
    >
      <div class="p-4 font-bold text-lg">Sidebar</div>
      <ul class="mt-4 space-y-2">
        <li><a href="#" class="block px-4 py-2 hover:bg-gray-700">Home</a></li>
        <li><a href="#" class="block px-4 py-2 hover:bg-gray-700">About</a></li>
        <li><a href="#" class="block px-4 py-2 hover:bg-gray-700">Services</a></li>
        <li><a href="#" class="block px-4 py-2 hover:bg-gray-700">Contact</a></li>
      </ul>
    </div>

    <!-- Overlay -->
    <div
      v-if="isSidebarOpen"
      @click="toggleSidebar"
      class="fixed inset-0 z-30 bg-black bg-opacity-50 md:hidden"
    ></div>

    <!-- Main Content -->
    <div class="p-4 ml-0 md:ml-64">
      <h1 class="text-2xl font-bold">Main Content</h1>
      <p class="mt-2">This is the main content of the page.</p>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const isSidebarOpen = ref(false)

const toggleSidebar = () => {
  isSidebarOpen.value = !isSidebarOpen.value
}
</script>

<style scoped>
/* 추가 스타일 필요 시 여기에 작성 */
</style>
