package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؔٙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2706l implements InterfaceC14833l {
    public final boolean loadAd;
    public final InterfaceC14833l yandex;

    public C2706l(int i) {
        boolean z = (i & 1) != 0;
        this.loadAd = z;
        if (z) {
            this.yandex = new C14854l(-1, -1, "image/heif");
        } else {
            this.yandex = new C7395l();
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.yandex.amazon(j, j2);
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.yandex.billing(interfaceC2053l);
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        return this.loadAd ? AbstractC17828l.amazon((C11826l) interfaceC10430l, false) : this.yandex.crashlytics(interfaceC10430l);
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        return this.yandex.loadAd(interfaceC10430l, c1014l);
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
        this.yandex.release();
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
