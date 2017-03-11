ddth-id
=======

DDTH's ID Generator Library.

Project home:
[https://github.com/DDTH/ddth-id](https://github.com/DDTH/ddth-id)

`ddth-id` requires Java 8+ since v0.5.0


## License ##

See LICENSE.txt for details. Copyright (c) 2014-2017 Thanh Ba Nguyen.

Third party libraries are distributed under their own licenses.


## Installation ##

Latest release version: `0.5.0`. See [RELEASE-NOTES.md](RELEASE-NOTES.md).

Maven dependency: if only a sub-set of `ddth-id` is used, choose the corresponding dependency artifact(s) to reduce the number of unused jar files.

`ddth-id-core`: in-memory id-generator and Snowflake id-generator; Cassandra, Jdbc, Redis and Zookeeper dependencies are optional.

```xml
<dependency>
	<groupId>com.github.ddth</groupId>
	<artifactId>ddth-id-core</artifactId>
	<version>0.5.0</version>
</dependency>
```

`ddth-id-cassandra`: include all `ddth-id-core` and Cassandra dependencies

```xml
<dependency>
    <groupId>com.github.ddth</groupId>
    <artifactId>ddth-id-cassandra</artifactId>
    <version>0.5.0</version>
    <type>pom</type>
</dependency>
```

`ddth-id-jdbc`: include all `ddth-id-core` and Jdbc dependencies

```xml
<dependency>
    <groupId>com.github.ddth</groupId>
    <artifactId>ddth-id-jdbc</artifactId>
    <version>0.5.0</version>
    <type>pom</type>
</dependency>
```

`ddth-id-redis`: include all `ddth-id-core` and Redis dependencies

```xml
<dependency>
    <groupId>com.github.ddth</groupId>
    <artifactId>ddth-id-redis</artifactId>
    <version>0.5.0</version>
    <type>pom</type>
</dependency>
```

`ddth-id-zookeeper`: include all `ddth-id-core` and ZooKeeper dependencies

```xml
<dependency>
    <groupId>com.github.ddth</groupId>
    <artifactId>ddth-id-zookeeper</artifactId>
    <version>0.5.0</version>
    <type>pom</type>
</dependency>
```


## Usage ##

`ddth-id` can generate 2 types of ID:

- Distributed:
  - Based on Twitter Snowflake algorithm, IDs are 48, 64 or 128-bit integers.
  - Generated IDs are unique across all nodes (each node must has a unique node-id).
  - Next generated ID is larger than previous ones.
  - Time-based: each generated ID is associated with a timestamp.
  - Non-serial: `next-id` may NOT be equal to `previous-id + 1`!
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
SerialIdGenerator idGenRedis = RedisIdGenerator.getInstance("localhost:6379");

//generate IDs, backed by Zookeeper.
SerialIdGenerator idGenZk = ZookeeperIdGenerator.getInstance("localhost:2181/ddth-id");

//generate IDs, backed by a database system.
JdbcIdGenerator idGenJdbc = new JdbcIdGenerator();
idGenJdbc.setDataSource(dataSource)
idGenJdbc.init();

//generate an ID within namespace "users"
long userId = idGenRedis.nextId("users");

//generate an ID within namespace "topics"
long topicId = idGenZk("topics");

//generate an ID within namespace "default"
long id = idGenJdbc("default");
```
