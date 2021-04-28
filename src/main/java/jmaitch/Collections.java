package jmaitch;

import java.util.*;

public class Collections
{
    private final List<Integer> list = new ArrayList<>();
    private final Integer[] array = new Integer[100];

    public void fillList()
    {
        for (int i = 0; i < 100; i++)
        {
            list.add(i);
        }
    }

    public void readList()
    {
        for (int i = 0; i < 100; i++)
        {
            final Integer integer = list.get(i);
        }
    }

    public void fillArray()
    {
        for (int i = 0; i < 100; i++)
        {
            array[i] = i;
        }
    }

    public void readArray()
    {
        for (int i = 0; i < 100; i++)
        {
            final Integer integer = array[i];
        }
    }
}

