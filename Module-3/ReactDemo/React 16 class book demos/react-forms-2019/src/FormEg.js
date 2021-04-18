import React from 'react';

import ReactDOM from 'react-dom';


class FormEg extends React.Component {
	constructor()
	{
		super();
		this.state={
		value:'default value'
		}
	}
	handleInputChange=(event)=>{
	console.log('evt',event.target.value);
		this.setState({
			value: event.target.value
		});
	}
  render() {
	return(
		<div>
	//with only input tag and value having staste will not chnage data in state
		// it wont even chnage in UI, coz, value='' in state
			<input value={this.state.value} onChange={this.handleInputChange}/> 
		</div>
	);   
  }
}
export default FormEg;


