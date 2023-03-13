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
        <img src="../../assets/img/info.png" style="width: 400px;height: 400px;margin-left: 300px;margin-top: 10px"/>
      </div>
      <div class="button">
        <a-button type="primary" @click="edit" style="margin-left: 360px;margin-top: 30px">简历编辑</a-button>
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
          <a-form-item ref="name" label="Activity name" name="name">
            <a-input v-model:value="formState.name" />
          </a-form-item>
          <a-form-item label="Activity zone" name="region">
            <a-select v-model:value="formState.region" placeholder="please select your zone">
              <a-select-option value="shanghai">Zone one</a-select-option>
              <a-select-option value="beijing">Zone two</a-select-option>
            </a-select>
          </a-form-item>
          <a-form-item label="Activity time" required name="date1">
            <a-date-picker
                v-model:value="formState.date1"
                show-time
                type="date"
                placeholder="Pick a date"
                style="width: 100%"
            />
          </a-form-item>
          <a-form-item label="Instant delivery" name="delivery">
            <a-switch v-model:checked="formState.delivery" />
          </a-form-item>
          <a-form-item label="Activity type" name="type">
            <a-checkbox-group v-model:value="formState.type">
              <a-checkbox value="1" name="type">Online</a-checkbox>
              <a-checkbox value="2" name="type">Promotion</a-checkbox>
              <a-checkbox value="3" name="type">Offline</a-checkbox>
            </a-checkbox-group>
          </a-form-item>
          <a-form-item label="Resources" name="resource">
            <a-radio-group v-model:value="formState.resource">
              <a-radio value="1">Sponsor</a-radio>
              <a-radio value="2">Venue</a-radio>
            </a-radio-group>
          </a-form-item>
          <a-form-item label="Activity form" name="desc">
            <a-textarea v-model:value="formState.desc" />
          </a-form-item>
          <a-form-item :wrapper-col="{ span: 14, offset: 4 }">
            <a-button type="primary" @click="onSubmit">Create</a-button>
            <a-button style="margin-left: 10px" @click="resetForm">Reset</a-button>
          </a-form-item>
        </a-form>
      </a-modal>
    </a-layout-content>
  </a-layout>
</template>
<script lang="ts">
import { ValidateErrorEntity } from 'ant-design-vue/es/form/interface';
import { Moment } from 'moment';
import { defineComponent, reactive, ref, toRaw, UnwrapRef } from 'vue';
interface FormState {
  name: string;
  region: string | undefined;
  date1: Moment | undefined;
  delivery: boolean;
  type: string[];
  resource: string;
  desc: string;
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
      region: undefined,
      date1: undefined,
      delivery: false,
      type: [],
      resource: '',
      desc: '',
    });
    const rules = {
      name: [
        { required: true, message: 'Please input Activity name', trigger: 'blur' },
        { min: 3, max: 5, message: 'Length should be 3 to 5', trigger: 'blur' },
      ],
      region: [{ required: true, message: 'Please select Activity zone', trigger: 'change' }],
      date1: [{ required: true, message: 'Please pick a date', trigger: 'change', type: 'object' }],
      type: [
        {
          type: 'array',
          required: true,
          message: 'Please select at least one activity type',
          trigger: 'change',
        },
      ],
      resource: [{ required: true, message: 'Please select activity resource', trigger: 'change' }],
      desc: [{ required: true, message: 'Please input activity form', trigger: 'blur' }],
    };
    const onSubmit = () => {
      formRef.value
          .validate()
          .then(() => {
            console.log('values', formState, toRaw(formState));
          })
          .catch((error: ValidateErrorEntity<FormState>) => {
            console.log('error', error);
          });
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