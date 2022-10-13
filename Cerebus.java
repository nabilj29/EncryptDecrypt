public class Cerebus implements EncryptionProtocol{
    private static final int CEREBUS_ONE = 18;
	private static final int CEREBUS_TWO = 31;
	private static final int CEREBUS_INIT_VALUE = 32;
	private static final int CEREBUS_ALPH_SIZE = 128;
    private final String type = "Cerebus";

    private static String encrypt(int am, String in) {
        StringBuilder out = new StringBuilder();
		String use = in.toLowerCase();
		for(char a : use.toCharArray()) {
			out.append((char)(((a + am - CEREBUS_INIT_VALUE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
		}
		return out.toString();
    }

    private static String decrypt(int am, String in) {
        StringBuilder out = new StringBuilder();
		String use = in.toLowerCase();
		for(char a : use.toCharArray()) {
			out.append((char)(((a - am  - CEREBUS_INIT_VALUE + CEREBUS_ALPH_SIZE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
		}
		return out.toString();
    }

    @Override
    public String encryptOne(String in) {

		return encrypt(CEREBUS_ONE, in);
	}

    @Override
	public String encryptTwo(String in) {

		return encrypt(CEREBUS_TWO, in);
	}

    @Override
	public String decryptOne(String in) {

		return decrypt(CEREBUS_ONE, in);
	}

    @Override
	public String decryptTwo(String in) {

		return decrypt(CEREBUS_TWO, in);
	}

    @Override
    public String protocolType() {
        return this.type;
    }
}
