import { createStore } from 'vuex'
declare let SessionStorage: any;
const DATA = "DATA"
const store = createStore({
  state: {
    data: SessionStorage.get(DATA)||{}
  },
  mutations: {
    setUser(state,data){
      state.data = data;
      SessionStorage.set(DATA,data);
    }
  },
  actions: {
  },
  modules: {
  }
})
export default store;