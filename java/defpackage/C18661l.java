package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18661l extends C1852l {
    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final AbstractC18620l Signature(Function1 function1) {
        return (C6583l) ((AbstractC18620l) AbstractC9620l.purchase(new C0786l(10, new C13832l(0, function1))));
    }

    @Override // defpackage.C1852l
    public final C1852l appmetrica(Function1 function1, Function1 function2) {
        return (C1852l) ((AbstractC18620l) AbstractC9620l.purchase(new C0786l(10, new C3768l(function1, function2, 11))));
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void crashlytics() {
        synchronized (AbstractC9620l.crashlytics) {
            metrica();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void firebase() {
        AbstractC15344l.admob();
        throw null;
    }

    @Override // defpackage.C1852l
    public final AbstractC6873l pro() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void remoteconfig() {
        AbstractC9620l.yandex();
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void smaato() {
        AbstractC15344l.admob();
        throw null;
    }
}
