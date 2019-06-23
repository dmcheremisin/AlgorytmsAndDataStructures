This is a repo for Udemy course Data Structures and Algorithms: Deep Dive Using Java: [link](https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java)
 

Found issues:
1. Buggy implementation of Hashtable.
According to the agreement Hashtable should contain only unique key-value pairs as it implements Map interface.
But in Sarah implementation it is not true. She doesn't check an existence of the provided key before insertions.
It can be simply fixed, I made it by myself.
2. Buggy implementation of Hashtable. 
In Hashtable remove method she iterates over collection of items and searches for the provided key.
She made iterator and increments a counter "i" in purpose to memorize an index of found item.
Then she provides this index to LinkedList and calls remove method -> remove(i). 
LinkedList will again iterate over collection of items in oder to find the provided index.
This leads to double iteration.
It is bad implementation, because she could simply use iterator's remove method and don't iterate over the collection twice.  