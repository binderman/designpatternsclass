package aula3.exercicios.parte1;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<ProductSearchDTO> getProductsForSearch() {
        List<ProductSearchDTO> products = new ArrayList<>();
        ProductSearchDTO product = new ProductSearchDTO();
        product.setProductId("001");
        product.setName("Apple iPhone 13");
        product.setShortDescription("Apple iPhone 13 with 128GB storage.");
        product.setPrice(799.00);
        product.setThumbnailUrl("http://example.com/iphone13.jpg");
        products.add(product);

        ProductSearchDTO product2 = new ProductSearchDTO();
        product2.setProductId("002");
        product2.setName("Samsung Galaxy S21");
        product2.setShortDescription("Samsung Galaxy S21 with 256GB storage.");
        product2.setPrice(699.00);
        product2.setThumbnailUrl("http://example.com/galaxys21.jpg");
        products.add(product2);

        return products;
    }

    public List<ProductPromotionDTO> getProductsForPromotion() {
        List<ProductPromotionDTO> promotions = new ArrayList<>();
        ProductPromotionDTO promotion = new ProductPromotionDTO();
        promotion.setProductId("003");
        promotion.setName("Sony WH-1000XM4");
        promotion.setOriginalPrice(349.99);
        promotion.setDiscountedPrice(299.99);
        promotion.setPromotionDescription("Sony WH-1000XM4 Wireless Noise Cancelling Headphones.");
        promotions.add(promotion);

        ProductPromotionDTO promotion2 = new ProductPromotionDTO();
        promotion2.setProductId("004");
        promotion2.setName("Dell XPS 13");
        promotion2.setOriginalPrice(999.99);
        promotion2.setDiscountedPrice(899.99);
        promotion2.setPromotionDescription("Dell XPS 13 Laptop with Intel Core i7.");
        promotions.add(promotion2);

        return promotions;
    }

    public ProductDetailDTO getProductDetails(String productId) {
        ProductDetailDTO productDetail = new ProductDetailDTO();
        productDetail.setProductId(productId);
        productDetail.setName("Apple MacBook Air");
        productDetail.setDescription("Apple MacBook Air with M1 Chip and 256GB SSD.");
        productDetail.setPrice(999.00);
        productDetail.setImageUrl("http://example.com/macbookair.jpg");
        productDetail.setManufacturer("Apple");
        productDetail.setCategory("Laptops");
        return productDetail;
    }

    public List<ProductOrderDTO> getProductsForOrder() {
        List<ProductOrderDTO> orders = new ArrayList<>();
        ProductOrderDTO order = new ProductOrderDTO();
        order.setProductId("005");
        order.setName("Bose QuietComfort 35 II");
        order.setQuantity(1);
        order.setPrice(299.00);
        order.setTotalAmount(299.00);
        orders.add(order);

        ProductOrderDTO order2 = new ProductOrderDTO();
        order2.setProductId("006");
        order2.setName("Amazon Echo Dot (4th Gen)");
        order2.setQuantity(2);
        order2.setPrice(49.99);
        order2.setTotalAmount(99.98);
        orders.add(order2);

        return orders;
    }
}