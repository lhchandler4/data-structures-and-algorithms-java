# Hashtables
- Hash tables are a data structure that very basically contain key-value pairs
- every index or bucket contains a key-value pair or more than one if there are collisions

## Challenge
- Successfully execute a hash table implementation
- The hash table implementation will have a hashing method, an add method, 
a contains method, and a get method

## Approach & Efficiency
- the big O for hash tables in terms of efficiency is normally O(1). But if there are collisions then the efficiency is O(n).

## API
- add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get: takes in the key and returns the value from the table.
- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.

## Code
- [Hash Table Code](../../src/main/java/Java/hashtable/Hashtable.java)
- [Hash Table Node Code](../../src/main/java/Java/hashtable/Node.java)

## Test
- [Hash Table Test](../../src/test/java/Java/hashtable/HashtableTest.java)
- [Hash Table Node Test](../../src/test/java/Java/hashtable/NodeTest.java)
