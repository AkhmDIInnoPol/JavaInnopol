package com.company;

/**
 * This class training copy of ArrayList.
 */
public class MyArrayList<T> {

    private final int DEFAULT_CAPACITY = 10;

    private Object[] array;

    private int capacity = 0;

    private int index = 0;


    public MyArrayList() {

        capacity = DEFAULT_CAPACITY;
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    /**
     * Add new value to array.
     * @param val - new value.
     */
    public void add(T val)
    {
        if (index < capacity)
        {
            array[index] = val;
            index++;
        }
        else
        {
            array = reBuildNewArr();
            array[index] = val;
            index++;
        }
    }


    /**
     * Rturn element of this index.
     * @param index - index of element in array.
     * @return - return selected element.
     */
    public T get(int index)
    {
        return (T) array[index];
    }


    /**
     * Rebuild new array with bigger capacity.
     */
    private Object[] reBuildNewArr()
    {
        capacity = capacity * 2;

         Object[] tempArr = array;
         Object[] newArr = new Object[capacity];

         for (int i = 0; i < capacity; i++)
         {
             newArr[i] = new Object();
         }

         return copyArr(tempArr, newArr);
    }


    /**
     * Copy first array to second array (with more capacity).
     * @param arr1 - has lower capacity than other array.
     * @param arr2 - has more capacity then previous array.
     */
    private Object[] copyArr(Object[] arr1, Object[] arr2)
    {
        for (int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }

        return arr2;
    }


    /**
     * Add element in selected index.
     * @param insertAfterIndex - selected index
     * @param element - element that will to specified index.
     */
    public void add(int insertAfterIndex, T element)
    {
        if ((index + 1) < capacity)
        {
            insertToArr(insertAfterIndex, element);
        }
        else
        {
            array = reBuildNewArr();
            array[index] = element;
            index++;
        }

    }

    /**
     * Function shift all elements in array after insertAfterIndex and it included.
     * @param insertAfterIndex - specified index for inserting.
     * @param element - element that need to insert.
     */
    private void insertToArr(int insertAfterIndex, T element)
    {
        for (int i = index; i > (insertAfterIndex + 1); i--)
        {
            array[i] = array[i-1];
        }
        array[insertAfterIndex + 1] = element;
        index++;
    }



    /**
     * Check if specified element contains in this array.
     * @param element - specified element.
     * @return - true this element contains in this array, false - otherwise.
     */
    public boolean contains(T element)
    {
          for (int i = 0; i < capacity; i++)
          {
              if (array[i] == null)
              {
                  break;
              }

              T customObj = (T) array[i];

              if (customObj.equals(element))
              {
                  return true;
              }
          }

          return false;
    }


    /**
     * Get size of arrayList.
     * @return size of arrayList.
     */
    public int size()
    {
        return index;
    }


}
