package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: lٍؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2905l implements InterfaceC14833l {
    public final C14854l crashlytics;
    public final C13143l loadAd;
    public final /* synthetic */ int yandex;

    public C2905l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new C13143l(4);
                this.crashlytics = new C14854l(-1, -1, "image/webp");
                break;
            default:
                this.loadAd = new C13143l(4);
                this.crashlytics = new C14854l(-1, -1, "image/avif");
                break;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        switch (this.yandex) {
            case 0:
                this.crashlytics.amazon(j, j2);
                break;
            default:
                this.crashlytics.amazon(j, j2);
                break;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        int i = this.yandex;
        C14854l c14854l = this.crashlytics;
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
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) throws EOFException, InterruptedIOException {
        int i = this.yandex;
        C13143l c13143l = this.loadAd;
        switch (i) {
            case 0:
                C11826l c11826l = (C11826l) interfaceC10430l;
                c11826l.firebase(4, false);
                c13143l.m3563native(4);
                c11826l.billing(c13143l.yandex, 0, 4, false);
                if (c13143l.applovin() == 1718909296) {
                    c13143l.m3563native(4);
                    c11826l.billing(c13143l.yandex, 0, 4, false);
                    if (c13143l.applovin() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                c13143l.m3563native(4);
                C11826l c11826l2 = (C11826l) interfaceC10430l;
                c11826l2.billing(c13143l.yandex, 0, 4, false);
                if (c13143l.applovin() == 1380533830) {
                    c11826l2.firebase(4, false);
                    c13143l.m3563native(4);
                    c11826l2.billing(c13143l.yandex, 0, 4, false);
                    if (c13143l.applovin() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.crashlytics.loadAd(interfaceC10430l, c1014l);
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
