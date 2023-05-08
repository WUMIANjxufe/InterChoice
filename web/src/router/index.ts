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
import AdminInspect from "@/views/admin/admin-inspect.vue";
import store from "@/store";
import {Tool} from "@/util/tool.ts";
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
    component: AdminInformation,
    meta:{
      loginRequire: true
    }
  },
  {
    path: '/admin/ahp',
    name: 'AdminAhp',
    component: AdminAhp,
    meta:{
      loginRequire: true
    }
  },
  {
    path: '/admin/result',
    name: 'AdminResult',
    component: AdminResult,
    meta:{
      loginRequire: true
    }
  },
  {
    path: '/admin/begin',
    name: 'AdminBegin',
    component: AdminBegin,
    meta:{
      loginRequire: true
    }
  },
  {
    path: '/admin/choice',
    name: 'AdminChoice',
    component: AdminChoice,
    meta:{
      loginRequire: true
    }
  },
  {
    path: '/admin/inspect',
    name: 'AdminInspect',
    component: AdminInspect,
    meta:{
      loginRequire: true
    }
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

// 路由登录拦截
router.beforeEach((to, from, next) => {
  // 要不要对meta.loginRequire属性做监控拦截
  if (to.matched.some(function (item) {
    console.log(item, "是否需要登录校验：", item.meta.loginRequire);
    return item.meta.loginRequire
  })) {
    const loginUser = store.state.user;
    if (Tool.isEmpty(loginUser)) {
      console.log("用户未登录！");
      next('/');
    } else {
      next();
    }
  } else {
    next();
  }
});

export default router

