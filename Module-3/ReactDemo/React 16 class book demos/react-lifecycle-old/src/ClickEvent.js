import React from 'react';

import ReactDOM from 'react-dom';

import Child from './Child';
class ClickEvent extends React.Component {
	constructor(props)
	{
	super();
		this.state={
		count:props.intialValue,
		newCount:'',
		status:true,
		name:''
		}
	}
	componentWillMount()
	{
	console.log("component will mount");
	}
	componentDidMount()
	{
	console.log("component did mount");
	}
	componentWillReceiveProps(nextProps)
	{
	console.log("component will receive props",nextProps);
	}	
	shouldComponentUpdate(nextProps,nextState)
	{
	console.log("should component update",nextProps,nextState);
	if(nextState.newCount===2)
	{
	return false;//it wont execute remaining methods
	}
	return true;
	} 
	componentWillUpdate(nextProps,nextState)
	{
	console.log("component will receive props",nextProps,nextState);
	}
	componentDidUpdate(prevProps,prevState)
	{
	console.log("component did update",prevProps,prevState);
	}
componentWillUnMount()
	{
	 this.componentCleanup();
        window.removeEventListener('beforeunload', this.componentCleanup);
	console.log("component will un mount");
	}
	increase()
	{
	this.setState({
		newCount:this.state.count++
		});
		//console.log(newCount);
	}
	decrease()
	{
	this.setState({
		newCount:this.state.count--
		});

	}
	mounted()
	{
	this.setState({
		status:!this.state.status
		});
	}
  render() {
		var data="";
		if(this.state.status){	
			data=<Child data='hi'/>;
		}
	return(
	<div>
		<div>
			<h1>{data}</h1>
		</div>
		<div>
			<h1>{this.state.newCount}</h1>
		
	<button type="submit" 
		onClick={this.increase.bind(this)}>Increase</button>
	<button type="submit" 
		onClick={this.decrease.bind(this)}>Decrease</button>
<button type="submit" 
		onClick={this.mounted.bind(this)}>unMount or Mount </button>
		</div></div>
	);   
  }
}
export default ClickEvent;
