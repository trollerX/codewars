package com.hfad.snail;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCreate(View view) {

        final TextView arrayLength = (TextView) findViewById(R.id.enter_array_length);
        int dimension = Integer.valueOf(arrayLength.getText().toString());
        int[][] array = new int[dimension][dimension];
        populateArray(array);
        displayArray(array);
        TextView snailPrintout = (TextView) findViewById(R.id.snail_printout);
        snailPrintout.setText(Arrays.toString(snailArray(array)));

    }

    public void populateArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void displayArray(int[][] array) {
        StringBuilder stringArray = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                stringArray.append(array[i][j]).append("  ");
            }
            stringArray.append("\n");
        }

        TextView displayArray = (TextView) findViewById(R.id.display_array);
        displayArray.setText(stringArray);
    }

    public int[] snailArray(int[][] array) {

        ArrayList<Integer> snailArrayList = new ArrayList<>();
        int direction = 3;
        int x = 0;
        int y = 0;

        if (array.length > 0) {
            while (snailArrayList.size() < array.length * array.length) {
                if (direction == 3) {
                    while (y <= array.length - 1 && array[x][y] != -1) {
                        snailArrayList.add(array[x][y]);
                        array[x][y] = -1;
                        y++;
                    }
                    y--;
                    x++;
                    direction = 6;
                } else if (direction == 6) {
                    while (x <= array.length - 1 && array[x][y] != -1) {
                        snailArrayList.add(array[x][y]);
                        array[x][y] = -1;
                        x++;
                    }
                    x--;
                    y--;
                    direction = 9;
                } else if (direction == 9) {
                    while (y >= 0 && array[x][y] != -1) {
                        snailArrayList.add(array[x][y]);
                        array[x][y] = -1;
                        y--;
                    }
                    y++;
                    x--;
                    direction = 12;
                } else if (direction == 12) {
                    while (x > 0 && array[x][y] != -1) {
                        snailArrayList.add(array[x][y]);
                        array[x][y] = -1;
                        x--;
                    }
                    x++;
                    y++;
                    direction = 3;
                }
            }
        } else {
        }

        int[] snailArray = new int[snailArrayList.size()];
        if (snailArray.length != 0) {
            for (int i = 0; i < snailArrayList.size(); i++) {
                snailArray[i] = snailArrayList.get(i);
            }
        }
        return snailArray;
    }
}


