package com.alan.uochatapp;

import androidx.annotation.NonNull;

public abstract class OnCompleteListener<T> {
    public abstract void onComplete(@NonNull Task<AuthResult> task);
}
