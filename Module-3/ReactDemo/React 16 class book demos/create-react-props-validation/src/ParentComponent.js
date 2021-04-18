import React from 'react';

import ReactDOM from 'react-dom';

import PropTypes from 'prop-types'
const ParentComponent1=(props)=>{
	const{num1,num2}=props;
	return <p> ans {num1+num2}</p>
}
class ParentComponent extends React.Component {
static getValue(key) {
    return key+89
  }
  render() {
		console.log(this.props);
	return(
		<h1> 
		{ParentComponent.getValue(90)}
answer is {this.props.num1+this.props.num2}
		</h1>
	);   
  }
}
ParentComponent.propTypes={
	//num: PropTypes.number
//	num: PropTypes.string
	num1: PropTypes.any.isRequired,
	num2: PropTypes.any.isRequired
//	num: PropTypes.bool -error
}
/*ParentComponent.defaultProps={
	num:20
}
*/
export default ParentComponent;


