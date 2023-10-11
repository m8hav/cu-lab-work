package dsa.hashing.collision.openHashing;

import java.util.ArrayList;

// V - value generic
public class SeparateChainingHashTable<V> {
    private class HashNode {
        private final Integer key;
        private V value;

        private HashNode next;

        public HashNode(Integer key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    private ArrayList<HashNode> buckets;

    private int size;
    private int bucketIndex;
    private int totalBucketSize;

    // [.][][][][.][.][][][.][]
    private int emptyBuckets;
    private int occupiedBuckets;

    public SeparateChainingHashTable(int capacity) {
        this.size = 0;
        this.totalBucketSize = capacity;
        this.emptyBuckets = capacity;
        this.buckets = new ArrayList<HashNode>(capacity);
        for (int i = 0; i < capacity; i++) buckets.add(null);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode(Integer key) {
        return key % totalBucketSize;
    }

    private int getBucketIndex(Integer key) {
        return hashCode(key);
    }

    public int getTotalBucketSize() {
        return totalBucketSize;
    }

    public int getOccupiedBuckets() {
        return occupiedBuckets;
    }

    public int getEmptyBuckets() {
        return emptyBuckets;
    }

    // updates already existing value or adds new record
    public void put(Integer key, V value) {
        bucketIndex = getBucketIndex(key);
        HashNode head = buckets.get(bucketIndex);

        // updating if value already exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // adding value if it doesn't already exist
        head = buckets.get(bucketIndex);
        if (head == null) {
            occupiedBuckets++;
            emptyBuckets--;
        }

        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets.set(bucketIndex, node);
        size++;
    }

    public V get(Integer key) {
        bucketIndex = getBucketIndex(key);
        HashNode head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null; // return null if key not present
    }

    public boolean search(Integer key) {
        bucketIndex = getBucketIndex(key);
        HashNode head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) return true;
            head = head.next;
        }
        return false;
    }

    public V delete(Integer key) {
        bucketIndex = getBucketIndex(key);
        HashNode head = buckets.get(bucketIndex);
        HashNode prev = null;

        while (head != null) {
            if (head.key.equals(key)) break;
            prev = head;
            head = head.next;
        }

        // if bucket was empty
        // or value doesn't exist
        if (head == null) return null;

        // program reaches here only if key exists

        // if prev != null then value isn't present at first node,
        // and we need to redirect previous node's next to head's next
        if (prev != null) {
            prev.next = head.next;
            head.next = null;
        }
        // if prev == null then value is present at first node,
        // and we need to put head's next node as buckets' value for that hashcode
        else buckets.set(bucketIndex, head.next);
        size--;
        if (buckets.get(bucketIndex) == null) {
            emptyBuckets++;
            occupiedBuckets--;
        }
        return head.value;
    }

    public void printBucketStats() {
        System.out.println("Statistics:");
        System.out.println("Size: " + size);
        System.out.println("Total Bucket Size: " + totalBucketSize);
        System.out.println("Empty Buckets: " + emptyBuckets);
        System.out.println("Occupied Buckets: " + occupiedBuckets);
    }

    public void printBucketDetails() {
        for (int bIndex = 0; bIndex < totalBucketSize; bIndex++) {
            System.out.println("[ " + bIndex + " ]");
            HashNode head = buckets.get(bIndex);
            while (head != null) {
                System.out.println("\t" + head.key + " - " + head.value);
                head = head.next;
            }
        }
    }

    public void rehash(int newCapacity) {
        emptyBuckets = newCapacity;
        occupiedBuckets = 0;

        ArrayList<HashNode> newBuckets = new ArrayList<>(newCapacity);
        int newSize = 0;
        for (int i = 0; i < newCapacity; i++) newBuckets.add(null);

        for (int bIndex = 0; bIndex < totalBucketSize; bIndex++) {
            HashNode oldHead = buckets.get(bIndex);
            while (oldHead != null) {
                bucketIndex = oldHead.key % newCapacity;
                HashNode newHead = newBuckets.get(bucketIndex);

                if (newHead == null) {
                    occupiedBuckets++;
                    emptyBuckets--;
                }

                HashNode node = new HashNode(oldHead.key, oldHead.value);
                node.next = newHead;
                newBuckets.set(bucketIndex, node);

                newSize++;
                oldHead = oldHead.next;
            }
        }

        this.size = newSize;
        this.buckets = newBuckets;
        this.totalBucketSize = newCapacity;
    }

    public static void main(String[] args) {
        SeparateChainingHashTable<String> obj = new SeparateChainingHashTable<>(10);

        System.out.println("Adding values");
        obj.put(15, "madhav");
        obj.put(15, "goyal");
        obj.put(5, "madhav");
        obj.put(25, "bruh");
        obj.put(35, "amy");
        obj.put(45, "sammy");
        obj.put(55, "dino");
        obj.put(65, "ilari");
        obj.put(27, "cheer");
        obj.put(5, "madhav");
        obj.put(2, "aayush");
        obj.put(7, "gujrot");
        obj.put(3, "jasmine");
        System.out.println();

        System.out.println("Checking get and search methods");
        System.out.println(obj.get(35));
        System.out.println(obj.search(25));
        System.out.println(obj.search(29));
        System.out.println();

        System.out.println("Printing all bucket details and stats");
        obj.printBucketDetails();
        obj.printBucketStats();
        System.out.println();

        obj.rehash(obj.getTotalBucketSize() + 1);
        System.out.println("Rehashed table to capacity " + obj.getTotalBucketSize());
        System.out.println();

        System.out.println("Printing all bucket details and stats");
        obj.printBucketDetails();
        obj.printBucketStats();
        System.out.println();

        System.out.println("Adding more values.");
        obj.put(10, "khosla");
        obj.put(100, "bart");
        System.out.println();

        System.out.println("Printing all bucket details");
        obj.printBucketDetails();
        System.out.println();

        System.out.println("Deleting key 15");
        obj.delete(15);
        System.out.println(obj.search(15));
        System.out.println();

        System.out.println("Printing all bucket details and stats");
        obj.printBucketDetails();
        obj.printBucketStats();
        System.out.println();
    }
}
