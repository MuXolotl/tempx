package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍِۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9495l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4240l f19377l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19378l;

    public /* synthetic */ C9495l(C4240l c4240l, int i) {
        this.f19378l = i;
        this.f19377l = c4240l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19378l;
        int i2 = 1;
        EnumC6775l enumC6775l = EnumC6775l.f14199l;
        int i3 = 0;
        InterfaceC14029l interfaceC14029l = null;
        C4240l c4240l = this.f19377l;
        switch (i) {
            case 0:
                AbstractC10999l.mopub(c4240l.m3914l(), null, 0, new C5169l(c4240l, interfaceC14029l, i2), 3);
                return Boolean.TRUE;
            case 1:
                c4240l.f8690l = (InterfaceC2229l) AbstractC13402l.loadAd(c4240l, AbstractC4751l.Signature);
                c4240l.f8681l.subs = c4240l.m1511l();
                if (c4240l.m1511l() && c4240l.f8672l == null) {
                    c4240l.f8672l = AbstractC10999l.mopub(c4240l.m3914l(), null, 0, new C5169l(c4240l, interfaceC14029l, 4), 3);
                } else if (!c4240l.m1511l()) {
                    C7504l c7504l = c4240l.f8672l;
                    if (c7504l != null) {
                        c7504l.ads(null);
                    }
                    c4240l.f8672l = null;
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC5573l.firebase(c4240l);
                return Unit.INSTANCE;
            case 3:
                AbstractC5573l.firebase(c4240l);
                return Unit.INSTANCE;
            case 4:
                AbstractC5632l.yandex(c4240l);
                return null;
            case 5:
                AbstractC5632l.yandex(c4240l);
                return AbstractC16934l.yandex;
            case 6:
                AbstractC10999l.mopub(c4240l.m3914l(), null, 0, new C5169l(c4240l, interfaceC14029l, 2), 3);
                return Boolean.TRUE;
            case 7:
                return c4240l.f8682l.yandex.loadAd().f12057l.toString();
            case 8:
                if (c4240l.m1511l()) {
                    ((C4666l) c4240l.m1509l()).loadAd();
                } else {
                    C12044l c12044l = c4240l.f8684l;
                    if (c12044l.f29462l) {
                        c12044l.f23965l.m2026l(7);
                    }
                }
                return Boolean.TRUE;
            case 9:
                if (!c4240l.m1511l()) {
                    C12044l c12044l2 = c4240l.f8684l;
                    if (c12044l2.f29462l) {
                        c12044l2.f23965l.m2026l(7);
                    }
                }
                c4240l.f8681l.pro(enumC6775l);
                return Boolean.TRUE;
            case 10:
                AbstractC10999l.mopub(c4240l.m3914l(), null, 0, new C5169l(c4240l, interfaceC14029l, i3), 3);
                return Boolean.TRUE;
            case 11:
                if (c4240l.f8689l != null) {
                    ((C4666l) c4240l.m1509l()).loadAd();
                } else {
                    c4240l.m1510l(true);
                }
                return Unit.INSTANCE;
            default:
                c4240l.f8681l.pro(enumC6775l);
                return Unit.INSTANCE;
        }
    }
}
