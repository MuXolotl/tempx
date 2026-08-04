package defpackage;

/* JADX INFO: renamed from: lٍٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16298l extends AbstractC15603l implements InterfaceC16189l {
    private static final C16298l zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private C7824l zzg;
    private byte zzh = 2;

    static {
        C16298l c16298l = new C16298l();
        zzb = c16298l;
        AbstractC15603l.admob(C16298l.class, c16298l);
        C7824l c7824lVip = C7824l.vip();
        EnumC1865l enumC1865l = EnumC1865l.f4284l;
        if (c7824lVip != null) {
            return;
        }
        C8339l.metrica("Null containingTypeDefaultInstance");
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C16298l();
        }
        if (i2 == 4) {
            return new C10667l(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
