import React from "react";
import { BrowserRouter as Router, Route, Link,Redirect } from "react-router-dom";
import Avengers1Component from './Avengers1Component';
import Infinity from './InfinityComponent';
import EndGame from './EndGameComponent';
import PrivateRoute from './PrivateRoute';
import Admin from './Admin';
import Login from './Login';

import fakeAuth from './Login';

class App extends React.Component {
  render() {
    return (
      <Router>
        <div className="App">
          <div className="container">
            <ul>
            <li><Link to="/">Home</Link></li>
              <li><Link to="/a1">Avengers1</Link></li>
              <li><Link to="/iwar">Infinity War</Link></li>
              <li><Link to="/end">End Game</Link></li>
              <li><Link to="/admin">Admin login</Link></li>
            </ul>
            <hr />
            <switch>
            <Route path="/" exact={true} render={() => {
              return (
                 <div className="jumbotron">
                   <h1 className="display-3">Home page!</h1>
                   <p>WelCome to Marvel movies download page</p>
                  
                 </div>
                );
         }}/>
        
         <Route path="/end" component={EndGame} />
          <Route path="/a1" component={Avengers1Component} />
            <Route path="/iwar" component={Infinity} />
            <Route path="/login" component={Login}/>
            <PrivateRoute authed={fakeAuth.isAuthenticated} path="/admin" component={Admin} />
            </switch>
          </div>
        </div>
      </Router>
    );
  }
}
export default App;