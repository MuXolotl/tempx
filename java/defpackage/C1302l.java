package defpackage;

/* JADX INFO: renamed from: lٜؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1302l extends AbstractC15603l implements InterfaceC16189l {
    private static final C1302l zzb;
    private int zzd;
    private C18366l zze;
    private C4203l zzf;
    private C8243l zzg;

    static {
        C1302l c1302l = new C1302l();
        zzb = c1302l;
        AbstractC15603l.admob(C1302l.class, c1302l);
    }

    public static /* synthetic */ void metrica(C1302l c1302l, C18366l c18366l) {
        c1302l.zze = c18366l;
        c1302l.zzd |= 1;
    }

    public static /* synthetic */ void startapp(C1302l c1302l, C4203l c4203l) {
        c1302l.zzf = c4203l;
        c1302l.zzd |= 2;
    }

    public static C0470l vip() {
        return (C0470l) zzb.amazon();
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C1302l();
        }
        if (i2 == 4) {
            return new C0470l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
