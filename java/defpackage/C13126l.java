package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lْؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13126l extends AbstractC5921l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C14025l f25666l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14025l f25667l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final LinkedHashMap f25668l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC5921l f25669l;

    static {
        String str = C14025l.f27330l;
        f25666l = C6162l.adcel("/", false);
    }

    public C13126l(C14025l c14025l, AbstractC5921l abstractC5921l, LinkedHashMap linkedHashMap) {
        this.f25667l = c14025l;
        this.f25669l = abstractC5921l;
        this.f25668l = linkedHashMap;
    }

    @Override // defpackage.AbstractC5921l
    public final void adcel(C14025l c14025l, boolean z) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.AbstractC5921l
    public final void billing(C14025l c14025l, C14025l c14025l2) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: continue */
    public final InterfaceC10506l mo691continue(C14025l c14025l, boolean z) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: default */
    public final InterfaceC14991l mo692default(C14025l c14025l) throws Throwable {
        Throwable th;
        C1503l c1503l;
        C14025l c14025l2 = f25666l;
        c14025l2.getClass();
        C11018l c11018l = (C11018l) this.f25668l.get(billing.loadAd(c14025l2, c14025l, true));
        if (c11018l == null) {
            C8876l.billing(c14025l, "no such file: ");
            return null;
        }
        long j = c11018l.billing;
        C13007l c13007lMo696throw = this.f25669l.mo696throw(this.f25667l);
        try {
            c1503l = new C1503l(c13007lMo696throw.billing(c11018l.admob));
            try {
                c13007lMo696throw.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (c13007lMo696throw != null) {
                try {
                    c13007lMo696throw.close();
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th3, th4);
                }
            }
            th = th3;
            c1503l = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC13628l.firebase(c1503l, null);
        if (c11018l.mopub == 0) {
            return new C15092l(c1503l, j, true);
        }
        return new C15092l(new C17237l(new C1503l(new C15092l(c1503l, c11018l.purchase, true)), new Inflater(true)), j, false);
    }

    @Override // defpackage.AbstractC5921l
    public final List inmobi(C14025l c14025l) {
        return m3560super(c14025l, false);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: private */
    public final C18402l mo694private(C14025l c14025l) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        C14025l c14025l2 = f25666l;
        c14025l2.getClass();
        C11018l c11018lFirebase = (C11018l) this.f25668l.get(billing.loadAd(c14025l2, c14025l, true));
        if (c11018lFirebase == null) {
            return null;
        }
        long j = c11018lFirebase.admob;
        if (j != -1) {
            C13007l c13007lMo696throw = this.f25669l.mo696throw(this.f25667l);
            try {
                C1503l c1503l = new C1503l(c13007lMo696throw.billing(j));
                try {
                    c11018lFirebase = AbstractC13628l.firebase(c1503l, c11018lFirebase);
                    try {
                        c1503l.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        c1503l.close();
                    } catch (Throwable th5) {
                        AbstractC11718l.yandex(th4, th5);
                    }
                    th2 = th4;
                    c11018lFirebase = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    c13007lMo696throw.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (c13007lMo696throw != null) {
                    try {
                        c13007lMo696throw.close();
                    } catch (Throwable th8) {
                        AbstractC11718l.yandex(th7, th8);
                    }
                }
                th = th7;
                c11018lFirebase = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = c11018lFirebase.loadAd;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(c11018lFirebase.billing);
        Long l2 = c11018lFirebase.remoteconfig;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = c11018lFirebase.startapp;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = c11018lFirebase.firebase;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = c11018lFirebase.vip;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = c11018lFirebase.isPro;
                if (i != -1) {
                    int i2 = c11018lFirebase.subs;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = c11018lFirebase.smaato;
        if (l4 == null) {
            Integer num3 = c11018lFirebase.metrica;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new C18402l(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new C18402l(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // defpackage.AbstractC5921l
    public final List signatures(C14025l c14025l) {
        return m3560super(c14025l, true);
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final List m3560super(C14025l c14025l, boolean z) throws IOException {
        C14025l c14025l2 = f25666l;
        c14025l2.getClass();
        C11018l c11018l = (C11018l) this.f25668l.get(billing.loadAd(c14025l2, c14025l, true));
        if (c11018l != null) {
            return AbstractC16901l.m4213const(c11018l.adcel);
        }
        if (!z) {
            return null;
        }
        C10754l.pro(c14025l, "not a directory: ");
        return null;
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: switch */
    public final C13007l mo695switch(C14025l c14025l) throws IOException {
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: throw */
    public final C13007l mo696throw(C14025l c14025l) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.AbstractC5921l
    public final void vip(C14025l c14025l) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.AbstractC5921l
    public final InterfaceC10506l yandex(C14025l c14025l) throws IOException {
        throw new IOException("zip file systems are read-only");
    }
}
