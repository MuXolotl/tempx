package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ۛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18205l extends AbstractC14971l implements InterfaceC3703l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final boolean f35654l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public Function1 f35655l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f35656l;

    public C18205l(boolean z, boolean z2, Function1 function1) {
        this.f35656l = z;
        this.f35654l = z2;
        this.f35655l = function1;
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final boolean mo490catch() {
        return this.f35654l;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        this.f35655l.invoke(interfaceC17593l);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final boolean mo491l() {
        return this.f35656l;
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }
}
