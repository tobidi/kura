package org.eclipse.kura.bluetooth;

public class BluetoothLeAdvertisingScanData {
	
	private byte dataType;
	private int dataLength;
	private byte[] data;
	private String address;
	private byte rssi;

	public byte getDataType() {
		return dataType;
	}

	public void setDataType(byte dataType) {
		this.dataType = dataType;
	}

	public int getDataLength() {
		return dataLength;
	}

	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte getRssi() {
		return rssi;
	}

	public void setRssi(byte b) {
		this.rssi = b;
	}

}
