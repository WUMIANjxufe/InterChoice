import { createStore } from 'vuex'

declare let SessionStorage: any;
const USER = "USER";
const NUM = "NUM"
const store = createStore({
  state: {
    user: SessionStorage.get(USER) || {},
    num:  SessionStorage.get(NUM)  || {}
  },
  mutations: {
    setUser (state, user) {
      console.log("store user：", user);
      state.user = user;
      SessionStorage.set(USER, user);
    },
    setNum (state , num){
      console.log("store num：", num);
      state.num = num;
      SessionStorage.set(NUM, num);
    }
  },
  actions: {
  },
  modules: {
  }
});

export default store;
