public class BinaryFormatException extends NumberFormatException {
	private String binaryString;

	//creates a BinaryFormatException object
	public BinaryFormatException(String binaryString) {
		super(binaryString + " is not a binary string");
		this.binaryString = binaryString;
	}

	//returns binaryString
	public String getBinaryString() {
		return binaryString;
	}
}