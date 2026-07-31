package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lۣٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2998l implements InterfaceC18660l, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f6498l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f6499l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Class f6500l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f6501l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f6502l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f6503l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f6504l;

    public C2998l(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.f6501l = obj;
        this.f6500l = cls;
        this.f6498l = str;
        this.f6503l = str2;
        this.f6502l = (i2 & 1) == 1;
        this.f6504l = i;
        this.f6499l = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2998l)) {
            return false;
        }
        C2998l c2998l = (C2998l) obj;
        return this.f6502l == c2998l.f6502l && this.f6504l == c2998l.f6504l && this.f6499l == c2998l.f6499l && AbstractC8576l.yandex(this.f6501l, c2998l.f6501l) && AbstractC8576l.yandex(this.f6500l, c2998l.f6500l) && this.f6498l.equals(c2998l.f6498l) && this.f6503l.equals(c2998l.f6503l);
    }

    @Override // defpackage.InterfaceC18660l
    public final int getArity() {
        return this.f6504l;
    }

    public final int hashCode() {
        Object obj = this.f6501l;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f6500l;
        return ((((AbstractC12589l.advert(AbstractC12589l.advert((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.f6498l), 31, this.f6503l) + (this.f6502l ? 1231 : 1237)) * 31) + this.f6504l) * 31) + this.f6499l;
    }

    public final String toString() {
        return AbstractC18202l.yandex.isPro(this);
    }

    public C2998l(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, C11128l.f22339l, str, str2);
    }
}
