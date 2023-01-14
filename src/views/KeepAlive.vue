 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<script>
import ButtonCounter from '../components/SampleComponent.vue'
import ButtonCounter2 from '../components/SampleComponent2.vue'

export default {
  components: {
    ButtonCounter,
    ButtonCounter2
  },
  data(){
    return {
      componentSelect: "ButtonCounter"
    }
  }
}
</script>

<template>
  <button @click="componentSelect='ButtonCounter'">Button Counter 1</button>
  <button @click="componentSelect='ButtonCounter2'">Button Counter 2</button>
  <KeepAlive>
    <component v-bind:is="componentSelect" />
  </KeepAlive>
  
</template>
