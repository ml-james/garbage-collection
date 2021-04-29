### A miscellany of garbage ...

###### concXecution 

`Implement a Worker class, which given a set of tasks (implementations of Runnable interface in Java) will execute them concurrently and return the summary of the execution with tasks categorized as successful, failed or timed out.`

###### jmaitch

| Benchmark                 | Mode | Cnt | Score  | Error   | Units |
|---------------------------|------|-----|--------|---------|-------|
| CollectionsTest.fillArray | avgt |   5 | 2.801  | ± 0.693 | ns/op |
| CollectionsTest.fillList  | avgt |   5 | 4.915  | ± 2.301 | ns/op |
| CollectionsTest.readArray | avgt |   5 | 3.156  | ± 0.257 | ns/op |
| CollectionsTest.readList  | avgt |   5 | 8.580  | ± 3.032 | ns/op |
