import React, { Component } from 'react';
import PropTypes from 'prop-types';

class App extends Component {
  render() {
    return (
      <div><h2>Welcome, {this.props.name},{this.props.tech},{this.props.data}</h2>

      </div>
    );
  }
}

export default App;
App.propTypes = {
   name: PropTypes.string,
data: PropTypes.object.isRequired,
 };
App.defaultProps = {
 
  name:PropTypes.string,
  tech: 'React Js'
};