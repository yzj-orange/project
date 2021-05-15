<template>
    <div class="body">
        <br>
        <div class="numofscroll">{{windowH}}</div>
        <transition name="tra"> 
        <img @click="tot" v-show="imgs" src="../assets/1.jpg" class="img" alt="">
        </transition>
        &nbsp;&nbsp;&nbsp;&nbsp;《新世纪福音战士》是由GAINAX、龙之子工作室共同制作的日本动画作品，简称EVA。于1995年10月4日-1996年3月27日在日本东京电视台首播，全26集。由庵野秀明担任主要编剧及总导演，贞本义行担任角色设计，绪方惠美、林原惠美、宫村优子、三石琴乃等人担任主要配音。
        作品以发生了“第二次冲击”大灾害的2015年的世界为舞台，主要讲述了14岁少年少女们操控巨大泛用人形决战兵器“EVA”，与袭击第3新东京市的神秘敌人“使徒”之间的战斗故事。
        该片播放期间收视率低迷，但是剧终后在社会上引起了毁誉参半的强烈反响。它与1970年代的《宇宙战舰大和号》及1980年代的《机动战士高达》并肩，成为了对后世动画作品产生影响的第三代动画作品，引发了动画热潮。1997年，公映了与电视动画系列结局（第25集和最终集）有所不同的剧场版动画《新世纪福音战士 Air/真心为你》。 [1]
        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;故事描述的是一个有关“第二次冲击”的记事。公元2000年有颗巨大的陨石坠落在南极冰山附近（政府宣称），高温造成部分冰块溶化，连带使得全球水位上涨，接下来的天灾人祸更是连绵不断，公元2015年又出现了新的入侵者，一种似人的巨大机械战斗群，人们将之称为”使徒”，大概是影射他们是上帝派来的使者，要来消灭作恶多端的人类吧。人类此刻的各种军事武器对使徒可说是毫无用处，为此，当时地球的政治中心决定重用NERV这个组织，他们以最精密的技术，花费巨资研究出一种以驾驶员的神经直接控制的”泛用人形决战兵器”，这种高科技产物将驾驶员与机器做了精细的契合，籍由意志及身体的反映来控制EVA。不过由于当时这些技术还在研发阶段，所以有许多障碍还无法立即克服。而且因为并不是每个人都能自由的驾驶EVA。驾驶人选一直是NERV最头疼的地方，除了符合条件的人难觅，而且还必须经过几个月训练才能和EVA达到同步活动的基本能力。而后，在世界上发现了3名可以驾驶EVA的少男少女，人们把希望都寄托在了他们身上。 [6]
        <div style="margin-top:2000px"></div>
        
    </div>
    
</template>


<script>
export default {
    name:"fly",
    data() {
        return {
            windowH:0,
            imgs:false
        }
    },
    methods: {
        displ(){
            this.windowH=window.scrollY
        },
        tot(){
            // alert("click!")
            // window.scrollTo(0,0)
            
            window.scrollTo({ 
                top: 0, 
                behavior: "smooth" 
            });
        }
    },
    watch: {
        windowH(){
            if(this.windowH>300){
                this.imgs=true
            }else{
                this.imgs=false
            }
        }
    },
    mounted(){
        window.addEventListener('scroll',this.displ)
    }
}
</script>

<style>
    .body{
        color: white;
        font-size: 20px;
    }
    .numofscroll{
        color: white;
        z-index: 9999;
        position: fixed;
        right: 0;
        bottom: 0;
    }
    .img{
        /* z-index: 9999; */
        bottom: 0;
        right: 0;
        margin: 25px;
        position: fixed;  
        width: 200px;
        height: 200px;

    }

    .tra-enter-active{
        animation: scale 3s;
        /* animation: opacity 2s; */
    }
    .tra-leave-active{
        /* animation: scale2 3s; */
        animation: opacity2 2s;
    }
    @keyframes scale {
    0%{
    transform: scale(0);
    }
    /* 50%{
    transform: scale(0.5);
    } */
    100%{
        transform: scale(1);
    }
    }
    @keyframes scale2 {
    0%{
    transform: scale(1);
    }
    /* 50%{
    transform: scale(0.5);
    } */
    100%{
        transform: scale(0);
    }
    }
    @keyframes opacity{
        0%{
    opacity: 0;
    }
    
    100%{
        opacity: 1;
    }
    }
    @keyframes opacity2{
    0%{
    opacity: 1;
    }
    
    100%{
        opacity: 0;
    }
    }
</style>