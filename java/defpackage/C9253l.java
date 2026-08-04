package defpackage;

import android.media.Image;

/* JADX INFO: renamed from: lٍّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9253l implements InterfaceC17771l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C18474l f19019l = AbstractC1805l.yandex(false);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5991l f19020l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC17771l f19021l;

    public C9253l(InterfaceC17771l interfaceC17771l, C5991l c5991l) {
        this.f19021l = interfaceC17771l;
        this.f19020l = c5991l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f19019l.yandex()) {
            C5991l c5991l = this.f19020l;
            C11879l c11879l = (C11879l) c5991l.f12715l;
            c11879l.getClass();
            if (C11879l.loadAd.decrementAndGet(c11879l) == 0) {
                C11561l c11561l = (C11561l) c5991l.f12718l;
                c11561l.getClass();
                ((C8426l) C11561l.loadAd.getAndSet(c11561l, null)).yandex((InterfaceC17771l) c5991l.f12716l);
            }
        }
    }

    public final String toString() {
        return this.f19021l.toString();
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (this.f19019l.loadAd()) {
            return null;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        if (interfaceC1388l.equals(c2336l.loadAd(C9253l.class)) || interfaceC1388l.equals(c2336l.loadAd(InterfaceC17771l.class)) || interfaceC1388l.equals(c2336l.loadAd(InterfaceC11741l.class))) {
            return this;
        }
        if (!interfaceC1388l.equals(c2336l.loadAd(Image.class))) {
            return this.f19021l.mo842while(interfaceC1388l);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public final C9253l yandex() {
        int i;
        int i2;
        C9253l c9253l;
        if (this.f19019l.loadAd()) {
            c9253l = null;
        } else {
            C5991l c5991l = this.f19020l;
            C11879l c11879l = (C11879l) c5991l.f12715l;
            do {
                i = c11879l.yandex;
                i2 = i == 0 ? 0 : i + 1;
            } while (!C11879l.loadAd.compareAndSet(c11879l, i, i2));
            if ((i2 != 0 ? (InterfaceC17771l) c5991l.f12716l : null) != null) {
                c9253l = new C9253l(this.f19021l, this.f19020l);
            } else {
                c9253l = null;
            }
        }
        if (c9253l != null) {
            return c9253l;
        }
        C8339l.smaato("Required value was null.");
        return null;
    }
}
