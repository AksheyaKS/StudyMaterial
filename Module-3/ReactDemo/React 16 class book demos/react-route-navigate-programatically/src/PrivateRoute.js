import React from "react";
import { BrowserRouter as Router, Route, Link,Redirect } from "react-router-dom";
import fakeAuth from './Login';
const PrivateRoute = ({ component: Component, ...rest }) => (
    <Route {...rest} render={props => (
      fakeAuth.isAuthenticated ? (
        <Component {...props}/>
      ) : (
        <Redirect to={{
          pathname: '/login',
          state: { from: props.location }
        }}/>
      )
    )}/>
  )
  export default PrivateRoute;