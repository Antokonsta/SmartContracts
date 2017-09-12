import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.Wallet;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.methods.response.EthAccounts;
import org.web3j.protocol.core.methods.response.EthMining;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.exceptions.TransactionTimeoutException;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.parity.JsonRpc2_0Parity;
import org.web3j.protocol.parity.Parity;
import org.web3j.protocol.parity.methods.response.NewAccountIdentifier;
import org.web3j.protocol.parity.methods.response.PersonalUnlockAccount;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;


import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by Anton on 23.08.17.
 */
public class Main {
    private static final BigInteger GAS_PRICE = BigInteger.valueOf(20_000_000_000L);
    private static final BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000);

    public static void main(String[] args) throws ExecutionException, InterruptedException, CipherException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException, IOException, TransactionTimeoutException, TimeoutException {
        HttpService httpService = new HttpService("http://127.0.0.1:8013");
        Web3j web3 = Web3j.build(httpService);

     /*   Web3ClientVersion clientVersion =
                web3.web3ClientVersion().sendAsync().get();
        if (!clientVersion.hasError()) {
            System.out.println("Client is running version: " +
                    clientVersion.getWeb3ClientVersion());
        }*/

       Parity parity = Parity.build(httpService);
        //Создать новый кошелек
        //String fileName = WalletUtils.generateNewWalletFile("30011994", new File("/Users/Anton/Documents/BC/keystore"),false);
        //System.out.println(fileName);


        // NewAccountIdentifier newAccountIdentifier = parity.personalNewAccount("30011994").sendAsync().get();
        //System.out.println(newAccountIdentifier.getAccountId());
        // EthMining ethMining = parity.ethMining().sendAsync().get();
        //System.out.println(ethMining.isMining());


      /*  EthAccounts ethAccounts = web3.ethAccounts().sendAsync().get();
        List<String> accounts = ethAccounts.getAccounts();
        if (accounts.size() == 0) System.out.println("no acc");
        for (String account : accounts) {
            System.out.println(account);
        }
*/
   /*     //разблокировать
        PersonalUnlockAccount personalUnlockAccount = parity.personalUnlockAccount("0xd19bc468d7152635f7a6b491ff45d7e660db0c21", "30011994").sendAsync().get();
        System.out.println(personalUnlockAccount.accountUnlocked());
*/
        //Сделать транзакцию
        Credentials credentials =
                WalletUtils.loadCredentials(
                        "30011994", "/Users/Anton/Documents/NewBC/keystore/UTC--2017-08-26T08-39-31.881016527Z--d19bc468d7152635f7a6b491ff45d7e660db0c21");

        Credentials credentials1 =
                WalletUtils.loadCredentials(
                        "30011994", "/Users/Anton/Documents/NewBC/keystore/UTC--2017-08-26T08-55-43.408127057Z--80cddcd19338d017e202ea0acd9956a05c448eb5");

    /*    TransactionReceipt transactionReceipt =
                Transfer.sendFundsAsync(
                        web3, credentials,
                        "0x80cddcd19338d017e202ea0acd9956a05c448eb5", BigDecimal.valueOf(30),
                        Convert.Unit.ETHER).get();

        System.out.println(
                "Funds transfer completed, transaction hash: " +
                        transactionReceipt.getTransactionHash() +
                        ", block number: " +
                        transactionReceipt.getBlockNumber());*/


        // ТРЕТЬЕ ЗЕРО!!
        Greeter contract = Greeter.deploy(
                web3, credentials, GAS_PRICE, GAS_LIMIT, BigInteger.ZERO, new Utf8String("TOHA!!!")).get();
         Utf8String greeting = contract.greet().get();
        System.out.println(greeting.getValue());

        /*TransactionReceipt transactionReceipt = contract.kill().get();
        System.out.println(transactionReceipt.toString());*/

      /*Greeter contractLoaded = Greeter.load("0xaaad8784351e7850e50bb34afdb639cc312cc82b",web3,credentials, GAS_PRICE, GAS_LIMIT);

        Utf8String greeting = contractLoaded.greet().get();
        System.out.println(greeting.getValue());*/



       // Rps rps1 = Rps.load("0x94b4815a9ddf21664463859578bd019e737a0780", web3, credentials, GAS_PRICE, GAS_LIMIT);





     //   Rps rps = Rps.deploy(web3, credentials,GAS_PRICE, GAS_LIMIT, BigInteger.ZERO).get();

     //   TransactionReceipt transactionReceipt = rps.register().get();
  /*      TransactionReceipt rock = rps.play(new Utf8String("rock")).get();

        Bool bool = rps.AmIPlayer1().get();
        System.out.println("im i player 1 :" + bool.getValue());*/

      //  Int256 int256 = rps.getWinner().get();
       // System.out.println(int256.getValue());

    //    Rps rps1 = Rps.load("0xdeeb3efe97cc3f33df962390ede5cade29c9cea8", web3, credentials, GAS_PRICE, GAS_LIMIT);
     //   rps1.register().get();
     //   rps.play(new Utf8String("paper")).get();

     //   Bool bool1 = rps.AmIPlayer2().get();
      //  System.out.println("im i player 2 :" + bool1.getValue());

     /*   Int256 int2561 = rps.getWinner().get();
        System.out.println(int2561.getValue());

        Bool bool2 = rps.checkBothNotNull().get();
        System.out.println("check both not null :" +  bool2.getValue());

        Utf8String choice = rps.player1Choice().get();
        System.out.println("player1Choice :" + choice.toString());*/

     /*   System.out.println("get contract balance : " + rps1.getContractBalance().get().getValue());
        System.out.println("get my balance : " +  rps1.getMyBalance().get().getValue());

        rps1.register().get();
        rps1.play(new Utf8String("paper")).get();

        Utf8String choice = rps1.player1Choice().get();
        System.out.println("player1Choice :" + choice.toString());*/





    }
}
