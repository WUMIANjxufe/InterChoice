<template class="template">
<a-layout class="layout" v-show="flag1">
  <p class="p1">注册账户</p>
  <a-form >
    <a-form-item>
      <a-input placeholder="账号" id="sid"></a-input>
    </a-form-item>
    <a-form-item>
      <a-input placeholder="用户名" id="username"></a-input>
    </a-form-item>
    <a-form-item>
      <a-input-password placeholder="密码" id="password"></a-input-password>
    </a-form-item>
    <a-space  size=large>
      <a-button type="primary" @click="register()">注册</a-button>
    </a-space>
  </a-form>
</a-layout>
  <a-result
      v-show="flag2"
      status="success"
      title="注册成功"
      sub-title="等待三秒即将转入登录界面，或点击返回按钮直接进入"
  >
    <template #extra>
      <a-button  type="primary" @click="back()">返回</a-button>
    </template>
  </a-result>
</template>

<script>

import {defineComponent, reactive, toRefs} from "vue";
import axios from "axios";
import Qs from "qs";
import router from "@/router";
import store from "@/store";
export default defineComponent({
  setup() {
    store.commit("setNum",false)
    const state = reactive({
      "flag1" : true,
      "flag2" : false
    })
    const back = () => {
      router.push('/')
    }
    const register = () => {
          let id = parseInt(document.getElementById("sid").value);
          let ue = document.getElementById("username").value;
          let pd = document.getElementById("password").value;
          console.log(pd)
      //qs.stringify 是把一个参数对象格式化为一个字符串。
      const data = Qs.stringify({"studentId": id, "password": pd,"studentName": ue});
      axios.post("http://localhost:8880/register",data).then(res=>{
            if(res.data.message=="注册成功"){
              console.log("页面跳转")
              state.flag1=false
              state.flag2=true
              setTimeout(()=>{
                router.push('/')
              },3000)
              // router.push('/home')
            }else if(res.data.message=="注册失败"){
              console.log("注册失败")
              alert("注册失败")
            }
          })
        }
    return{
      back,
      register,
      ...toRefs(state)
        }
  }
})
</script>

<style scoped>
.template{
  display: flex;
}
 .layout{
   margin-top: 10px;
   margin-left: auto;
   margin-right: auto;
   border-radius: 20px;
   display: flex;
   flex-direction: column;
   justify-content: center;
   align-items: center;
   width: 350px;
   height: 380px;
   border-top: 1px solid rgba(198,197,203,0.5);
   border-left: 1px solid rgba(198,197,203,0.5);
   border-bottom: 1px solid rgba(198,197,203,0.5);
   border-right: 1px solid rgba(198,197,203,0.5);
   backdrop-filter: blur(10px);
   background: rgba(50,50,50,0.2);
 }
 .p1{
   font-size: 20px;
 }

</style>