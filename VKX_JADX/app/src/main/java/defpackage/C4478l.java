package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4478l implements InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f9106l;

    public C4478l(Function1 function1) {
        this.f9106l = function1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4478l) || !(obj instanceof InterfaceC9234l)) {
            return false;
        }
        return AbstractC8576l.yandex(this.f9106l, ((InterfaceC9234l) obj).loadAd());
    }

    public final int hashCode() {
        return this.f9106l.hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return this.f9106l;
    }
}
