package defpackage;

/* JADX INFO: renamed from: lًٟؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1707l extends AbstractC15603l implements InterfaceC16189l {
    private static final C1707l zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        C1707l c1707l = new C1707l();
        zzb = c1707l;
        AbstractC15603l.admob(C1707l.class, c1707l);
    }

    public static C1707l startapp() {
        return zzb;
    }

    public final double metrica() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C1707l();
        }
        if (i2 == 4) {
            return new C10667l(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final double vip() {
        return this.zze;
    }
}
