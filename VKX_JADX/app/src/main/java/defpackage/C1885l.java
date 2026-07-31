package defpackage;

/* JADX INFO: renamed from: lؚؓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1885l extends AbstractC15603l implements InterfaceC16189l {
    private static final C1885l zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C1885l c1885l = new C1885l();
        zzb = c1885l;
        AbstractC15603l.admob(C1885l.class, c1885l);
    }

    public static /* synthetic */ void adcel(C1885l c1885l, int i) {
        c1885l.zzd |= 1;
        c1885l.zze = i;
    }

    public static /* synthetic */ void ads(C1885l c1885l, int i) {
        c1885l.zzd |= 2;
        c1885l.zzf = i;
    }

    public static C2864l startapp() {
        return (C2864l) zzb.amazon();
    }

    public final int metrica() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C1885l();
        }
        if (i2 == 4) {
            return new C2864l(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int vip() {
        return this.zze;
    }
}
