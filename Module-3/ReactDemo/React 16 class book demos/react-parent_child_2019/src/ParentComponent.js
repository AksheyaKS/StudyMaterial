import React from 'react';
import ChildComponent from './ChildComponent';

class ParentComponent extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            status: "false"
        };
		this.onChangeStatus = this.onChangeStatus.bind(this);
    }
	onChangeStatus(e) {
        var newColor = e.target.value;
        var newState;
        newState = this.state.status === "true" ? "false" : "true";
        this.setState({status:newState});
    }
    render() {
        return (
            <container-wrapper>
                <ChildComponent inputVal={this.state.status} />
				Enter your color name <input type="text" value={this.state.status} onChange={(e) => this.onChangeStatus(e)}/> 
                <h5>We have set input value is {this.state.status} inside Parent Component</h5>
            </container-wrapper>
        );
    }
}

export default ParentComponent;