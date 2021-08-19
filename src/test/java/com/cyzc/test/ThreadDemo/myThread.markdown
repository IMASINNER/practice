#MyThread
   **什么是线程**
   
   *线程和进程的区别
   *
##线程的状态
>new runnable block waiting timing-waiting termitered
>>他们之间的线程状态转换 


##线程池
###线程池的作用：有效利用系统资源;加快响应时间。
**线程池的种类**
1. newFixThreadPool
   1. public static ExecutorService newFixedThreadPool(int nThreads) {
           return new ThreadPoolExecutor(nThreads, nThreads,
                                         0L, TimeUnit.MILLISECONDS,
                                         new LinkedBlockingQueue<Runnable>());
       }
   2. 最大线程数=核心线程数, 线程一直存活,即定长线程池，适合执行长期的任务，因为线程一直存活。
2. newSingleThreadPool
   1. public static ExecutorService newSingleThreadExecutor() {
              return new FinalizableDelegatedExecutorService
                  (new ThreadPoolExecutor(1, 1,
                                          0L, TimeUnit.MILLISECONDS,
                                          new LinkedBlockingQueue<Runnable>()));
          }
    2. 核心线程数=最大线程数=1,线程一直存活，多个任务提交放在阻塞队列中。线程池内只有一个线程工作。
    适合同步情景。 因为只有一个线程在执行任务，其他任务放在阻塞队列中      
3. newCachedThreadPool
   1. public static ExecutorService newCachedThreadPool() {
              return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                                            60L, TimeUnit.SECONDS,
                                            new SynchronousQueue<Runnable>());
          }
   2. 初始线程数为0，最大线程数为int的最大值,存活时间是60s，同步队列
   适用场景：新任务到来时，放在同步队列中，若线程池内有线程则执行任务，没有线程则创建线程
   
4. newScheduleThreadPool
   1. public ScheduledThreadPoolExecutor(int corePoolSize) {
              super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS,
                    new DelayedWorkQueue());
          }
       1. 给定核心线程数,最大线程数为int的最大值,线程一直存活,适用延迟队列
       2. 适用于      
