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
          <a-menu-item key="teacher" disabled = ture>
            <router-link to="/admin/choice">选择导师</router-link>
          </a-menu-item >
          <a-menu-item key="4" disabled = ture>初选结果</a-menu-item>
          <a-menu-item key="4" disabled = ture>初选结果</a-menu-item>
          <a-menu-item key="4" disabled = ture>初选结果</a-menu-item>
          <a-menu-item key="4" disabled = ture>初选结果</a-menu-item>
          <a-menu-item key="4" disabled = ture>初选结果</a-menu-item>
          <a-menu-item key="4" disabled = ture>初选结果</a-menu-item>
          <a-menu-item key="4" disabled = ture>初选结果</a-menu-item>

        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
      <p align="center">
        <video src="../../assets/video/4.mp4" id="video4"  style="width:50%;height: auto" autoplay controls></video>
      </p>
      <a-modal v-model:visible="modalVisible"  title="选择导师" @ok="handleModalOk" style="width: 80%">
              <a-button type="primary">取消选择</a-button>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script>
import {defineComponent, onMounted, reactive, ref, toRefs} from "vue";
import { useRouter } from 'vue-router'
import * as modalVisible from "ant-design-vue/es/color-picker/ColorPicker";
import axios from "axios";
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
      modalVisible.value = false;
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