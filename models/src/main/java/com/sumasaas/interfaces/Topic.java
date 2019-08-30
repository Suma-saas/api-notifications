package com.sumasaas.interfaces;

import java.io.Serializable;

public interface Topic<T extends Serializable> {
    boolean sendNotification(T value);
}
