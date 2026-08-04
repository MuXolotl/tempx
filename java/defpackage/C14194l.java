package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٍٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14194l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12867l f27786l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27787l;

    public /* synthetic */ C14194l(C12867l c12867l, int i) {
        this.f27787l = i;
        this.f27786l = c12867l;
    }

    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        int i = this.f27787l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C12867l c12867l = this.f27786l;
        switch (i) {
            case 0:
                Object objYandex = c12867l.yandex(new C6332l(interfaceC9427l, 2), interfaceC14029l);
                return objYandex == enumC9342l ? objYandex : Unit.INSTANCE;
            case 1:
                Object objYandex2 = c12867l.yandex(new C6332l(interfaceC9427l, 3), interfaceC14029l);
                return objYandex2 == enumC9342l ? objYandex2 : Unit.INSTANCE;
            case 2:
                Object objYandex3 = c12867l.yandex(new C6332l(interfaceC9427l, 13), interfaceC14029l);
                return objYandex3 == enumC9342l ? objYandex3 : Unit.INSTANCE;
            case 3:
                Object objYandex4 = c12867l.yandex(new C6332l(interfaceC9427l, 15), interfaceC14029l);
                return objYandex4 == enumC9342l ? objYandex4 : Unit.INSTANCE;
            case 4:
                Object objYandex5 = c12867l.yandex(new C6332l(interfaceC9427l, 16), interfaceC14029l);
                return objYandex5 == enumC9342l ? objYandex5 : Unit.INSTANCE;
            default:
                Object objYandex6 = c12867l.yandex(new C6332l(interfaceC9427l, 23), interfaceC14029l);
                return objYandex6 == enumC9342l ? objYandex6 : Unit.INSTANCE;
        }
    }
}
