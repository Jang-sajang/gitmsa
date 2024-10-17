<template>
  <div class="flex min-h-screen">
  <!-- Sidebar -->
  <aside class="w-1/4 bg-blue-900 text-white p-4">
    <h2 class="text-lg font-bold mb-6">메뉴</h2>
    <ul class="space-y-4">
      <li><a href="#" class="block">출결 관리</a></li>
      <li><a href="#" class="block">문의 게시판</a></li>
      <li><a href="#" class="block font-bold">휴가 신청서 제출</a></li>
      <li><a href="#" class="block">과정 선택</a></li>
      <li><a href="#" class="block">마이페이지</a></li>
      <li><a href="#" class="block">공지 사항</a></li>
    </ul>
    <div class="mt-12 text-xs">
      <p>주소: 서울특별시 교육청 특수교육 지원센터 OO</p>
      <p>전화: 000-0000-000</p>
      <p>FAX: 000-0000-000</p>
    </div>
  </aside>

  <!-- Main content -->
  <main class="w-3/4 bg-gray-100 p-8">
    <h1 class="text-2xl font-bold mb-6">휴가 신청서 제출</h1>

    <!-- Form Section -->
    <form>
      <!-- Date Range -->
      <div class="mb-6">
        <label class="block mb-2 text-lg">1. 휴가를 시작하는 날짜와 끝나는 날짜를 기입해주세요.</label>
        <div class="grid grid-cols-3 gap-4">
          <div class="flex items-center space-x-2">
            <select class="border rounded p-2">
              <option>2024</option>
              <option>2023</option>

              <!-- Add more years -->
            </select>
            <select class="border rounded p-2">
              <option>10</option>
              <!-- Add more months -->
            </select>
            <select class="border rounded p-2">
              <option>24</option>
              <!-- Add more days -->
            </select>
          </div>
          <div class="flex items-center">부터</div>
          <div class="flex items-center space-x-2">
            <select class="border rounded p-2">
              <option>2024</option>
              <!-- Add more years -->
            </select>
            <select class="border rounded p-2">
              <option>10</option>
              <!-- Add more months -->
            </select>
            <select class="border rounded p-2">
              <option>24</option>
              <!-- Add more days -->
            </select>
          </div>
        </div>
      </div>

      <!-- Reason for leave -->
      <div class="mb-6">
        <label class="block mb-2 text-lg">2. 휴가 사유를 입력해주세요.</label>
        <textarea class="w-full border rounded p-4 h-32" placeholder="입력해주세요"></textarea>
      </div>

      <!-- Supervisor and Contact Info -->
      <div class="mb-6">
        <label class="block mb-2 text-lg">3. 수강증의 강좌명 본인 이름, 전화번호를 입력해주세요.</label>
        <div class="grid grid-cols-3 gap-4">
          <input class="border rounded p-2" type="text" placeholder="수강증의 강좌" />
          <input class="border rounded p-2" type="text" placeholder="이름" />
          <div class="flex space-x-2">
            <input class="border rounded p-2 w-1/3" type="text" placeholder="010" />
            <input class="border rounded p-2 w-2/3" type="text" placeholder="전화번호" />
          </div>
        </div>
      </div>
    </form>
  </main>

  <!-- Quick Menu -->
  <aside class="w-16 bg-white p-4">
    <ul class="space-y-4">
      <li>
        <button class="bg-blue-900 text-white p-4 rounded-full">
          <i class="fa fa-calendar"></i> <!-- You can use an icon library like FontAwesome -->
        </button>
      </li>
      <li>
        <button class="bg-blue-900 text-white p-4 rounded-full">
          <i class="fa fa-comments"></i>
        </button>
      </li>
      <li>
        <button class="bg-blue-900 text-white p-4 rounded-full">
          <i class="fa fa-user"></i>
        </button>
      </li>
      <li>
        <button class="bg-blue-900 text-white p-4 rounded-full">
          <i class="fa fa-bell"></i>
        </button>
      </li>
    </ul>
  </aside>
</div>

</template>

<script setup></script>

<style lang="scss" scoped></style>
