import React from 'react';

import ReactDOM from 'react-dom';


class ChildComponent extends React.Component {
  render() {
	return(
		<div>
			<h1>{this.props.appName}</h1>
			<img src={this.props.prod.img}/>
			<h2>{this.props.prod.prodName}</h2>
			<h2>{this.props.prod.price}</h2>
			<h2>{this.props.prod.qty}</h2>
		</div>
	);   
  }
}
export default PropEg;


