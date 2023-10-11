package dsa.hashing.collision.closedHashing;

// Closed Hashing
// Open Addressing Collision Handling Technique

public class QuadraticProbingHashTable {
    private int capacity;
    private int[] table;
    private int[] state;
//    0 for empty, 1 for occupied, -1 for deleted

    public QuadraticProbingHashTable(int capacity) {
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

    public int nextQuadraticHash(int index, int increment) {
        return (index + (increment * increment)) % capacity;
    }

    public void insert(int key) {
        int index = hash(key);

        int initial_index = index;

//        Quadratic probing to find the next available slot
        int i;
        for (i = 0; i <= capacity && state[index] == 1; i++) {
            index = nextQuadraticHash(initial_index, i);
        }
        if (i == capacity && state[index] == 1) {
            System.out.println("Your hashtable is full. You can't enter anything now.");
            return;
        }
//        h'(x) = ( h(x) + f(i) ) % z

        table[index] = key;
        state[index] = 1;
    }

    public boolean search(int key) {
        int index = hash(key);

        int initial_index = index;

//        Quadratic probing to find the key or an empty slot : keep checking till next empty slot
        int i;
        for (i = 0; i <= capacity && state[index] == 1; i++) {
            index = nextQuadraticHash(initial_index, i);
            if (table[index] == key) return true;
        }

//        key not found
        return false;
    }

    public void delete(int key) {
        int index = hash(key);

        int initial_index = index;

//        Quadratic probing to find the key : keep checking till next empty slot
        int i;
        for (i = 0; i <= capacity && state[index] == 1; i++) {
            index = nextQuadraticHash(initial_index, i);
            if (table[index] == key) {
                state[index] = -1;
                return;
            }
        }
        if (i == capacity) {
            System.out.println("Key not present in the hashtable. Get tf out.");
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
        QuadraticProbingHashTable qpHashTable = new QuadraticProbingHashTable(10);

        qpHashTable.insert(5);
        qpHashTable.insert(25);
        qpHashTable.insert(15);

        System.out.println("HashTable:");
        qpHashTable.print();
        System.out.println();

        System.out.println("Search 15: " + qpHashTable.search(15));
        System.out.println("Search 10: " + qpHashTable.search(10));
        System.out.println();

        qpHashTable.delete(25);
        System.out.println("HashTable after deleting:");
        qpHashTable.print();
        System.out.println();
    }
}
