ddth-id
=======

DDTH's ID Generator Library.

Project home:
[https://github.com/DDTH/ddth-id](https://github.com/DDTH/ddth-id)

OSGi environment: ddth-id modules are packaged as an OSGi bundle.


## License ##

See LICENSE.txt for details. Copyright (c) 2014 Thanh Ba Nguyen.

Third party libraries are distributed under their own licenses.


## Installation #

Latest release version: `0.1.0`. See [RELEASE-NOTES.md](RELEASE-NOTES.md).

Maven dependency:

```xml
<dependency>
	<groupId>com.github.ddth</groupId>
	<artifactId>ddth-id</artifactId>
	<version>0.1.0</version>
</dependency>
```

## Usage ##

`ddth-id` can generate several types of IDs:

- Distributed:
  - Based on Twitter Snowflake algorithm: 40, 64 and 128-bit integers.
  - Generated IDs are unique across all nodes (provided each node has a unique id).
  - Next generated ID is larger than prebious IDs.
  - Time-based: each generated ID is associated with a timestamp.
  - Non-serial: `next-id` is NOT equal to `previous-id + 1`!
- Serial:
  - `next-id = previous-id + 1`

Example 1: Generate distributed IDs with Snowflake algorithm.

```java
//get an instance of SnowflakeIdGenerator with default node-id.
SnowflakeIdGenerator idGenerator = SnowflakeIdGenerator.getInstance();

//generate a 64-bit long ID
long id64bit = idGenerator.generateId64();

//generate a 128-bit long ID
BigInteger id128bit = idGenerator.generateId128();

//extract timestamp (in milliseconds) from a 64-bit ID
long timestampMs = SnowflakeIdGenerator.extractTimestamp64(id64bit);

//extract timestamp (in milliseconds) from a 128-bit ID
long timestampMs = SnowflakeIdGenerator.extractTimestamp128(id128bit);
```

Example 2: Generate serial IDs

```java
//generate IDs, backed by Redis.
SerialIdGenerator idGenRedis = RedisIdGenerator.getInstance("localhost", 6379);

//generate IDs, backed by Zookeeper.
SerialIdGenerator idGenZk = ZookeeperIdGenerator.getInstance("localhost:2181/idgen");

//generate an ID within namespace "users"
long userId = idGenRedis.nextId("users");

//generate an ID within namespace "topics"
long topicId = idGenZk("topics");

```
