package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؚؖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3971l {
    public final String crashlytics;
    public final List loadAd;
    public final C7507l yandex;

    public C3971l(C7507l c7507l, List list) {
        EnumC4244l enumC4244l;
        InterfaceC12830l c2126l;
        this.yandex = c7507l;
        this.loadAd = list;
        this.crashlytics = c7507l.yandex;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                for (Object obj2 : arrayList) {
                    InterfaceC12830l interfaceC12830l = ((C12434l) obj2).loadAd;
                    if ((interfaceC12830l instanceof C2126l) && ((C2126l) interfaceC12830l).crashlytics) {
                        obj = obj2;
                        return;
                    }
                }
                return;
            }
            C11085l c11085l = (C11085l) it.next();
            int i = c11085l.amazon;
            boolean z = c11085l.subs;
            int i2 = c11085l.crashlytics;
            switch (AbstractC5020l.inmobi(i2)) {
                case 0:
                    enumC4244l = EnumC4244l.f8700l;
                    break;
                case 1:
                    enumC4244l = EnumC4244l.f8703l;
                    break;
                case 2:
                    enumC4244l = EnumC4244l.f8706l;
                    break;
                case 3:
                    enumC4244l = EnumC4244l.f8705l;
                    break;
                case 4:
                    enumC4244l = EnumC4244l.f8699l;
                    break;
                case 5:
                    enumC4244l = EnumC4244l.f8704l;
                    break;
                case 6:
                    enumC4244l = EnumC4244l.f8701l;
                    break;
                case 7:
                    enumC4244l = EnumC4244l.f8702l;
                    break;
                case 8:
                    enumC4244l = EnumC4244l.f8709l;
                    break;
                case 9:
                    enumC4244l = EnumC4244l.f8709l;
                    break;
                case 10:
                    enumC4244l = EnumC4244l.f8708l;
                    break;
                case 11:
                    enumC4244l = EnumC4244l.f8710l;
                    break;
                case 12:
                    enumC4244l = EnumC4244l.f8707l;
                    break;
                default:
                    C18262l.subs("Unknown storage type: ".concat(AbstractC4338l.m1529extends(i2)));
                    throw null;
            }
            EnumC4244l enumC4244l2 = enumC4244l;
            int iInmobi = AbstractC5020l.inmobi(i);
            if (iInmobi == 0) {
                c2126l = new C2126l(enumC4244l2, c11085l.subs, c11085l.isPro, c11085l.firebase, c11085l.smaato);
            } else if (iInmobi == 1) {
                c2126l = new C15789l(enumC4244l2, z, c11085l.remoteconfig);
            } else if (iInmobi == 2) {
                c2126l = new C12618l(enumC4244l2, z);
            } else {
                if (iInmobi != 3) {
                    C18262l.subs("Unsupported type ".concat(AbstractC11043l.license(i)));
                    throw null;
                }
                c2126l = new C7304l(enumC4244l2, z);
            }
            String str = c11085l.yandex;
            C12434l c12434l = new C12434l();
            c12434l.yandex = str;
            c12434l.loadAd = c2126l;
            if (!(c2126l instanceof C2126l) && !(c2126l instanceof C15789l) && !(c2126l instanceof C12618l) && !(c2126l instanceof C7304l)) {
                C18725l.billing();
                throw null;
            }
            arrayList.add(c12434l);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3971l)) {
            return false;
        }
        C3971l c3971l = (C3971l) obj;
        return this.yandex.equals(c3971l.yandex) && this.loadAd.equals(c3971l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "RealmClassImpl(cinteropClass=" + this.yandex + ", cinteropProperties=" + this.loadAd + ")";
    }
}
