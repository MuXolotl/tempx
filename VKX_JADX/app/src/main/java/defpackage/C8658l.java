package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌٌؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8658l implements InterfaceC7316l, InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f17838l;

    public C8658l(Function0 function0) {
        this.f17838l = function0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC7316l) || !(obj instanceof InterfaceC9234l)) {
            return false;
        }
        return AbstractC8576l.yandex(this.f17838l, ((InterfaceC9234l) obj).loadAd());
    }

    public final int hashCode() {
        return this.f17838l.hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return this.f17838l;
    }

    @Override // defpackage.InterfaceC7316l
    public final /* synthetic */ long yandex() {
        return ((C1187l) this.f17838l.invoke()).yandex;
    }
}
