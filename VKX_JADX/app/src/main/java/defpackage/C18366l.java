package defpackage;

/* JADX INFO: renamed from: lٕ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18366l extends AbstractC15603l implements InterfaceC16189l {
    private static final C18366l zzb;
    private int zzd;
    private C1287l zzj;
    private C3495l zzl;
    private String zze = "";
    private AbstractC1096l zzf = AbstractC1096l.f3033l;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        C18366l c18366l = new C18366l();
        zzb = c18366l;
        AbstractC15603l.admob(C18366l.class, c18366l);
    }

    public static /* synthetic */ void metrica(C18366l c18366l, C1287l c1287l) {
        c18366l.zzj = c1287l;
        c18366l.zzd |= 32;
    }

    public static /* synthetic */ void startapp(C18366l c18366l, AbstractC1096l abstractC1096l) {
        abstractC1096l.getClass();
        c18366l.zzd |= 2;
        c18366l.zzf = abstractC1096l;
    }

    public static C5369l vip() {
        return (C5369l) zzb.amazon();
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new C18366l();
        }
        if (i2 == 4) {
            return new C5369l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
