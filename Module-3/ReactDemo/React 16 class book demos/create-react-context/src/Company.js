import React from 'react';

import ReactDOM from 'react-dom';

import Employee from './Employee';
import EmpContext from './index';

class Company extends React.Component {
    state = {
    doorNo: 21,
    city: 'chennai',
    pincode: 600044
  }
  render() {
	return( 
	<EmpContext.Provider value={{
        state: this.state}}>

		<Employee/>
	</EmpContext.Provider>
	);   
  }
}
export default Company;


