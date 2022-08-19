package main;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<DeviceType, Device> devices = new HashMap<>();
	
	public Registry() {
		this.initialize();
	}
	
	public Device getDevice(DeviceType deviceType) {
		Device device = null;
		
		try {
			device = (Device) devices.get(deviceType).clone();
			
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return device;
	}

	private void initialize() {
		Laptop laptop = new Laptop();
		laptop.setStorageCapacity(2048);
		laptop.setModelType("Lenovo");
		laptop.setNumberOfStock(21);
		
		Phone phone = new Phone();
		phone.setStorageCapacity(1024);
		phone.setModelType("Apple");
		phone.setType("Phone-Apple");
		
		devices.put(DeviceType.LAPTOP, laptop);
		devices.put(DeviceType.PHONE, phone);
	}
}
