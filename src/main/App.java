package main;

import Labyrinth.RandomLabyrinth;
import commands.*;
import painter.PainterCells;
import utils.CommandLineInterractor;


public class App {
    char[][] cells;
    char[][] cellsWitnPath;
    private int height;
    private int width;
    private RandomLabyrinth lab;
    private PainterCells painterCells;
    private CommandLineInterractor cli = new CommandLineInterractor();
    private String[] commandsNames = {"Generate labyrinth","Show labyrinth in console","Find path","Show path in console",
            "Save labyrinth image on disk","Show commandsNames","Exit"};
    private Command[] Commands = {new GeneratorOfLabyrinthCommand(),new ShowLabyrinthInCMD(),
            new FindTheWayCommand(), new ShowPathInConsole(),new SaveLabyrinthInImageCommand(),new ShowCommandsCommand(),new ExitCommand()};

    public App() {
        Commands[5].execute(this);
        while (true){
            cli.printWithNewLine("Enter the number of commands");
            int in = cli.enterInt();
            if (in > 0 && in <= commandsNames.length){
                Commands[in-1].execute(this);
            }
            else {
                cli.printWithNewLine("Incorrect number of command. Please try again.");
            }
        }
    }

    public String[] getCommandsNames() {
        return commandsNames;
    }

    public Command[] getCommands() {
        return Commands;
    }

    public RandomLabyrinth getLab() {
        return lab;
    }

    public PainterCells getPainterCells() {
        return painterCells;
    }

    public void setLab(RandomLabyrinth lab) {
        this.lab = lab;
    }

    public void setPainterCells(PainterCells painterCells) {
        this.painterCells = painterCells;
    }

    public void setCommandsNames(String[] commandsNames) {
        this.commandsNames = commandsNames;
    }

    public void setCommands(Command[] Commands) {
        this.Commands = Commands;
    }

    public CommandLineInterractor getCli() {
        return cli;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setCli(CommandLineInterractor cli) {
        this.cli = cli;
    }

    public char[][] getCells() {
        return cells;
    }

    public void setCells(char[][] cells) {
        this.cells = cells;
    }

    public char[][] getCellsWitnPath() {
        return cellsWitnPath;
    }

    public void setCellsWitnPath(char[][] cellsWitnPath) {
        this.cellsWitnPath = cellsWitnPath;
    }
}
