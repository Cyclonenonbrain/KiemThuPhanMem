/**
 * cart_spec.cy.js
 * Scenario 3: Add a product to the cart
 * Scenario 4: Sort products by price (low to high)
 * Scenario 5: Remove a product from the cart
 * Scenario 6: Complete checkout flow
 */

describe('Cart Test', () => {
    beforeEach(() => {
        cy.visit('https://www.saucedemo.com');
        cy.get('#user-name').type('standard_user');
        cy.get('#password').type('secret_sauce');
        cy.get('#login-button').click();
    });

    // --- Scenario 3 ---
    it('Should add a product to the cart', () => {
        cy.get('.inventory_item').first().find('.btn_inventory').click();
        cy.get('.shopping_cart_badge').should('have.text', '1');
    });

    // --- Scenario 4 ---
    it('Should sort products by price low to high', () => {
        cy.get('.product_sort_container').select('lohi');
        cy.get('.inventory_item_price').first().should('have.text', '$7.99');
    });

    // --- Scenario 5: Remove product from cart ---
    it('Should remove a product from the cart', () => {
        // Add the first product
        cy.get('.inventory_item').first().find('.btn_inventory').click();
        cy.get('.shopping_cart_badge').should('have.text', '1');

        // Remove it
        cy.get('.inventory_item').first().find('.btn_inventory').click();

        // Badge should no longer exist
        cy.get('.shopping_cart_badge').should('not.exist');
    });

    // --- Scenario 6: Checkout flow ---
    it('Should complete the checkout process', () => {
        // Add a product
        cy.get('.inventory_item').first().find('.btn_inventory').click();
        cy.get('.shopping_cart_badge').should('have.text', '1');

        // Go to cart
        cy.get('.shopping_cart_link').click();
        cy.url().should('include', '/cart.html');

        // Proceed to checkout
        cy.get('#checkout').click();
        cy.url().should('include', '/checkout-step-one.html');

        // Fill in checkout information
        cy.get('#first-name').type('John');
        cy.get('#last-name').type('Doe');
        cy.get('#postal-code').type('12345');
        cy.get('#continue').click();

        // Verify we reach the order summary page
        cy.url().should('include', '/checkout-step-two.html');
    });
});
