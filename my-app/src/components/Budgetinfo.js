import React, { useState } from 'react';
import Container from '@material-ui/core/Container';
import TextField from '@material-ui/core/TextField';

import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';
import RemoveIcon from '@material-ui/icons/Remove';
import AddIcon from '@material-ui/icons/Add';
import Icon from '@material-ui/core/Icon';
import { v4 as uuidv4 } from 'uuid';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles((theme) => ({
    root: {
        '& .MuiTextField-root': {
            margin: theme.spacing(1),
        },
    },
    button: {
        margin: theme.spacing(1),
    },

    input:{
        width:150,
    },
    input1:{
        width:100,
    }
}))

function App() {
    const classes = useStyles()
    const [inputFields, setInputFields] = useState([
        { id: uuidv4(),  Month:'', Name: '', Budget: '', Expense:'' },
    ]);


    const handleSubmit = (e) => {
        e.preventDefault();
        console.log("InputFields", inputFields);
    };

    const handleChangeInput = (id, event) => {
        const newInputFields = inputFields.map(i => {
            if (id === i.id) {
                i[event.target.name] = event.target.value
            }
            return i;
        })
        setInputFields(newInputFields);
    }
    const handleAddFields = () => {
        setInputFields([...inputFields, { id: uuidv4(),  Month:'',Name: '', Budget: '', Expense:'' }])

    }

    const handleRemoveFields = id => {
        const values  = [...inputFields];
        values.splice(values.findIndex(value => value.id === id), 1);
        setInputFields(values);
    }

    return (
        <Container>
            <h1>Budget Info</h1>
            <form className={classes.root} onSubmit={handleSubmit}>

                { inputFields.map(inputField => (
                    <div key={inputField.id}>
                        <TextField
                            name="Month"
                            label="Month"
                            variant="outlined"
                            size="small"
                            InputProps={
                                {className: classes.input1}
                            }
                            value={inputField.Month}
                            onChange={event => handleChangeInput(inputField.id, event)}
                        />

                        <TextField
                            name="Name"
                            label="Name"
                            variant="outlined"
                            size="small"
                            InputProps={
                                {className: classes.input}
                            }
                            value={inputField.Name}
                            onChange={event => handleChangeInput(inputField.id, event)}
                        />
                        <TextField
                            name="Budget"
                            label="Budget"
                            variant="outlined"
                            //filled
                            size="small"
                            InputProps={
                                {className: classes.input1}
                            }
                            value={inputField.Budget}
                            onChange={event => handleChangeInput(inputField.id, event)}
                        />
                        <TextField
                            name="Expense"
                            label="Expense"
                            variant="outlined"
                            size="small"
                            type="number"
                            InputProps={
                                {className: classes.input1}
                            }
                            value={inputField.Expense}
                            onChange={event => handleChangeInput(inputField.id, event)}
                        />
                        <IconButton disabled={inputFields.length === 1} onClick={() => handleRemoveFields(inputField.id)}>
                            <RemoveIcon />
                        </IconButton>

                        <IconButton
                            onClick={handleAddFields}
                        >
                            <AddIcon />
                        </IconButton>
                    </div>
                )) }
                <Button
                    className={classes.button}
                    variant="outlined"
                    //contained
                    color="primary"
                    type="submit"

                    onClick={handleSubmit}
                >Send</Button>
            </form>
        </Container>
    );
}

export default App;




