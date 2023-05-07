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
          <a-menu-item key="begin">
            <router-link to="/admin/begin">开场</router-link>
          </a-menu-item>
          <a-menu-item key="information">
            <router-link to="/admin/information">填写简历</router-link>
          </a-menu-item>
          <a-menu-item key="choice">
            <router-link to="/admin/ahp">推荐权重设置</router-link>
          </a-menu-item>
          <a-menu-item key="teacher">
            <router-link to="/admin/choice">选择导师</router-link>
          </a-menu-item>
          <a-menu-item key="4"  disabled = ture>初选结果</a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
      <p align="center">
        <video src="../../assets/video/3.mp4" id="video3" style="width:50%;height: auto" autoplay controls></video>
      </p>
      <a-modal v-model:visible="modalVisible"  title="选择导师" @ok="handleModalOk" style="width: 80%">
        <a-table
            :columns="columns"
            :data-source="data"
            :row-key="record => record.id"
            style="width: 100%">
          <template v-slot:action="{record}">
          <a-space size="small">
            <a @click="choose(record)">选择{{ record.tutorname }}</a>
            <a-divider type="vertical" />
            <a>查看详情</a>
          </a-space>
          </template>
        </a-table>
        <a-button type="primary" @click="cancel">取消预选导师</a-button>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script>
import { SmileOutlined, DownOutlined } from '@ant-design/icons-vue';
import {computed, defineComponent, onMounted, reactive, ref, toRefs} from 'vue';
import { message } from 'ant-design-vue';
import axios from "axios";
import Qs from "qs";
import store from "@/store";
import {useRouter} from "vue-router";
const columns = [
  {
    title: '导师姓名',
    dataIndex: 'tutorname',
    key: 'tutorname',
  },
  {
    title: '年龄',
    dataIndex: 'tutorage',
    key: 'tutorage',
  },
  {
    title: '职称',
    dataIndex: 'tutortitle',
    key: 'tutortitle',
  },
  {
    title: '职务',
    dataIndex: 'tutorduty',
    key: 'tutorduty'
  },
  {
    title: '培养模式',
    dataIndex: 'cultivationmodel',
    key: 'cultivationmodel'
  },
  {
    title: '论文',
    dataIndex: 'thesis',
    key: 'thesis'
  },
  {
    title: '学生水平要求',
    dataIndex: 'studentrequirement',
    key: 'studentrequirement'
  },
  {
    title: '研究方向',
    dataIndex: 'researchdirection',
    key: 'researchdirection'
  },
  {
    title: '导师编号',
    dataIndex: 'tutorid',
    key: 'tutorid'
  },
  {
    title: '导师性别',
    dataIndex: 'tutorsex',
    key: 'tutorsex'
  },
  {
    title: '操作',
    key: 'action',
    slots:{customRender : 'action'}
  }
];


export default defineComponent({
  name: 'choice',
  setup() {
    const user = computed(()=> store.state.user);
    const data = ref();
    const tutorName = ref();
    axios.get("/choice/tutorList").then((res) => {
      console.log(res.data.content)
      data.value = res.data.content;
    });
    const modalVisible = ref(false)
    onMounted(() => {
      console.log(222)
      const video3 = document.getElementById("video3")
      video3.addEventListener("ended",() => {
        modalVisible.value = true;
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
    const router = useRouter()
    const handleModalOk = () =>{
      router.push('/admin/result')
    }
    const choose = (record) => {
      console.log(record.tutorname)
      console.log(record.tutorid)
      console.log(user.value.studentId)
      console.log(user.value.studentName)
      const data = Qs.stringify({"studentname": user.value.studentName,"studentid": user.value.studentId,"tutorid": record.tutorid, "tutorname": record.tutorname});
      axios.post("/choose",data).then((res => {
         axios.get("/getTutorName",{params:{studentid:user.value.studentId}}).then(((res =>{
           console.log("111111111111");
           tutorName.value = res.data.message
           console.log(res.data.message);
           console.log(tutorName.value);
           if(tutorName.value!=null){
             message.info("已选择"+tutorName.value);
           }
         })))
           console.log(res.data.message);
      }))
    }
    // const update = () => {
    //   axios.post("/update",data).then((res => {
    //     console.log(res.data)
    //   }))
    // }
    const cancel = () =>{
      const data1 = Qs.stringify({"studentid": user.value.studentId});
         axios.post("/cancel",data1).then((res =>{
           console.log(res.data.message);
           message.info(res.data.message);
         }))
    }
    return {
      cancel,
      tutorName,
      handleModalOk,
      ...toRefs(state),
      modalVisible,
      choose,
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