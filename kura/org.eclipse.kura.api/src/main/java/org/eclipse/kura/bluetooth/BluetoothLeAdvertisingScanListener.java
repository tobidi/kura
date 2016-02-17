package org.eclipse.kura.bluetooth;

/**
 * BluetoothLeAdvertisingScanListener must be implemented by any class
 * wishing to receive BLE Advertising data
 *
 */
public interface BluetoothLeAdvertisingScanListener {
	
	/**
	 * Fired when bluetooth Advertising scan data is received
	 * 
	 * @param advertisingScanData
	 */
	public void onAdvertisingScanDataReceived(BluetoothLeAdvertisingScanData advertisingScanData);
	
}
