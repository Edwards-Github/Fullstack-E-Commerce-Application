import products from '../data/products';
import PageHeading from './PageHeading';
import ProductListings from './ProductListings';
import BootstrapButton from "./BootstrapButton";

export default function Home() {
  return (
    <div className="home-container">
      <div className="container col-6">
         <BootstrapButton text="Submit" type="primary"></BootstrapButton>
        <BootstrapButton text="Save" type="secondary"></BootstrapButton>
        <BootstrapButton text="Okay" type="success"></BootstrapButton>
        <BootstrapButton text="Cancel" type="danger"></BootstrapButton>
        <BootstrapButton text="Delete" type="warning"></BootstrapButton>
        <BootstrapButton text="Link" type="link"></BootstrapButton>
      </div>
      <PageHeading title="Explore Eazy Stickers!">
        Add a touch of creativity to your space with our wide range of fun and
        unique stickers. Perfect for any occasion!
      </PageHeading>
      <ProductListings products={products} />
    </div>
  );
}
