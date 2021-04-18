import React, { Component } from 'react';

const User = WrappedComponent => {
  class WithUser extends React.Component {
    constructor(props) {
      console.log(props.ui);
      super(props);
      this.state = {
        user: 'ajay',
        loggedIn: 'false'
      };
    }
    render() {
      return <WrappedComponent user={this.state.user} {...this.props}/>;
    }
  }
  return WithUser;
};

const UserPage = props => (
  <div class="user-container">
    <p>My name is {props.user}!</p>
  </div>
);
// class UserPage extends React.Component
// {

  
//   render() {
//       return(
//       <div class="user-container">
//       <p>My name is {this.props.user}!</p>
//       <p>logged in  {this.props.status}</p>
//       </div>
//       );
//   }
// }


export default User(UserPage);
