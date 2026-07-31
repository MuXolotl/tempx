package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌٍٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9422l implements InterfaceC13952l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f19274l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C4529l f19272l = null;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public float f19275l = -1.0f;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C4529l f19273l = yandex(0.0f);

    public C9422l(List list) {
        this.f19274l = list;
    }

    @Override // defpackage.InterfaceC13952l
    public final float admob() {
        List list = this.f19274l;
        return ((C4529l) list.get(list.size() - 1)).yandex();
    }

    @Override // defpackage.InterfaceC13952l
    public final C4529l crashlytics() {
        return this.f19273l;
    }

    @Override // defpackage.InterfaceC13952l
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC13952l
    public final boolean loadAd(float f) {
        C4529l c4529l = this.f19272l;
        C4529l c4529l2 = this.f19273l;
        if (c4529l == c4529l2 && this.f19275l == f) {
            return true;
        }
        this.f19272l = c4529l2;
        this.f19275l = f;
        return false;
    }

    @Override // defpackage.InterfaceC13952l
    public final boolean mopub(float f) {
        C4529l c4529l = this.f19273l;
        if (f >= c4529l.loadAd() && f < c4529l.yandex()) {
            return !this.f19273l.crashlytics();
        }
        this.f19273l = yandex(f);
        return true;
    }

    @Override // defpackage.InterfaceC13952l
    public final float subs() {
        return ((C4529l) this.f19274l.get(0)).loadAd();
    }

    public final C4529l yandex(float f) {
        List list = this.f19274l;
        C4529l c4529l = (C4529l) list.get(list.size() - 1);
        if (f >= c4529l.loadAd()) {
            return c4529l;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C4529l c4529l2 = (C4529l) list.get(size);
            if (this.f19273l != c4529l2 && f >= c4529l2.loadAd() && f < c4529l2.yandex()) {
                return c4529l2;
            }
        }
        return (C4529l) list.get(0);
    }
}
