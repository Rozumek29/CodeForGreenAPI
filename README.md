# Documentation
    host = https://cfpapi.herokuapp.com/
### $host/api/getallplants
    METHOD GET
    Returns all plants in database in Json format.
### $host/api/addPlant
    METHOD POST
    Require login, password and minimum role "REDACTOR".
    Allows you to add plant to databse.
    Returns boolean.
### $host/api/getPlantById
    METHOD GET
    Require id param.
    Returns plant under the given id.
### $host/api/removePlantById
    METHOD DELETE
    Require id param.
    Returns boolean.