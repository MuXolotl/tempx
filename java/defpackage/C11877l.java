package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11877l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9817l f23696l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23697l;

    public /* synthetic */ C11877l(C9817l c9817l, int i) {
        this.f23697l = i;
        this.f23696l = c9817l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f23697l;
        C9817l c9817l = this.f23696l;
        switch (i) {
            case 0:
                synchronized (C9817l.mopub) {
                    C9817l.billing.remove(((C14025l) c9817l.purchase.getValue()).f27331l.tapsense());
                }
                return Unit.INSTANCE;
            default:
                C12242l c12242l = c9817l.amazon;
                C14025l c14025l = (C14025l) c12242l.invoke();
                if (billing.yandex(c14025l) != -1) {
                    return C6162l.adcel(c14025l.f27331l.tapsense(), true);
                }
                C10754l.subscription("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ", c12242l, ", instead got ", c14025l);
                return null;
        }
    }
}
