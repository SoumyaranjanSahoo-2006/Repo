#include <stdio.h>

int main() {
    // Declare variables
    int num1, num2;
    int sum, difference;
    
    // Get input from user
    printf("Enter first number: ");
    scanf("%d", &num1);
    
    printf("Enter second number: ");
    scanf("%d", &num2);
    
    // Perform addition
    sum = num1 + num2;
    
    // Perform subtraction
    difference = num1 - num2;
    
    // Display results
    printf("\n--- Results ---\n");
    printf("%d + %d = %d\n", num1, num2, sum);
    printf("%d - %d = %d\n", num1, num2, difference);
    
    return 0;
}