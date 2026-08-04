package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lَٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15730l {
    public C15730l adcel;
    public final boolean admob;
    public final boolean amazon;
    public final long billing;
    public final long crashlytics;
    public final float firebase;
    public final long isPro;
    public final long loadAd;
    public boolean metrica;
    public final long mopub;
    public final float purchase;
    public final ArrayList remoteconfig;
    public final long smaato;
    public boolean startapp;
    public final int subs;
    public final long vip;
    public final long yandex;

    public C15730l(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = z;
        this.purchase = f;
        this.billing = j4;
        this.mopub = j5;
        this.admob = z2;
        this.subs = i;
        this.isPro = j6;
        this.firebase = f2;
        this.smaato = j7;
        this.vip = 0L;
        this.metrica = z3;
        this.startapp = z3;
    }

    public final boolean crashlytics() {
        C15730l c15730l = this.adcel;
        if (c15730l != null) {
            return c15730l.crashlytics();
        }
        return this.metrica || this.startapp;
    }

    public final List loadAd() {
        ArrayList arrayList = this.remoteconfig;
        return arrayList == null ? C2580l.f5619l : arrayList;
    }

    public final String toString() {
        String strMopub = AbstractC17265l.mopub(this.yandex);
        String strFirebase = C1187l.firebase(this.crashlytics);
        String strFirebase2 = C1187l.firebase(this.mopub);
        boolean zCrashlytics = crashlytics();
        String strYandex = C10829l.yandex(this.subs);
        List listLoadAd = loadAd();
        String strFirebase3 = C1187l.firebase(this.isPro);
        String strFirebase4 = C1187l.firebase(this.smaato);
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append(strMopub);
        sb.append(", uptimeMillis=");
        sb.append(this.loadAd);
        sb.append(", position=");
        sb.append(strFirebase);
        sb.append(", pressed=");
        sb.append(this.amazon);
        sb.append(", pressure=");
        sb.append(this.purchase);
        sb.append(", previousUptimeMillis=");
        sb.append(this.billing);
        sb.append(", previousPosition=");
        sb.append(strFirebase2);
        sb.append(", previousPressed=");
        sb.append(this.admob);
        sb.append(", isConsumed=");
        sb.append(zCrashlytics);
        sb.append(", type=");
        sb.append(strYandex);
        sb.append(", historical=");
        sb.append(listLoadAd);
        sb.append(", scrollDelta=");
        sb.append(strFirebase3);
        sb.append(", scaleFactor=");
        sb.append(this.firebase);
        return AbstractC9361l.ad(sb, ", panOffset=", strFirebase4, ")");
    }

    public final void yandex() {
        C15730l c15730l = this.adcel;
        if (c15730l == null) {
            this.metrica = true;
            this.startapp = true;
        } else if (c15730l != null) {
            c15730l.yandex();
        }
    }

    public C15730l(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.remoteconfig = arrayList;
        this.vip = j8;
    }
}
