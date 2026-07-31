package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lٙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18409l extends AbstractC12216l {
    public final /* synthetic */ C1062l loadAd;
    public final AbstractC12216l yandex;

    public C18409l(C1062l c1062l, AbstractC12216l abstractC12216l) {
        this.loadAd = c1062l;
        this.yandex = abstractC12216l;
    }

    @Override // defpackage.AbstractC12216l
    public final void amazon(String str) {
        this.loadAd.firebase(str);
        this.yandex.amazon(str);
    }

    @Override // defpackage.AbstractC12216l
    public final void crashlytics(String str, C15053l c15053l) {
        if (!((Status) c15053l.f29576l).billing()) {
            this.loadAd.firebase(str);
        }
        this.yandex.crashlytics(str, c15053l);
    }

    @Override // defpackage.AbstractC12216l
    public final void loadAd(String str, C3713l c3713l) {
        if (c3713l.loadAd) {
            this.loadAd.isPro(str);
        }
        this.yandex.loadAd(str, c3713l);
    }

    @Override // defpackage.AbstractC12216l
    public final void yandex(String str, C18450l c18450l) {
        this.yandex.yandex(str, c18450l);
    }
}
