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
          <a-menu-item key="information">
            <router-link to="/admin/information">填写简历</router-link>
          </a-menu-item>
          <a-menu-item key="choice">
            <router-link to="/admin/ahp">推荐权重设置</router-link>
          </a-menu-item>
          <a-menu-item key="teacher" >
            <router-link to="/admin/choice">选择导师</router-link>
          </a-menu-item >
          <a-menu-item key="4">
            <router-link to="/admin/result">初选结果</router-link>
          </a-menu-item>
          <a-menu-item key="4"  >
            <router-link to="/admin/inspect">导师考察</router-link>
          </a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout-content :style="{ padding: '24px 24px', minHeight: '180px' }">
      <p align="center">
        <video src="../../assets/video/4.mp4" id="video4"  style="width:80%;height: auto" autoplay controls></video>
      </p>
      <a-modal v-model:visible="modalVisible"  title="一封来自预选导师的邮件" @ok="handleModalOk" ok-text= "考察开始" style="width: 50%">
              <p>恭喜你获得加入我的团队的资格，请尽快与我联系，我将对你进行为期一个月的考察，合格后你将正式入门</p>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script>
import {defineComponent, onMounted, reactive, ref, toRefs} from "vue";
import { useRouter } from 'vue-router'
import * as modalVisible from "ant-design-vue/es/color-picker/ColorPicker";
import axios from "axios";
import router from "@/router";
export default defineComponent({
  setup() {
    const modalVisible = ref(false)
    onMounted(() => {
      const router = useRouter()
      console.log(222)
      const video1 = document.getElementById("video4")
      document.getElementById("video4").src = require("../../assets/video/4.mp4");
      video1.addEventListener("ended",() => {
        modalVisible.value = true;
        axios.get()
      })
    })
    const handleModalOk = () =>{
      router.push('/admin/result')
    }
    const state = reactive({
      rootSubmenuKeys: ['sub1'],
      openKeys: ['sub1'],
      selectedKeys: [],
    });
    const onOpenChange = (openKeys) => {
      state.openKeys = openKeys;
    };
    return {
      handleModalOk,
      modalVisible,
      ...toRefs(state),
      onOpenChange,
    };
  },
});

</script>