import React from "react";
import { render } from "react-dom";
import { Greeting } from "./components";

import { BrowserRouter as Router, Route, Link } from "react-router-dom";

const styles = {
  fontFamily: "sans-serif",
  textAlign: "center"
};

const App = () => (
  <div style={styles}>
    <h2>Click below to go to other page. Also, open source code</h2>
    <Link to="/greeting/World">Go to /greeting/World</Link>
  </div>
);

const RouterExample = () => (
  <Router>
    <div>
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
      </ul>

      <hr />

      <Route exact path="/" component={App} />
      <Route
        path="/greeting/:name"
        render={props => <Greeting text="Hello, " {...props} />}
      />
    </div>
  </Router>
);

render(<RouterExample />, document.getElementById("root"));
