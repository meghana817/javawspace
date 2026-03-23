<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>Products</title>
    <style>
        .product-card { border: 1px solid #ccc; padding: 10px; width: 200px; margin: 10px; display: inline-block; }
        .badge { background: black; color: white; padding: 2px 5px; font-weight: bold; }
        .original-price { color: gray; }
        .discounted-price { color: green; font-weight: bold; }
    </style>
</head>
<body>
    <h1>Our Products</h1>

    <my:productCard productId="101" name="Wireless Headphones" price="99.99"
                    imageUrl="images/headphones.jpg" description="High quality sound"
                    discount="20" showAddToCart="true"/>

    <my:productCard productId="102" name="Smart Watch" price="149.99"
                    imageUrl="images/smartwatch.jpg" description="Track your fitness"
                    showAddToCart="true"/>

    <my:productCard productId="103" name="Gaming Mouse" price="59.99"
                    imageUrl="images/mouse.jpg" description="Ergonomic design for gamers"
                    discount="10" showAddToCart="true"/>
</body>
</html>

