package defpackage;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: lّٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12635l {
    public static final String yandex = C14513l.applovin("EnqueueRunnable");

    /* JADX WARN: Code duplicated, block: B:104:0x0205  */
    /* JADX WARN: Code duplicated, block: B:107:0x020b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0258  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a4 A[LOOP:5: B:125:0x02a2->B:126:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x02dd A[LOOP:6: B:128:0x02d7->B:130:0x02dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:153:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8  */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x02a0, please report this as an issue */
    public static boolean yandex(C5934l c5934l) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        Iterator it;
        boolean z6;
        boolean z7;
        boolean z8;
        C7718l c7718lLoadAd;
        UUID uuid;
        boolean zYandex;
        C0480l c0480lLicense;
        String string;
        Iterator it2;
        int i;
        String str;
        HashSet hashSetLoadAd = C5934l.loadAd(c5934l);
        C13432l c13432l = c5934l.yandex;
        List list = c5934l.amazon;
        int i2 = 0;
        String[] strArr = (String[]) hashSetLoadAd.toArray(new String[0]);
        String str2 = c5934l.loadAd;
        int i3 = c5934l.crashlytics;
        c13432l.loadAd.amazon.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = c13432l.crashlytics;
        boolean z9 = strArr != null && strArr.length > 0;
        EnumC9176l enumC9176l = EnumC9176l.f18875l;
        EnumC9176l enumC9176l2 = EnumC9176l.f18881l;
        EnumC9176l enumC9176l3 = EnumC9176l.f18880l;
        if (z9) {
            int length = strArr.length;
            z = false;
            z2 = false;
            z3 = true;
            while (true) {
                if (i2 < length) {
                    String str3 = strArr[i2];
                    List list2 = list;
                    C7718l c7718lAmazon = workDatabase2.Signature().amazon(str3);
                    if (c7718lAmazon == null) {
                        C14513l.tapsense().startapp(yandex, "Prerequisite " + str3 + " doesn't exist; not enqueuing");
                    } else {
                        EnumC9176l enumC9176l4 = c7718lAmazon.loadAd;
                        z3 &= enumC9176l4 == enumC9176l;
                        if (enumC9176l4 == enumC9176l3) {
                            z2 = true;
                        } else if (enumC9176l4 == enumC9176l2) {
                            z = true;
                        }
                        i2++;
                        list = list2;
                    }
                }
                z8 = false;
                z7 = true;
                c5934l.mopub = z7;
                return z8;
            }
        }
        z = false;
        z2 = false;
        z3 = true;
        List list3 = list;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        EnumC9176l enumC9176l5 = EnumC9176l.f18878l;
        if (!zIsEmpty && !z9) {
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            List list4 = (List) AbstractC2021l.purchase(workDatabase2.Signature().yandex, true, false, new C6789l(str2, 4));
            if (!list4.isEmpty()) {
                if (i3 == 3 || i3 == 4) {
                    C13664l c13664lStartapp = workDatabase.startapp();
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        C15573l c15573l = (C15573l) it3.next();
                        C13664l c13664l = c13664lStartapp;
                        Iterator it4 = it3;
                        if (!((Boolean) AbstractC2021l.purchase(c13664lStartapp.yandex, true, false, new C6908l(c15573l.yandex, 8))).booleanValue()) {
                            EnumC9176l enumC9176l6 = c15573l.loadAd;
                            boolean z10 = z3 & (enumC9176l6 == enumC9176l);
                            if (enumC9176l6 == enumC9176l3) {
                                z2 = true;
                            } else if (enumC9176l6 == enumC9176l2) {
                                z = true;
                            }
                            arrayList.add(c15573l.yandex);
                            z3 = z10;
                        }
                        c13664lStartapp = c13664l;
                        it3 = it4;
                    }
                    List list5 = arrayList;
                    list5 = arrayList;
                    if (i3 == 4 && (z || z2)) {
                        C9280l c9280lSignature = workDatabase.Signature();
                        Iterator it5 = ((List) AbstractC2021l.purchase(c9280lSignature.yandex, true, false, new C6789l(str2, 4))).iterator();
                        while (it5.hasNext()) {
                            AbstractC2021l.purchase(c9280lSignature.yandex, false, true, new C6789l(((C15573l) it5.next()).yandex, 3));
                        }
                        z = false;
                        z2 = false;
                        list5 = Collections.EMPTY_LIST;
                    }
                    strArr = (String[]) list5.toArray(strArr);
                    z9 = strArr.length > 0;
                } else {
                    try {
                        if (i3 == 2) {
                            Iterator it6 = list4.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    EnumC9176l enumC9176l7 = ((C15573l) it6.next()).loadAd;
                                    if (enumC9176l7 == enumC9176l5 || enumC9176l7 == EnumC9176l.f18877l) {
                                        z8 = false;
                                        z7 = true;
                                        c5934l.mopub = z7;
                                        return z8;
                                    }
                                }
                            }
                        }
                        Iterator it7 = ((List) AbstractC2021l.purchase(workDatabase.Signature().yandex, true, false, new C6908l(str2, 27))).iterator();
                        while (it7.hasNext()) {
                            AbstractC1497l.crashlytics(c13432l, (String) it7.next());
                        }
                        workDatabase.vip();
                        workDatabase.firebase();
                        C9280l c9280lSignature2 = workDatabase.Signature();
                        Iterator it8 = list4.iterator();
                        while (it8.hasNext()) {
                            AbstractC2021l.purchase(c9280lSignature2.yandex, false, true, new C6789l(((C15573l) it8.next()).yandex, 3));
                        }
                        z5 = true;
                    } catch (Throwable th) {
                        workDatabase.firebase();
                        throw th;
                    }
                    workDatabase.loadAd();
                }
            }
            it = list3.iterator();
            z6 = z5;
            while (it.hasNext()) {
                C9335l c9335l = (C9335l) it.next();
                c7718lLoadAd = c9335l.loadAd;
                uuid = c9335l.yandex;
                if (z9 || z3) {
                    c7718lLoadAd.vip = jCurrentTimeMillis;
                } else if (z2) {
                    c7718lLoadAd.loadAd = enumC9176l3;
                } else if (z) {
                    c7718lLoadAd.loadAd = enumC9176l2;
                } else {
                    c7718lLoadAd.loadAd = EnumC9176l.f18879l;
                }
                if (c7718lLoadAd.loadAd == enumC9176l5) {
                    z6 = true;
                }
                C9280l c9280lSignature3 = workDatabase.Signature();
                Iterator it9 = it;
                zYandex = c7718lLoadAd.purchase.yandex("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                EnumC9176l enumC9176l8 = enumC9176l5;
                long j = jCurrentTimeMillis;
                boolean zYandex2 = c7718lLoadAd.purchase.yandex("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                boolean zYandex3 = c7718lLoadAd.purchase.yandex("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                if (!zYandex && zYandex2 && zYandex3) {
                    String str4 = c7718lLoadAd.crashlytics;
                    C5183l c5183l = new C5183l(0);
                    c5183l.amazon(c7718lLoadAd.purchase.yandex);
                    c5183l.yandex.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str4);
                    c7718lLoadAd = C7718l.loadAd(c7718lLoadAd, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", c5183l.yandex());
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    C13152l c13152l = c7718lLoadAd.isPro;
                    str = c7718lLoadAd.crashlytics;
                    if (!AbstractC8576l.yandex(str, ConstraintTrackingWorker.class.getName()) && (c13152l.purchase || c13152l.billing)) {
                        C5183l c5183l2 = new C5183l(0);
                        c5183l2.amazon(c7718lLoadAd.purchase.yandex);
                        c5183l2.yandex.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                        c7718lLoadAd = C7718l.loadAd(c7718lLoadAd, ConstraintTrackingWorker.class.getName(), c5183l2.yandex());
                    }
                }
                AbstractC2021l.purchase(c9280lSignature3.yandex, false, true, new C15575l(c9280lSignature3, c7718lLoadAd, 18));
                if (z9) {
                    for (String str5 : strArr) {
                        C1044l c1044l = new C1044l(uuid.toString(), str5);
                        C13664l c13664lStartapp2 = workDatabase.startapp();
                        AbstractC2021l.purchase(c13664lStartapp2.yandex, false, true, new C3005l(c13664lStartapp2, c1044l, 9));
                    }
                }
                c0480lLicense = workDatabase.license();
                string = uuid.toString();
                Set set = c9335l.crashlytics;
                c0480lLicense.getClass();
                it2 = set.iterator();
                while (it2.hasNext()) {
                    AbstractC2021l.purchase(c0480lLicense.yandex, false, true, new C15575l(c0480lLicense, new C0854l((String) it2.next(), string), 19));
                }
                if (!z4) {
                    C10154l c10154lSubscription = workDatabase.subscription();
                    AbstractC2021l.purchase(c10154lSubscription.yandex, false, true, new C15575l(c10154lSubscription, new C17063l(str2, uuid.toString()), 14));
                }
                it = it9;
                enumC9176l5 = enumC9176l8;
                jCurrentTimeMillis = j;
            }
            z7 = true;
            z8 = z6;
            c5934l.mopub = z7;
            return z8;
        }
        z4 = zIsEmpty;
        workDatabase = workDatabase2;
        z5 = false;
        it = list3.iterator();
        z6 = z5;
        while (it.hasNext()) {
            C9335l c9335l2 = (C9335l) it.next();
            c7718lLoadAd = c9335l2.loadAd;
            uuid = c9335l2.yandex;
            if (z9) {
                c7718lLoadAd.vip = jCurrentTimeMillis;
            } else {
                c7718lLoadAd.vip = jCurrentTimeMillis;
            }
            if (c7718lLoadAd.loadAd == enumC9176l5) {
                z6 = true;
            }
            C9280l c9280lSignature4 = workDatabase.Signature();
            Iterator it10 = it;
            zYandex = c7718lLoadAd.purchase.yandex("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            EnumC9176l enumC9176l9 = enumC9176l5;
            long j2 = jCurrentTimeMillis;
            boolean zYandex4 = c7718lLoadAd.purchase.yandex("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zYandex5 = c7718lLoadAd.purchase.yandex("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zYandex) {
                String str6 = c7718lLoadAd.crashlytics;
                C5183l c5183l3 = new C5183l(0);
                c5183l3.amazon(c7718lLoadAd.purchase.yandex);
                c5183l3.yandex.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str6);
                c7718lLoadAd = C7718l.loadAd(c7718lLoadAd, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", c5183l3.yandex());
            }
            if (Build.VERSION.SDK_INT <= 25) {
                C13152l c13152l2 = c7718lLoadAd.isPro;
                str = c7718lLoadAd.crashlytics;
                if (!AbstractC8576l.yandex(str, ConstraintTrackingWorker.class.getName())) {
                    C5183l c5183l4 = new C5183l(0);
                    c5183l4.amazon(c7718lLoadAd.purchase.yandex);
                    c5183l4.yandex.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                    c7718lLoadAd = C7718l.loadAd(c7718lLoadAd, ConstraintTrackingWorker.class.getName(), c5183l4.yandex());
                }
            }
            AbstractC2021l.purchase(c9280lSignature4.yandex, false, true, new C15575l(c9280lSignature4, c7718lLoadAd, 18));
            if (z9) {
                while (i < r3) {
                    C1044l c1044l2 = new C1044l(uuid.toString(), str5);
                    C13664l c13664lStartapp3 = workDatabase.startapp();
                    AbstractC2021l.purchase(c13664lStartapp3.yandex, false, true, new C3005l(c13664lStartapp3, c1044l2, 9));
                }
            }
            c0480lLicense = workDatabase.license();
            string = uuid.toString();
            Set set2 = c9335l2.crashlytics;
            c0480lLicense.getClass();
            it2 = set2.iterator();
            while (it2.hasNext()) {
                AbstractC2021l.purchase(c0480lLicense.yandex, false, true, new C15575l(c0480lLicense, new C0854l((String) it2.next(), string), 19));
            }
            if (!z4) {
                C10154l c10154lSubscription2 = workDatabase.subscription();
                AbstractC2021l.purchase(c10154lSubscription2.yandex, false, true, new C15575l(c10154lSubscription2, new C17063l(str2, uuid.toString()), 14));
            }
            it = it10;
            enumC9176l5 = enumC9176l9;
            jCurrentTimeMillis = j2;
        }
        z7 = true;
        z8 = z6;
        c5934l.mopub = z7;
        return z8;
    }
}
