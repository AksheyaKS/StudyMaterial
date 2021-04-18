import React from 'react';

import ReactDOM from 'react-dom';

import PropTypes from 'prop-types'

class ParentComponent extends React.Component {
  render() {
		console.log(this.props);
	return(
		<h1>
			your favourite number is :  {this.props.num+5}
		</h1>
	);   
  }
}
ParentComponent.propTypes={
	//num: PropTypes.number
//	num: PropTypes.string
	num: PropTypes.any.isRequired
//	num: PropTypes.bool -error
}
/*ParentComponent.defaultProps={
	num:20
}
*/
export default ParentComponent;


