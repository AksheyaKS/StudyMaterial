import React, { Component,Fragment } from 'react';

class App extends Component {
  render() {
    return (
      <Fragment>
      <h2>welcome</h2>
      <h1>hello</h1>
      </Fragment>
    );
  }
}
//import React from 'react'

// export default class App extends React.Component {
//   render() {
//     return <div>
//       {
//         process.env.NODE_ENV === 'development' ?
//         <p>Currently using React {React.version}</p> : <h1>{React.version}</h1>
//       }
//     </div>
//   }
// }

export default App;
