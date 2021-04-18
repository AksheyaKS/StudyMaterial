//import React from 'react';

import  './abc.css';
import ReactDOM from 'react-dom';

var days = [-10,-9,-8,-5,-3,0,1,2,3,4,5,6,7,10,13,15,16,20];
var React = require('react');
var createReactClass = require('create-react-class');
var Day = createReactClass({
	onMouseOver: function(elem){
		this.props.onHover(this.props.index);
	},
	render: function(){
		
		return <div className={"day " + this.props.hoverState}
							onMouseOver={this.onMouseOver} >
							<div className='my	'>
								{this.props.val}
								</div>
					 </div>;
	}
})

var Days =createReactClass({
	
	getInitialState: function() {
    return {selected: "", hover: ""};
  },
	getHoverState: function(index) {
		if(this.state.hover - 1 === index || this.state.hover + 1 === index){
			return "sibling";
		} else if(this.state.hover === index) {
			return "current";
		}
		return "";
	},
	onHover: function(index){
		this.setState({hover: index});
	},
	onMouseOut: function(){
		this.setState({hover: ""});
	},
	render: function(){
		var all_days = this.props.list.map(function(d, i){
			return <Day index={i} key={d} val={d} hoverState={this.getHoverState(i)} onHover={this.onHover} />
		}.bind(this));
		return <div onMouseOut={this.onMouseOut}> {all_days}</div>;
	}
});

/*
 * Entry point
 */

ReactDOM.render(
  <Days list={days} />,
  document.getElementById('root')
)