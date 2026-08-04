package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًۨۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8451l extends AbstractC17187l {
    private static final C8451l zzm;
    private int zzb;
    private C18300l zzd;
    private long zze;
    private int zzf;
    private InterfaceC12239l zzg;
    private InterfaceC12239l zzh;
    private InterfaceC12239l zzi;
    private InterfaceC12239l zzj;
    private InterfaceC12239l zzk;
    private int zzl;

    static {
        C8451l c8451l = new C8451l();
        zzm = c8451l;
        AbstractC17187l.mopub(C8451l.class, c8451l);
    }

    public C8451l() {
        C4650l c4650l = C4650l.f9468l;
        this.zzg = c4650l;
        this.zzh = c4650l;
        this.zzi = c4650l;
        this.zzj = c4650l;
        this.zzk = c4650l;
    }

    public static C17683l smaato() {
        return (C17683l) zzm.crashlytics();
    }

    public final void adcel(ArrayList arrayList) {
        InterfaceC12239l interfaceC12239l = this.zzi;
        if (!((AbstractC13676l) interfaceC12239l).f26706l) {
            int size = interfaceC12239l.size();
            this.zzi = interfaceC12239l.subs(size + size);
        }
        AbstractC6909l.loadAd(arrayList, this.zzi);
    }

    public final void ads(ArrayList arrayList) {
        InterfaceC12239l interfaceC12239l = this.zzj;
        if (!((AbstractC13676l) interfaceC12239l).f26706l) {
            int size = interfaceC12239l.size();
            this.zzj = interfaceC12239l.subs(size + size);
        }
        AbstractC6909l.loadAd(arrayList, this.zzj);
    }

    public final void metrica(ArrayList arrayList) {
        InterfaceC12239l interfaceC12239l = this.zzg;
        if (!((AbstractC13676l) interfaceC12239l).f26706l) {
            int size = interfaceC12239l.size();
            this.zzg = interfaceC12239l.subs(size + size);
        }
        AbstractC6909l.loadAd(arrayList, this.zzg);
    }

    public final /* synthetic */ void remoteconfig(C18300l c18300l) {
        this.zzd = c18300l;
        this.zzb |= 1;
    }

    public final void startapp(ArrayList arrayList) {
        InterfaceC12239l interfaceC12239l = this.zzh;
        if (!((AbstractC13676l) interfaceC12239l).f26706l) {
            int size = interfaceC12239l.size();
            this.zzh = interfaceC12239l.subs(size + size);
        }
        AbstractC6909l.loadAd(arrayList, this.zzh);
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", C11140l.f22358l, "zzg", C1216l.class, "zzh", C13528l.class, "zzi", C12522l.class, "zzj", C0229l.class, "zzk", C12979l.class, "zzl"});
        }
        if (i2 == 3) {
            return new C8451l();
        }
        if (i2 == 4) {
            return new C17683l(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    public final void subscription(ArrayList arrayList) {
        InterfaceC12239l interfaceC12239l = this.zzk;
        if (!((AbstractC13676l) interfaceC12239l).f26706l) {
            int size = interfaceC12239l.size();
            this.zzk = interfaceC12239l.subs(size + size);
        }
        AbstractC6909l.loadAd(arrayList, this.zzk);
    }

    public final /* synthetic */ void tapsense(int i) {
        this.zzb |= 8;
        this.zzl = i;
    }

    public final /* synthetic */ void vip(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
