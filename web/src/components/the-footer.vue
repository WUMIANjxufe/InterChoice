<template>
  <a-layout-footer style="text-align: center">
    师生双选虚拟仿真实验平台，欢迎{{data}}
  </a-layout-footer>
</template>
<script lang="ts">
import {computed, defineComponent} from 'vue';
import store from "@/store";

export default defineComponent({
  name: 'the-footer',
  setup(){
    const data = computed(()=> store.state.data);
    return {
      data
    }

  }
});
</script>