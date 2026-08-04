package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٓۙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14390l extends AbstractC7581l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28135l = AtomicIntegerFieldUpdater.newUpdater(C14390l.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Function1 f28136l;

    public C14390l(Function1 function1) {
        this.f28136l = function1;
    }

    @Override // defpackage.AbstractC7581l
    public final void isPro(Throwable th) {
        if (f28135l.compareAndSet(this, 0, 1)) {
            this.f28136l.invoke(th);
        }
    }

    @Override // defpackage.AbstractC7581l
    public final boolean subs() {
        return true;
    }
}
