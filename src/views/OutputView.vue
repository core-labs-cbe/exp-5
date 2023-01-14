 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<template>
    <header style="padding: 30px">
        <h1>
            Step 4: Understanding the output
        </h1>
        <p>
            To understand the execution of the code, the final state 
            of stack/heap memory has been provided along with the output.
        </p>
    </header>
    <main>
        <div class="flex">
            <div class="codebox">
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
		robj.setBookingDate(new Date());
		robj.getVehicleObj().updateKeyStatus();
		}
	}
                </pre>
            </div>
            <div class="outbox">
                
                    <p>Process finished with exit code 0</p>
                
                </div>
        </div>
        <div style="padding: 20px;">
            <button class="button-9" @click="$router.push('/completion')">Next</button>
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

.comment {
  margin-left: 15px;
  font-style: italic;
  color: gray;
  font-size: small;
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

.flex{
    display: flex;
    justify-content: flex-start;
    align-items: flex-start;
    width: 100%;
    flex-direction: row;
}




.codebox {
    height: 80%;
    width: 50%;
    margin: 25px;
    padding: 25px;
    border-radius: 10px;
    
    box-shadow: 2px 3px 10px 2px #D7DFFF;
}

.outbox {
    height: 80%;
    min-height: 50vh;
    width: 50%;
    margin: 25px;
    padding: 25px;
    border-radius: 10px;
    background-color: #202020;
    color: white;
    font-size: medium;
    font-family: monospace;
    font-weight: bold;
    box-shadow: 2px 3px 10px 2px #D7DFFF;
}

.outbox p{
    background-color: inherit;
    color: inherit;
    font-size: inherit;
    font-family: inherit;
    font-weight: inherit;
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
</style>


<script>
</script>