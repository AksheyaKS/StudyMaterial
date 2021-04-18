import React from 'react';
class FiveMax extends React.Component {
    constructor(props) {
      super(props);
      this.state = { value: ''}
      this.handleChange = this.handleChange.bind(this);
    }
  
    handleChange(e) {
      this.setState({ value: e.target.value})
    }
  
    render() {
        //will throw ie print this error messages in console but it will a big trace
        //nothing will happen in browser //it has to be handled in proper way
      if(this.state.value.length > 5) {
        throw new Error('Please enter less than five characters!');
      }
      return (
        <div>
          <label>Type away: </label>
          <input type="text" value={this.state.value} onChange={this.handleChange} />
        </div>
      );
    }
  }
  
  export default FiveMax;