The solution for the unsafe *count increment* is to *synchronize* access to count. <br>
最简单的解决方案就是 使用 JAVA 内置的 `synchronize` 语句．

```JAVA
class Counter {
    private int count = 0;
    public synchronized void increment() {++count;}
    public int getCount() {return count;}
}
```


