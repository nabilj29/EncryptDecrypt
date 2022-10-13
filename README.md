# EncryptDecrypt
A school project for using different encryption and decryption protocols. 
The program works by the Central Artificial Intelligence sending out or “notifying” the sites which are “subscribed” to the CAI whenever an encryption protocol. In this case it would be required to send (update) everyday to the security sites which is done through the observer pattern. Since there are multiple encryption protocols and possibilities of adding new once, the CAI uses the EncryptionProtocol interface to choose the type of encryption protocol which is done through the strategy pattern.
