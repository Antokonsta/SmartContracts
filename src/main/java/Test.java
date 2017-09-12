import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Anton on 09.09.17.
 */
public class Test {
    private static final BigInteger GAS_PRICE = BigInteger.valueOf(20_000_000_000L);
    private static final BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000);
    private static final BigInteger WEI_PRICE = BigInteger.valueOf(2_000_000_000L);

    public static void main(String[] args) throws IOException, CipherException, ExecutionException, InterruptedException {
        HttpService httpService = new HttpService("http://127.0.0.1:8013");
        Web3j web3 = Web3j.build(httpService);

        Credentials credentials =
                WalletUtils.loadCredentials(
                        "30011994", "/Users/Anton/Documents/NewBC/keystore/UTC--2017-08-26T08-39-31.881016527Z--d19bc468d7152635f7a6b491ff45d7e660db0c21");

        Credentials credentials1 =
                WalletUtils.loadCredentials(
                        "30011994", "/Users/Anton/Documents/NewBC/keystore/UTC--2017-08-26T08-55-43.408127057Z--80cddcd19338d017e202ea0acd9956a05c448eb5");

   /*     MatchContract matchContract = MatchContract.deploy(web3, credentials, GAS_PRICE, GAS_LIMIT, BigInteger.ZERO, new Address(credentials.getAddress()),
                new Address(credentials1.getAddress()),
                new Utf8String("MU"), new Utf8String("Arsenal")).get();
        System.out.println(matchContract.getContractAddress());*/


        MatchContract load = MatchContract.load("0xd1181a45cce040b02ed9b56b6be0bdb40d804b67", web3, credentials, GAS_PRICE, GAS_LIMIT);
        //   System.out.println(matchContract.getContractAddress());
        //  load.setResult(new Uint256(1),new Uint256(2));

        Utf8String utf8String = load.getWinner().get();


        Uint256 uint256 = load.rightRes().get();
        System.out.println(uint256.getValue());
        System.out.println(utf8String.getValue());

    }

}
