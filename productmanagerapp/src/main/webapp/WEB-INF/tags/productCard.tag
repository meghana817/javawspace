<%@ tag description="Product Card Component" pageEncoding="UTF-8" %>
<%@ attribute name="productId" required="true" %>
<%@ attribute name="name" required="true" %>
<%@ attribute name="price" required="true" type="java.lang.Double" %>
<%@ attribute name="imageUrl" required="false" type="java.lang.String" %>
<%@ attribute name="description" required="false" type="java.lang.String" %>
<%@ attribute name="discount" required="false" type="java.lang.Integer" %>
<%@ attribute name="showAddToCart" required="false" type="java.lang.Boolean" %>

<%
    String img = (imageUrl == null) ? "images/no-image.jpg" : imageUrl;
    boolean showCart = (showAddToCart == null) ? true : showAddToCart;
    double finalPrice = price;
    boolean hasDiscount = (discount != null && discount > 0);
    if (hasDiscount) {
        finalPrice = price - (price * discount / 100.0);
    }
%>

<article class="product-card" id="product-<%= productId %>">
    <% if (hasDiscount && discount >= 20) { %>
        <span class="badge">SALE!</span>
    <% } %>

    <figure>
        <img src="<%= img %>" alt="<%= name %>" width="150" height="150"/>
        <figcaption><strong><%= name %></strong></figcaption>
    </figure>

    <section class="price">
        <% if (hasDiscount) { %>
            <span class="original-price" style="text-decoration: line-through;">
                $<%= String.format("%.2f", price) %>
            </span>
            <span class="discounted-price">
                $<%= String.format("%.2f", finalPrice) %>
            </span>
        <% } else { %>
            <span class="price">$<%= String.format("%.2f", price) %></span>
        <% } %>
    </section>

    <% if (description != null) { %>
        <p class="description"><%= description %></p>
    <% } %>

    <% if (showCart) { %>
        <button type="button">Add to Cart</button>
    <% } %>
</article>
