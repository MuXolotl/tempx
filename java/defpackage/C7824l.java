package defpackage;

/* JADX INFO: renamed from: lًؘؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7824l extends AbstractC13398l {
    private static final C7824l zzd;
    private byte zze;

    static {
        C7824l c7824l = new C7824l();
        zzd = c7824l;
        AbstractC15603l.admob(C7824l.class, c7824l);
    }

    public C7824l() {
        this.zzb = C5519l.crashlytics;
        this.zze = (byte) 2;
    }

    public static C7824l vip() {
        return zzd;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i2 == 2) {
            return new C9025l(zzd, "\u0003\u0000", null);
        }
        if (i2 == 3) {
            return new C7824l();
        }
        if (i2 == 4) {
            return new C15947l(0, zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        this.zze = abstractC15603l != null ? (byte) 1 : (byte) 0;
        return null;
    }
}
