import React, { Component } from 'react';
import './App.css';
//var createReactClass = require('create-react-class');

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
  constructor(props){
    super(props);
    this.state={ name:null};
  }
  render() {
    return (
      <div>
         <button  onClick={() => this.setState({name: 'X'})}>
         {this.state.name}
      </button>
      </div>
    );
  }
}

export default App;
