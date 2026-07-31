package defpackage;

import android.util.Pair;

/* JADX INFO: renamed from: lؒؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0832l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Pair f2475l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7065l f2476l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2477l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C2040l f2478l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C13071l f2479l;

    public /* synthetic */ RunnableC0832l(C7065l c7065l, Pair pair, C13071l c13071l, C2040l c2040l, int i) {
        this.f2477l = i;
        this.f2476l = c7065l;
        this.f2475l = pair;
        this.f2479l = c13071l;
        this.f2478l = c2040l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2477l;
        C2040l c2040l = this.f2478l;
        C13071l c13071l = this.f2479l;
        Pair pair = this.f2475l;
        C7065l c7065l = this.f2476l;
        switch (i) {
            case 0:
                ((C17505l) c7065l.f14805l.subs).subscription(((Integer) pair.first).intValue(), (C5019l) pair.second, c13071l, c2040l);
                break;
            default:
                ((C17505l) c7065l.f14805l.subs).license(((Integer) pair.first).intValue(), (C5019l) pair.second, c13071l, c2040l);
                break;
        }
    }
}
