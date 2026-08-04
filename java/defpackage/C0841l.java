package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؒؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0841l extends AbstractC5921l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC5921l f2487l;

    public C0841l(AbstractC5921l abstractC5921l) {
        this.f2487l = abstractC5921l;
    }

    @Override // defpackage.AbstractC5921l
    public final void adcel(C14025l c14025l, boolean z) {
        this.f2487l.adcel(c14025l, z);
    }

    @Override // defpackage.AbstractC5921l
    public final void billing(C14025l c14025l, C14025l c14025l2) {
        this.f2487l.billing(c14025l, c14025l2);
    }

    @Override // defpackage.AbstractC5921l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2487l.close();
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final InterfaceC10506l mo691continue(C14025l c14025l, boolean z) {
        C14025l c14025lCrashlytics = c14025l.crashlytics();
        if (c14025lCrashlytics != null) {
            mopub(c14025lCrashlytics);
        }
        return this.f2487l.mo691continue(c14025l, z);
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final InterfaceC14991l mo692default(C14025l c14025l) {
        return this.f2487l.mo692default(c14025l);
    }

    @Override // defpackage.AbstractC5921l
    public final List inmobi(C14025l c14025l) {
        List listInmobi = this.f2487l.inmobi(c14025l);
        if (listInmobi == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listInmobi.iterator();
        while (it.hasNext()) {
            arrayList.add((C14025l) it.next());
        }
        AbstractC3826l.tapsense(arrayList);
        return arrayList;
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final InterfaceC11075l mo693package(C14025l c14025l) {
        return new C11100l(this.f2487l.mo693package(c14025l), new C17049l(this));
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C18402l mo694private(C14025l c14025l) {
        C18402l c18402lMo694private = this.f2487l.mo694private(c14025l);
        if (c18402lMo694private == null) {
            return null;
        }
        C14025l c14025l2 = c18402lMo694private.crashlytics;
        return c14025l2 == null ? c18402lMo694private : new C18402l(c18402lMo694private.yandex, c18402lMo694private.loadAd, c14025l2, c18402lMo694private.amazon, c18402lMo694private.purchase, c18402lMo694private.billing, c18402lMo694private.mopub, c18402lMo694private.admob);
    }

    @Override // defpackage.AbstractC5921l
    public final List signatures(C14025l c14025l) {
        List listSignatures = this.f2487l.signatures(c14025l);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSignatures.iterator();
        while (it.hasNext()) {
            arrayList.add((C14025l) it.next());
        }
        AbstractC3826l.tapsense(arrayList);
        return arrayList;
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final C13007l mo695switch(C14025l c14025l) {
        return this.f2487l.mo695switch(c14025l);
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final C13007l mo696throw(C14025l c14025l) {
        return this.f2487l.mo696throw(c14025l);
    }

    public final String toString() {
        return AbstractC18202l.yandex.loadAd(C0841l.class).license() + '(' + this.f2487l + ')';
    }

    @Override // defpackage.AbstractC5921l
    public final void vip(C14025l c14025l) {
        this.f2487l.vip(c14025l);
    }

    @Override // defpackage.AbstractC5921l
    public final InterfaceC10506l yandex(C14025l c14025l) {
        return this.f2487l.yandex(c14025l);
    }
}
