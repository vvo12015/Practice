package workshop3;


public class BinaryHeap {

    private int[] heap;
    private int size;

    public BinaryHeap(int size) {
        this.heap = new int[size];
        this.size = 0;
    }

    public void insert(int val) {
        heap[size] = val;
        size++;

        int i = size - 1;
        int parent = (i - 1) / 2;

        while (i > 0 && heap[parent] < heap[i])
        {
            int temp = heap[i];
            heap[i] = heap[parent];
            heap[parent] = temp;

            i = parent;
            parent = (i - 1) / 2;
        }
    }

    public int poll() {
        if (size > 0) {
            int result = heap[0];
            heap[0] = heap[size-1];
            size--;
            heapify(0);
            return result;
        }
        return 0;
    }

    private void sortHeap(){
        for (int i = 0; i < size; i++) {
            heapify(i);
        }
    }

    private void heapify(int i){

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if ((largest < size) && (left < size)){
            if (heap[left] > heap[largest]) largest = left;
        }
        if ((largest < size)&& (right < size)){
            if (heap[right] > heap[largest]) largest = right;
        }

        if (largest != i){
            int forChange = heap[i];
            heap[i] = heap[largest];
            heap[largest] = forChange;
            heapify(largest);
        }
    }
}
