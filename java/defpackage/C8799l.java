package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٌٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8799l implements InterfaceC12353l {
    public final boolean crashlytics;
    public final C6162l loadAd;
    public final AbstractC1251l yandex;

    public C8799l(C6162l c6162l, AbstractC1251l abstractC1251l) {
        C6096l c6096l = AbstractC14987l.yandex;
        this.loadAd = c6162l;
        this.crashlytics = abstractC1251l instanceof AbstractC13398l;
        this.yandex = abstractC1251l;
    }

    @Override // defpackage.InterfaceC12353l
    public final int admob(AbstractC1251l abstractC1251l) {
        C2886l c2886l = ((AbstractC15603l) abstractC1251l).zzc;
        int iApplovin = c2886l.amazon;
        if (iApplovin == -1) {
            iApplovin = 0;
            for (int i = 0; i < c2886l.yandex; i++) {
                int i2 = c2886l.loadAd[i] >>> 3;
                AbstractC1096l abstractC1096l = (AbstractC1096l) c2886l.crashlytics[i];
                int iYandex = C9747l.yandex(8);
                int iYandex2 = C9747l.yandex(i2) + C9747l.yandex(16);
                int iYandex3 = C9747l.yandex(24);
                int iAdmob = abstractC1096l.admob();
                iApplovin = AbstractC5020l.applovin(iYandex + iYandex, iYandex2, AbstractC9029l.isVip(iAdmob, iAdmob, iYandex3), iApplovin);
            }
            c2886l.amazon = iApplovin;
        }
        if (!this.crashlytics) {
            return iApplovin;
        }
        C13639l c13639l = ((AbstractC13398l) abstractC1251l).zzb.yandex;
        int i3 = c13639l.f26665l;
        int iSubs = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iSubs += C5519l.subs(c13639l.crashlytics(i4));
        }
        Iterator it = c13639l.yandex().iterator();
        while (it.hasNext()) {
            iSubs += C5519l.subs((Map.Entry) it.next());
        }
        return iApplovin + iSubs;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a A[EDGE_INSN: B:54:0x009a->B:30:0x009a BREAK  A[LOOP:1: B:16:0x005a->B:57:0x005a], SYNTHETIC] */
    @Override // defpackage.InterfaceC12353l
    public final void amazon(Object obj, byte[] bArr, int i, int i2, C13275l c13275l) throws C18299l {
        int iSignatures;
        AbstractC15603l abstractC15603l = (AbstractC15603l) obj;
        C2886l c2886lLoadAd = abstractC15603l.zzc;
        if (c2886lLoadAd == C2886l.billing) {
            c2886lLoadAd = C2886l.loadAd();
            abstractC15603l.zzc = c2886lLoadAd;
        }
        C2886l c2886l = c2886lLoadAd;
        AbstractC13398l abstractC13398l = (AbstractC13398l) obj;
        C5519l c5519l = abstractC13398l.zzb;
        if (c5519l.loadAd) {
            abstractC13398l.zzb = c5519l.clone();
        }
        while (i < i2) {
            int iSignatures2 = AbstractC0140l.signatures(bArr, i, c13275l);
            int i3 = c13275l.yandex;
            C14545l c14545l = c13275l.amazon;
            AbstractC1251l abstractC1251l = this.yandex;
            if (i3 == 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                C13275l c13275l2 = c13275l;
                AbstractC1096l abstractC1096l = null;
                int i5 = 0;
                while (true) {
                    if (iSignatures2 >= i4) {
                        iSignatures = iSignatures2;
                        break;
                    }
                    iSignatures = AbstractC0140l.signatures(bArr2, iSignatures2, c13275l2);
                    int i6 = c13275l2.yandex;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 == 2) {
                        if (i8 != 0) {
                            if (i6 != 12) {
                                break;
                                break;
                            }
                            iSignatures2 = AbstractC0140l.m284package(i6, bArr2, iSignatures, i4, c13275l2);
                        } else {
                            iSignatures2 = AbstractC0140l.signatures(bArr2, iSignatures, c13275l2);
                            i5 = c13275l2.yandex;
                            c14545l.getClass();
                        }
                    } else if (i7 != 3 || i8 != 2) {
                        if (i6 != 12) {
                            break;
                        } else {
                            iSignatures2 = AbstractC0140l.m284package(i6, bArr2, iSignatures, i4, c13275l2);
                        }
                    } else {
                        iSignatures2 = AbstractC0140l.license(bArr2, iSignatures, c13275l2);
                        abstractC1096l = (AbstractC1096l) c13275l2.crashlytics;
                    }
                }
                if (abstractC1096l != null) {
                    c2886l.crashlytics((i5 << 3) | 2, abstractC1096l);
                }
                i = iSignatures;
                bArr = bArr2;
                i2 = i4;
                c13275l = c13275l2;
            } else if ((i3 & 7) == 2) {
                c14545l.getClass();
                i = AbstractC0140l.isVip(i3, bArr, iSignatures2, i2, c2886l, c13275l);
            } else {
                i = AbstractC0140l.m284package(i3, bArr, iSignatures2, i2, c13275l);
            }
        }
        if (i == i2) {
            return;
        }
        C11586l.billing("Failed to parse the message.");
    }

    @Override // defpackage.InterfaceC12353l
    public final Object billing() {
        AbstractC1251l abstractC1251l = this.yandex;
        return abstractC1251l instanceof AbstractC15603l ? (AbstractC15603l) ((AbstractC15603l) abstractC1251l).remoteconfig(4, null) : ((AbstractC7986l) ((AbstractC15603l) abstractC1251l).remoteconfig(5, null)).amazon();
    }

    @Override // defpackage.InterfaceC12353l
    public final int crashlytics(AbstractC15603l abstractC15603l) {
        int iHashCode = abstractC15603l.zzc.hashCode();
        if (!this.crashlytics) {
            return iHashCode;
        }
        return ((AbstractC13398l) abstractC15603l).zzb.yandex.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.InterfaceC12353l
    public final boolean loadAd(Object obj) {
        return ((AbstractC13398l) obj).zzb.billing();
    }

    @Override // defpackage.InterfaceC12353l
    public final void mopub(Object obj, Object obj2) {
        AbstractC17663l.startapp(obj, obj2);
        if (this.crashlytics) {
            C6096l c6096l = AbstractC14987l.yandex;
            AbstractC17663l.metrica(obj, obj2);
        }
    }

    @Override // defpackage.InterfaceC12353l
    public final boolean purchase(AbstractC15603l abstractC15603l, AbstractC15603l abstractC15603l2) {
        if (!abstractC15603l.zzc.equals(abstractC15603l2.zzc)) {
            return false;
        }
        if (this.crashlytics) {
            return ((AbstractC13398l) abstractC15603l).zzb.equals(((AbstractC13398l) abstractC15603l2).zzb);
        }
        return true;
    }

    @Override // defpackage.InterfaceC12353l
    public final void subs(Object obj, C0770l c0770l) {
        Iterator itCrashlytics = ((AbstractC13398l) obj).zzb.crashlytics();
        if (itCrashlytics.hasNext()) {
            ((AbstractC1552l) ((Map.Entry) itCrashlytics.next()).getKey()).getClass();
            throw null;
        }
        C2886l c2886l = ((AbstractC15603l) obj).zzc;
        for (int i = 0; i < c2886l.yandex; i++) {
            int i2 = c2886l.loadAd[i] >>> 3;
            Object obj2 = c2886l.crashlytics[i];
            boolean z = obj2 instanceof AbstractC1096l;
            C9747l c9747l = c0770l.yandex;
            if (z) {
                c9747l.metrica(11);
                c9747l.vip(2, i2);
                c9747l.purchase(3, (AbstractC1096l) obj2);
                c9747l.metrica(12);
            } else {
                c9747l.metrica(11);
                c9747l.vip(2, i2);
                c9747l.metrica(26);
                AbstractC15603l abstractC15603l = (AbstractC15603l) ((AbstractC1251l) obj2);
                c9747l.metrica(abstractC15603l.crashlytics());
                abstractC15603l.smaato(c9747l);
                c9747l.metrica(12);
            }
        }
    }

    @Override // defpackage.InterfaceC12353l
    public final void yandex(Object obj) {
        this.loadAd.getClass();
        C2886l c2886l = ((AbstractC15603l) obj).zzc;
        if (c2886l.purchase) {
            c2886l.purchase = false;
        }
        C6096l c6096l = AbstractC14987l.yandex;
        ((AbstractC13398l) obj).zzb.amazon();
    }
}
