package com.xin.design.behaviorpattern.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: RemuteController
 * @create: 2023-09-07 11:33
 **/
public class RemuteController {
    private List<Command> onCommands = new ArrayList<>();
    private List<Command> offCommands = new ArrayList<>();

    void addOnCommand(Command command) {
        onCommands.add(command);
    }

    void addOffCommand(Command command) {
        offCommands.add(command);
    }

    void pushOnCommand(int index) {
        onCommands.get(index).excete();
    }

    void pushOffCommand(int index) {
        offCommands.get(index).excete();
    }
}
