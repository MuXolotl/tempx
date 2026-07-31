package defpackage;

/* JADX INFO: renamed from: lؘٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5904l extends AbstractC15603l implements InterfaceC16189l {
    private static final C5904l zzb;
    private int zzd;
    private InterfaceC14009l zzf;
    private InterfaceC14009l zzg;
    private InterfaceC14009l zzh;
    private C7824l zzi;
    private C5904l zzj;
    private C16183l zzk;
    private byte zzl = 2;
    private String zze = "";

    static {
        C5904l c5904l = new C5904l();
        zzb = c5904l;
        AbstractC15603l.admob(C5904l.class, c5904l);
        C7824l c7824lVip = C7824l.vip();
        EnumC1865l enumC1865l = EnumC1865l.f4284l;
        if (c7824lVip != null) {
            return;
        }
        C8339l.metrica("Null containingTypeDefaultInstance");
    }

    public C5904l() {
        C2742l c2742l = C2742l.f5945l;
        this.zzf = c2742l;
        this.zzg = c2742l;
        this.zzh = c2742l;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", C5985l.class, "zzh", C5985l.class, "zzg", C11076l.class, "zzi", "zze", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C5904l();
        }
        if (i2 == 4) {
            return new C15947l(12, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
