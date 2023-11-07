package org.example;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

import java.io.IOException;

public class AmazonScraper {
    public static void main(String[] args) {
        String product = "laptop"; // Default product

        if (args.length > 0) {
            product = args[0]; // Use the user input product name
        }

        String url = "https://www.amazon.com/s?k=" + product;

        try (WebClient client = new WebClient()) {
            client.getOptions().setCssEnabled(false);
            client.getOptions().setJavaScriptEnabled(false);

            HtmlPage page = client.getPage(url);

            // Get product name and price
            DomNodeList<DomNode> items = page.querySelectorAll("div[data-component-type='s-search-result']");
            for (DomNode item : items) {
                DomNode productNameElement = item.querySelector(".a-size-medium");
                DomNode productPriceElement = item.querySelector(".a-price .a-offscreen");

                if (productNameElement != null && productPriceElement != null) {
                    String productName = productNameElement.getTextContent();
                    String productPrice = productPriceElement.getTextContent();

                    System.out.println("Product Name: " + productName);
                    System.out.println("Product Price: " + productPrice);
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


