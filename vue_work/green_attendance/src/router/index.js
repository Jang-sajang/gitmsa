import { createRouter, createWebHistory } from 'vue-router'
import LoginView from '../views/LoginView.vue'
import LoginHome from '@/views/LoginHome.vue'
import LaboView from '@/views/LaboView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'loginhome',
      component: LoginHome
    },
    {
      path: '/loginview',
      name: 'loginview',
      component: LoginView
    },
    {
      path: '/join',
      name: 'join',
      component: () => import('../views/JoinView.vue')
    },
    {
      path: '/laboview',
      name: 'laboview',
      component: LaboView
    }
  ]
})

export default router
