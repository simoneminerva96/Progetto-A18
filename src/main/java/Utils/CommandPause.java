package Utils;

import GameLogic.MatchFlowState;

public class CommandPause extends CommandMatch {

    public CommandPause(){

    }

    public CommandPause(String username, int gameId) {
        super(username);
        this.gameId = gameId;
    }

    @Override
    public void execute() {
        if (match.getMatchFlowState() == MatchFlowState.paused) {
            match.resumeGame(player);
        } else if (match.getMatchFlowState() == MatchFlowState.started1 || match.getMatchFlowState() == MatchFlowState.running) {
            match.pauseGame(player);
        }
    }
}
