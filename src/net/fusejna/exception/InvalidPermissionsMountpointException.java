package net.fusejna.exception;

import java.io.File;

public final class InvalidPermissionsMountpointException extends InvalidMountpointException
{
	private static final long serialVersionUID = -1641971209266080598L;
	private static final String errorString = "Mountpoint has insufficient permissions";

	public InvalidPermissionsMountpointException(final File mountpoint)
	{
		super(errorString, mountpoint);
	}
}
