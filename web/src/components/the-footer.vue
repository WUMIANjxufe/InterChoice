<template>
  <a-layout-footer style="text-align: center">
    师生双选虚拟仿真实验平台<span v-show="user.studentId">，欢迎{{user.studentName}}</span>
  </a-layout-footer>
</template>
<script lang="ts">
import {computed, defineComponent} from 'vue';
import store from "@/store";

export default defineComponent({
  name: 'the-footer',
  setup(){
    const user = computed(()=> store.state.user);
    return {
      user
    }

  }
});
</script>