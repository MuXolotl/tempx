package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lٕؐؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15355l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f30023l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30024l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30025l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f30026l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ String f30027l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f30028l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f30029l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C11675l f30030l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ boolean f30031l;

    public RunnableC15355l(C11675l c11675l, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f30027l = str;
        this.f30026l = str2;
        this.f30023l = j;
        this.f30029l = j2;
        this.f30028l = bundle;
        this.f30031l = z;
        this.f30024l = z2;
        this.f30025l = z3;
        this.f30030l = c11675l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30030l.m3198l(this.f30027l, this.f30026l, this.f30023l, this.f30029l, this.f30028l, this.f30031l, this.f30024l, this.f30025l);
    }
}
