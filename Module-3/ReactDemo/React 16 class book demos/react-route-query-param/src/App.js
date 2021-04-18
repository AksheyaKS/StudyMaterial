import React from "react";
import { BrowserRouter as Router, Link, Route } from "react-router-dom";
//we can also use query-string
//for this we have do below in line number 5
import queryString from 'query-string'


export default function ParamsExample() {
  
  return (
    <Router>
        <div>
          <h2>Accounts</h2>
          <ul>
            <li>
              <Link to={{ pathname: "/account", search: "?name=netflix" }}>
                Netflix
              </Link>
            </li>
            <li>
              <Link to={{ pathname: "/account", search: "?name=zillow-group" }}>
                Zillow Group
              </Link>
            </li>
            <li>
              <Link to={{ pathname: "/account", search: "?name=yahoo" }}>
                Yahoo
              </Link>
            </li>
            <li>
              <Link to={{ pathname: "/account", search: "?name=modus-create" }}>
                Modus Create
              </Link>
            </li>
          </ul>

          <Route
            render={({ location }) => {
             // let params = new URLSearchParams(location.search);
              //return <Child name={params.get("name")} />;
                  const params=queryString.parse(window.location.search);
              return <Child name={params.name} />
            }}
          />
        </div>
     </Router>
  );
}

function Child({ name }) {
  return (
    <div>
      {name ? (
        <h3>
          The <code>name</code> in the query string is "{name}"
        </h3>
      ) : (
        <h3>There is no name in the query string</h3>
      )}
    </div>
  );
}

