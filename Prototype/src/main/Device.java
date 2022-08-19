package main;

public abstract class Device implements Cloneable {

	private String modelType;
	private int storageCapacity;
	
	public String getModelType() {
		return modelType;
	}
	
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
	
	public int getStorageCapacity() {
		return storageCapacity;
	}
	
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
