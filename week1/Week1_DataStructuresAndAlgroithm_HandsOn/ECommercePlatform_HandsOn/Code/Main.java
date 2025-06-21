package Week1_DataStructuresAndAlgroithm_HandsOn.ECommercePlatform_HandsOn.Code;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Book", "Education"),
            new Product(104, "Phone", "Electronics")
        };

        Product result1 = SearchFunctions.linearSearch(products, "Book");
        System.out.println("Linear Search: " + (result1 != null ? result1 : "Not Found"));

        Product result2 = SearchFunctions.binarySearch(products, "Book");
        System.out.println("Binary Search: " + (result2 != null ? result2 : "Not Found"));
    }
}
