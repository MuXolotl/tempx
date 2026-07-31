package defpackage;

/* JADX INFO: renamed from: lٗؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16919l extends AbstractC15603l implements InterfaceC16189l {
    private static final C16919l zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        C16919l c16919l = new C16919l();
        zzb = c16919l;
        AbstractC15603l.admob(C16919l.class, c16919l);
    }

    public static C16919l vip() {
        return zzb;
    }

    public final int adcel() {
        int i;
        int i2 = this.zzf;
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

    public final String metrica() {
        return this.zzg;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C8042l.amazon, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C16919l();
        }
        if (i2 == 4) {
            return new C15947l(8, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzi = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String startapp() {
        return this.zze;
    }
}
