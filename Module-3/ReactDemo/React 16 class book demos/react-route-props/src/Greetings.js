import React from "react";

export class Greeting extends React.Component {
  render() {
    const { text, match: { params } } = this.props;

    const { name } = params;

    return (
      <React.Fragment>
        <h1>Greeting page</h1>
        <p>
          {text} {name}
        </p>
      </React.Fragment>
    );
  }
}
