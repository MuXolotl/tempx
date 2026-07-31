package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٖٛ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16490l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f32228l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32229l;

    public /* synthetic */ C16490l(C12217l c12217l, int i) {
        this.f32229l = i;
        this.f32228l = c12217l;
    }

    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        C7504l c7504l;
        int i = this.f32229l;
        C12217l c12217l = this.f32228l;
        switch (i) {
            case 0:
                c12217l.license(false);
                c12217l.pro(EnumC6775l.f14201l);
                break;
            default:
                if (((C8896l) obj) == null) {
                    C4451l c4451l = c12217l.purchase.yandex;
                    if (c4451l != null && (c7504l = c4451l.f9058l) != null) {
                        c7504l.ads(null);
                        c4451l.f9058l = null;
                    }
                } else {
                    c12217l.purchase.yandex();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
