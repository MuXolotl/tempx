package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1018l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7317l f2844l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2845l;

    public /* synthetic */ C1018l(AbstractC7317l abstractC7317l, int i) {
        this.f2845l = i;
        this.f2844l = abstractC7317l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f2845l;
        AbstractC7317l abstractC7317l = this.f2844l;
        switch (i) {
            case 0:
                int size = abstractC7317l.crashlytics.size();
                C6142l c6142l = new C6142l();
                c6142l.yandex = size;
                c6142l.loadAd = 0;
                return c6142l;
            default:
                C15478l.purchase.yandex(new C0590l(abstractC7317l), true);
                return Unit.INSTANCE;
        }
    }
}
