import React, { Component } from 'react';
import PropTypes from 'prop-types';
import ParentComponent from './ParentComponent';

class App extends Component {
  render() {
    return (
      <div><h2>Welcome, {this.props.name},{this.props.tech}</h2>
      <br/>
      <ParentComponent/>
      </div>
    );
  }
}

export default App;
App.defaultProps = {
  name:PropTypes.string,
  tech: 'React Js'
};