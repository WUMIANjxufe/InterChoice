<template>
  <a-layout>
    <a-layout-sider width="200" style="background: #fff">
      <a-menu
          mode="inline"
          v-model:selectedKeys="selectedKeys"
          v-model:openKeys="openKeys"
          @openChange="onOpenChange"
          style="height: 100%"
      >
        <a-sub-menu key="sub1">
          <template #title>
                <span>
                  <user-outlined />
                   实验流程
                </span>
          </template>
          <a-menu-item key="begin" >
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
          </a-menu-item>
          <a-menu-item key="4"  disabled = ture>
            <router-link to="/admin/result">初选结果</router-link>
          </a-menu-item>
          <a-menu-item key="4"  disabled = ture>
            <router-link to="/admin/inspect">导师考察</router-link>
          </a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
      <p align="center">
        <video src="../../assets/video/3.mp4" id="video3" style="width:50%;height: auto" autoplay controls></video>
      </p>
      <a-modal v-model:visible="modalvisible"  title="选择导师" @ok="handleModalOk" style="width: 80%">
        <a-table :columns="columns" :data-source="data" style="width: 100%">
        </a-table>
        <a-button @click="info" type="primary">填表前请点此看提示</a-button>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script>
import {SmileOutlined, DownOutlined} from '@ant-design/icons-vue';
import {defineComponent, h, onMounted, reactive, ref, toRefs} from 'vue';
import axios from "axios";
import {Modal} from "ant-design-vue";
import AHP from "@/assets/img/AHP.png"
import router from "@/router";
import store from "@/store";
const columns = [
  {
    title: '姓名',
    dataIndex: 'name',
    key: 'name',
  },
  {
    title: '年龄',
    dataIndex: 'age',
    key: 'age',
  },
  {
    title: '性别',
    dataIndex: 'address',
    key: 'address',
  },
  {
    title: '职称',
    key: 'tags',
    dataIndex: 'tags',
    slots: { customRender: 'tags' },
  },
  {
    title: '选择',
    key: 'action'
  },
  {
    title: '预测成功率',
    key: 'predict'
  }
];

const data = [
  {
    key: '1',
    name: 'John Brown',
    age: 32,
    address: 'New York No. 1 Lake Park',
    tags: ['nice', 'developer'],
  },
  {
    key: '2',
    name: 'Jim Green',
    age: 42,
    address: 'London No. 1 Lake Park',
    tags: ['loser'],
  },
  {
    key: '3',
    name: 'Joe Black',
    age: 32,
    address: 'Sidney No. 1 Lake Park',
    tags: ['cool', 'teacher'],
  },
  {
    key: '3',
    name: 'Joe Black',
    age: 32,
    address: 'Sidney No. 1 Lake Park',
    tags: ['cool', 'teacher'],
  },
  {
    key: '3',
    name: 'Joe Black',
    age: 32,
    address: 'Sidney No. 1 Lake Park',
    tags: ['cool', 'teacher'],
  },
  {
    key: '3',
    name: 'Joe Black',
    age: 32,
    address: 'Sidney No. 1 Lake Park',
    tags: ['cool', 'teacher'],
  },
  {
    key: '3',
    name: 'Joe Black',
    age: 32,
    address: 'Sidney No. 1 Lake Park',
    tags: ['cool', 'teacher'],
  }
];
export default defineComponent({
  setup() {
    store.commit("setNum",false)
    axios.get("/choice/tutorList").then((res) => {
      console.log(res.data)
    });
    const modalvisible = ref(false)
    onMounted(() => {
      console.log(222)
      const video3 = document.getElementById("video3")
      video3.addEventListener("ended",() => {
        modalvisible.value = true;
      })
    })
    const state = reactive({
      rootSubmenuKeys: ['sub1'],
      openKeys: ['sub1'],
      selectedKeys: [],
    });
    const onOpenChange = (openKeys) => {
      state.openKeys = openKeys;
    };
    const handleModalOk = ()=>{
      router.push('/admin/choice')
    }
    const info = () => {
      Modal.info({
        style:"width:1000px",
        title: () => '打分标准',
        content: () => h('div', {style:"width:1000px"}, [
          h('img', {src:AHP}),
        ]),
        onOk() {
          console.log('ok');
        },
      });
    };
    return {
      handleModalOk,
      info,
      ...toRefs(state),
      modalvisible,
      data,
      columns,
      onOpenChange
    };
  },
  components: {
    SmileOutlined,
    DownOutlined,
  },
});
</script>