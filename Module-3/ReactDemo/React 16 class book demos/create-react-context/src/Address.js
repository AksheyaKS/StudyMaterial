import React from 'react';

import ReactDOM from 'react-dom';

import EmpContext from './index';

class PropEg extends React.Component {

  render() {
	return(
		<div>
			<EmpContext.Consumer>
		          {
			     (context) => (
				<div>
				<p>Door Number : {context.state.doorNo}</p>
				<p>City : {context.state.city}</p>
				<p>Pincode : {context.state.pincode}</p>
				</div>
			   )}
			</EmpContext.Consumer>
		</div>
	);   
  }
}
export default PropEg;


