import React from "react";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import Avengers1Component from './Avengers1Component';
import Infinity from './InfinityComponent';
import EndGame from './EndGameComponent';

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
              <li><Link to="/end/game1">End Game1</Link></li>
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
        //  the below link must be first for switch
//it takes only end
         <Route path="/end" component={EndGame} />

         <Route path="/end/game1" render={() => {
          return (
             <div className="jumbotron">
               <h1 className="display-3">dummy!</h1>
               
             </div>
            );
     }}/>
            <Route path="/a1" component={Avengers1Component} />
            <Route path="/iwar" component={Infinity} />
            
            </switch>
          </div>
        </div>
      </Router>
    );
  }
}
export default App;