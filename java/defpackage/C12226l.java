package defpackage;

/* JADX INFO: renamed from: lِۤۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12226l extends AbstractC16808l {
    public final long admob;
    public final long billing;
    public final long mopub;
    public final boolean subs;

    public C12226l(AbstractC10759l abstractC10759l, long j, long j2, boolean z) throws C7941l {
        super(abstractC10759l);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new C7941l(2, j, j2);
        }
        boolean z2 = false;
        if (abstractC10759l.admob() != 1) {
            throw new C7941l(0);
        }
        C4322l c4322lRemoteconfig = abstractC10759l.remoteconfig(0, new C4322l(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !c4322lRemoteconfig.firebase && jMax != 0 && !c4322lRemoteconfig.admob) {
            throw new C7941l(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c4322lRemoteconfig.remoteconfig : Math.max(0L, j2);
        long j3 = c4322lRemoteconfig.remoteconfig;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.billing = jMax;
        this.mopub = jMax2;
        this.admob = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (c4322lRemoteconfig.subs && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.subs = z2;
    }

    @Override // defpackage.AbstractC16808l, defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        this.purchase.billing(0, c3904l, z);
        long j = c3904l.purchase - this.billing;
        long j2 = this.admob;
        c3904l.subs(c3904l.yandex, c3904l.loadAd, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, C12869l.billing, false);
        return c3904l;
    }

    @Override // defpackage.AbstractC16808l, defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        this.purchase.remoteconfig(0, c4322l, 0L);
        long j2 = c4322l.startapp;
        long j3 = this.billing;
        c4322l.startapp = j2 + j3;
        c4322l.remoteconfig = this.admob;
        c4322l.subs = this.subs;
        long j4 = c4322l.smaato;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c4322l.smaato = jMax;
            long j5 = this.mopub;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c4322l.smaato = jMax - j3;
        }
        long jM3986try = AbstractC15323l.m3986try(j3);
        long j6 = c4322l.purchase;
        if (j6 != -9223372036854775807L) {
            c4322l.purchase = j6 + jM3986try;
        }
        long j7 = c4322l.billing;
        if (j7 != -9223372036854775807L) {
            c4322l.billing = j7 + jM3986try;
        }
        return c4322l;
    }
}
