package defpackage;

import java.util.UUID;

/* JADX INFO: renamed from: lؗۤ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5269l implements InterfaceC9655l {
    public final C4684l yandex;

    public C5269l(C4684l c4684l) {
        this.yandex = c4684l;
    }

    @Override // defpackage.InterfaceC9655l
    public final C11102l admob() {
        return null;
    }

    @Override // defpackage.InterfaceC9655l
    public final boolean billing(String str) {
        return false;
    }

    @Override // defpackage.InterfaceC9655l
    public final boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC9655l
    public final UUID loadAd() {
        return AbstractC17252l.loadAd;
    }

    @Override // defpackage.InterfaceC9655l
    public final C4684l mopub() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC9655l
    public final int yandex() {
        return 1;
    }

    @Override // defpackage.InterfaceC9655l
    public final void amazon(C13281l c13281l) {
    }

    @Override // defpackage.InterfaceC9655l
    public final void purchase(C13281l c13281l) {
    }
}
