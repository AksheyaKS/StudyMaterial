import React, { Component } from 'react';
import './App.css';
import Theatre from './Theatre';
import Protect from './Protect';
class App extends Component {
  render() {
    return (
      <Protect>
      <Theatre/>
      </Protect>

      //if u use Theatre component for second time then wrap it seperately by protect error boundary
      /*
       <Protect>
      <Theatre/>
      </Protect>
      <br/>
       <Protect>
      <Theatre/>
      </Protect>
      */
    );
  }
}

export default App;
