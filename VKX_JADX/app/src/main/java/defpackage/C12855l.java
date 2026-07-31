package defpackage;

import android.util.Pair;

/* JADX INFO: renamed from: lّۛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12855l extends AbstractC15025l {
    public boolean adcel;
    public boolean ads;
    public C10298l metrica;
    public final C4322l remoteconfig;
    public final boolean smaato;
    public C7967l startapp;
    public boolean subscription;
    public final C3904l vip;

    public C12855l(AbstractC14384l abstractC14384l, boolean z) {
        super(abstractC14384l);
        this.smaato = z && abstractC14384l.subs();
        this.remoteconfig = new C4322l();
        this.vip = new C3904l();
        AbstractC10759l abstractC10759lMopub = abstractC14384l.mopub();
        if (abstractC10759lMopub == null) {
            this.metrica = new C10298l(new C8567l(abstractC14384l.admob()), C4322l.adcel, C10298l.admob);
        } else {
            this.metrica = new C10298l(abstractC10759lMopub, null, null);
            this.subscription = true;
        }
    }

    @Override // defpackage.AbstractC15025l
    public final C5019l advert(C5019l c5019l) {
        Object obj = c5019l.yandex;
        Object obj2 = this.metrica.mopub;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C10298l.admob;
        }
        return c5019l.yandex(obj);
    }

    @Override // defpackage.AbstractC14384l
    /* JADX INFO: renamed from: applovin, reason: merged with bridge method [inline-methods] */
    public final C7967l loadAd(C5019l c5019l, InterfaceC3783l interfaceC3783l, long j) {
        C7967l c7967l = new C7967l(c5019l, interfaceC3783l, j);
        AbstractC12442l.subscription(c7967l.f16612l == null);
        c7967l.f16612l = this.firebase;
        if (!this.ads) {
            this.startapp = c7967l;
            if (!this.adcel) {
                this.adcel = true;
                signatures();
            }
            return c7967l;
        }
        Object obj = c5019l.yandex;
        if (this.metrica.mopub != null && obj.equals(C10298l.admob)) {
            obj = this.metrica.mopub;
        }
        c7967l.yandex(c5019l.yandex(obj));
        return c7967l;
    }

    public final boolean appmetrica(long j) {
        C7967l c7967l = this.startapp;
        int iLoadAd = this.metrica.loadAd(c7967l.f16610l.yandex);
        if (iLoadAd == -1) {
            return false;
        }
        C10298l c10298l = this.metrica;
        C3904l c3904l = this.vip;
        c10298l.billing(iLoadAd, c3904l, false);
        long j2 = c3904l.amazon;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c7967l.f16608l = j;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC15025l
    public final void isVip(AbstractC10759l abstractC10759l) {
        long j;
        C10298l c10298l;
        C5019l c5019lYandex;
        C10298l c10298l2;
        if (this.ads) {
            C10298l c10298l3 = this.metrica;
            this.metrica = new C10298l(abstractC10759l, c10298l3.billing, c10298l3.mopub);
            C7967l c7967l = this.startapp;
            if (c7967l != null) {
                appmetrica(c7967l.f16608l);
            }
        } else {
            if (!abstractC10759l.startapp()) {
                C4322l c4322l = this.remoteconfig;
                abstractC10759l.vip(0, c4322l);
                long j2 = c4322l.smaato;
                Object obj = c4322l.yandex;
                C7967l c7967l2 = this.startapp;
                if (c7967l2 != null) {
                    long j3 = c7967l2.f16609l;
                    C10298l c10298l4 = this.metrica;
                    Object obj2 = c7967l2.f16610l.yandex;
                    C3904l c3904l = this.vip;
                    c10298l4.mopub(obj2, c3904l);
                    long j4 = c3904l.purchase + j3;
                    this.metrica.remoteconfig(0, c4322l, 0L);
                    if (j4 != c4322l.smaato) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairSubs = abstractC10759l.subs(this.remoteconfig, this.vip, 0, j);
                Object obj3 = pairSubs.first;
                long jLongValue = ((Long) pairSubs.second).longValue();
                if (this.subscription) {
                    C10298l c10298l5 = this.metrica;
                    c10298l = new C10298l(abstractC10759l, c10298l5.billing, c10298l5.mopub);
                } else {
                    c10298l = new C10298l(abstractC10759l, obj, obj3);
                }
                this.metrica = c10298l;
                C7967l c7967l3 = this.startapp;
                if (c7967l3 != null && appmetrica(jLongValue)) {
                    C5019l c5019l = c7967l3.f16610l;
                    Object obj4 = c5019l.yandex;
                    if (this.metrica.mopub != null && obj4.equals(C10298l.admob)) {
                        obj4 = this.metrica.mopub;
                    }
                    c5019lYandex = c5019l.yandex(obj4);
                }
                this.subscription = true;
                this.ads = true;
                remoteconfig(this.metrica);
                if (c5019lYandex != null) {
                    C7967l c7967l4 = this.startapp;
                    c7967l4.getClass();
                    c7967l4.yandex(c5019lYandex);
                }
            }
            if (this.subscription) {
                C10298l c10298l6 = this.metrica;
                c10298l2 = new C10298l(abstractC10759l, c10298l6.billing, c10298l6.mopub);
            } else {
                c10298l2 = new C10298l(abstractC10759l, C4322l.adcel, C10298l.admob);
            }
            this.metrica = c10298l2;
        }
        c5019lYandex = null;
        this.subscription = true;
        this.ads = true;
        remoteconfig(this.metrica);
        if (c5019lYandex != null) {
            C7967l c7967l5 = this.startapp;
            c7967l5.getClass();
            c7967l5.yandex(c5019lYandex);
        }
    }

    @Override // defpackage.AbstractC15025l
    public final void premium() {
        if (this.smaato) {
            return;
        }
        this.adcel = true;
        signatures();
    }

    @Override // defpackage.AbstractC7238l, defpackage.AbstractC14384l
    public final void startapp() {
        this.ads = false;
        this.adcel = false;
        super.startapp();
    }

    @Override // defpackage.AbstractC15025l, defpackage.AbstractC14384l
    public final void subscription(C2427l c2427l) {
        if (this.subscription) {
            C10298l c10298l = this.metrica;
            AbstractC10759l abstractC10759l = c10298l.purchase;
            this.metrica = new C10298l(abstractC10759l instanceof C2733l ? new C2733l(((C2733l) abstractC10759l).purchase, c2427l) : new C2733l(abstractC10759l, c2427l), c10298l.billing, c10298l.mopub);
        } else {
            this.metrica = new C10298l(new C8567l(c2427l), C4322l.adcel, C10298l.admob);
        }
        this.firebase.subscription(c2427l);
    }

    @Override // defpackage.AbstractC14384l
    public final void vip(InterfaceC8782l interfaceC8782l) {
        C7967l c7967l = (C7967l) interfaceC8782l;
        if (c7967l.f16611l != null) {
            AbstractC14384l abstractC14384l = c7967l.f16612l;
            abstractC14384l.getClass();
            abstractC14384l.vip(c7967l.f16611l);
        }
        if (interfaceC8782l == this.startapp) {
            this.startapp = null;
        }
    }

    @Override // defpackage.AbstractC14384l
    public final boolean yandex(C2427l c2427l) {
        return this.firebase.yandex(c2427l);
    }
}
