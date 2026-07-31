package org.chromium.net;

import defpackage.C8339l;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public NetworkQualityRttListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
        } else {
            C8339l.smaato("Executor must not be null");
            throw null;
        }
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i, long j, int i2);
}
