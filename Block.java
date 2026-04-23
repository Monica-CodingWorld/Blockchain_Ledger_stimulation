import java.security.MessageDigest;
import java.util.Date;

class Block {
    int index;
    String data;
    String previousHash;
    String hash;
    Block next;
    long timestamp;
    int nonce;

    Block(int index, String data, String previousHash) {
        this.index = index;
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        this.nonce = 0;

        this.hash = mineBlock(3);
        this.next = null;
    }

    String generateHash() {
        try {
            String input = index + data + previousHash + timestamp + nonce;

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();

            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    String mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');

        do {
            nonce++;
            hash = generateHash();
        } while (!hash.substring(0, difficulty).equals(target));

        System.out.println("Block Mined! Hash: " + hash);
        return hash;
    }
}