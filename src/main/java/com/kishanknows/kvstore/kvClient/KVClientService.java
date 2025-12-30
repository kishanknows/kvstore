package com.kishanknows.kvstore.kvClient;

import org.springframework.stereotype.Service;

@Service
public class KVClientService {
    private final KVClientRepository repo;

    public KVClientService(KVClientRepository repo){
        this.repo = repo;
    }

    public KVClientResponse fetchKeyValue(KVClientPostRequest request){
        return repo.getValue(request.key());
    }

    public KVClientResponse storeKeyValue(KVClientPutRequest request){
        return repo.storeValue(request.key(), request.value());
    }
}
