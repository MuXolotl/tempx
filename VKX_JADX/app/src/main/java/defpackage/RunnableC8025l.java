package defpackage;

import android.util.Pair;

/* JADX INFO: renamed from: lًٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8025l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Pair f16707l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7065l f16708l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16709l;

    public /* synthetic */ RunnableC8025l(C7065l c7065l, Pair pair, int i) {
        this.f16709l = i;
        this.f16708l = c7065l;
        this.f16707l = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16709l;
        Pair pair = this.f16707l;
        C7065l c7065l = this.f16708l;
        switch (i) {
            case 0:
                ((C17505l) c7065l.f14805l.subs).mo2164throw(((Integer) pair.first).intValue(), (C5019l) pair.second);
                break;
            default:
                ((C17505l) c7065l.f14805l.subs).isVip(((Integer) pair.first).intValue(), (C5019l) pair.second);
                break;
        }
    }
}
