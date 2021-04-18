import React, { Component } from 'react';
import './App.css';
class App extends Component {
  //static count=0;

  
  constructor()
  {
     
    super();
    
    this.state={
      name:'peter',
      count:0
    };
    console.log(' Constructor :: ');
  }
  
  componentWillMount(){
  //  this.setState({count: ++this.state.count});
    if(window.innerWidth<500){
      this.setState({innerWidth:window.innerWidth});
    }
   console.log("component will mount ");
  }
  componentDidMount(){
  
  }
  render() {
    return (
      <div>
        <h1>
          {JSON.stringify(this.props)}
          <br></br>
          
          {this.state.name} | width: {this.state.innerWidth}
        </h1>
      </div>
    );
  }
}

export default App;
