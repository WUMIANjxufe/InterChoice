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
              <p>在考察中，你会有一定的精力和金钱去完成各种事情，也会有相应的能力提高，在考察结束后，你的能力到达一定水平，即可正式入门，否则双选失败</p>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script>
import {computed, defineComponent, onMounted, reactive, ref, toRefs} from "vue";
import { useRouter } from 'vue-router'
import * as modalVisible from "ant-design-vue/es/color-picker/ColorPicker";
import axios from "axios";
import router from "@/router";
import store from "@/store";
import Qs from "qs";
export default defineComponent({
  setup() {
    const energy = ref();
    const money = ref();
    const user = computed(()=> store.state.user);
    store.commit("setNum",true)
    const modalVisible = ref(true)
    onMounted(() => {
      const router = useRouter()
      console.log(222)
      const data = Qs.stringify({"studentname": user.value.studentName,"studentid": user.value.studentId,"energy": 100, "money": 100});
      axios.post('/inspect',data).then(res=>{
        console.log(res.data.content)
        energy.value=res.data.content.energy
        money.value=res.data.content.money
        console.log(energy.value)
        store.commit("setNum",res.data.content)
      })
      const video1 = document.getElementById("video4")
      document.getElementById("video4").src = require("../../assets/video/4.mp4");
      video1.addEventListener("ended",() => {
        modalVisible.value = true;
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
      energy,
      money,
      user,
      handleModalOk,
      modalVisible,
      ...toRefs(state),
      onOpenChange,
    };
  },
});

</script>