 <!--Designed & Developed by:
    Nirmal K (@cyberwizard1001)⁶
    Nitin Ravi (@nitinravi)
    Ritwik M (@ritwik-m) &
    Nalinadevi K (@knaldev)
 for the Ministry of Education (MOE) virtual-labs project, Govt. Of India -->

<template>
	<main class="app">
    <div class="codebox">
    <pre>

public class Vehicle {
	private final int regNum;
	private String keyStatus;
	
	public Vehicle(int regNum)
	{
		this.regNum=regNum;
		this.keyStatus="available";
	}
	
	public String updateKeyStatus()
	{
		this.keyStatus="not available";
		return this.keyStatus;
	}

	public String getKeyStatus() {
		return keyStatus;
	}

	public void setKeyStatus(String keyStatus) {
		this.keyStatus = keyStatus;
	}

	public int getRegNum() {
		return regNum;
	}
	
}

    </pre>
</div>
</main>
</template>
    
<script>

</script>
    
    
<style scoped>

* {
  box-sizing: border-box;
  background-color: #F9FAFE;
}

.codebox {
    height: 80%;
    width: 90%;
    padding: 25px;
    border-radius: 10px;
    margin: 25px;
    background-color: #F9FAFE;
    box-shadow: 2px 3px 10px 2px #D7DFFF;
}

.app{
    background-color: #F9FAFE;
}


</style>