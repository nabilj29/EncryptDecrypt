public class Runner {
    public static void main(String[] args){


        EncryptionProtocol cer = new Cerebus();
        EncryptionProtocol ouro = new Ouroboros();

        CAI cai = new CAI(cer);

        Observer site2 = new SiteTwo(cai);
        Observer site1 = new SiteOne(cai);

        cai.add(site1);
        cai.add(site2);


        cai.setProtocol(ouro);

        String enc = site1.encryptOne("hello");
        System.out.println(enc);
        String dec = site1.decryptOne(enc);
        System.out.println(dec);

        cai.setProtocol(cer);
        enc = site2.encryptTwo("hello");
        System.out.println(enc);
        dec = site2.decryptTwo(enc);
        System.out.println(dec);



    }
    
}
