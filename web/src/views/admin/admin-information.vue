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
          <a-menu-item key="information">
            <router-link to="/admin/information">填写简历</router-link>
          </a-menu-item>
          <a-menu-item key="2">选择导师</a-menu-item>
          <a-menu-item key="3">预测成功率</a-menu-item>
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
      <div class="img">
        <img src="../../assets/img/info.png" style="width: 200px;height: 400px;margin-left: 300px;margin-top: 10px"/>
      </div>
      <div class="button">
        <a-button type="primary" @click="edit" style="margin-left: 360px;margin-top: 30px">简历编辑</a-button>
      </div>
      <a-modal
          v-model:visible="visible"
          :confirm-loading="modalLoading"
          title="简历编辑"
          @ok="handleOk">
        <a-form>
          <a-form-item label="姓名">
            <a-input />
          </a-form-item>
          <a-form-item label="年龄">
            <a-input />
          </a-form-item>
          <a-form-item label="性别">
            <a-input />
          </a-form-item>
          <a-form-item label="毕业院校">
            <a-input />
          </a-form-item>
          <a-form-item label="毕业院校">
            <a-input />
          </a-form-item>
          <a-form-item label="四级成绩">
            <a-input />
          </a-form-item>
          <a-form-item label="六级成绩">
            <a-input />
          </a-form-item>
          <a-form-item label="性别">
            <a-radio-group>
              <a-radio value="1">男</a-radio>
              <a-radio value="2">女</a-radio>
            </a-radio-group>
          </a-form-item>
        </a-form>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script lang="ts">
import { defineComponent, ref } from 'vue';
export default defineComponent({
  setup() {
    const visible = ref<boolean>(false);

    const edit = () => {
      visible.value = true;
    };

    const handleOk = (e: MouseEvent) => {
      console.log(e);
      visible.value = false;
    };
    return {
      visible,
      edit,
      handleOk,
    };
  },
});
</script>