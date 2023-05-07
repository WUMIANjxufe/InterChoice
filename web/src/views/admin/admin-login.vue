<template class="template">
<a-layout class="layout">
  <p class="p1">登录系统</p>
  <a-form>
    <a-form-item>
      <a-input placeholder="账号" id="username"></a-input>
    </a-form-item>
    <a-form-item>
      <a-input-password placeholder="密码" id="password"></a-input-password>
    </a-form-item>
    <a-space  size=large>
      <a-button type="primary" @click="login()">登录</a-button>
      <a-button type="primary" @click="register()">注册</a-button>
    </a-space>
  </a-form>
</a-layout>
</template>

<script>

import {defineComponent} from "vue";
import axios from "axios";
import Qs from "qs";
import router from "@/router";
import store from "@/store";
export default defineComponent({
  setup() {
    store.commit("setNum",false)
    const login = () => {
      let id = parseInt(document.getElementById("username").value);
      let pd = hexMd5(document.getElementById("password").value);
      //qs.stringify 是把一个参数对象格式化为一个字符串。
      const data = Qs.stringify({"studentId": id, "password": pd});
      console.log("data"+data)
      axios.post("http://localhost:8880/login",data).then(res=>{
           console.log("restoken"+res.data.content.token)
           console.log(res.data.content.studentId)
            if(res.data.content.password!=null){
              console.log("登录成功，页面跳转")
              store.commit("setUser",res.data.content)
              router.push('/admin/begin')
            }else if(res.data.content.password==null){
              alert("账号或密码错误")
            }
          })
        }
    const register = () => {
      router.push('/register')
    }
    return{
      login,
      register
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