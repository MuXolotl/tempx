package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10643l implements InterfaceC6477l, InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f21601l;

    public C10643l(Function0 function0) {
        this.f21601l = function0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC6477l) || !(obj instanceof InterfaceC9234l)) {
            return false;
        }
        return AbstractC8576l.yandex(this.f21601l, ((InterfaceC9234l) obj).loadAd());
    }

    public final int hashCode() {
        return this.f21601l.hashCode();
    }

    @Override // defpackage.InterfaceC6477l
    public final /* synthetic */ float invoke() {
        return ((Number) this.f21601l.invoke()).floatValue();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return this.f21601l;
    }
}
