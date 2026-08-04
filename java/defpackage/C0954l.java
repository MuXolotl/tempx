package defpackage;

/* JADX INFO: renamed from: lَؚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0954l extends AbstractC15603l implements InterfaceC16189l {
    private static final C0954l zzb;
    private int zzd = 0;
    private Object zze;

    static {
        C0954l c0954l = new C0954l();
        zzb = c0954l;
        AbstractC15603l.admob(C0954l.class, c0954l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzd", C4834l.class, C10387l.class, C15880l.class});
        }
        if (i2 == 3) {
            return new C0954l();
        }
        if (i2 == 4) {
            return new C10667l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
