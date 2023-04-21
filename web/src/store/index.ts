import { createStore } from 'vuex'
const store = createStore({
  state: {
    data: {}
  },
  mutations: {
    setUser(state,data){
      state.data = data;
    }
  },
  actions: {
  },
  modules: {
  }
})
export default store;