package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؙٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17434l extends AbstractC15603l implements InterfaceC16189l {
    private static final C17434l zzb;
    private int zzd;
    private InterfaceC9596l zze;
    private InterfaceC9596l zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C17434l c17434l = new C17434l();
        zzb = c17434l;
        AbstractC15603l.admob(C17434l.class, c17434l);
    }

    public C17434l() {
        C14217l c14217l = C14217l.f27817l;
        this.zze = c14217l;
        this.zzf = c14217l;
    }

    public static void adcel(C17434l c17434l, float f) {
        RandomAccess randomAccess = c17434l.zzf;
        if (!((AbstractC3486l) randomAccess).f7371l) {
            C14217l c14217l = (C14217l) randomAccess;
            int i = c14217l.f27818l;
            int i2 = i == 0 ? 10 : i + i;
            if (i2 < i) {
                C11983l.crashlytics();
                return;
            }
            c17434l.zzf = new C14217l(Arrays.copyOf(c14217l.f27819l, i2), c14217l.f27818l, true);
        }
        ((C14217l) c17434l.zzf).billing(f);
    }

    public static /* synthetic */ void ads(C17434l c17434l, int i) {
        c17434l.zzd |= 1;
        c17434l.zzg = i;
    }

    public static /* synthetic */ void metrica(C17434l c17434l, int i) {
        c17434l.zzd |= 2;
        c17434l.zzh = i;
    }

    public static void startapp(C17434l c17434l, float f) {
        RandomAccess randomAccess = c17434l.zze;
        if (!((AbstractC3486l) randomAccess).f7371l) {
            C14217l c14217l = (C14217l) randomAccess;
            int i = c14217l.f27818l;
            int i2 = i == 0 ? 10 : i + i;
            if (i2 < i) {
                C11983l.crashlytics();
                return;
            }
            c17434l.zze = new C14217l(Arrays.copyOf(c14217l.f27819l, i2), c14217l.f27818l, true);
        }
        ((C14217l) c17434l.zze).billing(f);
    }

    public static C12139l vip() {
        return (C12139l) zzb.amazon();
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C17434l();
        }
        if (i2 == 4) {
            return new C12139l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
