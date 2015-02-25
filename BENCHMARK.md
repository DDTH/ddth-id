## INFO ##

Benchamark date: 2015-02-25

Machine: MacBook Pro (Retina, 13-inch, Early 2013) - OS X Yosemite 10.10.2 (14C109)
2.6 GHz Intel Core i5
8 GB 1600 MHz DDR3

Benchmark flow:
- Generate ID.
- Check if generated ID is valid.

## Snowflake ##

Concurrency = 4
```
[Snowflake]:    Completed 10000000 ops in 11.649 secs (~858442.785 ops/sec), op time: 0.00/3045.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 10.609 secs (~942595.909 ops/sec), op time: 0.00/2944.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.608 secs (~1161710.037 ops/sec), op time: 0.00/2362.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 10.271 secs (~973615.033 ops/sec), op time: 0.00/3399.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.473 secs (~1180219.521 ops/sec), op time: 0.00/3321.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 9.639 secs (~1037452.018 ops/sec), op time: 0.00/3541.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 9.026 secs (~1107910.481 ops/sec), op time: 0.00/2693.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 9.065 secs (~1103143.960 ops/sec), op time: 0.00/3215.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 11.250 secs (~888888.889 ops/sec), op time: 0.00/3212.00/0.00/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.915 secs (~1263423.879 ops/sec), op time: 0.00/654.00/0.00/0.00/0.00 (ms)
```

Concurrency = 16
```
[Snowflake]:    Completed 10000000 ops in 8.988 secs (~1112594.571 ops/sec), op time: 0.00/2059.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.049 secs (~1418640.942 ops/sec), op time: 0.00/1913.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.711 secs (~1296848.658 ops/sec), op time: 0.00/2315.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 9.938 secs (~1006238.680 ops/sec), op time: 0.00/3414.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.788 secs (~1284026.708 ops/sec), op time: 0.00/3005.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.639 secs (~1309071.868 ops/sec), op time: 0.00/2684.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.279 secs (~1373815.084 ops/sec), op time: 0.00/2236.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.089 secs (~1410636.197 ops/sec), op time: 0.00/2380.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.774 secs (~1286339.079 ops/sec), op time: 0.00/2610.00/0.01/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.451 secs (~1183291.918 ops/sec), op time: 0.00/3471.00/0.01/0.00/0.00 (ms)
```

Concurrency = 64
```
[Snowflake]:    Completed 10000000 ops in 11.307 secs (~884407.889 ops/sec), op time: 0.00/3545.00/0.06/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 10.341 secs (~967024.466 ops/sec), op time: 0.00/3212.00/0.05/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.305 secs (~1368925.394 ops/sec), op time: 0.00/2589.00/0.04/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 6.552 secs (~1526251.526 ops/sec), op time: 0.00/2343.00/0.04/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 6.697 secs (~1493205.913 ops/sec), op time: 0.00/1414.00/0.04/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 9.210 secs (~1085776.330 ops/sec), op time: 0.00/3478.00/0.04/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 5.242 secs (~1907668.829 ops/sec), op time: 0.00/587.00/0.03/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 5.385 secs (~1857010.214 ops/sec), op time: 0.00/772.00/0.03/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 6.005 secs (~1665278.934 ops/sec), op time: 0.00/1363.00/0.03/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 6.613 secs (~1512172.993 ops/sec), op time: 0.00/1942.00/0.04/0.00/0.00 (ms)
```

Concurrency = 256
```
[Snowflake]:    Completed 10000000 ops in 10.967 secs (~911826.388 ops/sec), op time: 0.00/2482.00/0.23/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.841 secs (~1275347.532 ops/sec), op time: 0.00/2285.00/0.15/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.000 secs (~1250000.000 ops/sec), op time: 0.00/3049.00/0.16/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 6.757 secs (~1479946.722 ops/sec), op time: 0.00/2026.00/0.14/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 5.403 secs (~1850823.617 ops/sec), op time: 0.00/971.00/0.11/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 11.318 secs (~883548.330 ops/sec), op time: 0.00/3734.00/0.14/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 7.879 secs (~1269196.599 ops/sec), op time: 0.00/3209.00/0.13/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.443 secs (~1184413.123 ops/sec), op time: 0.00/3510.00/0.12/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 8.806 secs (~1135589.371 ops/sec), op time: 0.00/4191.00/0.14/0.00/0.00 (ms)
[Snowflake]:    Completed 10000000 ops in 5.305 secs (~1885014.138 ops/sec), op time: 0.00/809.00/0.10/0.00/0.00 (ms)
```


## Redis ##

Concurrency = 4
```
[Redis]:    Completed 100000 ops in 6.111 secs (~16363.934 ops/sec), op time: 0.00/132.00/0.24/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.800 secs (~20833.333 ops/sec), op time: 0.00/10.00/0.19/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.891 secs (~20445.717 ops/sec), op time: 0.00/8.00/0.20/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.769 secs (~20968.757 ops/sec), op time: 0.00/8.00/0.19/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 5.165 secs (~19361.084 ops/sec), op time: 0.00/7.00/0.21/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.672 secs (~21404.110 ops/sec), op time: 0.00/7.00/0.19/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.814 secs (~20772.746 ops/sec), op time: 0.00/14.00/0.19/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.798 secs (~20842.018 ops/sec), op time: 0.00/6.00/0.19/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.730 secs (~21141.649 ops/sec), op time: 0.00/7.00/0.19/0.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.638 secs (~21561.018 ops/sec), op time: 0.00/7.00/0.19/0.00/1.00 (ms)
```

Concurrency = 16
```
[Redis]:    Completed 100000 ops in 6.539 secs (~15292.858 ops/sec), op time: 0.00/123.00/1.01/1.00/3.00 (ms)
[Redis]:    Completed 100000 ops in 4.792 secs (~20868.114 ops/sec), op time: 0.00/106.00/0.71/1.00/2.00 (ms)
[Redis]:    Completed 100000 ops in 4.616 secs (~21663.778 ops/sec), op time: 0.00/101.00/0.71/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 5.019 secs (~19924.288 ops/sec), op time: 0.00/127.00/0.79/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.809 secs (~20794.344 ops/sec), op time: 0.00/149.00/0.74/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.746 secs (~21070.375 ops/sec), op time: 0.00/97.00/0.74/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 5.372 secs (~18615.041 ops/sec), op time: 0.00/96.00/0.84/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.710 secs (~21231.423 ops/sec), op time: 0.00/108.00/0.73/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.797 secs (~20846.362 ops/sec), op time: 0.00/122.00/0.74/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 4.262 secs (~23463.163 ops/sec), op time: 0.00/127.00/0.65/1.00/1.00 (ms)
```

Concurrency = 64
```
[Redis]:    Completed 100000 ops in 6.495 secs (~15396.459 ops/sec), op time: 0.00/368.00/3.93/1.00/19.55 (ms)
[Redis]:    Completed 100000 ops in 5.324 secs (~18782.870 ops/sec), op time: 0.00/458.00/3.04/1.00/12.00 (ms)
[Redis]:    Completed 100000 ops in 4.935 secs (~20263.425 ops/sec), op time: 0.00/562.00/2.85/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 5.100 secs (~19607.843 ops/sec), op time: 0.00/634.00/3.01/1.00/6.10 (ms)
[Redis]:    Completed 100000 ops in 5.126 secs (~19508.389 ops/sec), op time: 0.00/438.00/2.84/1.00/8.55 (ms)
[Redis]:    Completed 100000 ops in 4.973 secs (~20108.586 ops/sec), op time: 0.00/385.00/2.86/1.00/4.00 (ms)
[Redis]:    Completed 100000 ops in 5.196 secs (~19245.574 ops/sec), op time: 0.00/508.00/3.08/1.00/12.55 (ms)
[Redis]:    Completed 100000 ops in 4.864 secs (~20559.211 ops/sec), op time: 0.00/595.00/2.77/1.00/8.55 (ms)
[Redis]:    Completed 100000 ops in 4.457 secs (~22436.617 ops/sec), op time: 0.00/492.00/2.62/1.00/1.00 (ms)
[Redis]:    Completed 100000 ops in 5.061 secs (~19758.941 ops/sec), op time: 0.00/447.00/2.98/1.00/9.75 (ms)
```

Concurrency = 256
```
[Redis]:    Completed 100000 ops in 6.356 secs (~15733.166 ops/sec), op time: 0.00/842.00/14.98/19.00/75.55 (ms)
[Redis]:    Completed 100000 ops in 5.581 secs (~17917.936 ops/sec), op time: 0.00/1156.00/12.41/1.00/89.00 (ms)
[Redis]:    Completed 100000 ops in 4.975 secs (~20100.503 ops/sec), op time: 0.00/1498.00/11.01/1.00/39.20 (ms)
[Redis]:    Completed 100000 ops in 4.929 secs (~20288.091 ops/sec), op time: 0.00/1408.00/10.12/1.00/40.55 (ms)
[Redis]:    Completed 100000 ops in 5.244 secs (~19069.413 ops/sec), op time: 0.00/1429.00/11.43/1.00/51.55 (ms)
[Redis]:    Completed 100000 ops in 5.066 secs (~19739.439 ops/sec), op time: 0.00/1604.00/11.26/1.00/35.10 (ms)
[Redis]:    Completed 100000 ops in 4.866 secs (~20550.760 ops/sec), op time: 0.00/1477.00/10.61/1.00/23.20 (ms)
[Redis]:    Completed 100000 ops in 5.068 secs (~19731.650 ops/sec), op time: 0.00/1499.00/11.12/1.00/18.55 (ms)
[Redis]:    Completed 100000 ops in 5.050 secs (~19801.980 ops/sec), op time: 0.00/1506.00/11.02/1.00/24.00 (ms)
[Redis]:    Completed 100000 ops in 5.282 secs (~18932.223 ops/sec), op time: 0.00/1514.00/11.59/1.00/21.00 (ms)
```

## Mysql ##

Concurrency = 4
```
[MySQL]:    Completed 32000 ops in 20.446 secs (~1565.098 ops/sec), op time: 1.00/1060.00/2.55/3.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 16.869 secs (~1896.971 ops/sec), op time: 1.00/30.00/2.10/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.755 secs (~1909.878 ops/sec), op time: 1.00/18.00/2.09/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.452 secs (~1945.052 ops/sec), op time: 1.00/25.00/2.05/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.402 secs (~1950.982 ops/sec), op time: 1.00/24.00/2.05/2.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 16.822 secs (~1902.271 ops/sec), op time: 1.00/32.00/2.10/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.865 secs (~1897.421 ops/sec), op time: 1.00/57.00/2.10/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.123 secs (~1984.742 ops/sec), op time: 1.00/20.00/2.01/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.739 secs (~1911.703 ops/sec), op time: 1.00/23.00/2.09/2.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 17.355 secs (~1843.849 ops/sec), op time: 1.00/50.00/2.17/2.00/4.00 (ms)
```

Concurrency = 16
```
[MySQL]:    Completed 32000 ops in 20.522 secs (~1559.302 ops/sec), op time: 1.00/1269.00/9.76/4.00/29.55 (ms)
[MySQL]:    Completed 32000 ops in 17.181 secs (~1862.523 ops/sec), op time: 1.00/1264.00/7.63/2.00/13.00 (ms)
[MySQL]:    Completed 32000 ops in 17.098 secs (~1871.564 ops/sec), op time: 1.00/2263.00/8.01/2.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 15.735 secs (~2033.683 ops/sec), op time: 1.00/2069.00/7.44/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.571 secs (~1931.084 ops/sec), op time: 1.00/1217.00/7.81/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 17.445 secs (~1834.336 ops/sec), op time: 1.00/1573.00/8.04/2.00/4.00 (ms)
[MySQL]:    Completed 32000 ops in 16.313 secs (~1961.626 ops/sec), op time: 1.00/2076.00/7.73/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 15.972 secs (~2003.506 ops/sec), op time: 1.00/1737.00/7.41/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.422 secs (~1948.606 ops/sec), op time: 1.00/1281.00/7.93/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.563 secs (~1932.017 ops/sec), op time: 1.00/1478.00/7.74/2.00/3.00 (ms)
```

Concurrency = 64
```
[MySQL]:    Completed 32000 ops in 20.697 secs (~1546.118 ops/sec), op time: 1.00/4275.00/37.91/40.00/154.65 (ms)
[MySQL]:    Completed 32000 ops in 16.981 secs (~1884.459 ops/sec), op time: 1.00/4970.00/28.56/3.00/92.55 (ms)
[MySQL]:    Completed 32000 ops in 16.147 secs (~1981.792 ops/sec), op time: 1.00/7981.00/25.98/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.342 secs (~1958.145 ops/sec), op time: 1.00/8137.00/26.64/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.590 secs (~1928.873 ops/sec), op time: 1.00/7741.00/26.35/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.424 secs (~1948.368 ops/sec), op time: 1.00/6908.00/27.80/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 15.802 secs (~2025.060 ops/sec), op time: 1.00/8444.00/26.08/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.413 secs (~1949.674 ops/sec), op time: 1.00/6470.00/27.41/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.487 secs (~1940.923 ops/sec), op time: 1.00/7838.00/26.51/2.00/3.00 (ms)
[MySQL]:    Completed 32000 ops in 16.401 secs (~1951.101 ops/sec), op time: 1.00/9117.00/27.18/2.00/3.00 (ms)
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

## PostgreSQL ##

Concurrency = 4
```
[Pgsql]:    Completed 10000 ops in 6.023 secs (~1660.302 ops/sec), op time: 0.00/721.00/2.37/2.00/4.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.220 secs (~3105.590 ops/sec), op time: 0.00/57.00/1.27/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 2.867 secs (~3487.967 ops/sec), op time: 0.00/113.00/1.14/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 2.759 secs (~3624.502 ops/sec), op time: 0.00/5.00/1.10/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 2.893 secs (~3456.619 ops/sec), op time: 0.00/101.00/1.15/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 2.719 secs (~3677.823 ops/sec), op time: 0.00/4.00/1.09/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.133 secs (~3191.829 ops/sec), op time: 0.00/188.00/1.25/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 2.769 secs (~3611.412 ops/sec), op time: 0.00/7.00/1.11/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 2.818 secs (~3548.616 ops/sec), op time: 0.00/20.00/1.12/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.220 secs (~3105.590 ops/sec), op time: 0.00/202.00/1.29/1.00/2.00 (ms)
```

Concurrency = 16
```
[Pgsql]:    Completed 10000 ops in 6.479 secs (~1543.448 ops/sec), op time: 1.00/452.00/10.18/11.00/33.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.703 secs (~2700.513 ops/sec), op time: 0.00/1030.00/5.22/2.00/13.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.267 secs (~3060.912 ops/sec), op time: 0.00/854.00/4.38/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.140 secs (~3184.713 ops/sec), op time: 0.00/776.00/4.31/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.162 secs (~3162.555 ops/sec), op time: 0.00/1152.00/3.83/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.189 secs (~3135.779 ops/sec), op time: 0.00/813.00/4.09/1.00/2.55 (ms)
[Pgsql]:    Completed 10000 ops in 3.363 secs (~2973.536 ops/sec), op time: 0.00/929.00/4.59/1.00/3.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.109 secs (~3216.468 ops/sec), op time: 0.00/970.00/3.84/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.064 secs (~3263.708 ops/sec), op time: 0.00/718.00/4.07/1.00/2.00 (ms)
[Pgsql]:    Completed 10000 ops in 3.239 secs (~3087.373 ops/sec), op time: 0.00/1335.00/4.26/1.00/3.00 (ms)
```

Concurrency = 64
```
[Pgsql]:    Completed 160000 ops in 65.356 secs (~2448.130 ops/sec), op time: 0.00/7535.00/20.66/2.00/41.55 (ms)
[Pgsql]:    Completed 160000 ops in 50.506 secs (~3167.940 ops/sec), op time: 0.00/20839.00/16.61/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 46.450 secs (~3444.564 ops/sec), op time: 0.00/12851.00/16.02/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 48.205 secs (~3319.158 ops/sec), op time: 0.00/13894.00/16.39/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 46.681 secs (~3427.519 ops/sec), op time: 0.00/18105.00/15.99/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 47.351 secs (~3379.021 ops/sec), op time: 0.00/15310.00/16.40/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 45.615 secs (~3507.618 ops/sec), op time: 0.00/14591.00/15.58/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 48.205 secs (~3319.158 ops/sec), op time: 0.00/13341.00/16.41/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 46.630 secs (~3431.267 ops/sec), op time: 0.00/18139.00/15.96/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 46.125 secs (~3468.835 ops/sec), op time: 0.00/17501.00/15.33/1.00/2.00 (ms)
```

Concurrency = 256
```
[Pgsql]:    Completed 160000 ops in 52.831 secs (~3028.525 ops/sec), op time: 0.00/18473.00/70.65/2.00/169.55 (ms)
[Pgsql]:    Completed 160000 ops in 47.137 secs (~3394.361 ops/sec), op time: 0.00/28038.00/56.32/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 51.577 secs (~3102.158 ops/sec), op time: 0.00/40994.00/58.38/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 57.678 secs (~2774.021 ops/sec), op time: 0.00/41118.00/72.74/2.00/3.00 (ms)
[Pgsql]:    Completed 160000 ops in 55.901 secs (~2862.203 ops/sec), op time: 0.00/38209.00/70.14/2.00/3.00 (ms)
[Pgsql]:    Completed 160000 ops in 47.687 secs (~3355.212 ops/sec), op time: 0.00/36149.00/58.88/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 47.207 secs (~3389.328 ops/sec), op time: 0.00/35023.00/57.37/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 47.888 secs (~3341.129 ops/sec), op time: 0.00/37503.00/57.49/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 48.179 secs (~3320.949 ops/sec), op time: 0.00/35525.00/56.21/1.00/2.00 (ms)
[Pgsql]:    Completed 160000 ops in 47.285 secs (~3383.737 ops/sec), op time: 0.00/32887.00/57.07/1.00/2.00 (ms)
```


## Zookeeper ##

Concurrency = 1
```
[Zookeeper]:    Completed 32000 ops in 15.736 secs (~2033.554 ops/sec), op time: 0.00/90.00/0.49/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 13.655 secs (~2343.464 ops/sec), op time: 0.00/136.00/0.43/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 12.981 secs (~2465.141 ops/sec), op time: 0.00/20.00/0.40/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 12.881 secs (~2484.279 ops/sec), op time: 0.00/135.00/0.40/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 14.333 secs (~2232.610 ops/sec), op time: 0.00/20.00/0.45/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 13.581 secs (~2356.233 ops/sec), op time: 0.00/133.00/0.42/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 14.114 secs (~2267.252 ops/sec), op time: 0.00/21.00/0.44/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 14.240 secs (~2247.191 ops/sec), op time: 0.00/132.00/0.44/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 12.882 secs (~2484.086 ops/sec), op time: 0.00/9.00/0.40/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 12.797 secs (~2500.586 ops/sec), op time: 0.00/137.00/0.40/1.00/1.00 (ms)
```

Concurrency = 4
```
[Zookeeper]:    Completed 32000 ops in 9.047 secs (~3537.084 ops/sec), op time: 0.00/403.00/1.07/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 7.404 secs (~4321.988 ops/sec), op time: 0.00/379.00/0.86/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 7.171 secs (~4462.418 ops/sec), op time: 0.00/448.00/0.81/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 7.298 secs (~4384.763 ops/sec), op time: 0.00/307.00/0.87/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 6.847 secs (~4673.580 ops/sec), op time: 0.00/305.00/0.79/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 6.916 secs (~4626.952 ops/sec), op time: 0.00/304.00/0.81/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 6.671 secs (~4796.882 ops/sec), op time: 0.00/312.00/0.76/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 7.101 secs (~4506.408 ops/sec), op time: 0.00/312.00/0.82/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 6.506 secs (~4918.537 ops/sec), op time: 0.00/318.00/0.79/1.00/1.00 (ms)
[Zookeeper]:    Completed 32000 ops in 7.313 secs (~4375.769 ops/sec), op time: 0.00/311.00/0.81/1.00/1.00 (ms)
```

Concurrency = 16
```
[Zookeeper]:    Completed 32000 ops in 10.476 secs (~3054.601 ops/sec), op time: 0.00/445.00/5.04/4.75/9.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.400 secs (~3404.255 ops/sec), op time: 0.00/318.00/4.50/4.00/6.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.537 secs (~3355.353 ops/sec), op time: 0.00/319.00/4.56/4.00/6.00 (ms)
[Zookeeper]:    Completed 32000 ops in 8.444 secs (~3789.673 ops/sec), op time: 0.00/312.00/4.07/4.00/5.00 (ms)
[Zookeeper]:    Completed 32000 ops in 13.382 secs (~2391.272 ops/sec), op time: 0.00/329.00/6.47/6.00/15.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.152 secs (~3496.503 ops/sec), op time: 0.00/317.00/4.42/4.00/6.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.048 secs (~3536.693 ops/sec), op time: 0.00/374.00/4.34/4.00/6.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.535 secs (~3356.057 ops/sec), op time: 0.00/320.00/4.55/4.00/6.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.762 secs (~3278.017 ops/sec), op time: 0.00/330.00/4.68/4.00/7.00 (ms)
[Zookeeper]:    Completed 32000 ops in 8.940 secs (~3579.418 ops/sec), op time: 0.00/319.00/4.29/4.00/6.00 (ms)
```

Concurrency = 64
```
[Zookeeper]:    Completed 32000 ops in 13.280 secs (~2409.639 ops/sec), op time: 0.00/479.00/26.06/30.00/56.00 (ms)
[Zookeeper]:    Completed 32000 ops in 12.844 secs (~2491.436 ops/sec), op time: 0.00/342.00/25.16/26.00/30.00 (ms)
[Zookeeper]:    Completed 32000 ops in 12.435 secs (~2573.382 ops/sec), op time: 0.00/340.00/24.34/26.00/33.00 (ms)
[Zookeeper]:    Completed 32000 ops in 12.179 secs (~2627.474 ops/sec), op time: 0.00/361.00/23.80/28.00/40.00 (ms)
[Zookeeper]:    Completed 32000 ops in 11.916 secs (~2685.465 ops/sec), op time: 0.00/354.00/23.37/26.00/34.00 (ms)
[Zookeeper]:    Completed 32000 ops in 11.932 secs (~2681.864 ops/sec), op time: 0.00/378.00/23.34/26.00/36.00 (ms)
[Zookeeper]:    Completed 32000 ops in 11.146 secs (~2870.985 ops/sec), op time: 0.00/346.00/21.76/25.00/30.00 (ms)
[Zookeeper]:    Completed 32000 ops in 11.074 secs (~2889.651 ops/sec), op time: 0.00/398.00/21.60/25.00/29.00 (ms)
[Zookeeper]:    Completed 32000 ops in 12.074 secs (~2650.323 ops/sec), op time: 0.00/337.00/23.64/26.00/30.00 (ms)
[Zookeeper]:    Completed 32000 ops in 11.198 secs (~2857.653 ops/sec), op time: 0.00/353.00/21.98/26.00/31.00 (ms)
```

Concurrency = 256
```
[Zookeeper]:    Completed 32000 ops in 12.767 secs (~2506.462 ops/sec), op time: 0.00/537.00/100.11/108.00/210.00 (ms)
[Zookeeper]:    Completed 32000 ops in 10.307 secs (~3104.686 ops/sec), op time: 0.00/420.00/81.00/91.00/119.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.234 secs (~3465.454 ops/sec), op time: 1.00/383.00/71.85/77.75/100.55 (ms)
[Zookeeper]:    Completed 32000 ops in 11.272 secs (~2838.893 ops/sec), op time: 0.00/460.00/88.43/99.75/134.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.356 secs (~3420.265 ops/sec), op time: 0.00/519.00/73.12/78.00/98.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.390 secs (~3407.881 ops/sec), op time: 0.00/397.00/73.68/79.00/100.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.360 secs (~3418.803 ops/sec), op time: 0.00/403.00/73.40/78.00/98.55 (ms)
[Zookeeper]:    Completed 32000 ops in 9.053 secs (~3534.740 ops/sec), op time: 0.00/517.00/71.07/75.00/99.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.396 secs (~3405.705 ops/sec), op time: 0.00/398.00/73.94/83.00/102.00 (ms)
[Zookeeper]:    Completed 32000 ops in 9.681 secs (~3305.444 ops/sec), op time: 0.00/565.00/75.71/83.00/103.00 (ms)
```

