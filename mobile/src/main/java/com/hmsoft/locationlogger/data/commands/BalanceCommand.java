package com.hmsoft.locationlogger.data.commands;

import com.hmsoft.locationlogger.service.LocationService;

class BalanceCommand extends Command {

    static final String COMMAND_NAME = "Saldo";

    @Override
    public String getName() {
        return COMMAND_NAME;
    }

    @Override
    public void execute(String[] params) {
        LocationService.sendBalamceSms(context.androidContext);
    }
}