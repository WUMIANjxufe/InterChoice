<template>
  <a-layout>
    <a-layout-sider width="200" style="background: #fff">
      <a-menu
          mode="inline"
          v-model:selectedKeys="selectedKeys2"
          v-model:openKeys="openKeys"
          style="height: 100%"
      >
        <a-sub-menu key="sub1">
          <template #title>
                <span>
                  <user-outlined />
                   入学前
                </span>
          </template>
          <a-menu-item key="begin">
            <router-link to="/admin/begin">开场</router-link>
          </a-menu-item>
          <a-menu-item key="information">
            <router-link to="/admin/information">填写简历</router-link>
          </a-menu-item>
          <a-menu-item key="choice">
            <router-link to="/admin/choice">选择导师1</router-link>
          </a-menu-item>
          <a-menu-item key="teacher">
            <router-link to="/admin/teacher">选择导师2</router-link>
          </a-menu-item>
          <a-menu-item key="4">初选结果</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub2">
          <template #title>
                <span>
                  <laptop-outlined />
                  subnav 2
                </span>
          </template>
          <a-menu-item key="5">option5</a-menu-item>
          <a-menu-item key="6">option6</a-menu-item>
          <a-menu-item key="7">option7</a-menu-item>
          <a-menu-item key="8">option8</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub3">
          <template #title>
                <span>
                  <notification-outlined />
                  subnav 3
                </span>
          </template>
          <a-menu-item key="9">option9</a-menu-item>
          <a-menu-item key="10">option10</a-menu-item>
          <a-menu-item key="11">option11</a-menu-item>
          <a-menu-item key="12">option12</a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
      <p align="center">
        <video src="../../assets/video/3.mp4" id="video3" style="width:50%;height: auto" autoplay controls></video>
      </p>
      <a-modal v-model:visible="modalvisible"  title="选择导师" @ok="handleModalOk">
        <a-form>
        </a-form>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script>

import {defineComponent, onMounted,ref} from 'vue';
export default defineComponent({
  setup() {
    const modalvisible = ref(false)
    onMounted(() => {
      console.log(222)
      const video3 = document.getElementById("video3")
      video3.addEventListener("ended",() => {
        modalvisible.value = true;
      })
    })
    return {
      modalvisible
    };
  },
});
</script>