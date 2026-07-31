package defpackage;

/* JADX INFO: renamed from: lٓٛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14268l extends AbstractC15603l implements InterfaceC16189l {
    private static final C14268l zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C14268l c14268l = new C14268l();
        zzb = c14268l;
        AbstractC15603l.admob(C14268l.class, c14268l);
    }

    public static C14268l vip() {
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
            return new C14268l();
        }
        if (i2 == 4) {
            return new C15947l(5, zzb);
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
