<template>
    <div class="bg-gray-100 min-h-screen py-8">
      <!-- Header -->
      <header class="bg-blue-600 text-white py-4 shadow">
        <div class="container mx-auto px-4 flex justify-between items-center">
          <h1 class="text-2xl font-bold">Mini Board</h1>
          <button class="bg-white text-blue-600 px-4 py-2 rounded shadow hover:bg-gray-200">Create Post</button>
        </div>
      </header>
  
      <!-- Board Content -->
      <main class="container mx-auto px-4 mt-8">
        <!-- Search Bar -->
        <div class="mb-6 flex items-center justify-between">
          <input
            type="text"
            placeholder="Search posts..."
            class="w-full max-w-md px-4 py-2 border rounded shadow focus:outline-none focus:ring-2 focus:ring-blue-500"
          />
          <button class="ml-4 bg-blue-600 text-white px-4 py-2 rounded shadow hover:bg-blue-700">
            Search
          </button>
        </div>
  
        <!-- Posts Table -->
        <div class="bg-white shadow rounded-lg">
          <table class="w-full text-left border-collapse">
            <thead class="bg-blue-600 text-white">
              <tr>
                <th class="px-6 py-4">#</th>
                <th class="px-6 py-4">Title</th>
                <th class="px-6 py-4">Author</th>
                <th class="px-6 py-4">Date</th>
                <th class="px-6 py-4">Actions</th>
              </tr>
            </thead>
            <tbody>
              <tr class="border-b hover:bg-gray-100">
                <td class="px-6 py-4">1</td>
                <td class="px-6 py-4 font-semibold text-blue-600">Sample Post Title</td>
                <td class="px-6 py-4">John Doe</td>
                <td class="px-6 py-4">2024-12-06</td>
                <td class="px-6 py-4">
                  <button class="text-blue-600 hover:underline">Edit</button> |
                  <button class="text-red-600 hover:underline">Delete</button>
                </td>
              </tr>
              <!-- Add more rows dynamically -->
            </tbody>
          </table>
        </div>
  
        <!-- Pagination -->
        <div class="mt-6 flex justify-center items-center">
          <button class="px-4 py-2 bg-gray-200 rounded-l shadow hover:bg-gray-300">Previous</button>
          <button class="px-4 py-2 bg-gray-200 rounded-r shadow hover:bg-gray-300">Next</button>
        </div>
      </main>
    </div>
  </template>

<script setup>

</script>

<style lang="scss" scoped>

</style>