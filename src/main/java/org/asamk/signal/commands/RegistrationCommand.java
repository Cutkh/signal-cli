package org.asamk.signal.commands;

import net.sourceforge.argparse4j.inf.Namespace;

import org.asamk.signal.manager.RegistrationManager;

public interface RegistrationCommand extends Command {

    int handleCommand(Namespace ns, RegistrationManager m);
}
