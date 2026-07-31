package defpackage;

/* JADX INFO: renamed from: lٗٝۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17280l extends AbstractC15603l implements InterfaceC16189l {
    private static final C17280l zzb;
    private int zzd;
    private int zze;
    private AbstractC1096l zzf = AbstractC1096l.f3033l;

    static {
        C17280l c17280l = new C17280l();
        zzb = c17280l;
        AbstractC15603l.admob(C17280l.class, c17280l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C17280l();
        }
        if (i2 == 4) {
            return new C15947l(2, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
