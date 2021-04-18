import React from 'react';
import {Link} from  "react-router-dom";
const Avengers1Component = () => {
    return (
        <div className="jumbotron">
            <h1 className="display-3">Avengers1</h1>
            
            <Link to="/a1">click to download</Link>
        </div>
    );
}
export default Avengers1Component;