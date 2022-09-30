
class Cache {}

class DiskCache extends Cache {}

class MemoryCache extends Cache {}

class OptimizedDiskCache extends DiskCache {}

public class mainTest {

    public static void main(String[] args) {

//        no
//OptimizedDiskCache optimizedDiskCache=new OptimizedDiskCache();
//Cache cache=(Cache) optimizedDiskCache;

//        yes
//MemoryCache memoryCache=new MemoryCache();
//Cache cache=(Cache) memoryCache;
//DiskCache diskCache=(DiskCache) cache;


//        yes
//DiskCache diskCache=new DiskCache();
//OptimizedDiskCache optimizedDiskCache=(OptimizedDiskCache)  diskCache;



//no
//        OptimizedDiskCache optimizedDiskCache=new OptimizedDiskCache();
//        DiskCache diskCache=(DiskCache) optimizedDiskCache;
//

//        yes
//Cache cache=new Cache();
//MemoryCache memoryCache=(MemoryCache) cache;


        //no
        OptimizedDiskCache optimizedDiskCache=new OptimizedDiskCache();
        Cache cache=(Cache) optimizedDiskCache;
        DiskCache diskCache=(DiskCache) cache;




    }
}