<template>
  <a-layout>
    <a-layout-sider width="200" style="background: #fff">
      <a-menu
          mode="inline"
          v-model:selectedKeys="selectedKeys"
          v-model:openKeys="openKeys"
          @openChange="onOpen"
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
          <a-menu-item key="choice" disabled = ture>
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
      <div class="img" style="text-align: center">
        <img src="../../assets/img/info.png" style="width: 400px;height: 400px;margin-top: 10px;vertical-align:middle"/>
      </div>
      <div class="button" style="text-align: center">
        <a-button type="primary" @click="edit" style="margin-top: 30px">简历编辑</a-button>
      </div>
      <a-modal
          v-model:visible="visible"
          :confirm-loading="modalLoading"
          title="简历编辑"
          @ok="handleOk">
        <a-form
            ref="formRef"
            :model="formState"
            :rules="rules"
            :label-col="labelCol"
            :wrapper-col="wrapperCol"
        >
          <a-form-item ref="name" label="姓名" name="name">
           <a-input v-model:value="formState.name" ></a-input>
          </a-form-item>
          <a-form-item ref="name" label="年龄" name="age">
            <a-input v-model:value="formState.age" />
          </a-form-item>
          <a-form-item label="性别" name="sex">
            <a-radio-group v-model:value="formState.sex">
              <a-radio value="1">男</a-radio>
              <a-radio value="2">女</a-radio>
            </a-radio-group>
          </a-form-item>
          <a-form-item label="政治面貌" name="status">
            <a-radio-group v-model:value="formState.status">
              <a-radio value="1">群众</a-radio>
              <a-radio value="2">共青团员</a-radio>
              <a-radio value="3">中共党员</a-radio>
              <a-radio value="4">民主党派成员</a-radio>
            </a-radio-group>
          </a-form-item>
          <a-form-item label="考研排名" name="rank">
            <a-radio-group v-model:value="formState.rank">
              <a-radio value="1" style="margin-left: 10px">前10%</a-radio>
              <a-radio value="2" style="margin-left: 10px">前30%</a-radio>
              <a-radio value="3" style="margin-left: 10px">前50%</a-radio>
              <a-radio value="4" style="margin-left: 10px">前70%</a-radio>
              <a-radio value="5" style="margin-left: 10px">其他</a-radio>
            </a-radio-group>
          </a-form-item>
          <a-form-item label="四级" name="cet4">
            <a-radio-group v-model:value="formState.cet4">
              <a-radio value="1">通过</a-radio>
              <a-radio value="2">未通过</a-radio>
            </a-radio-group>
          </a-form-item>
          <a-form-item label="六级" name="cet6">
            <a-radio-group v-model:value="formState.cet6">
              <a-radio value="1">通过</a-radio>
              <a-radio value="2">未通过</a-radio>
            </a-radio-group>
          </a-form-item>
          <a-form-item label="兴趣方向" name="interestedDirection">
            <a-checkbox-group v-model:value="interestArray">
              <a-checkbox value="1" name="interestedDirection" style="margin-left: 10px">机器学习</a-checkbox>
              <a-checkbox value="2" name="interestedDirection" style="margin-left: 10px">数据挖掘</a-checkbox>
              <a-checkbox value="3" name="interestedDirection" style="margin-left: 10px">自然语言处理</a-checkbox>
            </a-checkbox-group>
          </a-form-item>
          <a-form-item :wrapper-col="{ span: 14, offset: 4 }">
            <a-button type="primary" @click="onSubmit" id="SaveButton">保存</a-button>
            <a-button style="margin-left: 10px" @click="resetForm">重置</a-button>
          </a-form-item>
        </a-form>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script lang="ts">
import { ValidateErrorEntity } from 'ant-design-vue/es/form/interface';
import axios from 'axios';
import {computed, defineComponent, reactive, ref, toRefs} from 'vue';
import { useRouter } from 'vue-router'
import store from "@/store";
interface FormState {
  name: string;
  age:string;
  sex:string;
  status:string;
  cet4:string;
  cet6:string;
  rank:string;
  interestedDirection: string[];
}
export default defineComponent({
  setup() {
    const user = computed(()=> store.state.user);
    const visible = ref<boolean>(false);
    const edit = () => {
      visible.value = true;
    };
    const formRef = ref();
    const formState =  ref({
      name: user.value.studentName,
      interestedDirection: '',
      age:'',
      sex:'',
      cet4:'',
      cet6:'',
      status:'',
      rank:''
    });
    const interestArray = ref([]);
    const rules = {
      name: [
        { required: true, message: '输入你的名字', trigger: 'blur' },
        { min: 1, max: 10, message: '长度不能超过10', trigger: 'blur' },
      ],
      age: [{ required: true, message: '输入你的年龄', trigger: 'blur' }],
      sex: [{ required: true, message: '选择你的性别', trigger: 'change' }],
      status: [{ required: true, message: '选择你的政治面貌', trigger: 'change' }],
      cet4: [{ required: true, message: '四级是否通过', trigger: 'change' }],
      cet6: [{ required: true, message: '六级是否通过', trigger: 'change' }],
      rank: [{ required: true, message: '选择你的成绩排名', trigger: 'change' }],
      interestArray: [
        {
          type: 'array',
          required: true,
          message: '请选择至少一个感兴趣的方向',
          trigger: 'change',
        },
      ],
      // resource: [{ required: true, message: 'Please select activity resource', trigger: 'change' }],
      // desc: [{ required: true, message: 'Please input activity form', trigger: 'blur' }],
    };
    const router = useRouter()
    const onSubmit = () => {
      console.log(formState.value);
      formRef.value
          .validate()
          .then(() => {
            formState.value.interestedDirection=interestArray.value.toString()
                    axios.post("/resume/save",formState.value)
                        .then((response)=>{
                      console.log("resp");
                      visible.value = false;
                      const data = response.data;
                      if(data.success){
                        visible.value = false;
                        console.log("success");
                        router.push('/admin/choice')
                      }else {
                        console.log(data);
                      }
                    });
          })
          .catch((error: ValidateErrorEntity<FormState>) => {
            console.log('error', error);
          });
    };
    const resetForm = () => {
      formRef.value.resetFields();
    };
    const state = reactive({
      rootSubmenuKeys: ['sub1'],
      openKeys: ['sub1'],
      selectedKeys: [],
    });
    const onOpen = (openKeys: string[]) => {
      state.openKeys = openKeys;
    };
    return {
      user,
      interestArray,
      visible,
      edit,
      formRef,
      labelCol: { span: 4 },
      wrapperCol: { span: 14 },
      other: '',
      formState,
      rules,
      onSubmit,
      resetForm,
      ...toRefs(state),
      onOpen,
    };
  },
});
</script>