package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: lٌّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8564l extends AbstractC10759l {
    public static final Object adcel = new Object();
    public final long admob;
    public final long billing;
    public final boolean firebase;
    public final long isPro;
    public final C2427l metrica;
    public final long mopub;
    public final long purchase;
    public final boolean remoteconfig;
    public final boolean smaato;
    public final C7828l startapp;
    public final long subs;
    public final Object vip;

    static {
        C0935l c0935l = new C0935l();
        C17464l c17464l = new C17464l();
        List list = Collections.EMPTY_LIST;
        C13708l c13708l = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        Uri uri = Uri.EMPTY;
        AbstractC12442l.subscription(((Uri) c17464l.purchase) == null || ((UUID) c17464l.amazon) != null);
        if (uri != null) {
            new C17805l(uri, null, ((UUID) c17464l.amazon) != null ? new C14227l(c17464l) : null, null, list, null, c13708l, null, -9223372036854775807L);
        }
        new C9202l(c0935l);
        new C7828l(c2410l);
        C3852l c3852l = C3852l.f7980private;
    }

    public C8564l(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, C6565l c6565l, C2427l c2427l, C7828l c7828l) {
        this.purchase = j;
        this.billing = j2;
        this.mopub = j3;
        this.admob = j4;
        this.subs = j5;
        this.isPro = j6;
        this.firebase = z;
        this.smaato = z2;
        this.remoteconfig = z3;
        this.vip = c6565l;
        c2427l.getClass();
        this.metrica = c2427l;
        this.startapp = c7828l;
    }

    @Override // defpackage.AbstractC10759l
    public final int admob() {
        return 1;
    }

    @Override // defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        AbstractC12442l.smaato(i, 1);
        Object obj = z ? adcel : null;
        long j = -this.subs;
        c3904l.getClass();
        c3904l.subs(null, obj, 0, this.mopub, j, C12869l.billing, false);
        return c3904l;
    }

    @Override // defpackage.AbstractC10759l
    public final int loadAd(Object obj) {
        return adcel != obj ? -1 : 0;
    }

    @Override // defpackage.AbstractC10759l
    public final int metrica() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        long j2;
        AbstractC12442l.smaato(i, 1);
        long j3 = this.isPro;
        boolean z = this.smaato;
        if (!z || this.remoteconfig || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.admob;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        c4322l.loadAd(C4322l.adcel, this.metrica, this.vip, this.purchase, this.billing, -9223372036854775807L, this.firebase, z, this.startapp, j2, this.admob, 0, 0, this.subs);
        return c4322l;
    }

    @Override // defpackage.AbstractC10759l
    public final Object smaato(int i) {
        AbstractC12442l.smaato(i, 1);
        return adcel;
    }
}
