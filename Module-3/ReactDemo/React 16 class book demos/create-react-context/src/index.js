import React from 'react';

import ReactDOM from 'react-dom';


import Company from './Company';


const EmpContext = React.createContext();
export default EmpContext ;

ReactDOM.render(<Company />
	, document.getElementById('root'));



/*task : iterate by passing json data as products - iterate using foreach*/