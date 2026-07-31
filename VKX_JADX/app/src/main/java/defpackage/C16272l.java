package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٌٍٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16272l extends AbstractC2712l {
    public final long Signature;
    public final C4234l ad;
    public final C17564l adcel;
    public final long admob;
    public final AbstractC1186l ads;
    public final int amazon;
    public final boolean billing;
    public final long firebase;
    public final int isPro;
    public final C7043l license;
    public final boolean metrica;
    public final boolean mopub;
    public final AbstractC1186l pro;
    public final long purchase;
    public final long remoteconfig;
    public final int smaato;
    public final boolean startapp;
    public final boolean subs;
    public final AbstractC1186l subscription;
    public final AbstractC13675l tapsense;
    public final long vip;

    public C16272l(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C17564l c17564l, List list2, List list3, C7043l c7043l, Map map, List list4, C4234l c4234l) {
        super(str, list, z3);
        this.amazon = i;
        this.admob = j2;
        this.mopub = z;
        this.subs = z2;
        this.isPro = i2;
        this.firebase = j3;
        this.smaato = i3;
        this.remoteconfig = j4;
        this.vip = j5;
        this.metrica = z4;
        this.startapp = z5;
        this.adcel = c17564l;
        this.ads = AbstractC1186l.Signature(list2);
        this.subscription = AbstractC1186l.Signature(list3);
        this.tapsense = AbstractC13675l.loadAd(map);
        this.pro = AbstractC1186l.Signature(list4);
        this.ad = c4234l;
        if (!list3.isEmpty()) {
            C6823l c6823l = (C6823l) AbstractC11356l.purchase(list3);
            this.Signature = c6823l.f20476l + c6823l.f20470l;
        } else if (list2.isEmpty()) {
            this.Signature = 0L;
        } else {
            C4234l c4234l2 = (C4234l) AbstractC11356l.purchase(list2);
            this.Signature = c4234l2.f20476l + c4234l2.f20470l;
        }
        long jMin = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j6 = this.Signature;
            jMin = j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j);
        }
        this.purchase = jMin;
        this.billing = j >= 0;
        this.license = c7043l;
    }

    @Override // defpackage.AbstractC2712l
    public final Object yandex(List list) {
        return this;
    }
}
