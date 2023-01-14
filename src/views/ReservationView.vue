 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<script>
export default {

  methods: {
    validate_one() {
      if (this.one == "class" && this.two == "Reservation") {
        this.button_value = this.button_text_right;
        btn2.style.backgroundColor = "green";
        this.display[0] = "none";
        this.display[1] = "inherit";
      }

      else {
        this.button_value = this.button_text;
        btn1.style.backgroundColor = "red";
      }
    },
    validate_two() {
      if (this.three == "Customer" && this.four == "customer" && this.five == "String" && this.six == "contractStatus" && this.seven == "Date" && this.eight == "releaseDate") {
        this.button_value = this.button_text_right;
        btn2.style.backgroundColor = "green";
        this.display[1] = "none";
        this.display[2] = "inherit";
      }

      else {
        this.button_value = this.button_text;
        btn1.style.backgroundColor = "red";
      }
    },

  },
  data() {
    return {
      id: 'container',
      class: 'wrapper',
      button_value: 'Next',
      button_text: "Incorrect. Try again",
      button_text_right: "Correct. Next",
      correct: false,
      display: ["inherit", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none",]
    }
  }

}

</script>

<template class="app">

  <main>

    <div class="row">
      <div class="column">
        <h1 style="padding: 25px;">Fill in the Java code for the following updated Reservation class.</h1>
        <h2 style="padding: 25px;">You only have to fill in the spaces provided.</h2>

        <div
          style="margin-left: 15%; height: 400px; width: 250px; border: 1px solid black; background-color: #F9FAFE; box-shadow: 2px 3px 10px 2px #D7DFFF;"
          :style="{ display: display[0] }">
          <div style="height : 45px; border-bottom: 1px solid black; text-align: center; padding-top: 15px;">
            <mark0>Class Reservation</mark0>
          </div>
          <div style="height : 155px; border-bottom: 1px solid black; padding: 15px; line-height: 40px;">
            - customerObj: Customer
            <br>
            - contractStatus: String
            <br>
            - releaseDate: Date
          </div>
          <div style="padding: 15px; line-height: 40px;">
            + addReservation(): void
            <br>
            + locateReservation(): String
            <br>
            + releaseContract(): void
          </div>
        </div>

        <div
          style="margin-left: 15%; height: 400px; width: 250px; border: 1px solid black; background-color: #F9FAFE; box-shadow: 2px 3px 10px 2px #D7DFFF;"
          :style="{ display: display[1] }">
          <div style="height : 45px; border-bottom: 1px solid black; text-align: center; padding-top: 15px;">
            <mark1>Class Reservation</mark1>
          </div>
          <div style="height : 155px; border-bottom: 1px solid black; padding: 15px; line-height: 40px;">
            <mark0>- customerObj: Customer
            <br>
            - contractStatus: String
            <br>
            - releaseDate: Date</mark0>
          </div>
          <div style="padding: 15px; line-height: 40px;">
            + addReservation(): void
            <br>
            + locateReservation(): String
            <br>
            + releaseContract(): void
          </div>
        </div>

      </div>
      <div class="column">
        <h1 style="padding: 25px;">Enter your code here .</h1>

        <div class="codebox" id="codebox" :style="{ display: display[0] }">
          public
          <input spellcheck="false" maxlength="5" style="width: 55px;" v-model='one'>
          <input spellcheck="false" id="two" maxlength="11" style="width: 105px;" v-model="two">{ <p id="comment">//Create
            a class "Reservation"</p><br>
          } <br><button class="button-9" id="btn1" @click="validate_one()"> {{ button_value }} </button>
        </div>

        <div class="codebox" id="codebox" :style="{ display: display[1] }">
          public class Reservation{
          <br>&emsp;private final
          <input spellcheck="false" maxlength="8" style="width: 85px;" v-model='three'>
          <input spellcheck="false" id="three" maxlength="8" style="width: 85px;" v-model='four'>; 
          <br>&emsp;private
          <input spellcheck="false" maxlength="6" style="width: 60px;" v-model='five'>
          <input spellcheck="false" maxlength="14" style="width: 150px;" v-model='six'>;
          <br>&emsp;private
          <input spellcheck="false" maxlength="4" style="width:45px;" v-model='seven'>
          <input spellcheck="false" id="seven" maxlength="10" style="width: 110px;" v-model='eight'>;
          <p id="comment">//Declare all attributes of the reservation class(Customer obj, contractStatus, releaseDate)</p><br>
          } <br><button class="button-9" id="btn2" @click="validate_two()"> {{ button_value }} </button>
        </div>

      </div>
    </div>
  </main>
</template>


<style scoped>
* {
  box-sizing: border-box;
  background-color: #F9FAFE;
}


h1,
h2,
p {
  font-family: sans-serif;
  color: rgb(0, 3, 40);
}

.column {
  float: left;
  width: 50%;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

mark1 {
  background-color: rgb(176, 230, 183);
  box-shadow: 1px 6px 15px 2px rgb(160, 222, 159);
  color: black;
  border-radius: 10px;
  padding-left: 12px;
  padding-right: 12px;
  padding-top: 6px;
  padding-bottom: 6px;
}

mark0 {
  box-shadow: 1px 6px 15px 2px rgb(249, 255, 191);
  background-color: rgb(231, 238, 162);
  color: black;
  border-radius: 10px;
  padding-left: 12px;
  padding-right: 12px;
  padding-top: 6px;
  padding-bottom: 6px;
}

#comment {
  margin-left: 15px;
  font-style: italic;
  color: gray;
  font-size: small;
}


.codebox {
  height: 80%;
  width: 90%;
  padding: 25px;
  border-radius: 10px;
  background-color: #F9FAFE;
  box-shadow: 2px 3px 10px 2px #D7DFFF;
}

input{
  border: 1px solid #ccc;
  padding: 10px;
  border-radius: 4px;
  font-size: 14px;
  background-color: white;
  color: black;
}

/* CSS */
.button-9 {
  appearance: button;
  backface-visibility: hidden;
  background-color: #405cf5;
  border-radius: 6px;
  border-width: 0;
  box-shadow: rgba(50, 50, 93, .1) 0 0 0 1px inset, rgba(50, 50, 93, .1) 0 2px 5px 0, rgba(0, 0, 0, .07) 0 1px 1px 0;
  box-sizing: border-box;
  color: #fff;
  cursor: pointer;
  font-family: -apple-system, system-ui, "Segoe UI", Roboto, "Helvetica Neue", Ubuntu, sans-serif;
  font-size: 100%;
  height: 44px;
  line-height: 1.15;
  margin: 12px 0 0;
  outline: none;
  overflow: hidden;
  padding: 0 25px;
  position: relative;
  text-align: center;
  text-transform: none;
  transform: translateZ(0);
  transition: all .2s, box-shadow .08s ease-in;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
  width: 200px;
}

.button-9:disabled {
  cursor: default;
}

.button-9:focus {
  box-shadow: rgba(50, 50, 93, .1) 0 0 0 1px inset, rgba(50, 50, 93, .2) 0 6px 15px 0, rgba(0, 0, 0, .1) 0 2px 2px 0, rgba(50, 151, 211, .3) 0 0 0 4px;
}
</style>
