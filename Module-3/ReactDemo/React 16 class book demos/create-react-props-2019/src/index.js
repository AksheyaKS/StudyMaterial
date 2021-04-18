import React from 'react';

import ReactDOM from 'react-dom';


import PropEg from './PropEg';
import imag from './dot.png';

var product1={prodName:"Echo Dot", price:"3500", qty:"6",img:imag};

ReactDOM.render(<PropEg appName="Shopping cart!!!" prod={product1}/>
	, document.getElementById('root'));



/*task : iterate by passing json data as products - iterate using foreach*/