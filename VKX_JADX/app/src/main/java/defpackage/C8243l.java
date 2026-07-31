package defpackage;

/* JADX INFO: renamed from: lًۚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8243l extends AbstractC15603l implements InterfaceC16189l {
    private static final C8243l zzb;
    private InterfaceC14009l zzd;
    private InterfaceC14009l zze;

    static {
        C8243l c8243l = new C8243l();
        zzb = c8243l;
        AbstractC15603l.admob(C8243l.class, c8243l);
    }

    public C8243l() {
        C2742l c2742l = C2742l.f5945l;
        this.zzd = c2742l;
        this.zze = c2742l;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", C0954l.class, "zze", C0954l.class});
        }
        if (i2 == 3) {
            return new C8243l();
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
