package com.kishanknows.kvstore.kvClient;

public record KVClientResponse(
        String key,
        String value
) {
}
