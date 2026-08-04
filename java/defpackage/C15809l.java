package defpackage;

/* JADX INFO: renamed from: lٕٜۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15809l extends AbstractC17187l {
    private static final C15809l zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C15809l c15809l = new C15809l();
        zzf = c15809l;
        AbstractC17187l.mopub(C15809l.class, c15809l);
    }

    public static C11314l smaato() {
        return (C11314l) zzf.crashlytics();
    }

    public final /* synthetic */ void remoteconfig(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new C15809l();
        }
        if (i2 == 4) {
            return new C11314l(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void vip(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }
}
