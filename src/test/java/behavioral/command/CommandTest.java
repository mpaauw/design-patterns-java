package behavioral.command;

import org.junit.Assert;
import org.junit.Test;

public class CommandTest {

    @Test
    public void command_GameCommandJump_AssertSetCommandInvokedCorrectly() {
        // arrange
        final CommandInvoker invoker = new CommandInvoker(new JumpCommand(new CommandReceiver()));

        // act
        final String result = invoker.invokeCommand();


        // assert
        Assert.assertEquals(result, "Jump!");
    }

    @Test
    public void command_GameCommandDodge_AssertSetCommandInvokedCorrectly() {
        // arrange
        final CommandInvoker invoker = new CommandInvoker(new DodgeCommand(new CommandReceiver()));

        // act
        final String result = invoker.invokeCommand();


        // assert
        Assert.assertEquals(result, "Dodge!");
    }

    @Test
    public void command_GameCommand_AssertSetSubsequentCommandInvokedCorrectly() {
        // arrange
        final CommandReceiver receiver = new CommandReceiver();
        final CommandInvoker invoker = new CommandInvoker(new JumpCommand(receiver));

        // act
        final String jumpResult = invoker.invokeCommand();
        invoker.setCommand(new DodgeCommand(receiver));
        final String dodgeResult = invoker.invokeCommand();

        // assert
        Assert.assertEquals(jumpResult, "Jump!");
        Assert.assertEquals(dodgeResult, "Dodge!");
    }

}
