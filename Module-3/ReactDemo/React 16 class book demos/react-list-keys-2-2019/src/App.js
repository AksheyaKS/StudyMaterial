import React from 'react';

export default function Fruits(props) {
//  const listItems = myList.map((item,index) =>   
//     <li key={index}>
  const listItems = myList.map((item )=>
    <li key={item.id}> //auto generated value
       {item.value}
     </li>
  );
  return (
    <ul>{listItems}</ul>
  );
}

const myList = [{id: 'a', value: 'apple'},
                {id: 'b', value: 'orange'}, 
                {id: 'c', value: 'strawberry'},
                {id: 'd', value: 'blueberry'}, 
                {id: 'e', value: 'avocado'}];


/*
const todoItems = todos.map((todo, index) =>
  // Only do this if items have no stable IDs
  <li key={index}>
    {todo.text}
  </li>
);
*/