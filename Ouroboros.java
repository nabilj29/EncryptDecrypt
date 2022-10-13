public class Ouroboros implements EncryptionProtocol {

    private static final int[] OUROBOROS_ONE = new int[] {3, 1, 0, 2};
    private static final int[] OUROBOROS_TWO = new int[] {2, 5, 4, 1, 3, 0};
    private final String type = "Ouroboros";

    private static String encrypt(int[] am, String in) {
        StringBuilder out = new StringBuilder();
        String use = in + new String(new char[am.length - (in.length() % am.length)]).replace("\0", " ");
        for(int i = 0; i < use.length(); i += am.length) {
            char[] next = new char[am.length];
            for(int j = 0; j < am.length; j++) {
                next[j] = use.charAt(i + am[j]);
            }
            out.append(new String(next));
        }
        return out.toString();
    }


    private static String decrypt(int[] am, String in) {
        StringBuilder out = new StringBuilder();
        String use = in+"";
        for(int i = 0; i < use.length(); i += am.length) {
            char[] next = new char[am.length];
            for(int j = 0; j < am.length; j++) {
                next[am[j]] = use.charAt(i + j);
                next[am[j]] = use.charAt(i + j);
            }
            out.append(new String(next));
        }
        return out.toString();
    }




    @Override
    public String encryptOne(String in) {

        return encrypt(OUROBOROS_ONE, in);
    }

    @Override
    public String encryptTwo(String in) {
        return encrypt(OUROBOROS_TWO, in);
    }

    @Override
    public String decryptOne(String in) {

        return decrypt(OUROBOROS_ONE, in);
    }

    @Override
    public String decryptTwo(String in) {

        return decrypt(OUROBOROS_TWO, in);
    }

    @Override
    public String protocolType() {
        return this.type;
    }





}