import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import QuestionBoard from '@/views/QuestionBoard.vue'
import MyPage from '@/views/mobile/MyPage.vue'
import LabVue from '@/components/LabVue.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'homeview',
      component: HomeView,
    },
    {
      path: '/questionboard',
      name: 'questionboard',
      component: QuestionBoard,
    },
    {
      path: '/mypage',
      name: 'mypage',
      component: MyPage,
    },
    {
      path: '/labvue',
      name: 'labvue',
      component: LabVue,
    },
  ],
})

export default router
