package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lُؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4595l {
    public final C15581l yandex;
    public static final C16033l loadAd = new C16033l("fire-global");
    public static final C16033l crashlytics = new C16033l("fire-count");
    public static final C16033l amazon = new C16033l("last-used-date");

    public C4595l(Context context, String str) {
        this.yandex = new C15581l(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized void admob(C16221l c16221l, String str) {
        C16033l c16033lPurchase = purchase(c16221l, str);
        if (c16033lPurchase == null) {
            return;
        }
        Object hashSet = new HashSet();
        Object objCrashlytics = c16221l.crashlytics(c16033lPurchase);
        if (objCrashlytics != null) {
            hashSet = objCrashlytics;
        }
        HashSet hashSet2 = new HashSet((Collection) hashSet);
        hashSet2.remove(str);
        if (hashSet2.isEmpty()) {
            c16221l.loadAd();
            c16221l.yandex.remove(c16033lPurchase);
        } else {
            c16221l.amazon(c16033lPurchase, hashSet2);
        }
    }

    public final synchronized String amazon(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized boolean billing(long j, long j2) {
        return amazon(j).equals(amazon(j2));
    }

    public final synchronized ArrayList crashlytics() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strAmazon = amazon(System.currentTimeMillis());
            C15581l c15581l = this.yandex;
            c15581l.getClass();
            for (Map.Entry entry : ((Map) AbstractC10999l.subs(C17218l.f33421l, new C9082l(c15581l, null, 0))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strAmazon);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C2986l(((C16033l) entry.getKey()).yandex, new ArrayList(hashSet)));
                    }
                }
            }
            smaato(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void firebase(long j, String str) throws Throwable {
        try {
            try {
                String strAmazon = amazon(j);
                C16033l c16033l = new C16033l(str);
                this.yandex.yandex(new C17796l(this, strAmazon, str, c16033l, 6));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized boolean isPro(long j) {
        C15581l c15581l = this.yandex;
        c15581l.getClass();
        InterfaceC14029l interfaceC14029l = null;
        C9082l c9082l = new C9082l(c15581l, interfaceC14029l, 1);
        C17218l c17218l = C17218l.f33421l;
        if (billing(((Long) AbstractC10999l.subs(c17218l, c9082l)).longValue(), j)) {
            return false;
        }
        C15581l c15581l2 = this.yandex;
        Long lValueOf = Long.valueOf(j);
        c15581l2.getClass();
        return true;
    }

    public final synchronized void loadAd() {
        this.yandex.yandex(new C15079l(28, this));
    }

    public final synchronized void mopub() {
        this.yandex.yandex(new C3005l(this, amazon(System.currentTimeMillis()), 18));
    }

    public final synchronized C16033l purchase(C16221l c16221l, String str) {
        for (Map.Entry entry : c16221l.yandex().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return new C16033l(((C16033l) entry.getKey()).yandex);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void smaato(long j) {
        this.yandex.yandex(new C4199l(j, 6));
    }

    public final synchronized boolean subs(long j) {
        return isPro(j);
    }

    public final synchronized long yandex(C16221l c16221l) {
        long j;
        try {
            Object obj = 0L;
            Object objCrashlytics = c16221l.crashlytics(crashlytics);
            if (objCrashlytics != null) {
                obj = objCrashlytics;
            }
            long jLongValue = ((Long) obj).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : c16221l.yandex().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = ((C16033l) entry.getKey()).yandex;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            c16221l.amazon(new C16033l(str), hashSet2);
            j = jLongValue - 1;
            c16221l.amazon(crashlytics, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }
}
