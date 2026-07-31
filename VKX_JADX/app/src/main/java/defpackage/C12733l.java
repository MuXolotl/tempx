package defpackage;

import android.util.Log;

/* JADX INFO: renamed from: lّٝ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12733l implements InterfaceC9492l, InterfaceC12762l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C14517l f25100l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3897l f25101l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f25102l;

    public C12733l(long j) {
        this.f25102l = j;
        if (j <= 0) {
            C8339l.metrica("Failed requirement.");
            throw null;
        }
        C3897l c3897l = new C3897l();
        c3897l.yandex = 0L;
        this.f25101l = c3897l;
    }

    @Override // defpackage.InterfaceC12762l
    public final void loadAd() {
        this.f25101l.yandex = -1L;
        this.f25100l.f28415l.yandex = 0;
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: throw */
    public final void mo1762throw(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        long j2;
        long j3;
        C3897l c3897l = this.f25101l;
        do {
            j2 = c3897l.yandex;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!C3897l.loadAd.compareAndSet(c3897l, j2, j3));
        if (j3 == this.f25102l) {
            Log.w("CXCP", "Capture processing is now enabled for " + this.f25100l + " after " + j3 + " frames.");
            C14517l c14517l = this.f25100l;
            c14517l.f28415l.yandex = 1;
            c14517l.f28401l.m3144l(C15305l.loadAd);
        }
    }

    @Override // defpackage.InterfaceC12762l
    public final void yandex() {
        long j;
        C3897l c3897l = this.f25101l;
        do {
            j = c3897l.yandex;
        } while (!C3897l.loadAd.compareAndSet(c3897l, j, j != -1 ? 0L : -1L));
        this.f25100l.f28415l.yandex = 0;
        Log.w("CXCP", "Capture processing has been disabled for " + this.f25100l + " until " + this.f25102l + " frames have been completed.");
    }

    @Override // defpackage.InterfaceC12762l
    public final void crashlytics() {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void ads(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo1758package(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ void mo1760switch(C15390l c15390l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void vip(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void adcel(InterfaceC10687l interfaceC10687l, long j) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void signatures(InterfaceC10687l interfaceC10687l, int i) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void inmobi(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void isVip(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void mopub(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: private */
    public final /* synthetic */ void mo1759private(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: synchronized */
    public final /* synthetic */ void mo1761synchronized(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void billing(InterfaceC10687l interfaceC10687l, long j, int i, int i2) {
    }
}
