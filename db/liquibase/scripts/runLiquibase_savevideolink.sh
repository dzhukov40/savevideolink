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
log "+------------------------------------------------------------------------------------------------------------------+"
log "| use example (*) you must have database [savevideolink] and user [savevideolink] :                                |"
log "| ./runLiquibase_savevideolink.sh jdbc:postgresql://{{db_host}}:{{db_port}} {{db_pass}} {{db_user}} {{command}}    |"
log "| ./runLiquibase_savevideolink.sh jdbc:postgresql://192.168.56.10:5432 savevideolink savevideolink update          |"
log "| ./runLiquibase_savevideolink.sh jdbc:postgresql://192.168.56.10:5432 savevideolink savevideolink rollbackCount 1 |"
log "+------------------------------------------------------------------------------------------------------------------+"




# fill variables. begin
DEFAULT_URL="jdbc:postgresql://localhost:5432"
DEFAULT_USR="savevideolink"
DEFAULT_CLASSPATH="../jdbcDriver/postgresql-42.1.4.jar"
DEFAULT_CHANGELOGFILE="../changeSets/master.xml"
DEFAULT_COMMAND="update"

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

if [ _$4 == "_" ]; then # set command
    logn "Enter ro name (default is $DEFAULT_COMMAND):"
    read EDB_COMMAND
    if [ _$EDB_COMMAND == "_" ]; then
        EDB_COMMAND=$DEFAULT_COMMAND;
    fi
else
    EDB_COMMAND=$4;
fi


EDB_PARAMS=$5" "$6
# fill variables. end

log "Running UPDATESQL using url: $URL"
log "RUN: [ ../unPackegLiquibase/liquibase --driver=org.postgresql.Driver --username=$EDB_USR --changeLogFile=$DEFAULT_CHANGELOGFILE --url=\"$URL/savevideolink?useUnicode=true&characterEncoding=UTF-8\" --password=$EDB_PWD --classpath=$DEFAULT_CLASSPATH $EDB_COMMAND $EDB_PARAMS ]"
../unPackegLiquibase/liquibase --driver=org.postgresql.Driver --username=$EDB_USR --changeLogFile=$DEFAULT_CHANGELOGFILE --url="$URL/savevideolink?useUnicode=true&characterEncoding=UTF-8" --password=$EDB_PWD --classpath=$DEFAULT_CLASSPATH $EDB_COMMAND $EDB_PARAMS
if [ $? -ne 0 ]
then
exit 1
fi
