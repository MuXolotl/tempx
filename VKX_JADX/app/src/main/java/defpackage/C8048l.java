package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lًٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8048l {
    public AbstractC14771l admob;
    public final C11315l amazon;
    public AbstractC5288l billing;
    public final C7549l crashlytics;
    public final C1807l firebase;
    public final C1807l isPro;
    public final C1008l loadAd;
    public int mopub;
    public final C11315l purchase;
    public boolean remoteconfig;
    public boolean smaato;
    public final C1807l subs;
    public boolean vip;
    public final C1008l yandex = AbstractC11190l.yandex(C2455l.crashlytics);

    public C8048l() {
        C1008l c1008lYandex = AbstractC11190l.yandex(new C14936l());
        this.loadAd = c1008lYandex;
        this.crashlytics = AbstractC0622l.yandex(c1008lYandex);
        this.amazon = new C11315l();
        this.purchase = new C11315l();
        this.subs = AbstractC1793l.yandex();
        this.isPro = AbstractC1793l.yandex();
        this.firebase = AbstractC1793l.yandex();
    }

    public final AbstractC5288l crashlytics(int i) {
        Object next;
        Object next2;
        C11315l c11315l = this.purchase;
        C11315l c11315l2 = this.amazon;
        Object obj = null;
        if (i == -1) {
            Iterator it = c11315l2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((AbstractC5288l) next).yandex());
            AbstractC5288l abstractC5288l = (AbstractC5288l) next;
            if (abstractC5288l != null) {
                return abstractC5288l;
            }
            for (Object obj2 : c11315l) {
                if (((AbstractC5288l) obj2).yandex()) {
                    obj = obj2;
                    break;
                }
            }
            return (AbstractC5288l) obj;
        }
        if (i != 0) {
            if (i != 1) {
                C6541l.mopub(i, "'.", "Unsupported direction: '");
                return null;
            }
            Iterator it2 = c11315l2.iterator();
            while (it2.hasNext()) {
                ((AbstractC5288l) it2.next()).getClass();
            }
            Iterator it3 = c11315l.iterator();
            while (it3.hasNext()) {
                ((AbstractC5288l) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = c11315l2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((AbstractC5288l) next2).yandex());
        AbstractC5288l abstractC5288l2 = (AbstractC5288l) next2;
        if (abstractC5288l2 != null) {
            return abstractC5288l2;
        }
        for (Object obj3 : c11315l) {
            if (((AbstractC5288l) obj3).yandex()) {
                obj = obj3;
                break;
            }
        }
        return (AbstractC5288l) obj;
    }

    public final void loadAd() {
        boolean z;
        boolean z2;
        long j;
        C14936l c14936l;
        C11315l c11315l = this.amazon;
        if (c11315l != null && c11315l.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = c11315l.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((AbstractC5288l) it.next()).yandex()) {
                z = true;
                break;
            }
        }
        C11315l c11315l2 = this.purchase;
        if (c11315l2 != null && c11315l2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = c11315l2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            } else if (((AbstractC5288l) it2.next()).yandex()) {
                z2 = true;
                break;
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.remoteconfig != z;
        boolean z5 = this.smaato != z2;
        boolean z6 = this.vip != z3;
        C1807l c1807l = this.firebase;
        char c = 31;
        if (z4) {
            Object[] objArr = c1807l.loadAd;
            long[] jArr = c1807l.crashlytics;
            j = 2147483647L;
            int i = c1807l.purchase;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((AbstractC14771l) objArr[i]).loadAd(z);
                i = i2;
                c11315l = c11315l;
            }
        } else {
            j = 2147483647L;
        }
        C11315l c11315l3 = c11315l;
        C1807l c1807l2 = this.isPro;
        if (z5) {
            Object[] objArr2 = c1807l2.loadAd;
            long[] jArr2 = c1807l2.crashlytics;
            int i3 = c1807l2.purchase;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> c) & j);
                ((AbstractC14771l) objArr2[i3]).loadAd(z2);
                c = c;
                i3 = i4;
            }
        }
        char c2 = c;
        C1807l c1807l3 = this.subs;
        if (z6) {
            Object[] objArr3 = c1807l3.loadAd;
            long[] jArr3 = c1807l3.crashlytics;
            int i5 = c1807l3.purchase;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> c2) & j);
                ((AbstractC14771l) objArr3[i5]).loadAd(z3);
                i5 = i6;
            }
        }
        this.remoteconfig = z;
        this.smaato = z2;
        this.vip = z3;
        AbstractC5288l abstractC5288lCrashlytics = this.billing;
        if (abstractC5288lCrashlytics == null) {
            abstractC5288lCrashlytics = crashlytics(0);
        }
        AbstractC5288l abstractC5288lCrashlytics2 = this.billing;
        if (abstractC5288lCrashlytics2 == null) {
            abstractC5288lCrashlytics2 = crashlytics(0);
        }
        if (AbstractC8576l.yandex(abstractC5288lCrashlytics2, abstractC5288lCrashlytics)) {
            if (abstractC5288lCrashlytics2 == null) {
                c14936l = new C14936l();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it3 = c11315l3.iterator();
                while (it3.hasNext()) {
                    ((AbstractC5288l) it3.next()).yandex();
                }
                Iterator<E> it4 = c11315l2.iterator();
                while (it4.hasNext()) {
                    ((AbstractC5288l) it4.next()).yandex();
                }
                c14936l = new C14936l(abstractC5288lCrashlytics2.yandex, arrayList, C2580l.f5619l, arrayList.size());
            }
            C1008l c1008l = this.loadAd;
            if (AbstractC8576l.yandex((C14936l) c1008l.getValue(), c14936l)) {
                return;
            }
            c1008l.remoteconfig(null, c14936l);
            Object[] objArr4 = c1807l.loadAd;
            long[] jArr4 = c1807l.crashlytics;
            int i7 = c1807l.purchase;
            while (i7 != Integer.MAX_VALUE) {
                int i8 = (int) ((jArr4[i7] >> c2) & j);
                ((AbstractC14771l) objArr4[i7]).getClass();
                i7 = i8;
            }
            Object[] objArr5 = c1807l2.loadAd;
            long[] jArr5 = c1807l2.crashlytics;
            int i9 = c1807l2.purchase;
            while (i9 != Integer.MAX_VALUE) {
                int i10 = (int) ((jArr5[i9] >> c2) & j);
                ((AbstractC14771l) objArr5[i9]).getClass();
                i9 = i10;
            }
            Object[] objArr6 = c1807l3.loadAd;
            long[] jArr6 = c1807l3.crashlytics;
            int i11 = c1807l3.purchase;
            while (i11 != Integer.MAX_VALUE) {
                int i12 = (int) ((jArr6[i11] >> c2) & j);
                ((AbstractC14771l) objArr6[i11]).getClass();
                i11 = i12;
            }
        }
    }

    public final void yandex(C1527l c1527l, AbstractC14771l abstractC14771l, int i) {
        C1807l c1807l;
        boolean z;
        if (abstractC14771l.yandex != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(abstractC14771l);
            C1527l c1527l2 = abstractC14771l.yandex;
            sb.append("' is already added to dispatcher ");
            sb.append(c1527l2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            c1807l = i != 1 ? this.subs : this.isPro;
        } else {
            c1807l = this.firebase;
        }
        c1807l.mopub(abstractC14771l);
        abstractC14771l.yandex = c1527l;
        if (i != 0) {
            z = i != 1 ? this.vip : this.smaato;
        } else {
            z = this.remoteconfig;
        }
        abstractC14771l.loadAd(z);
    }
}
