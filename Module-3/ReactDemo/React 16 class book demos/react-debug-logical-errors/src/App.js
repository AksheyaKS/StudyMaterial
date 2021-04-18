import React, { Component } from 'react';
import './App.css';
import Welcome from './Welcome';

class App extends Component {
  render() {
    // var s={name:'vino',lname:'suren'};
    return (
      <div><h1>this is home</h1>
      <Welcome name='vinoth'/>
      {/* <Welcome {...s}/> */}
      </div>
    );
  }
}

export default App;
