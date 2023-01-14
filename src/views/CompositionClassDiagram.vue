 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<template>
    <header style="padding: 30px">
        <h1>Step 2: Updating the class diagram</h1>
        <p>Now that we've understood how aggregation works, let's 
            update the class diagram with new constructors to make it a 
            composition relationship.</p>
    </header>
    <main>
        <div id="snackbar">Some text some message..</div>

        <div class="row">
            <div class="column">
                <div class="codebox" :style="{ display: display[0] }">
                    <img style="max-width: 800px;" src="..\assets\Screen1.png" />
                </div>
                <div class="codebox" :style="{ display: display[1] }">
                    <img style="max-width: 800px;" src="..\assets\Screen2.png" />
                </div>
                <div class="codebox" :style="{ display: display[2] }">
                    <img style="max-width: 800px;" src="..\assets\Screen3.png" />
                </div>
                <div class="codebox" :style="{ display: display[3] }">
                    <img style="max-width: 800px;" src="..\assets\Screen4.png" />
                </div>
            </div>
            <div class="column" style="margin-left: 100px">
                <div class="row" style="margin-top:35px">
                    <div class="codebox" style="max-width: 350px;" :style="{ display: display[0] }">
                        Write arguments for a Reservation constructor that takes customer name (customerName), phone number (phone) and vehicle Object (vehicleObj)
                        <br>
                        <br>
                        1. <input v-model="one">
                        <button class="button-9" id="btn1" @click="validate_one()"> Validate </button>
                    </div>
                    <div class="codebox" style="max-width: 350px;" :style="{ display: display[1] }">
                        Write arguments for a Reservation constructor that takes customer name (customerName), email (email) and vehicle Object (vehicleObj)
                        <br>
                        <br>
                        2. <input v-model="two">
                        <button class="button-9" id="btn2" @click="validate_two()"> Validate </button>
                    </div>
                    <div class="codebox" style="max-width: 350px;" :style="{ display: display[2] }">
                        Write arguments for a Reservation constructor that takes customer name (customerName), email (email), phone number (phone) and vehicle Object (vehicleObj)
                        <br>
                        <br>
                        3. <input v-model="three">
                        <button class="button-9" id="btn3" @click="validate_three()"> Validate </button>
                    </div>
                </div>
            </div>
        </div>
        <footer>
    <div id="buttons" class="relative">
      <button class="button-30" @click="$router.push('/screen-three')" :style="{ display: display[3] }">Next</button>
    </div>
  </footer>
    </main>
    
</template>

<script>

export default {
    methods: {
        correct1(){
            var x = document.getElementById("snackbar");
        x.innerHTML = "Correct";
        x.style.backgroundColor = "green";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000);
        },
        validate_one() {
            if (this.one == "String customerName, long phone, Vehicle vehicleObj") {
                this.display[0] = "none";
                this.display[1] = "block";
                this.correct1();
            }

            else {

                var x = document.getElementById("snackbar");
        x.innerHTML = "Wrong Answer";
        x.style.backgroundColor = "red";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000);
            }

        },
        validate_two() {
            if (this.two == "String customerName, String email, Vehicle vehicleObj") {
                this.display[1] = "none";
                this.display[2] = "block";
                this.correct1();

            }
            else {
                var x = document.getElementById("snackbar");
        x.innerHTML = "Wrong Answer";
        x.style.backgroundColor = "red";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000);
            }

        },
        validate_three() {
            if (this.three == "String customerName, String email, long phone, Vehicle vehicleObj") {
                this.display[2] = "none";
                this.display[3] = "block";
                this.correct1();

                this.validated = true;
            }
            else {
                var x = document.getElementById("snackbar");
        x.innerHTML = "Wrong Answer";
        x.style.backgroundColor = "red";
        x.className = "show";
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000);
            }
        },
    },
    data() {
        return {
            id: 'container',
            class: 'wrapper',
            button_text: "Incorrect. Try again.",
            button_text_right: "Next",
            correct: false,
            valid: [false, false],
            validated: false,
            display: ["block", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none", "none"]
        }
    }
}


</script>

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

.row {
    display: flex;
}

.column {
    flex: 50%;
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

.button-30 {
  align-items: center;
  appearance: none;
  background-color: #FCFCFD;
  border-radius: 4px;
  border-width: 0;
  box-shadow: rgba(45, 35, 66, 0.4) 0 2px 4px,rgba(45, 35, 66, 0.3) 0 7px 13px -3px,#D6D6E7 0 -3px 0 inset;
  box-sizing: border-box;
  color: #36395A;
  cursor: pointer;
  display: inline-flex;
  font-family: "JetBrains Mono",monospace;
  height: 48px;
  justify-content: center;
  line-height: 1;
  list-style: none;
  overflow: hidden;
  padding-left: 16px;
  padding-right: 16px;
  position: relative;
  text-align: left;
  text-decoration: none;
  transition: box-shadow .15s,transform .15s;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
  white-space: nowrap;
  will-change: box-shadow,transform;
  font-size: 18px;
}

.button-30:focus {
  box-shadow: #D6D6E7 0 0 0 1.5px inset, rgba(45, 35, 66, 0.4) 0 2px 4px, rgba(45, 35, 66, 0.3) 0 7px 13px -3px, #D6D6E7 0 -3px 0 inset;
}

.button-30:hover {
  box-shadow: rgba(45, 35, 66, 0.4) 0 4px 8px, rgba(45, 35, 66, 0.3) 0 7px 13px -3px, #D6D6E7 0 -3px 0 inset;
  transform: translateY(-2px);
}

.button-30:active {
  box-shadow: #D6D6E7 0 3px 7px inset;
  transform: translateY(2px);
}

#comment {
    margin-left: 15px;
    font-style: italic;
    color: gray;
    font-size: small;
}


.codebox {
    height: 100%;
    width: 100%;
    padding: 25px;
    border-radius: 10px;
    margin: 25px;
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