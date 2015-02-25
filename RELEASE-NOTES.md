ddth-id release notes
=====================

0.4.0 - 2015-02-26
------------------
- New API: `SerialIdGenerator.setValue(final String namespace, final long value)`.
- Bug fixes & Improvements.
- Benchmark results.


0.3.2 - 2015-02-24
------------------
- Bug fix: handle `DeadlockLoserDataAccessException`.
- Bug fix: handle `DuplicateKeyException`.


0.3.0 - 2015-02-22
------------------
- Add `JdbcIdGenerator`.


0.2.0 - 2015-02-20
------------------
- Now require Java 7.
- Bug fix: Zookeeper id generator.
- Support method `currentId()` for serial id generators.
- Add JUnit test cases.


0.1.0 - 2014-05-02
------------------
- First release: Snowflake, Redis & Zookeeper id generators.
