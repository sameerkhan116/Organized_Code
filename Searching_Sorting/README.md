# Searching and Sorting Questions

|   Time Complexity    |  QuickSort  |  MergeSort   |   HeapSort   | BubbleSort | InsertionSort | BucketSort |
| :------------------: | :---------: | :----------: | :----------: | :--------: | :-----------: | :--------: |
|         Best         | O(n log(n)) | O(n logn(n)) | O(n logn(n)) |    O(n)    |     O(n)      |   O(n+k)   |
|       Average        | O(n log(n)) | O(n logn(n)) | O(n logn(n)) |   O(n^2)   |     O(n)      |   O(n+k)   |
|        Worst         |   O(n^2)    | O(n logn(n)) | O(n logn(n)) |   O(n^2)   |     O(n)      |   O(n^2)   |
| **Space Complexity** |  O(log(n))  | O(n logn(n)) |     O(1)     |    O(1)    |     O(1)      |    O(n)    |

### Algo for Top K Frequent Elements

```pseudocode
  Initialize a map and add all elements with key as number and value as the number of times it occurs.
  Initialize a priority queue and add each map entry to the queue in decreasing order, by specifying new PriorityQueue<>((a,b->b.getValue() - a.getValue()))
  Then create a list of results and loop as follows:
  While res.size() < K:
    Map.Entry<> x = first element in priority queue and add the value of this to the results list.
  Return the list
```
