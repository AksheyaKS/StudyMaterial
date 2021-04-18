import React from 'react';

class ChildComponent extends React.Component {
    constructor(props){
        super(props);
    }
    render() {
	let { inputVal } = this.props;
        return (
            <container>
                <input type="text" value={inputVal} readonly />
                <h2 style={{color:inputVal}}>Child Component Input Value Color is {this.props.inputVal}</h2>
            </container>
        );
    }
}
    
export default ChildComponent