<template>
    <div  style="margin: 0 auto">
        <!-- <button @click="reloadv()">aaa</button> -->
        <div id="mui-player" style="margin:0 auto"></div>
    </div>
    <!-- <video src="../static/a.mp4" controls style="width:1000px;"></video> -->
</template>
<script>
import 'mui-player/dist/mui-player.min.css'
import MuiPlayer from 'mui-player'
import MuiPlayerDesktopPlugin from 'mui-player-desktop-plugin'

export default {
    data() {
        return {
            mp:{}
        }
    },
    mounted() {
        new MuiPlayer({
            container: '#mui-player',
            title: 'eva',
            src: 'http://192.168.199.233:9999/my/mp4/a.mp4',
            loop:true,
            width:'1000px',
            height:'550px',
            dragSpotShape:'square',
            themeColor:'#3CB371',
            volume:0.5,
            plugins:[
                new MuiPlayerDesktopPlugin({
                })
            ]
        })
    },
    methods: {
        reloadv(){
            this.mp.reloadUrl("./a.mp4")
        }
    },

}
</script>