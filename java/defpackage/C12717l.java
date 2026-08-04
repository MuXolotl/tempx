package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lّٜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12717l implements InterfaceC1837l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C12717l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC1837l
    public final void yandex(C10814l c10814l) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C9731l c9731l = (C9731l) obj;
                if (c9731l.amazon() != null) {
                    C11108l c11108l = c9731l.isVip;
                    c11108l.getClass();
                    AbstractC12225l.crashlytics();
                    c11108l.f22317l = true;
                    c9731l.m2729synchronized(true);
                    String strBilling = c9731l.billing();
                    C14180l c14180l = (C14180l) c9731l.admob;
                    C5464l c5464l = c9731l.subs;
                    c5464l.getClass();
                    C16774l c16774lM2728strictfp = c9731l.m2728strictfp(strBilling, c14180l, c5464l);
                    c9731l.ad = c16774lM2728strictfp;
                    Object[] objArr = {c16774lM2728strictfp.crashlytics()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    c9731l.m2081throws(DesugarCollections.unmodifiableList(arrayList));
                    c9731l.adcel();
                    C11108l c11108l2 = c9731l.isVip;
                    c11108l2.getClass();
                    AbstractC12225l.crashlytics();
                    c11108l2.f22317l = false;
                    c11108l2.crashlytics();
                    break;
                }
                break;
            case 1:
                C0527l c0527l = (C0527l) obj;
                if (c0527l.amazon() != null) {
                    c0527l.m626volatile((C8749l) c0527l.admob, c0527l.subs);
                    c0527l.adcel();
                    break;
                }
                break;
            case 2:
                Iterator it = ((C11419l) obj).vip.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1837l) it.next()).yandex(c10814l);
                }
                break;
            default:
                ((C10418l) obj).m2918else();
                break;
        }
    }
}
