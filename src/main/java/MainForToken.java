import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
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
public class MainForToken {
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


      /*  HumanStandardToken token = HumanStandardToken.deploy(web3, credentials, GAS_PRICE, GAS_LIMIT, BigInteger.ZERO, new Uint256(2_000_000),
                new Utf8String("Toha tokens"),  new Uint8(BigInteger.TEN),
                new Utf8String("TOH")).get();*/

        HumanStandardToken token = HumanStandardToken.load("0x9f888051f7739096f44d1a97e85c931d7a9e78da", web3, credentials, GAS_PRICE, GAS_LIMIT);

        System.out.println("contr address : " + token.getContractAddress());
        Uint256 totalSupply = token.totalSupply().get();
        System.out.println("Token supply issued: " +  totalSupply.getValue());

        // check your token balance
        Uint256 balance = token.balanceOf(
                new Address(credentials.getAddress()))
                .get();
        System.out.println("Your current balance is: TOH " +
                balance.getValue());

        Uint256 balance1 = token.balanceOf(
                new Address(credentials1.getAddress()))
                .get();
        System.out.println(" 2 Your current balance is: TOH " +
                balance1.getValue());

        // transfer tokens to another address
        TransactionReceipt transferReceipt =
                token.transfer(
                        new Address(credentials1.getAddress()),
                        new Uint256(BigInteger.valueOf(100))).get();

        Uint256 balance2 = token.balanceOf(
                new Address(credentials1.getAddress()))
                .get();
        System.out.println(" AFTER TRANSFER Your current balance is: TOH " +
                balance1.getValue());

        token.approve(new Address(credentials1.getAddress()), new Uint256(BigInteger.valueOf(100)));

        Uint256 uint256 = token.allowance(new Address(credentials.getAddress()), new Address(credentials1.getAddress())).get();
        System.out.println(uint256.getValue());


        Uint256 uint2562 = token.allowance(new Address(credentials1.getAddress()), new Address(credentials.getAddress())).get();
        System.out.println(uint2562.getValue());

    }
}
