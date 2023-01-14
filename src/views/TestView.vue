 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<template>

<div id="app">
    <div v-html= "validate()"></div>
    <div class="live-code">
        <span>
            class <input type="text"> extends Consumer {
                <br>
                <input type="text">() {
                    <br>
                    <input type="text">
                    <br>
                }
                <br>
            }
        </span>
    </div>
</div>

</template>


<script>

export default{
    data: () => {
        return{
            code: [`<h1>Test</h1>`,`<h2>Test</h2>`],
            lineCounter: 0,
        }
    },

    methods: {
        validate(){
            this.lineCounter++;
            console.log(this.lineCounter)
            return this.render(this.lineCounter);
        },

        render(j){
            let html = "";
            for(let i=0;i<=j;i++){
                if(i>=this.code.length){
                    break;
                }
                html += this.code[i];

            }
            console.log(html)
            return html;
        }
    }
  
}



</script>