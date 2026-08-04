package defpackage;

import android.util.SparseArray;

/* JADX INFO: renamed from: lَّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12666l {
    public long adcel;
    public int admob;
    public boolean ads;
    public final C7200l billing;
    public final boolean crashlytics;
    public long isPro;
    public final boolean loadAd;
    public byte[] mopub;
    public long smaato;
    public long startapp;
    public int subs;
    public boolean subscription;
    public final InterfaceC8979l yandex;
    public final SparseArray amazon = new SparseArray();
    public final SparseArray purchase = new SparseArray();
    public C13715l remoteconfig = new C13715l();
    public C13715l vip = new C13715l();
    public boolean firebase = false;
    public boolean metrica = false;

    public C12666l(InterfaceC8979l interfaceC8979l, boolean z, boolean z2) {
        this.yandex = interfaceC8979l;
        this.loadAd = z;
        this.crashlytics = z2;
        byte[] bArr = new byte[128];
        this.mopub = bArr;
        this.billing = new C7200l(bArr, 0, 0);
        C13715l c13715l = this.vip;
        c13715l.loadAd = false;
        c13715l.yandex = false;
    }
}
