package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؔۢۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2988l implements InterfaceC14833l {
    public final C14854l loadAd;
    public final /* synthetic */ int yandex;

    public C2988l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new C14854l(35152, 2, "image/png");
                break;
            default:
                this.loadAd = new C14854l(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        int i = this.yandex;
        C14854l c14854l = this.loadAd;
        switch (i) {
            case 0:
                c14854l.amazon(j, j2);
                break;
            default:
                c14854l.amazon(j, j2);
                break;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        int i = this.yandex;
        C14854l c14854l = this.loadAd;
        switch (i) {
            case 0:
                c14854l.billing(interfaceC2053l);
                break;
            default:
                c14854l.billing(interfaceC2053l);
                break;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        int i = this.yandex;
        C14854l c14854l = this.loadAd;
        switch (i) {
            case 0:
                break;
        }
        return c14854l.crashlytics(interfaceC10430l);
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        int i = this.yandex;
        C14854l c14854l = this.loadAd;
        switch (i) {
            case 0:
                break;
        }
        return c14854l.loadAd(interfaceC10430l, c1014l);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        switch (this.yandex) {
        }
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
        int i = this.yandex;
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        int i = this.yandex;
        return this;
    }

    private final void admob() {
    }

    private final void mopub() {
    }
}
