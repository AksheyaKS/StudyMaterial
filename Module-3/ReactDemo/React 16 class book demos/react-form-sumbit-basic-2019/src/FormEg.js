
import React, { Component } from "react";

/* Import Components */
//import CheckBox from "../components/CheckBox";
import Input from './Input'
//import TextArea from "../components/TextArea";
import Select from "./Select";
import Button from "./BUtton";

class FormEg extends Component {
  constructor(props) {
    super(props);

    this.state = {
      newUser: {
        name: "",
        age: "",
        gender: "",
       
      },
	 genderOptions: ["Male", "Female", "Others"],
     
    };
    this.handleAge = this.handleAge.bind(this);
    this.handleFullName = this.handleFullName.bind(this);
    this.handleFormSubmit = this.handleFormSubmit.bind(this);
    this.handleClearForm = this.handleClearForm.bind(this);
    this.handleInput = this.handleInput.bind(this);
  }

  /* This lifecycle hook gets executed when the component mounts */

  handleFullName(e) {
    let value = e.target.value;
    this.setState(
      prevState => ({
        newUser: {
          ...prevState.newUser,
          name: value
        }
      }),
      () => console.log(this.state.newUser)
    );
  }

  handleAge(e) {
    let value = e.target.value;
    this.setState(
      prevState => ({
        newUser: {
          ...prevState.newUser,
          age: value
        }
      }),
      () => console.log(this.state.newUser)
    );
  }

  handleInput(e) {
    let value = e.target.value;
    let name = e.target.name;
    this.setState(
      prevState => ({
        newUser: {
          ...prevState.newUser,
          [name]: value
        }
      }),
      () => console.log(this.state.newUser)
    );
  }


  
  handleFormSubmit(e) {
    e.preventDefault();
    let userData = this.state.newUser;
alert("you typed : "+JSON.stringify(userData));
        console.log("Successful " + userData);
     
  }

  handleClearForm(e) {
    e.preventDefault();
    this.setState({
      newUser: {
        name: "",
        age: "",
        gender: "",
        skills: [],
        about: ""
      }
    });
  }

  render() {
    return (
      <form className="container-fluid" onSubmit={this.handleFormSubmit}>
        <Input
          inputType={"text"}
          title={"Full Name"}
          name={"name"}
          value={this.state.newUser.name}
          placeholder={"Enter your name"}
          handleChange={this.handleInput}
        />{" "}
        {/* Name of the user */}
        <Input
          inputType={"number"}
          name={"age"}
          title={"Age"}
          value={this.state.newUser.age}
          placeholder={"Enter your age"}
          handleChange={this.handleAge}
        />{" "}
        {/* Age */}
        <Select
          title={"Gender"}
          name={"gender"}
          options={this.state.genderOptions}
          value={this.state.newUser.gender}
          placeholder={"Select Gender"}
          handleChange={this.handleInput}
        />{" "}
        
        <Button
          action={this.handleFormSubmit}
          
          title={"Submit"}
          style={buttonStyle}
        />{" "}
        
        <Button
          action={this.handleClearForm}
          
          title={"Clear"}
          style={buttonStyle}
        />{" "}
        
      </form>
    );
  }
}

const buttonStyle = {
	color:'blue',
  margin: "10px 10px 10px 10px"
};

export default FormEg;
