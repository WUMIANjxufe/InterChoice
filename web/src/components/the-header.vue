<template>
  <a-layout-header class="header">
    <div class="logo">实验平台</div>
    <a-menu
        theme="dark"
        mode="horizontal"
        v-model:selectedKeys="selectedKeys1"
        :style="{ lineHeight: '64px' }"
    >
    </a-menu>
    <a-popconfirm
    title="确定退出？"
    ok-text="是"
    cancel-text="否"
    @confirm="logout()"
    >
      <a class="login-menu" >
        <a-button type="primary" v-show="user.studentId">退出登录</a-button>
      </a>
    </a-popconfirm>
    <a class="login-menu" v-show="user.studentId">
    <span>您好：{{user.studentName}}</span>
    </a>
    <a class="login-menu">
      <span>金钱值为：</span>
    </a>
    <a class="login-menu">
      <span>精力值为：</span>
    </a>
  </a-layout-header>
</template>
<script lang="ts">
import store from '@/store';
import {computed, defineComponent } from 'vue';
import axios from "axios";
import {message} from "ant-design-vue";
import router from "@/router";

export default defineComponent({
  name: 'the-header',
  setup() {
    const user = computed(() => store.state.user);
    const logout = () => {
      console.log("退出登录开始"+user.value);
      axios.get('http://localhost:8880/logout/'+user.value.token).then((response) => {
        const data =response.data;
        if(data.success){
          message.success("退出登录成功！");
          store.commit("setUser",{});
          router.push("/")
        }else {
          message.error(data.message);
        }
      })
    }
    return {
      user,
      logout
    }
  }
});
</script>
<style>
.logo {
  width: 120px;
  height: 31px;
  /*background: rgba(255, 255, 255, 0.2);*/
  /*margin: 16px 28px 16px 0;*/
  float: left;
  color: white;
  font-size: 18px;
}
.login-menu {
  float: right;
  color: white;
  padding-right: 10px;
}
</style>