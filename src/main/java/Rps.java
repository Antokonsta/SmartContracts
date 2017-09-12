import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.3.0.
 */
public final class Rps extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b5b60008060405180807f726f636b000000000000000000000000000000000000000000000000000000008152506004019050908152602001604051809103902060405180807f726f636b0000000000000000000000000000000000000000000000000000000081525060040190509081526020016040518091039020819055506002600060405180807f726f636b000000000000000000000000000000000000000000000000000000008152506004019050908152602001604051809103902060405180807f706170657200000000000000000000000000000000000000000000000000000081525060050190509081526020016040518091039020819055506001600060405180807f726f636b000000000000000000000000000000000000000000000000000000008152506004019050908152602001604051809103902060405180807f73636973736f727300000000000000000000000000000000000000000000000081525060080190509081526020016040518091039020819055506001600060405180807f70617065720000000000000000000000000000000000000000000000000000008152506005019050908152602001604051809103902060405180807f726f636b00000000000000000000000000000000000000000000000000000000815250600401905090815260200160405180910390208190555060008060405180807f70617065720000000000000000000000000000000000000000000000000000008152506005019050908152602001604051809103902060405180807f706170657200000000000000000000000000000000000000000000000000000081525060050190509081526020016040518091039020819055506002600060405180807f70617065720000000000000000000000000000000000000000000000000000008152506005019050908152602001604051809103902060405180807f73636973736f727300000000000000000000000000000000000000000000000081525060080190509081526020016040518091039020819055506002600060405180807f73636973736f72730000000000000000000000000000000000000000000000008152506008019050908152602001604051809103902060405180807f726f636b0000000000000000000000000000000000000000000000000000000081525060040190509081526020016040518091039020819055506001600060405180807f73636973736f72730000000000000000000000000000000000000000000000008152506008019050908152602001604051809103902060405180807f7061706572000000000000000000000000000000000000000000000000000000815250600501905090815260200160405180910390208190555060008060405180807f73636973736f72730000000000000000000000000000000000000000000000008152506008019050908152602001604051809103902060405180807f73636973736f727300000000000000000000000000000000000000000000000081525060080190509081526020016040518091039020819055505b5b610e498061049e6000396000f300606060405236156100a2576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680630ce6e680146100a75780631aa3a00814610136578063452d44dc1461014b5780634c738909146101785780636f9fb98a146101a1578063718e6302146101ca57806379b0797c1461023b578063805210b7146102685780638e7ea5b214610295578063d8b1f219146102be575b600080fd5b34156100b257600080fd5b6100ba61034d565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156100fb5780820151818401525b6020810190506100df565b50505050905090810190601f1680156101285780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561014157600080fd5b6101496103eb565b005b341561015657600080fd5b61015e6105c0565b604051808215151515815260200191505060405180910390f35b341561018357600080fd5b61018b610603565b6040518082815260200191505060405180910390f35b34156101ac57600080fd5b6101b4610623565b6040518082815260200191505060405180910390f35b34156101d557600080fd5b610225600480803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091905050610643565b6040518082815260200191505060405180910390f35b341561024657600080fd5b61024e610b3e565b604051808215151515815260200191505060405180910390f35b341561027357600080fd5b61027b610b97565b604051808215151515815260200191505060405180910390f35b34156102a057600080fd5b6102a8610bf0565b6040518082815260200191505060405180910390f35b34156102c957600080fd5b6102d1610cda565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156103125780820151818401525b6020810190506102f6565b50505050905090810190601f16801561033f5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b60048054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103e35780601f106103b8576101008083540402835291602001916103e3565b820191906000526020600020905b8154815290600101906020018083116103c657829003601f168201915b505050505081565b6005803410156103fa57600080fd5b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614806104a35750600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16145b156104ad57600080fd5b6000600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614156105345733600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506105b8565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614156105b75733600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5b5b5b5b5b5b50565b60008060038054600181600116156101000203166002900490501480156105fd575060006004805460018160011615610100020316600290049050145b90505b90565b60003373ffffffffffffffffffffffffffffffffffffffff163190505b90565b60003073ffffffffffffffffffffffffffffffffffffffff163190505b90565b600080600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614156106b85782600390805190602001906106b2929190610d78565b50610727565b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415610726578260049080519060200190610724929190610d78565b505b5b600060038054600181600116156101000203166002900490501415801561076557506000600480546001816001161561010002031660029004905014155b15610b0f576000600360405180828054600181600116156101000203166002900480156107c95780601f106107a75761010080835404028352918201916107c9565b820191906000526020600020905b8154815290600101906020018083116107b5575b50509150509081526020016040518091039020600460405180828054600181600116156101000203166002900480156108395780601f10610817576101008083540402835291820191610839565b820191906000526020600020905b815481529060010190602001808311610825575b5050915050908152602001604051809103902054905060018114156108cc57600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc3073ffffffffffffffffffffffffffffffffffffffff16319081150290604051600060405180830381858888f1935050505050610a35565b600281141561094957600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc3073ffffffffffffffffffffffffffffffffffffffff16319081150290604051600060405180830381858888f1935050505050610a34565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc60023073ffffffffffffffffffffffffffffffffffffffff16318115156109a857fe5b049081150290604051600060405180830381858888f1935050505050600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc3073ffffffffffffffffffffffffffffffffffffffff16319081150290604051600060405180830381858888f19350505050505b5b602060405190810160405280600081525060039080519060200190610a5b929190610d78565b50602060405190810160405280600081525060049080519060200190610a82929190610d78565b506000600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506000600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550809150610b38565b7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff9150610b38565b5b50919050565b6000600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161490505b90565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161490505b90565b60008060036040518082805460018160011615610100020316600290048015610c505780601f10610c2e576101008083540402835291820191610c50565b820191906000526020600020905b815481529060010190602001808311610c3c575b5050915050908152602001604051809103902060046040518082805460018160011615610100020316600290048015610cc05780601f10610c9e576101008083540402835291820191610cc0565b820191906000526020600020905b815481529060010190602001808311610cac575b505091505090815260200160405180910390205490505b90565b60038054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610d705780601f10610d4557610100808354040283529160200191610d70565b820191906000526020600020905b815481529060010190602001808311610d5357829003601f168201915b505050505081565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610db957805160ff1916838001178555610de7565b82800160010185558215610de7579182015b82811115610de6578251825591602001919060010190610dcb565b5b509050610df49190610df8565b5090565b610e1a91905b80821115610e16576000816000905550600101610dfe565b5090565b905600a165627a7a723058202092f69f0db6f241f0374751fdc37614144dbdb5ca711ceeee86e6dcff3a7f120029";

    private Rps(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Rps(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Utf8String> player2Choice() {
        Function function = new Function("player2Choice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> register() {
        Function function = new Function("register", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Bool> checkBothNotNull() {
        Function function = new Function("checkBothNotNull", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> getMyBalance() {
        Function function = new Function("getMyBalance", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> getContractBalance() {
        Function function = new Function("getContractBalance", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> play(Utf8String choice) {
        Function function = new Function("play", Arrays.<Type>asList(choice), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Bool> AmIPlayer1() {
        Function function = new Function("AmIPlayer1", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> AmIPlayer2() {
        Function function = new Function("AmIPlayer2", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Int256> getWinner() {
        Function function = new Function("getWinner", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> player1Choice() {
        Function function = new Function("player1Choice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<Rps> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Rps.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<Rps> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Rps.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Rps load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Rps(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Rps load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Rps(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}