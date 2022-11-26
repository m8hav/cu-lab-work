#include <stdio.h>
#include <stdlib.h>

// defining Linked List's Node's structure
struct Node
{
    int data;
    struct Node *next;
};

// function to print elements until node pointer points to NULL
void linkedListTraversal(struct Node *ptr)
{
    while (ptr) // OR while (ptr != NULL)
    {
        printf("Element: %d\n", ptr->data);
        ptr = ptr->next;
    }
}

int main()
{

    // creating struct Node pointers;
    struct Node *head, *second, *third, *fourth;

    // allocating memory for nodes of linked list in Heap memory
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    // linking first and second nodes
    head->data = 11;
    head->next = second;

    // linking second and third nodes
    second->data = 22;
    second->next = third;

    // linking third and fourth nodes
    third->data = 33;
    third->next = fourth;

    // terminating linked list with NULL as next node
    fourth->data = 44;
    fourth->next = NULL;

    // printing elements of list
    linkedListTraversal(head);
    return 0;
}