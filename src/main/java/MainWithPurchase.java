import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

/**
 * Created by Anton on 07.09.17.
 */
public class MainWithPurchase {
    private static final BigInteger GAS_PRICE = BigInteger.valueOf(20_000_000_000L);
    private static final BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000);

    private static final BigInteger WEI_PRICE = BigInteger.valueOf(2_000_000_000L);

    public static void main(String[] args) throws IOException, CipherException, ExecutionException, InterruptedException {

        HttpService httpService = new HttpService("http://127.0.0.1:8013");
        Web3j web3 = Web3j.build(httpService);

        Credentials credentials =
                WalletUtils.loadCredentials(
                        "30011994", "/Users/Anton/Documents/NewBC/keystore/UTC--2017-08-26T08-39-31.881016527Z--d19bc468d7152635f7a6b491ff45d7e660db0c21");

        //SimpleStorage ss = SimpleStorage.deploy(web3, credentials, GAS_PRICE, GAS_LIMIT, BigInteger.ZERO).get();
        SimpleStorage ss = SimpleStorage.load("0x1ead8dfc1a532f04a91ffaa17b2c4442e56b4ec2", web3, credentials, GAS_PRICE, GAS_LIMIT);
   //     ss.set(new Uint256(100));

        System.out.println("address " + ss.getContractAddress());

        Uint256 uint256 = ss.get().get();
        System.out.println("храним : " + uint256.getValue());


    }
}
