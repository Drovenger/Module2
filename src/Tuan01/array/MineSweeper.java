package Tuan01.array;

import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        int column;
        int line;
        int check;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInput number columns for the 2D array: ");
        column = scanner.nextInt();
        System.out.print("\nInput number of lines for the 2D array: ");
        line = scanner.nextInt();

        String[][] map = new String[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                check = (int) (Math.random() * 100);
                if (check % 4 == 0) {
                    map[i][j] = "*";
                } else {
                    map[i][j] = ".";
                }
            }
        }

        final int MAP_HEIGHT = map.length;
        final int MAP_WIDTH = map[0].length;

        String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
        for (int yOrdinate = 0; yOrdinate < MAP_HEIGHT; yOrdinate++) {
            for (int xOrdinate = 0; xOrdinate < map[0].length; xOrdinate++) {
                String curentCell = map[yOrdinate][xOrdinate];
                if (curentCell.equals("*")) {
                    mapReport[yOrdinate][xOrdinate] = "*";
                } else {
                    final int[][] NEIGHBOURS_ORDINATE = {
                            {yOrdinate - 1, xOrdinate - 1}, {yOrdinate - 1, xOrdinate}, {yOrdinate - 1, xOrdinate + 1},
                            {yOrdinate, xOrdinate - 1}, {yOrdinate, xOrdinate + 1},
                            {yOrdinate + 1, xOrdinate - 1}, {yOrdinate + 1, xOrdinate}, {yOrdinate + 1, xOrdinate + 1},
                    };

                    int minesAround = 0;
                    for (int[] neighbourOrdinate : NEIGHBOURS_ORDINATE) {
                        int xOrdinateOfNeighbour = neighbourOrdinate[1];
                        int yOrdinateOfNeighbour = neighbourOrdinate[0];

                        boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0
                                || xOrdinateOfNeighbour == MAP_WIDTH
                                || yOrdinateOfNeighbour < 0
                                || yOrdinateOfNeighbour == MAP_HEIGHT;
                        if (isOutOfMapNeighbour) continue;

                        boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
                        if (isMineOwnerNeighbour) minesAround++;
                    }

                    mapReport[yOrdinate][xOrdinate] = String.valueOf(minesAround);
                }
            }
        }

        for (int yOrdinate = 0; yOrdinate < MAP_HEIGHT; yOrdinate++) {
            for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
                String currentCellReport = mapReport[yOrdinate][xOrdinate];
                System.out.printf("%-2s",currentCellReport);
            }
            System.out.println();
        }
    }
}

