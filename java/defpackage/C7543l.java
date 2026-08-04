package defpackage;

/* JADX INFO: renamed from: lَؚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7543l extends AbstractC15603l implements InterfaceC16189l {
    private static final C7543l zzb;
    private int zzd;
    private C16183l zzj;
    private C7824l zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private InterfaceC0250l zzg = C14363l.f28110l;
    private String zzh = "";
    private String zzi = "";

    static {
        C7543l c7543l = new C7543l();
        zzb = c7543l;
        AbstractC15603l.admob(C7543l.class, c7543l);
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
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C8042l.loadAd, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new C7543l();
        }
        if (i2 == 4) {
            return new C15947l(4, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
