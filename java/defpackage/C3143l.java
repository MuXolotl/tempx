package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lؕؓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3143l implements InterfaceC12702l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C3143l f6747l = new C3143l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3797l f6746l = C3797l.appmetrica("c", "v", "i", "o");

    @Override // defpackage.InterfaceC12702l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final Object mo1290default(AbstractC9542l abstractC9542l, float f) {
        if (abstractC9542l.mo1287synchronized() == 1) {
            abstractC9542l.yandex();
        }
        abstractC9542l.billing();
        ArrayList arrayListCrashlytics = null;
        ArrayList arrayListCrashlytics2 = null;
        ArrayList arrayListCrashlytics3 = null;
        boolean zIsVip = false;
        while (abstractC9542l.ads()) {
            int iMo1288throw = abstractC9542l.mo1288throw(f6746l);
            if (iMo1288throw == 0) {
                zIsVip = abstractC9542l.isVip();
            } else if (iMo1288throw == 1) {
                arrayListCrashlytics = AbstractC14878l.crashlytics(abstractC9542l, f);
            } else if (iMo1288throw == 2) {
                arrayListCrashlytics2 = AbstractC14878l.crashlytics(abstractC9542l, f);
            } else if (iMo1288throw != 3) {
                abstractC9542l.mo1286switch();
                abstractC9542l.mo1275continue();
            } else {
                arrayListCrashlytics3 = AbstractC14878l.crashlytics(abstractC9542l, f);
            }
        }
        abstractC9542l.vip();
        if (abstractC9542l.mo1287synchronized() == 2) {
            abstractC9542l.mopub();
        }
        if (arrayListCrashlytics == null || arrayListCrashlytics2 == null || arrayListCrashlytics3 == null) {
            C8339l.metrica("Shape data was missing information.");
            return null;
        }
        if (arrayListCrashlytics.isEmpty()) {
            return new C8114l(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListCrashlytics.size();
        PointF pointF = (PointF) arrayListCrashlytics.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListCrashlytics.get(i);
            int i2 = i - 1;
            arrayList.add(new C4550l(AbstractC7484l.yandex((PointF) arrayListCrashlytics.get(i2), (PointF) arrayListCrashlytics3.get(i2)), AbstractC7484l.yandex(pointF2, (PointF) arrayListCrashlytics2.get(i)), pointF2));
        }
        if (zIsVip) {
            PointF pointF3 = (PointF) arrayListCrashlytics.get(0);
            int i3 = size - 1;
            arrayList.add(new C4550l(AbstractC7484l.yandex((PointF) arrayListCrashlytics.get(i3), (PointF) arrayListCrashlytics3.get(i3)), AbstractC7484l.yandex(pointF3, (PointF) arrayListCrashlytics2.get(0)), pointF3));
        }
        return new C8114l(pointF, zIsVip, arrayList);
    }
}
