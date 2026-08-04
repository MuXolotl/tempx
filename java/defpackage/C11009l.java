package defpackage;

/* JADX INFO: renamed from: lُّۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11009l extends AbstractC15603l implements InterfaceC16189l {
    private static final C11009l zzb;
    private int zzd;
    private int zze;
    private C5904l zzg;
    private byte zzh = 2;
    private InterfaceC14009l zzf = C2742l.f5945l;

    static {
        C11009l c11009l = new C11009l();
        zzb = c11009l;
        AbstractC15603l.admob(C11009l.class, c11009l);
    }

    public final int metrica() {
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

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C8042l.purchase, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C11009l();
        }
        if (i2 == 4) {
            return new C15947l(9, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final InterfaceC14009l vip() {
        return this.zzf;
    }
}
