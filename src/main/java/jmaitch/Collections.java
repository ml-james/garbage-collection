package jmaitch;

import java.util.*;

public class Collections
{
    private final List<Integer> primedList;
    private final Integer[] primedArray;

    public Collections()
    {
        primedList = new ArrayList<>();
        primedArray = new Integer[10];

        for (int i = 0; i < 10; i++)
        {
            primedList.add(i);
            primedArray[i] = i;
        }
    }


    public List<Integer> getPrimedList() {
        return primedList;
    }

    public Integer[] getPrimedArray() {
        return primedArray;
    }
}

