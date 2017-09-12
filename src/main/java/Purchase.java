import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.EventValues;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.3.0.
 */
public final class Purchase extends Contract {
    private static final String BINARY = "60606040525b33600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060023481151561005257fe5b046000819055503460005460020214151561006c57600080fd5b5b5b6106588061007d6000396000f30060606040523615610081576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806308551a531461008657806335a063b4146100db5780633fa4f245146100f05780637150d8ae1461011957806373fac6f01461016e578063c19d93fb14610183578063d6960697146101ba575b600080fd5b341561009157600080fd5b6100996101c4565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156100e657600080fd5b6100ee6101ea565b005b34156100fb57600080fd5b610103610349565b6040518082815260200191505060405180910390f35b341561012457600080fd5b61012c61034f565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561017957600080fd5b610181610375565b005b341561018e57600080fd5b610196610538565b604051808260028111156101a657fe5b60ff16815260200191505060405180910390f35b6101c261054b565b005b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561024657600080fd5b600080600281111561025457fe5b600260149054906101000a900460ff16600281111561026f57fe5b14151561027b57600080fd5b7f72c874aeff0b183a56e2b79c71b46e1aed4dee5e09862134b8821ba2fddbf8bf60405160405180910390a160028060146101000a81548160ff021916908360028111156102c557fe5b0217905550600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc3073ffffffffffffffffffffffffffffffffffffffff16319081150290604051600060405180830381858888f19350505050151561034357600080fd5b5b5b505b565b60005481565b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156103d157600080fd5b60018060028111156103df57fe5b600260149054906101000a900460ff1660028111156103fa57fe5b14151561040657600080fd5b7fe89152acd703c9d8c7d28829d443260b411454d45394e7995815140c8cbcbcf760405160405180910390a160028060146101000a81548160ff0219169083600281111561045057fe5b0217905550600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc6000549081150290604051600060405180830381858888f1935050505015156104b957600080fd5b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc3073ffffffffffffffffffffffffffffffffffffffff16319081150290604051600060405180830381858888f19350505050151561053257600080fd5b5b5b505b565b600260149054906101000a900460ff1681565b600080600281111561055957fe5b600260149054906101000a900460ff16600281111561057457fe5b14151561058057600080fd5b600054600202341480151561059457600080fd5b7fd5d55c8a68912e9a110618df8d5e2e83b8d83211c57a8ddd1203df92885dc88160405160405180910390a133600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506001600260146101000a81548160ff0219169083600281111561062057fe5b02179055505b5b505b505600a165627a7a72305820063df28ff6fa7d58f40a556f250d6d63aa01f4c8be03562d101b13bbc03ce3f20029";

    private Purchase(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Purchase(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<AbortedEventResponse> getAbortedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Aborted", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<AbortedEventResponse> responses = new ArrayList<AbortedEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            AbortedEventResponse typedResponse = new AbortedEventResponse();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<AbortedEventResponse> abortedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Aborted", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, AbortedEventResponse>() {
            @Override
            public AbortedEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                AbortedEventResponse typedResponse = new AbortedEventResponse();
                return typedResponse;
            }
        });
    }

    public List<PurchaseConfirmedEventResponse> getPurchaseConfirmedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("PurchaseConfirmed", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<PurchaseConfirmedEventResponse> responses = new ArrayList<PurchaseConfirmedEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            PurchaseConfirmedEventResponse typedResponse = new PurchaseConfirmedEventResponse();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<PurchaseConfirmedEventResponse> purchaseConfirmedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("PurchaseConfirmed", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, PurchaseConfirmedEventResponse>() {
            @Override
            public PurchaseConfirmedEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                PurchaseConfirmedEventResponse typedResponse = new PurchaseConfirmedEventResponse();
                return typedResponse;
            }
        });
    }

    public List<ItemReceivedEventResponse> getItemReceivedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("ItemReceived", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<ItemReceivedEventResponse> responses = new ArrayList<ItemReceivedEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            ItemReceivedEventResponse typedResponse = new ItemReceivedEventResponse();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ItemReceivedEventResponse> itemReceivedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("ItemReceived", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, ItemReceivedEventResponse>() {
            @Override
            public ItemReceivedEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                ItemReceivedEventResponse typedResponse = new ItemReceivedEventResponse();
                return typedResponse;
            }
        });
    }

    public Future<Address> seller() {
        Function function = new Function("seller", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> abort() {
        Function function = new Function("abort", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> value() {
        Function function = new Function("value", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> buyer() {
        Function function = new Function("buyer", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> confirmReceived() {
        Function function = new Function("confirmReceived", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint8> state() {
        Function function = new Function("state", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> confirmPurchase(BigInteger weiValue) {
        Function function = new Function("confirmPurchase", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, weiValue);
    }

    public static Future<Purchase> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Purchase.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<Purchase> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Purchase.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Purchase load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Purchase(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Purchase load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Purchase(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class AbortedEventResponse {
    }

    public static class PurchaseConfirmedEventResponse {
    }

    public static class ItemReceivedEventResponse {
    }
}
