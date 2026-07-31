package defpackage;

import android.util.Pair;

/* JADX INFO: renamed from: lۣؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5241l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Pair f11316l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7065l f11317l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11318l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C2040l f11319l;

    public /* synthetic */ RunnableC5241l(C7065l c7065l, Pair pair, C2040l c2040l, int i) {
        this.f11318l = i;
        this.f11317l = c7065l;
        this.f11316l = pair;
        this.f11319l = c2040l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11318l;
        C2040l c2040l = this.f11319l;
        Pair pair = this.f11316l;
        C7065l c7065l = this.f11317l;
        switch (i) {
            case 0:
                C17505l c17505l = (C17505l) c7065l.f14805l.subs;
                int iIntValue = ((Integer) pair.first).intValue();
                C5019l c5019l = (C5019l) pair.second;
                c5019l.getClass();
                c17505l.crashlytics(iIntValue, c5019l, c2040l);
                break;
            default:
                ((C17505l) c7065l.f14805l.subs).loadAd(((Integer) pair.first).intValue(), (C5019l) pair.second, c2040l);
                break;
        }
    }
}
