package com.github.ddth.id.qnd;

import java.math.BigInteger;

import com.github.ddth.id.SnowflakeIdGenerator;

public class QndSnowflakeIdGenerator {

	public static void main(String[] args) {
		// get an instance of SnowflakeIdGenerator with default node-id.
		SnowflakeIdGenerator idGenerator = SnowflakeIdGenerator.getInstance();

		// generate a 64-bit long ID
		long id64bit = idGenerator.generateId64();

		// generate a 128-bit long ID
		BigInteger id128bit = idGenerator.generateId128();

		long timestampMs;

		// extract timestamp (in milliseconds) from a 64-bit ID
		timestampMs = SnowflakeIdGenerator.extractTimestamp64(id64bit);

		// extract timestamp (in milliseconds) from a 128-bit ID
		timestampMs = SnowflakeIdGenerator.extractTimestamp128(id128bit);
	}
}
