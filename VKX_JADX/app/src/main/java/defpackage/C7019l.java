package defpackage;

/* JADX INFO: renamed from: lؚؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7019l extends AbstractC15603l implements InterfaceC16189l {
    private static final C7019l zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C7019l c7019l = new C7019l();
        zzb = c7019l;
        AbstractC15603l.admob(C7019l.class, c7019l);
    }

    public static C7019l vip() {
        return zzb;
    }

    public final String metrica() {
        return this.zze;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C7019l();
        }
        if (i2 == 4) {
            return new C15947l(7, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String startapp() {
        return this.zzf;
    }
}
