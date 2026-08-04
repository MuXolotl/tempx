package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٟؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2805l implements InterfaceC14833l {
    public boolean crashlytics;
    public AbstractC2634l loadAd;
    public InterfaceC2053l yandex;

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        AbstractC2634l abstractC2634l = this.loadAd;
        if (abstractC2634l != null) {
            C11587l c11587l = abstractC2634l.yandex;
            C6673l c6673l = c11587l.yandex;
            c6673l.yandex = 0;
            c6673l.loadAd = 0L;
            c6673l.crashlytics = 0;
            c6673l.amazon = 0;
            c6673l.purchase = 0;
            c11587l.loadAd.m3563native(0);
            c11587l.crashlytics = -1;
            c11587l.purchase = false;
            if (j == 0) {
                abstractC2634l.amazon(!abstractC2634l.smaato);
                return;
            }
            if (abstractC2634l.admob != 0) {
                long j3 = (((long) abstractC2634l.subs) * j2) / 1000000;
                abstractC2634l.purchase = j3;
                InterfaceC17732l interfaceC17732l = abstractC2634l.amazon;
                String str = AbstractC15323l.yandex;
                interfaceC17732l.amazon(j3);
                abstractC2634l.admob = 2;
            }
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.yandex = interfaceC2053l;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        try {
            return mopub(interfaceC10430l);
        } catch (C17655l unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        byte[] bArr;
        this.yandex.getClass();
        if (this.loadAd == null) {
            if (!mopub(interfaceC10430l)) {
                throw C17655l.yandex(null, "Failed to determine bitstream type");
            }
            interfaceC10430l.smaato();
        }
        if (!this.crashlytics) {
            InterfaceC8979l interfaceC8979lStartapp = this.yandex.startapp(0, 1);
            this.yandex.firebase();
            AbstractC2634l abstractC2634l = this.loadAd;
            abstractC2634l.crashlytics = this.yandex;
            abstractC2634l.loadAd = interfaceC8979lStartapp;
            abstractC2634l.amazon(true);
            this.crashlytics = true;
        }
        AbstractC2634l abstractC2634l2 = this.loadAd;
        C11587l c11587l = abstractC2634l2.yandex;
        abstractC2634l2.loadAd.getClass();
        String str = AbstractC15323l.yandex;
        int i = abstractC2634l2.admob;
        if (i != 0) {
            if (i == 1) {
                interfaceC10430l.remoteconfig((int) abstractC2634l2.billing);
                abstractC2634l2.admob = 2;
                return 0;
            }
            if (i != 2) {
                if (i == 3) {
                    return -1;
                }
                C18073l.admob();
                return 0;
            }
            long jYandex = abstractC2634l2.amazon.yandex(interfaceC10430l);
            if (jYandex >= 0) {
                c1014l.f2761l = jYandex;
                return 1;
            }
            if (jYandex < -1) {
                abstractC2634l2.yandex(-(jYandex + 2));
            }
            if (!abstractC2634l2.smaato) {
                InterfaceC12703l interfaceC12703lCrashlytics = abstractC2634l2.amazon.crashlytics();
                interfaceC12703lCrashlytics.getClass();
                abstractC2634l2.crashlytics.tapsense(interfaceC12703lCrashlytics);
                abstractC2634l2.loadAd.amazon(interfaceC12703lCrashlytics.mopub());
                abstractC2634l2.smaato = true;
            }
            if (abstractC2634l2.firebase <= 0 && !c11587l.loadAd(interfaceC10430l)) {
                abstractC2634l2.admob = 3;
                return -1;
            }
            abstractC2634l2.firebase = 0L;
            C13143l c13143l = c11587l.loadAd;
            long jLoadAd = abstractC2634l2.loadAd(c13143l);
            if (jLoadAd >= 0) {
                long j = abstractC2634l2.mopub;
                if (j + jLoadAd >= abstractC2634l2.purchase) {
                    long j2 = (j * 1000000) / ((long) abstractC2634l2.subs);
                    abstractC2634l2.loadAd.purchase(c13143l.crashlytics, c13143l);
                    abstractC2634l2.loadAd.yandex(j2, 1, c13143l.crashlytics, 0, null);
                    abstractC2634l2.purchase = -1L;
                }
            }
            abstractC2634l2.mopub += jLoadAd;
            return 0;
        }
        while (true) {
            boolean zLoadAd = c11587l.loadAd(interfaceC10430l);
            C13143l c13143l2 = c11587l.loadAd;
            if (!zLoadAd) {
                abstractC2634l2.admob = 3;
                return -1;
            }
            long position = interfaceC10430l.getPosition();
            long j3 = abstractC2634l2.billing;
            abstractC2634l2.firebase = position - j3;
            if (!abstractC2634l2.crashlytics(c13143l2, j3, abstractC2634l2.isPro)) {
                C5978l c5978l = (C5978l) abstractC2634l2.isPro.f5291l;
                abstractC2634l2.subs = c5978l.f12622synchronized;
                if (!abstractC2634l2.remoteconfig) {
                    abstractC2634l2.loadAd.mopub(c5978l);
                    abstractC2634l2.remoteconfig = true;
                }
                C16528l c16528l = (C16528l) abstractC2634l2.isPro.f5290l;
                if (c16528l == null) {
                    if (interfaceC10430l.getLength() == -1) {
                        abstractC2634l2.amazon = new C16222l(11);
                    } else {
                        C6673l c6673l = c11587l.yandex;
                        abstractC2634l2.amazon = new C6216l(abstractC2634l2, abstractC2634l2.billing, interfaceC10430l.getLength(), c6673l.amazon + c6673l.purchase, c6673l.loadAd, (c6673l.yandex & 4) != 0);
                    }
                    abstractC2634l2.admob = 2;
                    bArr = c13143l2.yandex;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    c13143l2.m3565private(c13143l2.crashlytics, Arrays.copyOf(bArr, Math.max(65025, c13143l2.crashlytics)));
                    return 0;
                }
                abstractC2634l2.amazon = c16528l;
                abstractC2634l2.admob = 2;
                bArr = c13143l2.yandex;
                if (bArr.length == 65025) {
                    return 0;
                }
                c13143l2.m3565private(c13143l2.crashlytics, Arrays.copyOf(bArr, Math.max(65025, c13143l2.crashlytics)));
                return 0;
            }
            abstractC2634l2.billing = interfaceC10430l.getPosition();
        }
    }

    public final boolean mopub(InterfaceC10430l interfaceC10430l) {
        boolean zAdmob;
        C6673l c6673l = new C6673l();
        if (c6673l.yandex(interfaceC10430l, true) && (c6673l.yandex & 2) == 2) {
            int iMin = Math.min(c6673l.purchase, 8);
            C13143l c13143l = new C13143l(iMin);
            interfaceC10430l.yandex(0, iMin, c13143l.yandex);
            c13143l.m3562for(0);
            if (c13143l.yandex() >= 5 && c13143l.signatures() == 127 && c13143l.applovin() == 1179402563) {
                this.loadAd = new C4888l();
                return true;
            }
            c13143l.m3562for(0);
            try {
                zAdmob = AbstractC6968l.admob(1, c13143l, true);
            } catch (C17655l unused) {
                zAdmob = false;
            }
            if (zAdmob) {
                this.loadAd = new C10200l();
            } else {
                c13143l.m3562for(0);
                if (C11688l.purchase(c13143l, C11688l.metrica)) {
                    this.loadAd = new C11688l();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
