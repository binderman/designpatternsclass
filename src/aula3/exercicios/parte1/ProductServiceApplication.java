package aula3.exercicios.parte1;

// ProductServiceApplication.java
import java.util.List;

public class ProductServiceApplication {

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        // Simulando busca de produtos para a página de busca
        System.out.println("### Produtos para Busca ###");
        List<ProductSearchDTO> searchProducts = productService.getProductsForSearch();
        for (ProductSearchDTO product : searchProducts) {
            System.out.println("ID: " + product.getProductId());
            System.out.println("Nome: " + product.getName());
            System.out.println("Descrição: " + product.getShortDescription());
            System.out.println("Preço: $" + product.getPrice());
            System.out.println("Thumbnail: " + product.getThumbnailUrl());
            System.out.println();
        }

        // Simulando busca de produtos para a página de promoções
        System.out.println("### Produtos para Promoção ###");
        List<ProductPromotionDTO> promotionProducts = productService.getProductsForPromotion();
        for (ProductPromotionDTO product : promotionProducts) {
            System.out.println("ID: " + product.getProductId());
            System.out.println("Nome: " + product.getName());
            System.out.println("Preço Original: $" + product.getOriginalPrice());
            System.out.println("Preço com Desconto: $" + product.getDiscountedPrice());
            System.out.println("Descrição da Promoção: " + product.getPromotionDescription());
            System.out.println();
        }

        // Simulando busca de detalhes do produto
        System.out.println("### Detalhes do Produto ###");
        ProductDetailDTO productDetail = productService.getProductDetails("007");
        System.out.println("ID: " + productDetail.getProductId());
        System.out.println("Nome: " + productDetail.getName());
        System.out.println("Descrição: " + productDetail.getDescription());
        System.out.println("Preço: $" + productDetail.getPrice());
        System.out.println("URL da Imagem: " + productDetail.getImageUrl());
        System.out.println("Fabricante: " + productDetail.getManufacturer());
        System.out.println("Categoria: " + productDetail.getCategory());
        System.out.println();

        // Simulando busca de produtos para a página de pedidos
        System.out.println("### Produtos para Pedido ###");
        List<ProductOrderDTO> orderProducts = productService.getProductsForOrder();
        for (ProductOrderDTO product : orderProducts) {
            System.out.println("ID: " + product.getProductId());
            System.out.println("Nome: " + product.getName());
            System.out.println("Quantidade: " + product.getQuantity());
            System.out.println("Preço Unitário: $" + product.getPrice());
            System.out.println("Total: $" + product.getTotalAmount());
            System.out.println();
        }
    }
}
