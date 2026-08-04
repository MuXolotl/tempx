package defpackage;

import java.io.InputStream;

/* JADX INFO: renamed from: lْؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4935l extends AbstractC16869l {
    public final /* synthetic */ Object amazon;
    public final C5254l crashlytics;
    public final Long loadAd;
    public final /* synthetic */ int yandex = 1;

    public C4935l(AbstractC12074l abstractC12074l, C5254l c5254l, Object obj) {
        this.amazon = obj;
        String strM217l = ((C6806l) abstractC12074l.f24000l).crashlytics.m217l("Content-Length");
        this.loadAd = strM217l != null ? Long.valueOf(Long.parseLong(strM217l)) : null;
        if (c5254l == null) {
            C5254l c5254l2 = AbstractC14192l.yandex;
            c5254l = AbstractC14192l.loadAd;
        }
        this.crashlytics = c5254l;
    }

    @Override // defpackage.AbstractC8870l
    public final C5254l loadAd() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC16869l
    public final InterfaceC9354l purchase() {
        int i = this.yandex;
        Object obj = this.amazon;
        switch (i) {
            case 0:
                return (InterfaceC9354l) obj;
            default:
                return AbstractC6745l.isPro((InputStream) obj);
        }
    }

    @Override // defpackage.AbstractC8870l
    public final Long yandex() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd;
    }

    public C4935l(C6806l c6806l, C5254l c5254l, Object obj) {
        this.amazon = obj;
        String strM217l = c6806l.crashlytics.m217l("Content-Length");
        this.loadAd = strM217l != null ? Long.valueOf(Long.parseLong(strM217l)) : null;
        if (c5254l == null) {
            C5254l c5254l2 = AbstractC14192l.yandex;
            c5254l = AbstractC14192l.loadAd;
        }
        this.crashlytics = c5254l;
    }
}
