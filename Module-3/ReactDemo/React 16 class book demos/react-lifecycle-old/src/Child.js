import React from 'react';

import ReactDOM from 'react-dom';


class Child extends React.Component {

render() {
		return(<span>{this.props.data}</span>);
	
	}
}
export default Child;


