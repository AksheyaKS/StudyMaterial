import React from 'react';
import axios from 'axios'
class AxiosExample extends React.Component {
    constructor(props) {
      super(props);
      this.state = { username: ''}
      this.handleChange = this.handleChange.bind(this);
    }
  
    handleChange(e) {

        axios.get('https://api.github.com/users/maecapozzi')
        .then(response => this.setState({username: response.data}))
      
    }
  
    render() {
       
      return (
        <div>
          <button className='button' onClick={this.handleChange}>
        Click Me
      </button>
          <p>{this.state.username.name}</p>
          <p>{this.state.username.id}</p>
        </div>
      );
    }
  }
  
  export default AxiosExample;