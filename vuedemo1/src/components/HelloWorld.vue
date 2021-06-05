<template>
  
  <div>
    <h1 class="home">this is home page</h1>
    <button @click=";
    
    if(testData1==1){
      testData1=2
    }else if(testData1==2){
      testData1=1
      }">TEST{{testData1}}</button>
    {{testData1}}
  </div>
</template>

<style>
.home {
  color: white;
}
</style>
<script>
export default {
  data() {
    return {
      testData1:1
    }
  },
}
</script>