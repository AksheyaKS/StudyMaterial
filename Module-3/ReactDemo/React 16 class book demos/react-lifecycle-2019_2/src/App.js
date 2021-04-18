import React, { Component } from 'react';
import './App.css';
class App extends Component {
  constructor(props){
    console.log('in constructor');
  super(props);
    this.state={
      counter:0,
      mount:true
    }
    this.mount=()=>this.setState({mount:true})
    this.unmount=()=>this.setState({mount:false})

this.increment=()=>this.setState({counter:this.state.counter+1})
this.decrement=()=>this.setState({counter:this.state.counter-1})
  }

  componentWillMount(){
    console.log('in will mount');
  }
  
  componentDidMount(){
    console.log('in did mount');
  }
  componentDidUpdate(prevProps,prevState,snapshot){
    console.log('in did update '+prevState.counter)
    console.log()
  }
  shouldComponentUpdate(nextProps,nextState){
    console.log('in should '+nextState.counter)
    return true //when its false no changes will happen in ui ie it will not update or render the ui
  }
    render() {
      var comp=<div>
      <button onClick={this.increment}>increment</button>
      <button onClick={this.decrement}>decrement</button>
      <br></br>
      {this.state.counter}
      </div>
      console.log("rendering...")
    return (
      <div>
        <h1>
          <div>
          <button onClick={this.mount} disabled={this.state.mount}>mount</button>
          <button onClick={this.unmount} disabled={!this.state.mount}>un mount</button>
          </div>
          <br></br>
        {this.state.mount? comp:null}
        {/* disables counter component (we havent created a seperate component, so used a var) */}
          
        </h1>
      </div>
    );
  }
}

export default App;
