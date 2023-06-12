import React from 'react';
import dummyData from './dummyData';

const ProductList = ({ onSelectProduct }) => {
  return (
    <div>
      <h2>Product List</h2>
      {dummyData.map(product => (
        <div key={product.id}>
          <h3>{product.name}</h3>
          <p>Price: ${product.price}</p>
          <button onClick={() => onSelectProduct(product)}>Add to Cart</button>
        </div>
      ))}
    </div>
  );
};

export default ProductList;
