import React, { Component,Fragment } from 'react';
//class component
// class App extends Component {
//   render() {
//     return (
//       <Fragment>
//       <h2>welcome</h2>
//       <h1>hello</h1>
//       </Fragment>
//     );
//   }
// }
//import React from 'react'

//functional component
// function App(props){
//   return <div>Hello {props.name}</div>
// }

//same but in ES6 syntax
const App = ({name}) => <div>Hello {name}</div>
export default App;
