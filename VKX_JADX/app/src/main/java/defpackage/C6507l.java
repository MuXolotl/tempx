package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6507l {
    public List amazon;
    public final C8688l billing;
    public final List crashlytics;
    public final List loadAd;
    public final C8688l mopub;
    public List purchase;
    public final List yandex;

    public C6507l(List list, List list2, List list3, List list4, List list5) {
        this.yandex = list;
        this.loadAd = list2;
        this.crashlytics = list3;
        this.amazon = list4;
        this.purchase = list5;
        final int i = 0;
        this.billing = new C8688l(new Function0(this) { // from class: lًّۚ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C6507l f16586l;

            {
                this.f16586l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C2580l c2580l = C2580l.f5619l;
                int i3 = 0;
                C6507l c6507l = this.f16586l;
                switch (i2) {
                    case 0:
                        List list6 = c6507l.amazon;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            AbstractC3984l.license(arrayList, (List) ((Function0) list6.get(i3)).invoke());
                            i3++;
                        }
                        c6507l.amazon = c2580l;
                        return arrayList;
                    default:
                        List list7 = c6507l.purchase;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            AbstractC3984l.license(arrayList2, (List) ((Function0) list7.get(i3)).invoke());
                            i3++;
                        }
                        c6507l.purchase = c2580l;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.mopub = new C8688l(new Function0(this) { // from class: lًّۚ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C6507l f16586l;

            {
                this.f16586l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C2580l c2580l = C2580l.f5619l;
                int i4 = 0;
                C6507l c6507l = this.f16586l;
                switch (i3) {
                    case 0:
                        List list6 = c6507l.amazon;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i4 < size) {
                            AbstractC3984l.license(arrayList, (List) ((Function0) list6.get(i4)).invoke());
                            i4++;
                        }
                        c6507l.amazon = c2580l;
                        return arrayList;
                    default:
                        List list7 = c6507l.purchase;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i4 < size2) {
                            AbstractC3984l.license(arrayList2, (List) ((Function0) list7.get(i4)).invoke());
                            i4++;
                        }
                        c6507l.purchase = c2580l;
                        return arrayList2;
                }
            }
        });
    }
}
