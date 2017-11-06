#!/usr/bin/env bash

log()
{
    echo "[$(date +%F\ %T)] $@"
}

logn()
{
    echo -n "[$(date +%F\ %T)] $@"
}

log "+---------------------+"
log "|    savevideolink    |"
log "|        UPDATE       |"
log "+---------------------+"
log "+---------------------------------------------------------------------------------------------------+"
log "| use example (*) you must have database [savevideolink] :                                          |"
log "| ./runLiquibase_savevideolink.sh jdbc:postgresql://{{db_host}}:{{db_port}} {{db_pass}} {{db_user}} |"
log "+---------------------------------------------------------------------------------------------------+"




# fill variables. begin
DEFAULT_URL="jdbc:postgresql://localhost:5432"
DEFAULT_USR="savevideolink"

if [ _$1 == "_" ]; then # url not specified
    logn "Enter url for database (default is $DEFAULT_URL):"
    read URL
    if [ _$URL == "_" ]; then
        URL=$DEFAULT_URL;
    fi
else
    URL=$1;
fi

if [ _$2 == "_" ]; then # password not specified
    logn "Enter password for database superuser:"
    read -s EDB_PWD
else
    EDB_PWD=$2;
fi

if [ _$3 == "_" ]; then # user not specified
    logn "Enter superuser name (default is $DEFAULT_USR):"
    read EDB_USR
    if [ _$EDB_USR == "_" ]; then
        EDB_USR=$DEFAULT_USR;
    fi
else
    EDB_USR=$3;
fi

EDB_PARAMS=$4" "$5
# fill variables. end

log "Running UPDATESQL using url: $URL"

./liquibase --driver=com.mysql.jdbc.Driver --username=$EDB_USR --changeLogFile=master.xml --url="$URL/savevideolink?useUnicode=true&characterEncoding=UTF-8" --password=$EDB_PWD update $EDB_PARAMS
if [ $? -ne 0 ]
then
exit 1
fi
