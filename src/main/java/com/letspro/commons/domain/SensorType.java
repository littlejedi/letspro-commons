package com.letspro.commons.domain;

// This data should be in sync with DB all the time
public enum SensorType {
	
	LUMINOSITY(1,"lux","光照传感器"),
	TEMPERATURE(2,"temperature","温度传感器"),
	HUMIDITY(3,"%","湿度传感器"),
	AIR_PRESUURE(4,"pa","气压传感器"),
	DUST(5,"ug/cm2","灰尘传感器"),
	MAGNETIC(6,"T","磁感应传感器"),
	POSITION(7,"m","位置传感器"),
	DISTANCE(8,"m","激光测距传感器"),
	ULTRAWAVE(9,"","超声波传感器"),
	IMAGE(10,"","图像传感器"),
	GPS(11,"x°y°","GPS定位传感器"),
	ACCELERATION(12,"m/s","三轴加速度传感器"),
	SWITCH(13,"on/off","按钮检测传感器"),
	VOLTAGE(14,"v","电压传感器"),
	CURRENT(15,"A","电流传感器"),
	PRESSURE(16,"N","压力传感器"),
	INFRARED(17,"","红外传感器"),
	SPORTS(18,"","人体运动检测传感器"),
	STEP_COUNTER(19,"steps","计步传感器"),
	ELECTROCARDIOGRAPHY(20,"","心电传感器"),
	PULSE(21,"","脉搏传感器"),
	RADIATION(22,"","辐射传感器"),
	GAS(23,"","气体传感器"),
	SOUND(24,"db","声音传感器");
	
	private int value;
	private String unit;
	private String chineseName;
	
	SensorType(int val, String u, String cn) {
		this.value = val;
		this.unit = u;
		this.chineseName = cn;
	}

    public int getValue() {
	    return this.value;
    }
	
	public String getUnit() {
		return this.unit;
	}
	
	public String getChinesName() {
		return this.chineseName;
	}
}
