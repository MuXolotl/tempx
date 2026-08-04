package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lْٕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15658l extends CancellationException {
    public C15658l(long j) {
        super(AbstractC2812l.subscription(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC16814l.yandex);
        return this;
    }
}
