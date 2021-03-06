import React, { useContext } from "react";
import { Form } from "react-bootstrap";
import { StoreContext } from "../store";



const SetContext = () => {

    const context = useContext(StoreContext)
    const handleChange = (e) => {
        context.setColor(e.target.value);
    }

  return (
  
  <>
    <Form.Label htmlFor="exampleColorInput">Select a Color</Form.Label>
    <Form.Control
      type="color"
      id="exampleColorInput"
      defaultValue={context.color}
      title="Choose your color"
      onChange={handleChange}
    />
  </>
  
    );
};

export default SetContext;
