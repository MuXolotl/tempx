package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: lٍٝۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9712l extends AbstractC5813l {
    public static final C9712l loadAd = new C9712l(C2992l.yandex);
    public final AtomicReference yandex;

    public C9712l(AbstractC5813l abstractC5813l) {
        this.yandex = new AtomicReference(abstractC5813l);
    }

    @Override // defpackage.AbstractC5813l
    public final AbstractC1068l crashlytics() {
        return ((AbstractC5813l) this.yandex.get()).crashlytics();
    }

    @Override // defpackage.AbstractC5813l
    public final C13059l loadAd() {
        return ((AbstractC5813l) this.yandex.get()).loadAd();
    }

    @Override // defpackage.AbstractC5813l
    public final void yandex(String str, Level level, boolean z) {
        ((AbstractC5813l) this.yandex.get()).yandex(str, level, z);
    }
}
