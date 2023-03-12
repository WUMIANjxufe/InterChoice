<template>
  <a-layout-header class="header">
    <div class="logo" />
    <a-menu
        theme="dark"
        mode="horizontal"
        v-model:selectedKeys="selectedKeys1"
        :style="{ lineHeight: '64px' }"
    >
      <a-menu-item key="1">研一</a-menu-item>
      <a-menu-item key="2">研二</a-menu-item>
      <a-menu-item key="3">研三</a-menu-item>
    </a-menu>
  </a-layout-header>
</template>
<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'the-header'
});
</script>