import React, { Component } from 'react';
export default class App extends React.Component {
  constructor(props) {
    super(props);
    // create a ref to store the textInput DOM element
    this.textInput = React.createRef();
    this.textInput1 = React.createRef();
    this.focusTextInput = this.focusTextInput.bind(this);
  }

  focusTextInput() {
    // Explicitly focus the text input using the raw DOM API
    // Note: we're accessing "current" to get the DOM node
    this.textInput.current.focus();// this is to focus last name text box
    //this.textInput1.current.focus(); //enable this to focus name text box
  }

  render() {
    // tell React that we want to associate the <input> ref
    // with the `textInput` that we created in the constructor
    return (
      <div>
      Name:   <input type="text" value="hi" ref={this.textInput1}/><br/>
      Last name: <input
          type="text"
          ref={this.textInput} />
<br/>
        <input
          type="button"
          value="Focus the text input"
          onClick={this.focusTextInput}
        />
      </div>
    );
  }
}