import React, { Component } from 'react';
import './App.css';
import 'semantic-ui/dist/semantic.min.css';
import { Button } from 'semantic-ui-react';

class App extends Component {
  render() {
    return (
      <div>
  <button class="ui button" role="button">Btn with Semantic-UI</button>
  or
<Button>click</Button>
        <h2>welcome</h2>
      <h1>hello</h1>
      </div>
    );
  }
}

export default App;
