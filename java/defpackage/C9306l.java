package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٍؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9306l extends AbstractC17187l {
    private static final C9306l zzh;
    private int zzb;
    private C15809l zzd;
    private C13655l zze;
    private InterfaceC12239l zzf = C4650l.f9468l;
    private InterfaceC7913l zzg = C4522l.f9159l;

    static {
        C9306l c9306l = new C9306l();
        zzh = c9306l;
        AbstractC17187l.mopub(C9306l.class, c9306l);
    }

    public static C6138l smaato() {
        return (C6138l) zzh.crashlytics();
    }

    public final /* synthetic */ void remoteconfig(C15809l c15809l) {
        this.zzd = c15809l;
        this.zzb |= 1;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", C11170l.class, "zzg", C1461l.f3644l});
        }
        if (i2 == 3) {
            return new C9306l();
        }
        if (i2 == 4) {
            return new C6138l(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final void vip(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzg;
        if (!((AbstractC13676l) randomAccess).f26706l) {
            C4522l c4522l = (C4522l) randomAccess;
            int i = c4522l.f9161l;
            this.zzg = c4522l.subs(i + i);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EnumC10345l enumC10345l = (EnumC10345l) it.next();
            ((C4522l) this.zzg).admob(enumC10345l.f21131l);
        }
    }
}
