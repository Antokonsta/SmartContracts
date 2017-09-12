import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
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
public final class MatchContract extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b6040516107d63803806107d6833981016040528080519060200190919080519060200190919080518201919060200180518201919050505b836000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555082600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555081600290805190602001906100de929190610100565b5080600390805190602001906100f5929190610100565b505b505050506101a5565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061014157805160ff191683800117855561016f565b8280016001018555821561016f579182015b8281111561016e578251825591602001919060010190610153565b5b50905061017c9190610180565b5090565b6101a291905b8082111561019e576000816000905550600101610186565b5090565b90565b610622806101b46000396000f3006060604052361561008c576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806316e64048146100915780631f2a63c014610120578063310efb48146101af5780635c39fcc1146101db5780638e7ea5b21461023057806398785738146102bf578063bbf3e8c314610314578063c495952c1461033d575b600080fd5b341561009c57600080fd5b6100a4610366565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156100e55780820151818401525b6020810190506100c9565b50505050905090810190601f1680156101125780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561012b57600080fd5b610133610404565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101745780820151818401525b602081019050610158565b50505050905090810190601f1680156101a15780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156101ba57600080fd5b6101d960048080359060200190919080359060200190919050506104a2565b005b34156101e657600080fd5b6101ee6104b5565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561023b57600080fd5b6102436104da565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156102845780820151818401525b602081019050610268565b50505050905090810190601f1680156102b15780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156102ca57600080fd5b6102d26105b0565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561031f57600080fd5b6103276105d6565b6040518082815260200191505060405180910390f35b341561034857600080fd5b6103506105dc565b6040518082815260200191505060405180910390f35b60028054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103fc5780601f106103d1576101008083540402835291602001916103fc565b820191906000526020600020905b8154815290600101906020018083116103df57829003601f168201915b505050505081565b60038054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561049a5780601f1061046f5761010080835404028352916020019161049a565b820191906000526020600020905b81548152906001019060200180831161047d57829003601f168201915b505050505081565b81600481905550806005819055505b5050565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6104e26105e2565b600554600454111561052b576040805190810160405280600481526020017f6c6566740000000000000000000000000000000000000000000000000000000081525090506105ad565b6005546004541415610574576040805190810160405280600481526020017f647261770000000000000000000000000000000000000000000000000000000081525090506105ad565b6040805190810160405280600581526020017f726967687400000000000000000000000000000000000000000000000000000081525090505b90565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60045481565b60055481565b6020604051908101604052806000815250905600a165627a7a72305820213d09b27b6ea12339d3f2b86a5cda6d6b73dcb5fe8d821c19f8bb21b7e315740029";

    private MatchContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private MatchContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Utf8String> left() {
        Function function = new Function("left", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> right() {
        Function function = new Function("right", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> setResult(Uint256 leftResult, Uint256 rightResult) {
        Function function = new Function("setResult", Arrays.<Type>asList(leftResult, rightResult), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Address> initiator() {
        Function function = new Function("initiator", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> getWinner() {
        Function function = new Function("getWinner", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> opposer() {
        Function function = new Function("opposer", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> leftRes() {
        Function function = new Function("leftRes", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> rightRes() {
        Function function = new Function("rightRes", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<MatchContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Address _initiator, Address _opposer, Utf8String _left, Utf8String _right) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_initiator, _opposer, _left, _right));
        return deployAsync(MatchContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Future<MatchContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Address _initiator, Address _opposer, Utf8String _left, Utf8String _right) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_initiator, _opposer, _left, _right));
        return deployAsync(MatchContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static MatchContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new MatchContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static MatchContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new MatchContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
