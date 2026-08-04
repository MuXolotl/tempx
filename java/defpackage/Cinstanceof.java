package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: instanceof, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class Cinstanceof extends CancellationException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final transient Object f839l;

    public Cinstanceof(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f839l = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
