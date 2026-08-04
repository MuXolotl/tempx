package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lْٜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C3309l.class)
public final class C13520l extends AbstractC3160l {
    public static final C17688l Companion = new C17688l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f26534l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte f26535l;

    public C13520l(byte b, byte[] bArr) {
        this.f26535l = b;
        this.f26534l = bArr;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        if (!AbstractC8576l.yandex(c2336l.loadAd(C13520l.class), c2336l.loadAd(obj.getClass()))) {
            return false;
        }
        C13520l c13520l = (C13520l) obj;
        return this.f26535l == c13520l.f26535l && Arrays.equals(this.f26534l, c13520l.f26534l);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26534l) + (this.f26535l * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BsonBinary(type=");
        sb.append((int) this.f26535l);
        sb.append(", data=");
        return AbstractC2812l.tapsense(sb, AbstractC8669l.m2397case(this.f26534l, ",", null, 56), ')');
    }
}
