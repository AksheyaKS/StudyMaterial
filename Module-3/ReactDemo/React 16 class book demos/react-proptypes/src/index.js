import React from 'react';

import ReactDOM from 'react-dom';


import ParentComponent from './ParentComponent';



ReactDOM.render(<ParentComponent num={10}/>, document.getElementById('root'));

/*
if num is not there in parentComponent then it takes value 
given by defaultProps


ReactDOM.render(<ParentComponent num="10"/>, document.getElementById('root'));
if its  given then it takes 10 , like above scenario
in above snippet , problem is we have passed 10 as string so when it goes to expression in parentcomponent , its not adding , its concatenating ,output becomes 510, instead of 15.

but how to check the type being passed from parent to child
Employee.propTypes = {
  firstName: PropTypes.string,
  empId: PropTypes.number,
  status: PropTypes.bool,
  onDisplay: PropTypes.func,
  symbol: PropTypes.symbol,
  user: PropTypes.object,
  name: PropTypes.node
}

If isRequired is used along with any of the above propTypes,then will get warning as below

Warning: Failed prop type: The prop `num` is marked as required in `ParentComponent`, but its value is `undefined`.
    in ParentComponent (at index.js:10)

NOTE: ensure defaultProps is not defined for that element , else required wont have an impact

*/


