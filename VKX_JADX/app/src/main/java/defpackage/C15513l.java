package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15513l implements InterfaceC10835l {
    public boolean loadAd;
    public final C1209l yandex;

    public C15513l(C1209l c1209l) {
        this.yandex = c1209l;
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iCrashlytics = ((InterfaceC6357l) list.get(0)).crashlytics(i);
        int iSmaato = AbstractC14055l.smaato(list);
        int i2 = 1;
        if (1 <= iSmaato) {
            while (true) {
                int iCrashlytics2 = ((InterfaceC6357l) list.get(i2)).crashlytics(i);
                if (iCrashlytics2 > iCrashlytics) {
                    iCrashlytics = iCrashlytics2;
                }
                if (i2 == iSmaato) {
                    break;
                }
                i2++;
            }
        }
        return iCrashlytics;
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iRemoteconfig = ((InterfaceC6357l) list.get(0)).remoteconfig(i);
        int iSmaato = AbstractC14055l.smaato(list);
        int i2 = 1;
        if (1 <= iSmaato) {
            while (true) {
                int iRemoteconfig2 = ((InterfaceC6357l) list.get(i2)).remoteconfig(i);
                if (iRemoteconfig2 > iRemoteconfig) {
                    iRemoteconfig = iRemoteconfig2;
                }
                if (i2 == iSmaato) {
                    break;
                }
                i2++;
            }
        }
        return iRemoteconfig;
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        C10086l c10086l = this.yandex.loadAd;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) list.get(i)).adcel(j);
            iMax = Math.max(iMax, abstractC10113lAdcel.f20592l);
            iMax2 = Math.max(iMax2, abstractC10113lAdcel.f20591l);
            arrayList.add(abstractC10113lAdcel);
        }
        if (interfaceC7448l.mo992import()) {
            this.loadAd = true;
            c10086l.setValue(new C4999l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.loadAd) {
            c10086l.setValue(new C4999l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return interfaceC7448l.isVip(iMax, iMax2, C14054l.f27396l, new C4819l(2, arrayList));
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo1460for = ((InterfaceC6357l) list.get(0)).mo1460for(i);
        int iSmaato = AbstractC14055l.smaato(list);
        int i2 = 1;
        if (1 <= iSmaato) {
            while (true) {
                int iMo1460for2 = ((InterfaceC6357l) list.get(i2)).mo1460for(i);
                if (iMo1460for2 > iMo1460for) {
                    iMo1460for = iMo1460for2;
                }
                if (i2 == iSmaato) {
                    break;
                }
                i2++;
            }
        }
        return iMo1460for;
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMetrica = ((InterfaceC6357l) list.get(0)).metrica(i);
        int iSmaato = AbstractC14055l.smaato(list);
        int i2 = 1;
        if (1 <= iSmaato) {
            while (true) {
                int iMetrica2 = ((InterfaceC6357l) list.get(i2)).metrica(i);
                if (iMetrica2 > iMetrica) {
                    iMetrica = iMetrica2;
                }
                if (i2 == iSmaato) {
                    break;
                }
                i2++;
            }
        }
        return iMetrica;
    }
}
