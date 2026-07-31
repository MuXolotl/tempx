package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lَُٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10273l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0848l f20914l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f20915l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f20916l;

    public RunnableC10273l(C0848l c0848l, long j, long j2) {
        Objects.requireNonNull(c0848l);
        this.f20914l = c0848l;
        this.f20916l = j;
        this.f20915l = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C17923l c17923l = ((C17417l) ((C11569l) this.f20914l.f2498l).f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC10799l(12, this));
    }
}
