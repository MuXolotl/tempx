package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lَؚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7173l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC0389l f15008l;

    public C7173l(C12428l c12428l) {
        this.f15008l = c12428l;
    }

    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        Object objLoadAd = this.f15008l.loadAd(interfaceC14029l, obj);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }
}
