import React from 'react';

const Cart = ({ selectedProducts }) => {
  const totalPrice = selectedProducts.reduce((total, product) => total + product.price, 0);

  return (
    <div>
      <h2>Cart</h2>
      {selectedProducts.length === 0 ? (
        <p>No products selected</p>
      ) : (
        <div>
          <ul>
            {selectedProducts.map(product => (
              <li key={product.id}>{product.name} - ${product.price}</li>
            ))}
          </ul>
          <p>Total Price: ${totalPrice}</p>
        </div>
      )}
    </div>
  );
};

export default Cart;
