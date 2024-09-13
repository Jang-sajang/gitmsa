import { createRouter, createWebHistory } from 'vue-router'
import TheHome from '../views/TheHome.vue'
import TheFreeBoard from '../views/TheFreeBoard.vue'
import TheUser from '../views/TheUser.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'TheHome',
      component: TheHome
    },
    {
      path: '/TheFreeBoard',
      name: 'TheFreeBoard',
      component: TheFreeBoard
    },
    {
      path: '/TheUser',
      name: 'TheUser',
      component: TheUser
    },
     
  ]
})

export default router
