import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import Login from  '../views/admin/admin-login.vue'
import Register from '../views/admin/admin-register.vue'
import  Ahp from '../views/admin/admin-ahp.vue'
import AdminInformation from '../views/admin/admin-information.vue'
import AdminBegin from "@/views/admin/admin-begin.vue";
import AdminChoice from "@/views/admin/admin-choice.vue";
import AdminAhp from "@/views/admin/admin-ahp.vue";
import AdminResult from "@/views/admin/admin-result.vue";
const routes: Array<RouteRecordRaw> = [
  {
    path: '/home',
    name: 'Home',
    component: Home
  },
  {
    path: '/ahp',
    name: 'AHP',
    component: Ahp
  },
  {
    path: '/',
    name: 'login',
    component: Login
  },
  {
    path: '/register',
    name: 'Register',
    component: Register
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/admin/information',
    name: 'AdminInformation',
    component: AdminInformation
  },
  {
    path: '/admin/ahp',
    name: 'AdminAhp',
    component: AdminAhp
  },
  {
    path: '/admin/result',
    name: 'AdminResult',
    component: AdminResult
  },
  {
    path: '/admin/begin',
    name: 'AdminBegin',
    component: AdminBegin
  },
  {
    path: '/admin/choice',
    name: 'AdminChoice',
    component: AdminChoice
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
