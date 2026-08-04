package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lُٜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11176l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f22462l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C17512l f22463l = null;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C17512l f22464l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22465l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C11500l f22466l;

    public C11176l(C11500l c11500l, int i) {
        this.f22465l = i;
        this.f22466l = c11500l;
        this.f22464l = c11500l.f23113l.f34129l;
        this.f22462l = c11500l.f23118l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22464l != this.f22466l.f23113l;
    }

    public final C17512l loadAd() {
        C17512l c17512l = this.f22464l;
        C11500l c11500l = this.f22466l;
        if (c17512l == c11500l.f23113l) {
            C4875l.firebase();
            return null;
        }
        if (c11500l.f23118l != this.f22462l) {
            C8339l.mopub();
            return null;
        }
        this.f22464l = c17512l.f34129l;
        this.f22463l = c17512l;
        return c17512l;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f22465l) {
            case 1:
                return loadAd().f34131l;
            default:
                return yandex();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C17512l c17512l = this.f22463l;
        if (c17512l == null) {
            C18073l.admob();
            return;
        }
        C11500l c11500l = this.f22466l;
        c11500l.crashlytics(c17512l, true);
        this.f22463l = null;
        this.f22462l = c11500l.f23118l;
    }

    public final Object yandex() {
        return loadAd();
    }
}
