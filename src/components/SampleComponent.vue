 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<script>
export default {
  data() {
    return {
      count: 0
    }
  }
}
</script>

<template>
    <h1>Sample Component 1</h1>
  <button @click="count++">You clicked me {{ count }} times.</button>
</template>