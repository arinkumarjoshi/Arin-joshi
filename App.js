import React, { useState } from 'react';
import ProductList from './ProductList';
import Cart from './Cart'

const App = () => {
  const [selectedProducts, setSelectedProducts] = useState([]);

  const handleSelectProduct = product => {
    setSelectedProducts(prevSelectedProducts => [...prevSelectedProducts, product]);
  };

  return (
    <div>
      <h1>Product Cart</h1>
      <ProductList onSelectProduct={handleSelectProduct} />
      <Cart selectedProducts={selectedProducts} />
    </div>
  );
};

export default App;
