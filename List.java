package MeaningfulNames;

    public List<int[]> getThem() {

        List<int[]> list1 = new ArrayList<int[]>();

            for (int[] x : theList) if (x[0] == 4) list1.add(x);
            return list1;

    }
