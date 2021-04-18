import React, {Component } from 'react';
import Radium from 'radium';
import mycss from './App.css';

var styles = {
  // both: {
  //   background: 'black',
  //   border: 'solid 1px white',
  //   height: 28,
  //   width: 50
  // },
  one: {
    ':hover': {
      background: 'blue',
    }
  },
  two: {
    ':hover': {
      background: 'red',
    }
  }
};

class App extends Component {
  render() {
    return (
      <div>
        <div key="one" style={mycss.red} ><button>hi</button></div>
      <div key="one" style={[styles.one]} ><button>hi</button></div>
      <div key="two" style={[styles.two]} ><button>hello</button></div>
    </div>
    );
  }
}

export default Radium(App);
