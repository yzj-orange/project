import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import mh from '@/components/mh'
import fly from '@/components/fly'
import living from '@/components/videoplayer'
Vue.use(Router)

export default new Router({
  routes: [{
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/mh',
      name: 'mh',
      component: mh
    },
    {
      path: '/fly',
      name: 'fly',
      component: fly
    },{
      path:'/living',
      name: 'living',
      component: living
    }
  ]
})
