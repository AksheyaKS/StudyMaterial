const redux = require('redux')
const createStore=redux.createStore

const RENT_CYCLE = 'RENT_CYCLE'

function rentCycle( )
{
 return {
	type: RENT_CYCLE ,
	info:'First Redux Action'
          }
}

const initialState = {
  noOfCycles : 20
}

const reducer = (state = initialState, action) =>
{
	switch(action.type)
	{
	   case RENT_CYCLE : return {
	    ...state,
	   noOfCycles : state.noOfCycles -1
	    }
	    default : return state;
	}
}

const store = createStore(reducer)

console.log('Initial State', store.getState( ));

const unsubscribe = store.subscribe( ( )=> console.log('Updated State',  store.getState( )));

store.dispatch(rentCycle( ))
store.dispatch(rentCycle( ))
store.dispatch(rentCycle( ))

unsubscribe( )

