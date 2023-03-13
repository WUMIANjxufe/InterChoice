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
            <a-input v-model:value="formState.name" />
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
          <a-form-item label="兴趣方向" name="type">
            <a-checkbox-group v-model:value="formState.type">
              <a-checkbox value="1" name="type" style="margin-left: 10px">机器学习</a-checkbox>
              <a-checkbox value="2" name="type" style="margin-left: 10px">数据挖掘</a-checkbox>
              <a-checkbox value="3" name="type" style="margin-left: 10px">自然语言处理</a-checkbox>
            </a-checkbox-group>
          </a-form-item>
          <a-form-item :wrapper-col="{ span: 14, offset: 4 }">
            <a-button type="primary" @click="onSubmit">保存</a-button>
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
import { Moment } from 'moment';
import { defineComponent, reactive, ref, toRaw, UnwrapRef } from 'vue';
interface FormState {
  name: string;
  age:string;
  sex:string;
  status:string;
  cet4:string;
  cet6:string;
  rank:string;
  type: string[];
}
export default defineComponent({
  setup() {
    const visible = ref<boolean>(false);

    const edit = () => {
      visible.value = true;
    };
    const formRef = ref();
    const formState: UnwrapRef<FormState> = reactive({
      name: '',
      type: [],
      age:'',
      sex:'',
      cet4:'',
      cet6:'',
      status:'',
      rank:''
    });
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
      type: [
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
    const onSubmit = () => {
            axios.post("/studentintro/save",formRef.value).then((response)=>{
              const data = response.data;
              if(data.success){
                visible.value = false;
                console.log("success");
              }
            });
            console.log('values', formState, toRaw(formState));
    };
    const resetForm = () => {
      formRef.value.resetFields();
    };
    return {
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
    };
  },
});
</script>