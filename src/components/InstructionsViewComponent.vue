 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<template>
    <main class="app">
        <div class="box">
            <h1>Instructions</h1>
            <ol>
                <li class="arrow">In this section of the experiment, we'll be writing code to understand aggregation.</li>
                <li class="arrow">Customer, Reservation and Vehicle classes have been implemented and are to be referred to.</li>
                <li class="arrow">To combine the different classes as shown in the diagram, we will be creating a Reservation System class.</li>
                <li class="arrow">Switch between instructions, classes and the class diagram by clicking on the respective elements in the top navigation bar.</li>
                <li class="arrow">Once you're done programming the Reservation and Reservation System classes, a'Next' button will appear at the bottom left corner.</li>
            </ol>
        </div>
    </main>
</template>


<script>

</script>

<style scoped>

.app{
  background-color: #F9FAFE;
  min-height: 960px;
  display: flex;
  align-items: flex-start;
  justify-content: center;
}

.box{
    height: 80%;
    min-height: 600px;
    width: 100%;
    padding: 25px;
    border-radius: 10px;
    margin: 30px;
    margin-top: 15px;
    line-height: 60px;
    background-color: #F9FAFE;
    box-shadow: 2px 3px 10px 2px #D7DFFF;
}

            
            
ol {
  line-height: 3;
}

ol li {
  list-style-type: none;
  counter-increment: item;
}

ol li:before {
  content: counter(item);
  display: inline-block;
  width: 15px;
  height: 25px;
  margin-right: 5px;
  background-color: #f9dd94;
  color: #7eb4e2;
  font-weight: bold;
  font-size: 140%;
  text-align: center;
  vertical-align: end;
  padding: 0 8px 8px;
  border-radius: 3px;
  line-height: 1.3;
}
    
    


</style>