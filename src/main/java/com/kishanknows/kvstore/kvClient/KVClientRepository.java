package com.kishanknows.kvstore.kvClient;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class KVClientRepository {
    final private HashMap<String, String> hashMap;

    public KVClientRepository(){
        hashMap = new HashMap<>();
    }

    public KVClientResponse getValue(String key){
        return new KVClientResponse(key, hashMap.get(key));
    }

    public KVClientResponse storeValue(String key, String value){
        hashMap.put(key, value);
        return new KVClientResponse(key, value);
    }
}
