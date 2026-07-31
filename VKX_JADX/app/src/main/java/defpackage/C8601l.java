package defpackage;

/* JADX INFO: renamed from: lٌؙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8601l extends AbstractC15603l implements InterfaceC16189l {
    private static final C8601l zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C8601l c8601l = new C8601l();
        zzb = c8601l;
        AbstractC15603l.admob(C8601l.class, c8601l);
    }

    public static C8601l vip() {
        return zzb;
    }

    public final String adcel() {
        return this.zzg;
    }

    public final int ads() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
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
        return this.zzf;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", C8042l.applovin, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C8601l();
        }
        if (i2 == 4) {
            return new C10667l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String startapp() {
        return this.zzh;
    }
}
