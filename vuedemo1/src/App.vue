<template>
  <div id="app">
    <ul class="ul1">
      <li>
        <router-link to="/" class="test"><button>首页</button></router-link>
      </li>
      <li>
        <router-link to="/mh" class="test"><button>我的</button></router-link>
      </li>
      <br />
      <router-view />
    </ul>
  </div>
</template>

<script>
export default {
  name: "App",
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /* text-align: center; */
  color: #2c3e50;
  margin-top: 60px;
}

.ul1 {
  list-style: none;
}
.test {
  text-decoration: none;
  float: left;
  padding: 0;
  margin-right: 20px;
}

.test > button {
  background-color: rgb(107, 23, 72);
  padding: 0;
  border: 0;
  width: 60px;
  height: 30px;
  font-weight: bold;
  font-size: 19px;
  color: burlywood;
}
.test > button:hover {
  cursor: pointer;
}

.test > button:focus {
  outline: 0;
  background: blue;
}
body {
  background: rgba(0, 0, 0, 0.794);
}
</style>
