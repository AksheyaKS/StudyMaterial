import React from 'react';
import {Link} from  "react-router-dom";
const EndGame = () => {
    return (
        <div className="jumbotron">
            <h1 className="display-3">End game</h1>
            
            <Link to="/end">click to download</Link>
        </div>
    );
}
export default EndGame;