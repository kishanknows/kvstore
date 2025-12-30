package com.kishanknows.kvstore.kvClient;

public record KVClientPutRequest(
        String key,
        String value
) {
}
