#include <stdio.h>

void union_print
(
    int main_size,
    float arr1[main_size][2],
    float arr2[main_size][2]
)
    {
    float arr[main_size][2];
    for (int i = 0; i < main_size; i++){
        arr[i][0] = arr1[i][0];
        if (arr1[i][1] > arr2[i][1]) {
            arr[i][1] = arr1[i][1];
        }
        else {
            arr[i][1] = arr2[i][1];
        }
    }
    for (int j = 0; j < main_size; j++){
        printf("%.0f\t%.2f\n", arr[j][0], arr[j][1]);
    }
}

void intersection_print
(
    int main_size,
    float arr1[main_size][2],
    float arr2[main_size][2]
)
    {
    float arr[main_size][2];
    for (int i = 0; i < main_size; i++){
        arr[i][0] = arr1[i][0];
        if (arr1[i][1] < arr2[i][1]) {
            arr[i][1] = arr1[i][1];
        }
        else {
            arr[i][1] = arr2[i][1];
        }
    }
    for (int j = 0; j < main_size; j++){
        printf("%.0f\t%.2f\n", arr[j][0], arr[j][1]);
    }
}

void complement_print
(
    int main_size,
    float arr1[main_size][2]
)
    {
    float arr[main_size][2];
    for (int i = 0; i < main_size; i++){
        arr[i][0] = arr1[i][0];
        arr[i][1] = 1-arr1[i][1];
    }
    for (int j = 0; j < main_size; j++){
        printf("%.0f\t%.2f\n", arr[j][0], arr[j][1]);
    }
}

int main()
{
    float arr1[][2] = {
        {0, 0.5},
        {1, 0.7},
        {2, 0.3},
    };
    float arr2[][2] = {
        {0, 0.2},
        {1, 0.9},
        {2, 0.4},
    };
    int main_size = sizeof(arr1)/sizeof(arr1[0]);

    union_print(main_size, arr1, arr2);
    printf("\n");

    intersection_print(main_size, arr1, arr2);
    printf("\n");

    complement_print(main_size, arr1);
    printf("\n");

    return 0;
}