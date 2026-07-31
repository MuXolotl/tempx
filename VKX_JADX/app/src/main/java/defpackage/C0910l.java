package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lًؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0910l extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2397l f2583l;

    public C0910l(C2397l c2397l) {
        super(false);
        this.f2583l = c2397l;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f2583l.subs(new C18435l(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f2583l.subs(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
