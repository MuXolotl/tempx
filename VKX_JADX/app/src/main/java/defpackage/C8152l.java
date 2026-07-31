package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٟٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8152l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2768l f17032l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17033l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8152l(C2768l c2768l, int i) {
        super(2);
        this.f17033l = i;
        this.f17032l = c2768l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17033l;
        C2768l c2768l = this.f17032l;
        switch (i) {
            case 0:
                c2768l.yandex().f18731l = (AbstractC0306l) obj2;
                break;
            case 1:
                C9117l c9117lYandex = c2768l.yandex();
                ((C3654l) obj).m1400try(new C14108l(c9117lYandex, (Function2) obj2, c9117lYandex.f18730l));
                break;
            default:
                C3654l c3654l = (C3654l) obj;
                InterfaceC2702l interfaceC2702l = c2768l.yandex;
                C9117l c9117l = c3654l.f7707l;
                if (c9117l == null) {
                    c9117l = new C9117l(c3654l, interfaceC2702l);
                    c3654l.f7707l = c9117l;
                }
                c2768l.loadAd = c9117l;
                c2768l.yandex().admob();
                C9117l c9117lYandex2 = c2768l.yandex();
                if (c9117lYandex2.f18727l != interfaceC2702l) {
                    c9117lYandex2.f18727l = interfaceC2702l;
                    c9117lYandex2.isPro(false);
                    C3654l.m1371goto(c9117lYandex2.f18732l, false, 7);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
