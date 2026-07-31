package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* JADX INFO: renamed from: lْٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13381l {
    public static final C0376l mopub;
    public final int amazon;
    public final Cfor billing;
    public final int crashlytics;
    public final int loadAd;
    public final int purchase;
    public final int yandex;

    static {
        Cfor cfor = InterfaceC8134l.yandex;
        C13381l c13381l = new C13381l(1, 32, 1, 265, 7, cfor);
        C13381l c13381l2 = new C13381l(2, 32, 2, 133, 6, cfor);
        C13381l c13381l3 = new C13381l(3, 32, 4, 67, 4, cfor);
        C13381l c13381l4 = new C13381l(4, 32, 8, 34, 0, cfor);
        C13381l c13381l5 = new C13381l(5, 24, 1, 200, 8, cfor);
        C13381l c13381l6 = new C13381l(6, 24, 2, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6, cfor);
        C13381l c13381l7 = new C13381l(7, 24, 4, 51, 4, cfor);
        C13381l c13381l8 = new C13381l(8, 24, 8, 26, 0, cfor);
        Cfor cfor2 = InterfaceC8134l.adcel;
        C13381l c13381l9 = new C13381l(9, 32, 1, 265, 7, cfor2);
        C13381l c13381l10 = new C13381l(10, 32, 2, 133, 6, cfor2);
        C13381l c13381l11 = new C13381l(11, 32, 4, 67, 4, cfor2);
        C13381l c13381l12 = new C13381l(12, 32, 8, 34, 0, cfor2);
        C13381l c13381l13 = new C13381l(13, 24, 1, 200, 8, cfor2);
        C13381l c13381l14 = new C13381l(14, 24, 2, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6, cfor2);
        C13381l c13381l15 = new C13381l(15, 24, 4, 51, 4, cfor2);
        C13381l c13381l16 = new C13381l(16, 24, 8, 26, 0, cfor2);
        C0376l c0376l = new C0376l();
        c0376l.put(1, c13381l);
        c0376l.put(2, c13381l2);
        c0376l.put(3, c13381l3);
        c0376l.put(4, c13381l4);
        c0376l.put(5, c13381l5);
        c0376l.put(6, c13381l6);
        c0376l.put(7, c13381l7);
        c0376l.put(8, c13381l8);
        c0376l.put(9, c13381l9);
        c0376l.put(10, c13381l10);
        c0376l.put(11, c13381l11);
        c0376l.put(12, c13381l12);
        c0376l.put(13, c13381l13);
        c0376l.put(14, c13381l14);
        c0376l.put(15, c13381l15);
        c0376l.put(16, c13381l16);
        mopub = c0376l;
    }

    public C13381l(int i, int i2, int i3, int i4, int i5, Cfor cfor) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        this.purchase = i5;
        this.billing = cfor;
    }
}
