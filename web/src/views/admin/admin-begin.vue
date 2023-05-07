<template>
  <a-layout>
    <a-layout-sider width="200" style="background: #fff">
      <a-menu
          mode="inline"
          v-model:selectedKeys="selectedKeys"
          v-model:openKeys="openKeys"
          style="height: 100%"
          @openChange="onOpenChange"
      >
        <a-sub-menu key="sub1">
          <template #title>
                <span>
                  <user-outlined />
                   实验流程
                </span>
          </template>
          <a-menu-item key="begin">
            <router-link to="/admin/begin">开场</router-link>
          </a-menu-item>
          <a-menu-item key="information" disabled = ture>
            <router-link to="/admin/information">填写简历</router-link>
          </a-menu-item>
          <a-menu-item key="choice" disabled = ture>
            <router-link to="/admin/ahp">推荐权重设置</router-link>
          </a-menu-item>
          <a-menu-item key="teacher" disabled = ture>
            <router-link to="/admin/choice">选择导师</router-link>
          </a-menu-item >
          <a-menu-item key="4" disabled = ture>初选结果</a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
      <p align="center">
        <video src="../../assets/video/1.mp4" id="video1"  style="width:50%;height: auto" autoplay controls></video>
      </p>
    </a-layout-content>
  </a-layout>
</template>
<script>
import {defineComponent, onMounted, reactive, toRefs} from "vue";
import { useRouter } from 'vue-router'
export default defineComponent({
  setup() {
    onMounted(() => {
      const router = useRouter()
      console.log(222)
      const video1 = document.getElementById("video1")
      document.getElementById("video1").src = require("../../assets/video/1.mp4");
      video1.addEventListener("ended",() => {
        console.log(111)
        router.push('/admin/information')
      })
    })
    const state = reactive({
      rootSubmenuKeys: ['sub1'],
      openKeys: ['sub1'],
      selectedKeys: [],
    });
    const onOpenChange = (openKeys) => {
        state.openKeys = openKeys;
    };
    return {
      ...toRefs(state),
      onOpenChange,
    };
  },
});

</script>