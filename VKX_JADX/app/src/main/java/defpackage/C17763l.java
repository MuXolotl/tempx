package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lً٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17763l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7276l f34592l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34593l;

    public /* synthetic */ C17763l(C7276l c7276l, int i) {
        this.f34593l = i;
        this.f34592l = c7276l;
    }

    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        int i = this.f34593l;
        C7276l c7276l = this.f34592l;
        switch (i) {
            case 0:
                AbstractC10252l abstractC10252l = (AbstractC10252l) obj;
                C7931l c7931l = c7276l.crashlytics;
                if (abstractC10252l instanceof C17481l) {
                    if (!((C17481l) abstractC10252l).yandex.equals(c7931l.yandex)) {
                        C8339l.smaato("Check failed.");
                        return null;
                    }
                    C7276l.yandex(c7276l, abstractC10252l);
                } else if (abstractC10252l instanceof C12163l) {
                    if (!AbstractC8576l.yandex(((C12163l) abstractC10252l).yandex, c7931l.yandex)) {
                        C8339l.smaato("Check failed.");
                        return null;
                    }
                    C7276l.yandex(c7276l, abstractC10252l);
                }
                return Unit.INSTANCE;
            default:
                C7276l.yandex(c7276l, C16495l.yandex);
                return Unit.INSTANCE;
        }
    }
}
