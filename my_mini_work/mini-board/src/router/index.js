import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import QuestionBoard from '@/views/QuestionBoard.vue'
import MobileMyPage from '@/views/mobile/MobileMyPage.vue'
import LabVue from '@/components/LabVue.vue'
import WebMyPage from '@/views/WebMyPage.vue'

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
      component: MobileMyPage,
    },
    {
      path: '/labvue',
      name: 'labvue',
      component: LabVue,
    },
    {
      path: '/webmypage',
      name: 'webmypage',
      component: WebMyPage,
    },
  ],
})

export default router
