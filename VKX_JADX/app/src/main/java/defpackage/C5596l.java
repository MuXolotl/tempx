package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* JADX INFO: renamed from: lؘُؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5596l implements InterfaceC11792l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2817l f11889l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10685l[] f11890l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Image f11891l;

    public C5596l(Image image) {
        this.f11891l = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f11890l = new C10685l[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f11890l[i] = new C10685l(planes[i]);
            }
        } else {
            this.f11890l = new C10685l[0];
        }
        this.f11889l = new C2817l(C12920l.loadAd, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f11891l.close();
    }

    @Override // defpackage.InterfaceC11792l
    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final InterfaceC11699l mo1829const() {
        return this.f11889l;
    }

    @Override // defpackage.InterfaceC11792l
    public final int getFormat() {
        return this.f11891l.getFormat();
    }

    @Override // defpackage.InterfaceC11792l
    public final InterfaceC18001l[] license() {
        return this.f11890l;
    }

    @Override // defpackage.InterfaceC11792l
    public final int loadAd() {
        return this.f11891l.getHeight();
    }

    @Override // defpackage.InterfaceC11792l
    public final int purchase() {
        return this.f11891l.getWidth();
    }

    @Override // defpackage.InterfaceC11792l
    public final Image startapp() {
        return this.f11891l;
    }
}
