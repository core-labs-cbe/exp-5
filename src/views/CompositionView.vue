 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<script>
import CustomerView2 from '../components/CustomerViewComponent2.vue'
import ReservationView2 from '../components/ReservationViewComponent2.vue'
import VehicleView2 from '../components/VehicleViewComponent2.vue'
import InstructionsView2 from '../components/InstructionsViewComponent2.vue'
import ReservationSystemView2 from '../components/ReservationSystemViewComponent2.vue'
import ClassView2 from '../components/ClassDiagramView2.vue'

export default {
  components: {
    CustomerView2,
    ReservationView2,
    VehicleView2,
    InstructionsView2,
    ReservationSystemView2,
    ClassView2
  },
  data(){
    return {
      componentSelect: "InstructionsView2",
      reservation_complete: false,
      reservation_system_complete: false
    }
  },
  methods: {
    reservationCallback(value) {
      console.log("Event reservation triggered", value);
      this.reservation_complete = true;
    },
    reservationSystemCallBack(value){
      console.log("Event reservation system triggered", value);
      this.reservation_system_complete = true;
    }
  },
}
</script>

<template>
  <main class="app">
  <button @click="componentSelect='InstructionsView2'">Instructions</button>
  <button @click="componentSelect='CustomerView2'">Customer Class</button>
  <button @click="componentSelect='ReservationView2'">Reservation Class</button>
  <button @click="componentSelect='VehicleView2'">Vehicle Class</button>
  <button @click="componentSelect='ReservationSystemView2'">Reservation System Class</button>
  <button @click="componentSelect='ClassView2'">Class diagram</button>
  <KeepAlive>
    <component v-bind:is="componentSelect" 
    @reservation-complete="reservationCallback"
        @reservation-system-complete="reservationSystemCallBack"
    />
  </KeepAlive>
  </main>
  <footer v-show="(reservation_complete && reservation_system_complete)">
    <div id="buttons" class="relative">
      <button class="navitem" @click="$router.push('/screen-four')">Next</button>
    </div>
  </footer>
</template>

<style>


.app{
  background-color: #F9FAFE;
  min-height: 1024px;
}

button{
  margin-top: 30px;
  border: none;
  padding: 20px;
  margin-left: 5px;
  background-color: #2c3e50;
  color: white;
}

button:first-of-type{
  margin-left: 30px;
}
</style>