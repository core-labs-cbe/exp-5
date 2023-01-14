 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<template>
  <div class="app">

    <div class="flexbox">
      <div class="outer-box">

        <div class="congrats">
          Congratulations
        </div>
        <div class="sub-text">
          You have completed the experiment
          <br/>
          You can quit this experiment now

          </div>

        <button class="continue-button" @click="quit">Quit</button>

      </div>
    </div>
  </div>
</template>

<script>
export default {}
</script>

<style scoped>
.flexbox {
  display: flex;
  justify-content: space-evenly;
  flex-direction: column;
  align-items: center;
  height: 90vh;
  overflow: hidden;
  margin: 0;
  padding: 15px
}

.outer-box {
  display: flex;
  flex-direction: column;
  background-color: #F9FAFE;
  box-shadow: 2px 3px 10px 2px #D7DFFF;
  border-radius: 10px;
  padding: 50px;
  width: min-content;
  align-items: center;
  margin: 10px 10% 30px;
  justify-content: center;
}

.congrats {
  font-size: 2.5rem;
  font-weight: 600;
  color: #42b983;
  margin: 0;
  padding: 0;
}

.sub-text {
  font-size: 1rem;
  text-align: center;
  font-weight: 400;
  color: #2c3e50;
  margin-bottom: 50px;
  padding: 0;
}

.continue-button{
  background-color: #42b983;
  color: white;
  border: none;
  border-radius: 5px;
  padding: 10px 20px;
  font-size: 1rem;
  font-weight: 600;
  margin: 10px;
  cursor: pointer;
  width: 100%;
}

.continue-button:hover {
  background-color: #2c3e50;
}

</style>