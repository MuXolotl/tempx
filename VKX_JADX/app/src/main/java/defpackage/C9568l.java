package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍٔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9568l {
    public final C2197l adcel;
    public final int admob;
    public final C13698l ads;
    public final C12507l amazon;
    public final boolean billing;
    public final C11862l crashlytics;
    public final int firebase;
    public final int isPro;
    public final C16761l loadAd;
    public final List metrica;
    public final C17385l mopub;
    public final long purchase;
    public final InterfaceC2262l remoteconfig;
    public final int smaato;
    public final InterfaceC3685l startapp;
    public final long subs;
    public final int subscription;
    public final boolean vip;
    public final C7583l yandex;

    public C9568l(C7583l c7583l, C16761l c16761l, C11862l c11862l, C12507l c12507l, long j, boolean z, C17385l c17385l, int i, long j2, int i2, int i3, int i4, InterfaceC2262l interfaceC2262l, boolean z2, List list, InterfaceC3685l interfaceC3685l) {
        this.yandex = c7583l;
        this.loadAd = c16761l;
        this.crashlytics = c11862l;
        this.amazon = c12507l;
        this.purchase = j;
        this.billing = z;
        this.mopub = c17385l;
        this.admob = i;
        this.subs = j2;
        this.isPro = i2;
        this.firebase = i3;
        this.smaato = i4;
        this.remoteconfig = interfaceC2262l;
        this.vip = z2;
        this.metrica = list;
        this.startapp = interfaceC3685l;
        this.adcel = new C2197l(this, z, c11862l, c17385l, c12507l);
        this.ads = c7583l.purchase;
        this.subscription = c12507l.f24646l.length;
    }

    public final long yandex(C11862l c11862l, int i, int i2) {
        boolean zInmobi = c11862l.loadAd.amazon.inmobi(i);
        int i3 = zInmobi ? this.subscription : 1;
        if (zInmobi) {
            i2 = 0;
        }
        return (((long) i2) << 32) | (((long) (i3 + i2)) & 4294967295L);
    }
}
