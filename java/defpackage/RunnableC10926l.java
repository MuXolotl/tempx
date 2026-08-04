package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lٌُۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10926l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10844l f22043l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22044l;

    public /* synthetic */ RunnableC10926l(C10844l c10844l, int i) {
        this.f22044l = i;
        this.f22043l = c10844l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22044l;
        C10844l c10844l = this.f22043l;
        switch (i) {
            case 0:
                c10844l.isPro();
                break;
            default:
                C7847l c7847l = c10844l.purchase;
                if (((C9961l) c7847l.f16369l) == null) {
                    c7847l.f16369l = C9961l.amazon((Context) c7847l.f16370l);
                }
                C9961l c9961l = (C9961l) c7847l.f16369l;
                if (c9961l != null) {
                    c9961l.purchase(c10844l);
                }
                break;
        }
    }
}
