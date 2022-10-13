public interface EncryptionProtocol {
    String encryptOne(String in);
    String encryptTwo(String in);

    String decryptOne(String in);
    String decryptTwo(String in);

    String protocolType();
}
;