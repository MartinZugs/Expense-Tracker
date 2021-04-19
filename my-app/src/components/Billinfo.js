import React, { useState } from 'react';
import './billinfo.css';
import Container from '@material-ui/core/Container';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';
import RemoveIcon from '@material-ui/icons/Remove';
import AddIcon from '@material-ui/icons/Add';
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
    },
    input2:{
        width:150,
    }
}))

function BudgetInfo() {
    const classes = useStyles()
    const [inputFields, setInputFields] = useState([
        { id: uuidv4(),  BillName: '',  Amount:'', DueDate:'' },
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
        setInputFields([...inputFields, { id: uuidv4(),  BillName: '', Amount:'', DueDate: '' }])

    }

    const handleRemoveFields = id => {
        const values  = [...inputFields];
        values.splice(values.findIndex(value => value.id === id), 1);
        setInputFields(values);
    }


    return (
        <Container className="bill-info-container">
            <h3 className="bill-name">Bill Info</h3>

            <form className={classes.root} onSubmit={handleSubmit}>

                { inputFields.map(inputField => (
                    <div key={inputField.id}>

                        <TextField
                            name="BillName"
                            label="Bill Name"
                            variant="outlined"
                            size="small"
                            InputProps={
                                {className: classes.input}
                            }
                            value={inputField.BillName}
                            onChange={event => handleChangeInput(inputField.id, event)}
                        />

                        <TextField
                            name="Amount"
                            label="Amount"
                            variant="outlined"
                            size="small"
                            InputProps={
                                {className: classes.input1}
                            }
                            value={inputField.Amount}
                            onChange={event => handleChangeInput(inputField.id, event)}
                        />

                        <TextField
                            id="date"
                            name={"DueDate"}
                            label="Due Date"
                            type="date"
                            defaultValue="2021-01-01"
                            className={classes.DueDate}
                            value={inputField.DueDate}
                            InputProps={
                                {className: classes.input2}
                            }
                            InputLabelProps={{
                                shrink: true,
                            }}
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

export default BudgetInfo;




