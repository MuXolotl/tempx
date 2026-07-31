package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٕٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15882l extends AbstractC9813l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f31146l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f31147l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC5030l f31148l;

    public C15882l(AbstractC5030l abstractC5030l, int i, int i2) {
        this.f31148l = abstractC5030l;
        this.f31147l = i;
        AbstractC6900l.crashlytics(i, i2, abstractC5030l.pro());
        this.f31146l = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC6900l.yandex(i, this.f31146l);
        return this.f31148l.get(this.f31147l + i);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f31146l;
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final List subList(int i, int i2) {
        AbstractC6900l.crashlytics(i, i2, this.f31146l);
        int i3 = this.f31147l;
        return new C15882l(this.f31148l, i + i3, i3 + i2);
    }
}
