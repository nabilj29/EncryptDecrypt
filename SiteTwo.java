public class SiteTwo implements Observer {

    CAI cai;
    EncryptionProtocol ep;

    public SiteTwo(CAI cai){
        this.cai = cai;
        this.ep = cai.getProtocol();
    }


    @Override
    public void update() {

        ep = this.cai.getProtocol();

        System.out.println("Using this protocol in Site 2: " + ep.protocolType());
        
    }

    @Override
    public String encryptOne(String in) {
        return this.ep.encryptOne(in);
    }

    @Override
    public String encryptTwo(String in) {
        return this.ep.encryptTwo(in);
    }

    @Override
    public String decryptOne(String in) {
        return this.ep.decryptOne(in);
    }

    @Override
    public String decryptTwo(String in) {
        return this.ep.decryptTwo(in);
    }

    @Override
    public String protocolType() {
        return ep.protocolType();
    }
}
