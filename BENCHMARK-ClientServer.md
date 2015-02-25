## INFO ##

Benchamark date: 2015-02-25

Benchmark mode: client-server
Client machine: Linux 2.6.32-358.6.2.el6.x86_64
16Gb RAM - 16 Cores Intel(R) Xeon(R) CPU E5520  @ 2.27GHz

Benchmark flow:
- Generate ID.
- Check if generated ID is valid.

## Snowflake ##

Concurrency = 4
```
[Snowflake]:    Completed 10000000 ops in 11.179 secs (~894534.395 ops/sec), op time: 0.00/2121.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.769 secs (~1287166.946 ops/sec), op time: 0.00/747.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.688 secs (~1300728.408 ops/sec), op time: 0.00/777.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.588 secs (~1317870.322 ops/sec), op time: 0.00/791.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.052 secs (~1241927.471 ops/sec), op time: 0.00/1153.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.381 secs (~1354829.969 ops/sec), op time: 0.00/707.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.476 secs (~1337613.697 ops/sec), op time: 0.00/868.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.981 secs (~1252975.818 ops/sec), op time: 0.00/1189.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 9.190 secs (~1088139.282 ops/sec), op time: 0.00/1938.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.059 secs (~1416631.251 ops/sec), op time: 0.00/493.00/0.00/0.00/0.00 (ms)
```

Concurrency = 16
```
[Snowflake]: Completed 10000000 ops in 10.826 secs (~923702.198 ops/sec), op time: 0.00/2248.00/0.02/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 10.054 secs (~994629.003 ops/sec), op time: 0.00/2100.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.649 secs (~1156203.029 ops/sec), op time: 0.00/1352.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.863 secs (~1271779.219 ops/sec), op time: 0.00/846.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.104 secs (~1233958.539 ops/sec), op time: 0.00/633.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.883 secs (~1268552.582 ops/sec), op time: 0.00/793.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.283 secs (~1207292.044 ops/sec), op time: 0.00/941.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.550 secs (~1169590.643 ops/sec), op time: 0.00/1264.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.477 secs (~1337434.800 ops/sec), op time: 0.00/529.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.186 secs (~1221597.850 ops/sec), op time: 0.00/567.00/0.01/0.00/0.00 (ms)
```

Concurrency = 64
```
[Snowflake]:    Completed 10000000 ops in 12.426 secs (~804764.204 ops/sec), op time: 0.00/3006.00/0.08/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.906 secs (~1122838.536 ops/sec), op time: 0.00/1862.00/0.06/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.205 secs (~1218769.043 ops/sec), op time: 0.00/996.00/0.05/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.339 secs (~1362583.458 ops/sec), op time: 0.00/841.00/0.05/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.021 secs (~1246727.341 ops/sec), op time: 0.00/903.00/0.05/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.356 secs (~1196744.854 ops/sec), op time: 0.00/1272.00/0.05/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.330 secs (~1200480.192 ops/sec), op time: 0.00/1396.00/0.05/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.997 secs (~1111481.605 ops/sec), op time: 0.00/2055.00/0.05/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.312 secs (~1367614.880 ops/sec), op time: 0.00/522.00/0.04/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.629 secs (~1310787.783 ops/sec), op time: 0.00/1192.00/0.05/0.00/0.00 (ms)
```

Concurrency = 256
```
[Snowflake]:    Completed 10000000 ops in 11.790 secs (~848176.421 ops/sec), op time: 0.00/2693.00/0.29/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 9.031 secs (~1107297.088 ops/sec), op time: 0.00/1841.00/0.21/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.771 secs (~1286835.671 ops/sec), op time: 0.00/1030.00/0.19/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.331 secs (~1364070.386 ops/sec), op time: 0.00/805.00/0.18/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.060 secs (~1240694.789 ops/sec), op time: 0.00/922.00/0.20/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.366 secs (~1195314.368 ops/sec), op time: 0.00/1363.00/0.20/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.759 secs (~1141682.841 ops/sec), op time: 0.00/1578.00/0.21/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.096 secs (~1409244.645 ops/sec), op time: 0.00/484.00/0.17/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.870 secs (~1270648.030 ops/sec), op time: 0.00/608.00/0.19/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.778 secs (~1285677.552 ops/sec), op time: 0.00/919.00/0.19/0.00/0.00 (ms)
```


## Redis ##

01 Redis server, same DC with client machine.

Concurrency = 4
```
[Redis]:    Completed 320000 ops in 20.752 secs (~15420.200 ops/sec), op time: 0.00/167.00/0.26/0.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 19.642 secs (~16291.620 ops/sec), op time: 0.00/15.00/0.24/0.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 20.848 secs (~15349.194 ops/sec), op time: 0.00/17.00/0.26/1.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 20.531 secs (~15586.187 ops/sec), op time: 0.00/10.00/0.26/0.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 19.478 secs (~16428.791 ops/sec), op time: 0.00/159.00/0.24/0.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 20.091 secs (~15927.530 ops/sec), op time: 0.00/52.00/0.25/1.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 19.748 secs (~16204.173 ops/sec), op time: 0.00/21.00/0.25/1.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 19.487 secs (~16421.204 ops/sec), op time: 0.00/22.00/0.24/0.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 18.548 secs (~17252.534 ops/sec), op time: 0.00/101.00/0.23/0.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 22.224 secs (~14398.848 ops/sec), op time: 0.00/22.00/0.28/1.00/1.00 (ms)
```

Concurrency = 16
```
[Redis]:    Completed 320000 ops in 10.401 secs (~30766.272 ops/sec), op time: 0.00/80.00/0.52/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 10.704 secs (~29895.366 ops/sec), op time: 0.00/12.00/0.53/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 8.996 secs (~35571.365 ops/sec), op time: 0.00/205.00/0.45/1.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 9.347 secs (~34235.584 ops/sec), op time: 0.00/205.00/0.46/1.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 10.118 secs (~31626.804 ops/sec), op time: 0.00/176.00/0.50/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 10.302 secs (~31061.930 ops/sec), op time: 0.00/15.00/0.51/1.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 9.968 secs (~32102.729 ops/sec), op time: 0.00/6.00/0.50/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 10.628 secs (~30109.146 ops/sec), op time: 0.00/19.00/0.53/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 9.306 secs (~34386.417 ops/sec), op time: 0.00/10.00/0.46/1.00/1.00 (ms)
[Redis]:    Completed 320000 ops in 9.298 secs (~34416.003 ops/sec), op time: 0.00/17.00/0.46/1.00/1.00 (ms)
```

Concurrency = 64
```
[Redis]:    Completed 320000 ops in 6.390 secs (~50078.247 ops/sec), op time: 0.00/235.00/1.25/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 6.080 secs (~52631.579 ops/sec), op time: 0.00/169.00/1.21/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 5.414 secs (~59106.021 ops/sec), op time: 0.00/212.00/1.08/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 5.272 secs (~60698.027 ops/sec), op time: 0.00/4.00/1.05/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 6.213 secs (~51504.909 ops/sec), op time: 0.00/203.00/1.24/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 6.108 secs (~52390.308 ops/sec), op time: 0.00/252.00/1.21/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 5.695 secs (~56189.640 ops/sec), op time: 0.00/7.00/1.13/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 5.718 secs (~55963.624 ops/sec), op time: 0.00/5.00/1.14/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 5.671 secs (~56427.438 ops/sec), op time: 0.00/30.00/1.13/1.00/2.00 (ms)
[Redis]:    Completed 320000 ops in 5.762 secs (~55536.272 ops/sec), op time: 0.00/43.00/1.15/1.00/2.00 (ms)
```

Concurrency = 256
```
[Redis]:    Completed 320000 ops in 6.254 secs (~51167.253 ops/sec), op time: 0.00/172.00/4.87/5.00/8.00 (ms)
[Redis]:    Completed 320000 ops in 6.023 secs (~53129.670 ops/sec), op time: 0.00/230.00/4.72/5.00/5.00 (ms)
[Redis]:    Completed 320000 ops in 5.640 secs (~56737.589 ops/sec), op time: 0.00/16.00/4.43/5.00/5.00 (ms)
[Redis]:    Completed 320000 ops in 5.905 secs (~54191.363 ops/sec), op time: 0.00/132.00/4.62/5.00/5.00 (ms)
[Redis]:    Completed 320000 ops in 5.552 secs (~57636.888 ops/sec), op time: 0.00/199.00/4.38/4.00/5.00 (ms)
[Redis]:    Completed 320000 ops in 5.665 secs (~56487.202 ops/sec), op time: 0.00/206.00/4.42/5.00/6.00 (ms)
[Redis]:    Completed 320000 ops in 6.584 secs (~48602.673 ops/sec), op time: 0.00/1006.00/5.07/5.00/9.00 (ms)
[Redis]:    Completed 320000 ops in 5.828 secs (~54907.344 ops/sec), op time: 0.00/270.00/4.58/5.00/6.00 (ms)
[Redis]:    Completed 320000 ops in 6.006 secs (~53280.053 ops/sec), op time: 0.00/394.00/4.70/5.00/6.00 (ms)
[Redis]:    Completed 320000 ops in 5.524 secs (~57929.037 ops/sec), op time: 0.00/228.00/4.31/5.00/5.00 (ms)
```

## Mysql ##

2 MySQL servers (master-slave), same DC with client machine.

Concurrency = 4
```
MySQL]: Completed 32000 ops in 29.864 secs (~1071.524 ops/sec), op time: 2.00/53.00/3.73/4.00/5.00 (ms)
[MySQL]:    Completed 32000 ops in 29.146 secs (~1097.921 ops/sec), op time: 2.00/217.00/3.63/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.065 secs (~1100.981 ops/sec), op time: 2.00/49.00/3.63/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.586 secs (~1081.593 ops/sec), op time: 2.00/16.00/3.70/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.932 secs (~1106.042 ops/sec), op time: 2.00/23.00/3.61/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.906 secs (~1107.037 ops/sec), op time: 2.00/56.00/3.61/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.588 secs (~1119.351 ops/sec), op time: 2.00/38.00/3.57/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.053 secs (~1101.435 ops/sec), op time: 2.00/20.00/3.63/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.533 secs (~1083.534 ops/sec), op time: 2.00/21.00/3.69/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.999 secs (~1103.486 ops/sec), op time: 2.00/20.00/3.62/4.00/4.00 (ms)
```

Concurrency = 16
```
[MySQL]:    Completed 32000 ops in 30.485 secs (~1049.697 ops/sec), op time: 2.00/5322.00/13.54/14.00/20.00 (ms)
[MySQL]:    Completed 32000 ops in 28.785 secs (~1111.690 ops/sec), op time: 2.00/5235.00/12.38/4.00/16.00 (ms)
[MySQL]:    Completed 32000 ops in 29.524 secs (~1083.864 ops/sec), op time: 2.00/6937.00/12.31/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.955 secs (~1105.163 ops/sec), op time: 3.00/6514.00/12.26/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.490 secs (~1123.201 ops/sec), op time: 3.00/7640.00/11.64/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.324 secs (~1091.256 ops/sec), op time: 2.00/10230.00/11.48/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.484 secs (~1085.334 ops/sec), op time: 2.00/7940.00/12.73/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.063 secs (~1101.056 ops/sec), op time: 3.00/9381.00/12.43/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.296 secs (~1092.299 ops/sec), op time: 3.00/7380.00/12.34/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.498 secs (~1084.819 ops/sec), op time: 2.00/7348.00/12.66/4.00/4.00 (ms)
```

Concurrency = 64
```
[MySQL]:    Completed 32000 ops in 30.547 secs (~1047.566 ops/sec), op time: 3.00/12115.00/52.91/59.00/116.65 (ms)
[MySQL]:    Completed 32000 ops in 28.954 secs (~1105.201 ops/sec), op time: 2.00/11757.00/46.94/4.00/71.30 (ms)
[MySQL]:    Completed 32000 ops in 28.924 secs (~1106.348 ops/sec), op time: 3.00/20626.00/43.33/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.436 secs (~1125.334 ops/sec), op time: 2.00/19588.00/44.66/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.917 secs (~1106.615 ops/sec), op time: 2.00/21595.00/44.26/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.270 secs (~1093.270 ops/sec), op time: 2.00/17414.00/44.57/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.990 secs (~1103.829 ops/sec), op time: 3.00/25049.00/44.40/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 28.713 secs (~1114.478 ops/sec), op time: 2.00/19837.00/43.17/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.061 secs (~1101.132 ops/sec), op time: 2.00/18737.00/43.47/4.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 29.191 secs (~1096.228 ops/sec), op time: 2.00/23794.00/43.70/4.00/4.00 (ms)
```

Concurrency = 256
```
[MySQL]:    Completed 32000 ops in 21.819 secs (~1466.612 ops/sec), op time: 1.00/8190.00/151.45/221.00/502.50 (ms)
[MySQL]:    Completed 32000 ops in 16.344 secs (~1957.905 ops/sec), op time: 1.00/9533.00/97.10/2.00/407.00 (ms)
[MySQL]:    Completed 32000 ops in 16.212 secs (~1973.847 ops/sec), op time: 1.00/12897.00/85.01/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.854 secs (~1898.659 ops/sec), op time: 1.00/14090.00/88.34/2.00/5.00 (ms)
[MySQL]:    Completed 32000 ops in 17.375 secs (~1841.727 ops/sec), op time: 1.00/13974.00/91.32/2.00/5.00 (ms)
[MySQL]:    Completed 32000 ops in 16.179 secs (~1977.873 ops/sec), op time: 1.00/14407.00/85.22/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 17.439 secs (~1834.968 ops/sec), op time: 1.00/15376.00/91.40/2.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 16.829 secs (~1901.480 ops/sec), op time: 1.00/15538.00/88.61/2.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 16.915 secs (~1891.812 ops/sec), op time: 1.00/15280.00/90.82/2.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 16.410 secs (~1950.030 ops/sec), op time: 1.00/14259.00/85.03/2.00/4.00 (ms)
```


## Zookeeper ##

Zookeeper: 5 servers, same DC with client machine.

Concurrency = 4
```
[Zookeeper]:    Completed 3200 ops in 22.822 secs (~140.216 ops/sec), op time: 5.00/532.00/26.80/24.00/48.55 (ms)
[Zookeeper]:    Completed 3200 ops in 27.965 secs (~114.429 ops/sec), op time: 6.00/451.00/34.04/29.00/146.55 (ms)
[Zookeeper]:    Completed 3200 ops in 24.222 secs (~132.111 ops/sec), op time: 5.00/427.00/29.13/24.00/132.55 (ms)
[Zookeeper]:    Completed 3200 ops in 25.264 secs (~126.662 ops/sec), op time: 6.00/467.00/30.61/24.00/138.55 (ms)
[Zookeeper]:    Completed 3200 ops in 25.976 secs (~123.191 ops/sec), op time: 6.00/418.00/31.13/24.00/140.00 (ms)
[Zookeeper]:    Completed 3200 ops in 25.635 secs (~124.829 ops/sec), op time: 5.00/501.00/30.00/24.00/135.55 (ms)
[Zookeeper]:    Completed 3200 ops in 24.092 secs (~132.824 ops/sec), op time: 5.00/468.00/29.36/24.00/135.55 (ms)
[Zookeeper]:    Completed 3200 ops in 23.996 secs (~133.356 ops/sec), op time: 6.00/447.00/29.40/25.00/136.55 (ms)
[Zookeeper]:    Completed 3200 ops in 23.861 secs (~134.110 ops/sec), op time: 6.00/601.00/28.37/23.00/134.10 (ms)
[Zookeeper]:    Completed 3200 ops in 22.785 secs (~140.443 ops/sec), op time: 6.00/475.00/27.29/24.00/136.00 (ms)
```

Concurrency = 8
```
[Zookeeper]:    Completed 3200 ops in 21.480 secs (~148.976 ops/sec), op time: 7.00/443.00/52.45/50.00/147.00 (ms)
[Zookeeper]:    Completed 3200 ops in 27.273 secs (~117.332 ops/sec), op time: 7.00/541.00/66.14/67.00/171.00 (ms)
[Zookeeper]:    Completed 3200 ops in 26.838 secs (~119.234 ops/sec), op time: 7.00/510.00/65.80/67.75/173.55 (ms)
[Zookeeper]:    Completed 3200 ops in 26.786 secs (~119.465 ops/sec), op time: 7.00/508.00/65.30/67.00/168.00 (ms)
[Zookeeper]:    Completed 3200 ops in 25.933 secs (~123.395 ops/sec), op time: 6.00/521.00/63.50/66.00/163.10 (ms)
[Zookeeper]:    Completed 3200 ops in 28.295 secs (~113.094 ops/sec), op time: 9.00/568.00/69.70/69.00/181.10 (ms)
[Zookeeper]:    Completed 3200 ops in 26.803 secs (~119.390 ops/sec), op time: 6.00/492.00/66.01/69.00/170.55 (ms)
[Zookeeper]:    Completed 3200 ops in 28.964 secs (~110.482 ops/sec), op time: 7.00/485.00/70.49/71.00/177.55 (ms)
[Zookeeper]:    Completed 3200 ops in 27.115 secs (~118.016 ops/sec), op time: 7.00/510.00/66.40/68.00/174.55 (ms)
[Zookeeper]:    Completed 3200 ops in 25.219 secs (~126.888 ops/sec), op time: 10.00/501.00/61.55/62.00/173.00 (ms)
```

Concurrency = 16
```
[Zookeeper]:    Completed 3200 ops in 22.023 secs (~145.303 ops/sec), op time: 6.00/587.00/108.38/113.00/209.00 (ms)
[Zookeeper]:    Completed 3200 ops in 24.595 secs (~130.108 ops/sec), op time: 9.00/501.00/121.16/129.00/203.55 (ms)
[Zookeeper]:    Completed 3200 ops in 28.693 secs (~111.525 ops/sec), op time: 6.00/620.00/141.64/150.00/250.75 (ms)
[Zookeeper]:    Completed 3200 ops in 25.231 secs (~126.828 ops/sec), op time: 8.00/550.00/123.66/134.00/234.55 (ms)
[Zookeeper]:    Completed 3200 ops in 27.770 secs (~115.232 ops/sec), op time: 9.00/604.00/136.35/147.00/247.10 (ms)
[Zookeeper]:    Completed 3200 ops in 25.119 secs (~127.394 ops/sec), op time: 8.00/575.00/123.08/136.75/225.55 (ms)
[Zookeeper]:    Completed 3200 ops in 26.809 secs (~119.363 ops/sec), op time: 8.00/579.00/132.47/142.00/234.55 (ms)
[Zookeeper]:    Completed 3200 ops in 26.185 secs (~122.207 ops/sec), op time: 6.00/630.00/128.40/141.00/240.00 (ms)
[Zookeeper]:    Completed 3200 ops in 26.691 secs (~119.891 ops/sec), op time: 12.00/533.00/131.91/141.75/248.10 (ms)
[Zookeeper]:    Completed 3200 ops in 26.156 secs (~122.343 ops/sec), op time: 6.00/589.00/128.89/140.00/236.00 (ms)
```

Concurrency = 32
```
[Zookeeper]:    Completed 3200 ops in 22.092 secs (~144.849 ops/sec), op time: 21.00/594.00/216.79/230.75/321.30 (ms)
[Zookeeper]:    Completed 3200 ops in 23.339 secs (~137.110 ops/sec), op time: 8.00/619.00/229.44/246.00/325.65 (ms)
[Zookeeper]:    Completed 3200 ops in 27.244 secs (~117.457 ops/sec), op time: 7.00/720.00/267.79/298.75/399.55 (ms)
[Zookeeper]:    Completed 3200 ops in 28.099 secs (~113.883 ops/sec), op time: 13.00/764.00/275.68/300.00/391.65 (ms)
[Zookeeper]:    Completed 3200 ops in 29.067 secs (~110.090 ops/sec), op time: 12.00/773.00/285.73/317.00/422.10 (ms)
[Zookeeper]:    Completed 3200 ops in 25.171 secs (~127.130 ops/sec), op time: 9.00/798.00/246.81/278.75/377.55 (ms)
[Zookeeper]:    Completed 3200 ops in 25.919 secs (~123.462 ops/sec), op time: 11.00/750.00/254.41/281.75/376.20 (ms)
[Zookeeper]:    Completed 3200 ops in 24.632 secs (~129.912 ops/sec), op time: 29.00/703.00/242.11/253.00/360.00 (ms)
[Zookeeper]:    Completed 3200 ops in 26.380 secs (~121.304 ops/sec), op time: 8.00/744.00/258.64/283.00/370.55 (ms)
[Zookeeper]:    Completed 3200 ops in 29.244 secs (~109.424 ops/sec), op time: 13.00/755.00/288.19/320.00/425.10 (ms)
```

