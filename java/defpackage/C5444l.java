package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5444l extends AbstractC14971l implements InterfaceC10653l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public EnumC11822l f11671l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Function1 f11672l;

    @Override // defpackage.InterfaceC10653l
    /* JADX INFO: renamed from: native */
    public final void mo1231native(EnumC11822l enumC11822l) {
        if (AbstractC8576l.yandex(this.f11671l, enumC11822l)) {
            return;
        }
        this.f11671l = enumC11822l;
        this.f11672l.invoke(enumC11822l);
    }
}
