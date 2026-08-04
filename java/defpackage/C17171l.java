package defpackage;

/* JADX INFO: renamed from: lٖٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17171l extends AbstractC15603l implements InterfaceC16189l {
    private static final C17171l zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C17171l c17171l = new C17171l();
        zzb = c17171l;
        AbstractC15603l.admob(C17171l.class, c17171l);
    }

    public static C17171l vip() {
        return zzb;
    }

    public final String metrica() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C8042l.billing, "zzf"});
        }
        if (i2 == 3) {
            return new C17171l();
        }
        if (i2 == 4) {
            return new C15947l(11, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int startapp() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
