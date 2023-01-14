 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<script>
export default {
  methods: {
    correct() {
      var x = document.getElementById("snackbar");
      x.innerHTML = "Correct";
      x.style.backgroundColor = "green";
      x.className = "show";
      setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000)
    },
    incorrect() {
      var x = document.getElementById("snackbar");
      x.innerHTML = "Inorrect. Try again";
      x.style.backgroundColor = "red";
      x.className = "show";
      setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000)
    },
    validate_one() {
      if (this.one == "Customer[]" && this.two == "Customer[3]") {
        var x = document.getElementById("snackbar");
        x.innerHTML = "Correct";
        x.style.backgroundColor = "green";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000)
        this.display[0] = "none";
        this.display[1] = "inherit";
      }

      else {
        this.incorrect();
      }
    },

    validate_two() {
      if (this.three == "new" && this.four == "ABC" && this.five == "abc@gmail.com") {
        var x = document.getElementById("snackbar");
        x.innerHTML = "Correct";
        x.style.backgroundColor = "green";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000)
        this.display[1] = "none";
        this.display[2] = "inherit";
      }
      else {
        this.incorrect();
      }
    },

    validate_three() {
      if (this.six == "setCity" && this.seven == "Coimbatore") {
        var x = document.getElementById("snackbar");
        x.innerHTML = "Correct";
        x.style.backgroundColor = "green";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000)
        this.display[2] = "none";
        this.display[3] = "inherit";
      }
      else {
        this.incorrect();
      }
    },
    validate_four() {
      if (this.eight == "Vehicle" && this.nine == "Vehicle" && this.ten == "1234") {
        var x = document.getElementById("snackbar");
        x.innerHTML = "Correct";
        x.style.backgroundColor = "green";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000)
        this.display[3] = "none";
        this.display[4] = "inherit";
      }
      else {
        this.incorrect();
      }
    },
    validate_five() {
      if (this.eleven == "Reservation" && this.twelve == "cobj[0]" && this.thirteen == "vobj") {
        var x = document.getElementById("snackbar");
        x.innerHTML = "Correct";
        x.style.backgroundColor = "green";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000)
        this.display[4] = "none";
        this.display[5] = "inherit";
      }
      else {
        this.incorrect();
      }
    },
    validate_six() {
      if (this.fourteen == "setBookingDate" && this.fifteen == "getVehicleObj" && this.sixteen == "updateKeyStatus") {
        var x = document.getElementById("snackbar");
        x.innerHTML = "Correct";
        x.style.backgroundColor = "green";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000)
        this.display[5] = "none";
        this.display[6] = "block";
        this.$emit("reservationSystemComplete", true)
      }
      else {
        this.incorrect();
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
<template>
  <main class="app">
    <div id="snackbar">Some text some message..</div>

    <div class="column" style="position:fixed; top: 30%; left: 60%;">
      <div class="column">
        <div class="codebox">
          <h5>Aggregation: </h5>
          <ul style="line-height: 125%;">
            <li>Write a demo class to create a customer array with 3 objects. </li>
            <li>Customer objects are created with the availability of <b>only email</b>,
              then <b>only phone</b> and last <b>customer with both email and phone number</b>.</li>
            <li>Assign the city of the first two customers as Coimbatore and that of the remaining
              customers as Chennai.</li>
            <li>Create a vehicle object with a registration number. </li>
            <li>A customer in Coimbatore does a reservation of the vehicle for current date.
              Also release the vehicle.</li>
          </ul>
        </div>
      </div>
    </div>
    <div class="row">

      <div class="column">
        <h1 style="padding: 25px; padding-bottom: 0px;">Enter your code here .</h1>
        <p style="padding: 25px; padding-top: 0px">Follow instructions provided in the comments</p>

        <div class="codebox" id="codebox" :style="{ display: display[0] }">
          <pre>
import java.util.Scanner;
import java.util.Date;

public class TestDriver {

    public static void main(String[] args) {</pre>&emsp;
          <input spellcheck="false" maxlength="10" style="width: 100px;" v-model='one'> cobj = new
          <input spellcheck="false" id="two" maxlength="11" style="width: 105px;" v-model="two">{ <p id="comment">
            //Create
            an array of Customer objects with 3 array-objects</p><br>
          } <br><button class="button-9" id="btn1" @click="validate_one()"> {{ button_value }} </button>
        </div>

        <div class="codebox" id="codebox" :style="{ display: display[1] }">
          <pre>
import java.util.Scanner;
import java.util.Date;

public class TestDriver {

    public static void main(String[] args) {
        Customer[] cobj= new Customer[3];
                </pre>
          <br>&emsp;&emsp;&emsp;cobj[0] =
          <input spellcheck="false" maxlength="3" style="width: 49px;" v-model='three'> Customer("
          <input spellcheck="false" maxlength="3" style="width: 50px;" v-model='four'>", "
          <input spellcheck="false" maxlength="13" style="width: 130px;" v-model='five'>")
          <p id="comment">//Create a new Customer object using name as "ABC" and email "abc@gmail.com"</p><br>
          } <br><button class="button-9" id="btn2" @click="validate_two()"> {{ button_value }} </button>
        </div>

        <div class="codebox" id="codebox" :style="{ display: display[2] }">
          <pre>
import java.util.Scanner;
import java.util.Date;

public class TestDriver {

    public static void main(String[] args) {
        Customer[] cobj= new Customer[3];
        cobj[0]=new Customer("ABC", "abc@gmail.com");
        cobj[1]=new Customer("DEF", 8654678976L);
        cobj[2]=new Customer("GHI", "ghi@gmail.com", 1234567890L);
      
      </pre>
          <br>&emsp;&emsp;&emsp;cobj[0].
          <input spellcheck="false" maxlength="7" style="width: 75px;" v-model='six'>(
          <input spellcheck="false" maxlength="10" style="width: 110px;" v-model='seven'>);
          <br>&emsp;
          <p id="comment">//Set the City of first object to "Coimbatore"</p><br>&emsp;}
          <br>
          } <br><button class="button-9" id="btn3" @click="validate_three()"> {{ button_value }} </button>
        </div>



        <div class="codebox" id="codebox" :style="{ display: display[3] }">
          <pre>
import java.util.Scanner;
import java.util.Date;

public class TestDriver {

    public static void main(String[] args) {
        Customer[] cobj= new Customer[3];
        cobj[0]=new Customer("ABC", "abc@gmail.com");
        cobj[1]=new Customer("DEF", 8654678976L);
        cobj[2]=new Customer("GHI", "ghi@gmail.com", 1234567890L);
        cobj[0].setCity("Coimbatore");
        cobj[1].setCity("Coimbatore");
        cobj[2].setCity("Chennai");
      </pre> &emsp;&emsp;&emsp;
          <input spellcheck="false" maxlength="7" style="width: 75px;" v-model='eight'> vobj = new
          <input spellcheck="false" maxlength="7" style="width: 75px;" v-model='nine'>(
          <input spellcheck="false" maxlength="4" style="width: 60px;" v-model='ten'>;)

          <br>&emsp;}
          <p id="comment">//Create a new Vehicle object with value "1234"</p><br>
          } <br><button class="button-9" id="btn4" @click="validate_four()"> {{ button_value }} </button>
        </div>

        <div class="codebox" id="codebox" :style="{ display: display[4] }">
          <pre>
import java.util.Scanner;
import java.util.Date;

public class TestDriver {

	public static void main(String[] args) {
		Customer[] cobj= new Customer[3];
		cobj[0]=new Customer("ABC", "abc@gmail.com");
		cobj[1]=new Customer("DEF", 8654678976L);
		cobj[2]=new Customer("GHI", "ghi@gmail.com", 1234567890L);
		cobj[0].setCity("Coimbatore");
		cobj[1].setCity("Coimbatore");
		cobj[2].setCity("Chennai");
		Vehicle vobj=new Vehicle(1234);
      </pre> &emsp;&emsp;&emsp;Reservation robj= new
          <input spellcheck="false" maxlength="11" style="width: 115px;" v-model='eleven'>(
          <input spellcheck="false" maxlength="7" style="width: 75px;" v-model='twelve'>,
          <input spellcheck="false" maxlength="4" style="width: 60px;" v-model='thirteen'> );
          <br>&emsp;&emsp;
          <br>&emsp;}
          <p id="comment">//Create a Reservation object with first Customer object and Vehicle object</p><br>
          } <br><button class="button-9" id="btn5" @click="validate_five()"> {{ button_value }} </button>
        </div>

        <div class="codebox" id="codebox" :style="{ display: display[5] }">
          <pre>
import java.util.Scanner;
import java.util.Date;

public class TestDriver {

	public static void main(String[] args) {
		Customer[] cobj= new Customer[3];
		cobj[0]=new Customer("ABC", "abc@gmail.com");
		cobj[1]=new Customer("DEF", 8654678976L);
		cobj[2]=new Customer("GHI", "ghi@gmail.com", 1234567890L);
		cobj[0].setCity("Coimbatore");
		cobj[1].setCity("Coimbatore");
		cobj[2].setCity("Chennai");
		Vehicle vobj=new Vehicle(1234);
		Reservation robj= new Reservation(cobj[0],vobj);
      </pre> &emsp;&emsp;&emsp;&emsp;robj.
          <input spellcheck="false" maxlength="14" style="width: 140px;" v-model='fourteen'>(new Date());
          <br>&emsp;&emsp;&emsp;&emsp;robj.
          <input spellcheck="false" maxlength="13" style="width: 130px;" v-model='fifteen'>().
          <input spellcheck="false" maxlength="15" style="width: 150px;" v-model='sixteen'>());
          <br>&emsp;&emsp;
          <br>&emsp;}
          <p id="comment">//Call the function to set a booking date and update the key status of vehicle object</p><br>
          } <br><button class="button-9" id="btn6" @click="validate_six()"> {{ button_value }} </button>
        </div>

        <div class="codebox" id="codebox" height=500px :style="{ display: display[6] }">
          <img style="max-width: 800px;" src="..\assets\stack_heap.png">
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
  margin: 25px;
  padding: 25px;
  border-radius: 10px;
  background-color: #F9FAFE;
  box-shadow: 2px 3px 10px 2px #D7DFFF;
}

input {
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

#snackbar {
  visibility: hidden;
  min-width: 250px;
  margin-left: -125px;
  background-color: #333;
  color: #fff;
  text-align: center;
  border-radius: 2px;
  padding: 16px;
  position: fixed;
  z-index: 1;
  left: 50%;
  bottom: 30px;
  font-size: 17px;
}

#snackbar.show {
  visibility: visible;
  -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
  animation: fadein 0.5s, fadeout 0.5s 2.5s;
}

@-webkit-keyframes fadein {
  from {bottom: 0; opacity: 0;} 
  to {bottom: 30px; opacity: 1;}
}

@keyframes fadein {
  from {bottom: 0; opacity: 0;}
  to {bottom: 30px; opacity: 1;}
}

@-webkit-keyframes fadeout {
  from {bottom: 30px; opacity: 1;} 
  to {bottom: 0; opacity: 0;}
}

@keyframes fadeout {
  from {bottom: 30px; opacity: 1;}
  to {bottom: 0; opacity: 0;}
}
</style>
