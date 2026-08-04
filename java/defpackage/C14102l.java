package defpackage;

/* JADX INFO: renamed from: lَّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14102l extends AbstractC15603l implements InterfaceC16189l {
    private static final C14102l zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        C14102l c14102l = new C14102l();
        zzb = c14102l;
        AbstractC15603l.admob(C14102l.class, c14102l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            C8042l c8042l = C8042l.tapsense;
            return new C9025l(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", C8042l.Signature, "zzg", "zzh", C8042l.subscription, "zzi", c8042l, "zzj", c8042l, "zzk", c8042l, "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new C14102l();
        }
        if (i2 == 4) {
            return new C15947l(26, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
