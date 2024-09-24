import { createRouter, createWebHistory } from 'vue-router'
import TheHome from '../views/TheHome.vue'
import TheFreeBoardInput from '../views/freeboard/TheFreeBoardInput.vue'
import TheFreeBoardList from '../views/freeboard/TheFreeBoardList.vue'
import TheUser from '../views/TheUser.vue'
import TheFreeBoardView from '@/views/freeboard/TheFreeBoardView.vue'
import TheFreeBoardUpdate from '@/views/freeboard/TheFreeBoardUpdate.vue'
import TheFileUpload from '@/views/freeboard/TheFileUpload.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'Home',
      component: TheHome
    },
    {
      path: '/FreeBoardInput',
      name: 'FreeBoardInput',
      component: TheFreeBoardInput
    },
    {
      path: '/FreeBoardupdate',
      name: 'FreeBoardupdate',
      component: TheFreeBoardUpdate
    },
    {
      path: '/User',
      name: 'User',
      component: TheUser
    },
    {
      path: '/FreeBoardList',
      name: 'FreeBoardList',
      component: TheFreeBoardList
    },
    {
      path: '/freeboardview/:idx',
      name: 'freeboardview',
      component: TheFreeBoardView
    },
    {
      path: '/fileupload',
      name: 'fileupload',
      component: TheFileUpload
    }
    // ,
    // {
    //   path: '/FreeBoardList/:aa/:bb',
    //   name: 'FreeBoardList',
    //   component: TheFreeBoardList
    // }
  ]
})

export default router
