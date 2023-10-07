package lotr;

import Kick.ElfStrategy;

public class Elf extends Character{
    public Elf(){
        super(10, 10, new ElfStrategy());
        };
    }

