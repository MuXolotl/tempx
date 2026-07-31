package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lْۡٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13731l extends AbstractC4777l implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f26799l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f26800l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26801l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f26802l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f26803l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f26804l;

    public C13731l(int i, int i2) {
        int i3 = ~i;
        this.f26801l = i;
        this.f26799l = i2;
        this.f26803l = 0;
        this.f26802l = 0;
        this.f26804l = i3;
        this.f26800l = (i << 10) ^ (i2 >>> 4);
        if ((i | i2 | i3) == 0) {
            C8339l.metrica("Initial state must have at least one non-zero element.");
            throw null;
        }
        for (int i4 = 0; i4 < 64; i4++) {
            amazon();
        }
    }

    @Override // defpackage.AbstractC4777l
    public final int amazon() {
        int i = this.f26801l;
        int i2 = i ^ (i >>> 2);
        this.f26801l = this.f26799l;
        this.f26799l = this.f26803l;
        this.f26803l = this.f26802l;
        int i3 = this.f26804l;
        this.f26802l = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f26804l = i4;
        int i5 = this.f26800l + 362437;
        this.f26800l = i5;
        return i4 + i5;
    }

    @Override // defpackage.AbstractC4777l
    public final int yandex(int i) {
        return (amazon() >>> (32 - i)) & ((-i) >> 31);
    }
}
