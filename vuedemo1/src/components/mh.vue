<template>
  <div class="hello">
    <h1 style="color: Turquoise">HELLOWORLD!! {{ mgs }}</h1>
    <button id="cj" @click="cj">抽奖</button>
    <button @click="rep">生成100次</button>
    <p style="color:yellow"> 你抽取到的数字是：{{cjresult}}</p>
    <p style="color:Orange"> 概率：{{probability}}</p>
    <p style="color:PaleGreen"> 记录的长度：{{listLen}}</p>
    <p style="color:pink"> 记录{{resList}}</p>
  </div>
</template>

<script>
export default {
  name: "Hello",
  data() {
    return {
      mgs: "nihao",
      cjresult:"还未开始抽奖",
      resList:[],
      probability:{},
      listLen:0
    };
  },
  methods: {
    rep:function(){
      for(let i=0;i<100;i++)
      document.getElementById("cj").click();
    },
    cj: function(){
      let _this=this
      this.listLen=this.resList.length+1
        let randomNUM=Math.floor(Math.random()*10+1)
        this.cjresult=randomNUM
        this.resList.push(randomNUM)
        _this.probability={}
        for(let i=0;i<_this.resList.length;i++){
          let item = _this.resList[i]
          _this.probability[item] = (this.probability[item]+1) || 1  
        }
        let num = 0
        for(let key in _this.probability){
          num=_this.probability[key]+num
        }
        for(let keys in _this.probability){
          _this.probability[keys]=(_this.probability[keys]/num*100).toFixed(0)+"%"
        }
        }
    }
  };
</script>