import React from 'react';
import {Link} from  "react-router-dom";
const Infinity = () => {
    return (
        <div className="jumbotron">
            <h1 className="display-3">Infinity War</h1>
            
            <Link to="/iwar">click to download</Link>
        </div>
    );
}
export default Infinity;