<template>
  <a-layout style="height: 100%;width: 100%">
  <TheHeader></TheHeader>
       <router-view/>
  <the-footer></the-footer>
  </a-layout>
</template>
<script lang="ts">
import { defineComponent } from 'vue';
import TheHeader from "@/components/the-header.vue";
import TheFooter from "@/components/the-footer.vue";
export default defineComponent({
  name: 'app',
  components:{
    TheFooter,
    TheHeader
  }
});
</script>
<style>
#components-layout-demo-top-side .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(100, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>
