import React, { Component } from 'react';
import './App.css';
var createReactClass = require('create-react-class');

// var App=createReactClass({
//   render: function(){
//     return (
//       <div><h2>Welcome</h2></div>
//     );
//   }
// });
// function App(){
 
//     return(
//       <h1>hi</h1>

//     );
  
// }
 class App extends Component {

  render() {
    return (
      <div><h2>{this.props.foo } | {this.props.name}</h2>
      <h1>hello</h1>
      </div>
    );
  }
}

export default App;
