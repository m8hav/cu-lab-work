package dsa.hashing.collision.closedHashing;

// Closed Hashing
// Open Addressing Collision Handling Technique

public class LinearProbingHashTable {
    private int capacity;
    private int[] table;
    private int[] state;
//    0 for empty, 1 for occupied, -1 for deleted

    public LinearProbingHashTable(int capacity) {
        this.capacity = capacity;
        table = new int[capacity];
        state = new int[capacity];

//        initialize all slots as empty
        for (int i = 0; i < capacity; i++)
            state[i] = 0;
    }

    public int hash(int key) {
        return key % capacity;
    }

    public int nextLinearHash(int index) {
        return hash(index + 1);
    }

    public void insert(int key) {
        int index = hash(key);

        int initial_index = index;

//        Linear probing to find the next available slot
//        stop if you reach initial position when no slot is empty
        while (state[index] == 1) {
            index = nextLinearHash(index);
            if (index == initial_index) {
                System.out.println("Your hashtable is full. You can't enter anything now.");
                return;
            }
        }
//        h'(x) = ( h(x) + f(i) ) % z

        table[index] = key;
        state[index] = 1;
    }

    public boolean search(int key) {
        int index = hash(key);

        int initial_index = index;

//        Linear probing to find the key or an empty slot : keep checking till next empty slot
//        stop if you reach initial position when key doesn't exist
        while (state[index] != 0) {
            if (state[index] == 1 && table[index] == key)
                return true;
            index = nextLinearHash(index);
            if (index == initial_index) {
                System.out.println("Your hashtable is full. You can't enter anything now.");
                return false;
            }
        }

//        key not found
        return false;
    }

    public void delete(int key) {
        int index = hash(key);

        int initial_index = index;

        //        Linear probing to find the key : keep checking till next empty slot
//        stop if you reach initial position when key doesn't exist
        while (state[index] == 1) {
            if (table[index] == key) {
                state[index] = -1;
                return;
            }
            index = nextLinearHash(index);
            if (index == initial_index) {
                System.out.println("Key not present in the hashtable. Get tf out.");
                return;
            }
        }
    }

    public void print() {
        for (int i = 0; i < capacity; i++) {
            if (state[i] == 1)
                System.out.println("Slot " + i + ": " + table[i]);
            else if (state[i] == 0)
                System.out.println("Slot " + i + ": " + "EMPTY");
            else System.out.println("Slot " + i + ": " + "DELETED");
        }
    }

    public static void main(String[] args) {
        LinearProbingHashTable lpHashTable = new LinearProbingHashTable(10);

        lpHashTable.insert(5);
        lpHashTable.insert(25);
        lpHashTable.insert(15);

        System.out.println("HashTable:");
        lpHashTable.print();
        System.out.println();

        System.out.println("Search 15: " + lpHashTable.search(15));
        System.out.println("Search 10: " + lpHashTable.search(10));
        System.out.println();

        lpHashTable.delete(25);
        System.out.println("HashTable after deleting:");
        lpHashTable.print();
        System.out.println();
    }
}
