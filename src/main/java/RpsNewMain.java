import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

/**
 * Created by Anton on 07.09.17.
 */
public class RpsNewMain {
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
        //RpsNew rpsNew = RpsNew.deploy(web3, credentials, GAS_PRICE, GAS_LIMIT, BigInteger.ZERO,new Uint256(20)).get();
        RpsNew load = RpsNew.load("0xede2d3406312953acaf76616e8bc0aa06473d3e7", web3, credentials, GAS_PRICE, GAS_LIMIT);



     /*   load.setFirstChoice(new Utf8String("rock"));
        load.setSecondChoice(new Utf8String("paper"));
*/
      /*  Utf8String utf8String = load.choice1().get();
        System.out.println("choice1 : " + utf8String.getValue());

        Utf8String utf8String2 = load.choice2().get();
        System.out.println("choice2 : " + utf8String2.getValue());
*/
        Int256 winner2 = load.getWinner().get();
        System.out.println("AND WINNER IS " + winner2.getValue());

    }
}
