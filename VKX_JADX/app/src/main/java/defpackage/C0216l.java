package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* JADX INFO: renamed from: lٍؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0216l extends AbstractC17187l {
    private static final C0216l zzs;
    private int zzb;
    private C18300l zzd;
    private boolean zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private C10046l zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;

    static {
        C0216l c0216l = new C0216l();
        zzs = c0216l;
        AbstractC17187l.mopub(C0216l.class, c0216l);
    }

    public static C18277l remoteconfig(C0216l c0216l) {
        AbstractC1506l abstractC1506lCrashlytics = zzs.crashlytics();
        AbstractC17187l abstractC17187l = abstractC1506lCrashlytics.f3758l;
        if (!abstractC17187l.equals(c0216l)) {
            if (!abstractC1506lCrashlytics.f3757l.isPro()) {
                AbstractC17187l abstractC17187l2 = (AbstractC17187l) abstractC17187l.subs(4, null);
                C12765l.crashlytics.yandex(abstractC17187l2.getClass()).yandex(abstractC17187l2, abstractC1506lCrashlytics.f3757l);
                abstractC1506lCrashlytics.f3757l = abstractC17187l2;
            }
            AbstractC17187l abstractC17187l3 = abstractC1506lCrashlytics.f3757l;
            C12765l.crashlytics.yandex(abstractC17187l3.getClass()).yandex(abstractC17187l3, c0216l);
        }
        return (C18277l) abstractC1506lCrashlytics;
    }

    public static C18277l smaato() {
        return (C18277l) zzs.crashlytics();
    }

    public static C0216l vip() {
        return zzs;
    }

    public final /* synthetic */ void Signature(boolean z) {
        this.zzb |= 2048;
        this.zzo = z;
    }

    public final /* synthetic */ void ad(boolean z) {
        this.zzb |= 16384;
        this.zzr = z;
    }

    public final /* synthetic */ void adcel(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void ads(int i) {
        this.zzb |= 64;
        this.zzj = i;
    }

    public final /* synthetic */ void license() {
        this.zzb |= 4096;
        this.zzp = 0;
    }

    public final /* synthetic */ void metrica(C18300l c18300l) {
        this.zzd = c18300l;
        this.zzb |= 1;
    }

    public final /* synthetic */ void pro() {
        this.zzb |= 8192;
        this.zzq = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public final /* synthetic */ void startapp(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzs, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", C13863l.f27105l, "zzi", C6168l.f12986l, "zzj", "zzk", "zzl", "zzm", C15718l.f30859l, "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new C0216l();
        }
        if (i2 == 4) {
            return new C18277l(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        throw null;
    }

    public final /* synthetic */ void subscription(int i) {
        this.zzb |= 128;
        this.zzk = i;
    }

    public final /* synthetic */ void tapsense(int i) {
        this.zzb |= 1024;
        this.zzn = i;
    }
}
