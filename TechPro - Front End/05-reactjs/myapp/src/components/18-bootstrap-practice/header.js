import React from "react";
import { Button, FormControl, Form, NavDropdown, Nav, Container, Navbar } from 'react-bootstrap'
const Header = () => {
  return(
    <Navbar bg="dark" expand="lg" variant="dark">
    <Container>
      <Navbar.Brand href="#">TechPro Shop</Navbar.Brand>
      <Navbar.Toggle aria-controls="navbarScroll" />
      <Navbar.Collapse id="navbarScroll">

        <Nav
          className="me-auto ms-auto my-2 my-lg-0"
          style={{ maxHeight: '100px' }}
          navbarScroll
        >
          <Nav.Link href="#action1">Home</Nav.Link>
          <Nav.Link href="#action2">Products</Nav.Link>
          <Nav.Link href="#" >About</Nav.Link>
          <Nav.Link href="#" >Contact</Nav.Link>
        </Nav>

        <Form className="d-flex">
          <FormControl
            type="search"
            placeholder="Search"
            className="me-2"
            aria-label="Search"
          />
          <Button variant="outline-success">Search</Button>
        </Form>
      </Navbar.Collapse>
    </Container>
  </Navbar>
    )
};

export default Header;
