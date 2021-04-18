//var React = require('react');
//import React from 'react';

//import ReactDOM from 'react-dom';

var ReactDOM = require('react-dom');
var React = require('react');
//var gulp = require('gulp');
//var React = require('gulp-react');

var createReactClass = require('create-react-class');
var App = createReactClass({
    render:function(){
        return (<h1>React with Gulp</h1>)
    }
});
  
//export default App;      
module.exports=App;