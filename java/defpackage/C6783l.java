package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؙ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6783l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4394l f14213l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14214l;

    public /* synthetic */ C6783l(C4394l c4394l, int i) {
        this.f14214l = i;
        this.f14213l = c4394l;
    }

    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        int i = this.f14214l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C4394l c4394l = this.f14213l;
        switch (i) {
            case 0:
                Object objYandex = c4394l.yandex(new C13790l(interfaceC9427l, 1), interfaceC14029l);
                return objYandex == enumC9342l ? objYandex : Unit.INSTANCE;
            default:
                Object objYandex2 = c4394l.yandex(new C6332l(interfaceC9427l, 0), interfaceC14029l);
                return objYandex2 == enumC9342l ? objYandex2 : Unit.INSTANCE;
        }
    }
}
