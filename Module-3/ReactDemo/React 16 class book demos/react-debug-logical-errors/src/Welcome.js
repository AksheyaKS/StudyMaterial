import React, { Component } from 'react';
import './App.css';

class Welcome extends Component {
    constructor(props){
        super(props);
        this.state={
        users:  [
            {name: "John", id: 120, age: 22, gender: "male"},
            {name: "Beth", id: 443, age: 24, gender: "female"},
            {name: "Jane", id: 510, age: 19, gender: "female"}
           ]
        }
      }
  render() {
    return (
     <React.Fragment>
         <h1>this welcome part</h1>
         <br/>
         <span><h1>Hi !!!</h1><h2>{this.props.name}&nbsp;&nbsp;&nbsp;{this.props.lname}</h2></span>
         <ul>
     {this.state.users.map(function(user, i){
       return <li key={i}>{user.name} |  {user.age}  |  {user.gender}</li>
     })}
   </ul>
     </React.Fragment>
    );
  }
}
export default Welcome;