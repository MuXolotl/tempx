package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: renamed from: lِّۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12220l {
    public static final HashSet isPro = new HashSet();
    public long admob;
    public final C10023l amazon;
    public final Random billing;
    public final C1424l crashlytics;
    public final C6172l loadAd;
    public final boolean mopub;
    public final HashMap purchase;
    public C0322l subs;
    public final File yandex;

    public C12220l(File file, C6172l c6172l, C11324l c11324l) {
        boolean zAdd;
        C1424l c1424l = new C1424l();
        c1424l.f3603l = new HashMap();
        c1424l.f3602l = new SparseArray();
        c1424l.f3601l = new SparseBooleanArray();
        c1424l.f3605l = new SparseBooleanArray();
        C10038l c10038l = new C10038l(c11324l);
        C18480l c18480l = new C18480l(new File(file, "cached_content_index.exi"));
        c1424l.f3604l = c10038l;
        c1424l.f3606l = c18480l;
        C10023l c10023l = new C10023l();
        c10023l.f20419l = c11324l;
        synchronized (C12220l.class) {
            zAdd = isPro.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            C11983l.ad(file, "Another SimpleCache instance uses the folder: ");
            throw null;
        }
        this.yandex = file;
        this.loadAd = c6172l;
        this.crashlytics = c1424l;
        this.amazon = c10023l;
        this.purchase = new HashMap();
        this.billing = new Random();
        this.mopub = true;
        this.admob = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new C12889l(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void purchase(File file) throws C0322l {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC6427l.admob("SimpleCache", str);
        throw new C0322l(str);
    }

    public static long subs(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                } catch (NumberFormatException unused) {
                    AbstractC6427l.admob("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static void yandex(C12220l c12220l) {
        C10023l c10023l = c12220l.amazon;
        C1424l c1424l = c12220l.crashlytics;
        File file = c12220l.yandex;
        if (!file.exists()) {
            try {
                purchase(file);
            } catch (C0322l e) {
                c12220l.subs = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            AbstractC6427l.admob("SimpleCache", str);
            c12220l.subs = new C0322l(str);
            return;
        }
        long jSubs = subs(fileArrListFiles);
        c12220l.admob = jSubs;
        if (jSubs == -1) {
            try {
                long jNextLong = new SecureRandom().nextLong();
                long j = 0;
                long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
                File file2 = new File(file, AbstractC12900l.firebase(Long.toString(jAbs, 16), ".uid"));
                if (file2.createNewFile()) {
                    j = jAbs;
                } else {
                    C10754l.pro(file2, "Failed to create UID file: ");
                }
                c12220l.admob = j;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                AbstractC6427l.subs("SimpleCache", str2, e2);
                c12220l.subs = new C0322l(str2, e2);
                return;
            }
        }
        try {
            c1424l.m960this(c12220l.admob);
            if (c10023l != null) {
                c10023l.premium(c12220l.admob);
                HashMap mapAdvert = c10023l.advert();
                c12220l.admob(file, true, fileArrListFiles, mapAdvert);
                c10023l.m2831strictfp(mapAdvert.keySet());
            } else {
                c12220l.admob(file, true, fileArrListFiles, null);
            }
            AbstractC10199l it = AbstractC8481l.ads(((HashMap) c1424l.f3603l).keySet()).iterator();
            while (it.hasNext()) {
                c1424l.m922l((String) it.next());
            }
            try {
                c1424l.m924l();
            } catch (IOException e3) {
                AbstractC6427l.subs("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            AbstractC6427l.subs("SimpleCache", str3, e4);
            c12220l.subs = new C0322l(str3, e4);
        }
    }

    public final void admob(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                admob(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                C17144l c17144l = map != null ? (C17144l) map.remove(name) : null;
                if (c17144l != null) {
                    j = c17144l.yandex;
                    j2 = c17144l.loadAd;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                C0812l c0812lLoadAd = C0812l.loadAd(file2, j, j2, this.crashlytics);
                if (c0812lLoadAd != null) {
                    loadAd(c0812lLoadAd);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void amazon() {
        C0322l c0322l = this.subs;
        if (c0322l != null) {
            throw c0322l;
        }
    }

    public final synchronized C9056l billing(String str) {
        C1013l c1013lM958super;
        c1013lM958super = this.crashlytics.m958super(str);
        return c1013lM958super != null ? c1013lM958super.purchase : C9056l.crashlytics;
    }

    public final synchronized void crashlytics(String str, C0458l c0458l) {
        amazon();
        C1424l c1424l = this.crashlytics;
        C1013l c1013lM914instanceof = c1424l.m914instanceof(str);
        C9056l c9056l = c1013lM914instanceof.purchase;
        C9056l c9056lYandex = c9056l.yandex(c0458l);
        c1013lM914instanceof.purchase = c9056lYandex;
        if (!c9056lYandex.equals(c9056l)) {
            ((InterfaceC13158l) c1424l.f3604l).pro(c1013lM914instanceof);
        }
        try {
            this.crashlytics.m924l();
        } catch (IOException e) {
            throw new C0322l(e);
        }
    }

    public final void firebase(C0812l c0812l) {
        String str = c0812l.f2437l;
        long j = c0812l.f2435l;
        File file = c0812l.f2438l;
        C1424l c1424l = this.crashlytics;
        C1013l c1013lM958super = c1424l.m958super(str);
        if (c1013lM958super == null || !c1013lM958super.crashlytics.remove(c0812l)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        C10023l c10023l = this.amazon;
        if (c10023l != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) c10023l.f20418l).getClass();
                try {
                    ((C11324l) c10023l.f20419l).getWritableDatabase().delete((String) c10023l.f20418l, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new C12309l(e);
                }
            } catch (IOException unused) {
                AbstractC11043l.remoteconfig("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        c1424l.m922l(c1013lM958super.loadAd);
        ArrayList arrayList = (ArrayList) this.purchase.get(c0812l.f2437l);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C6172l c6172l = (C6172l) arrayList.get(size);
                c6172l.yandex.remove(c0812l);
                c6172l.loadAd -= j;
            }
        }
        C6172l c6172l2 = this.loadAd;
        c6172l2.yandex.remove(c0812l);
        c6172l2.loadAd -= j;
    }

    public final synchronized void isPro(C0812l c0812l) {
        C1013l c1013lM958super = this.crashlytics.m958super(c0812l.f2437l);
        c1013lM958super.getClass();
        long j = c0812l.f2436l;
        ArrayList arrayList = c1013lM958super.amazon;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C14798l) arrayList.get(i)).yandex == j) {
                arrayList.remove(i);
                this.crashlytics.m922l(c1013lM958super.loadAd);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void loadAd(C0812l c0812l) {
        String str = c0812l.f2437l;
        this.crashlytics.m914instanceof(str).crashlytics.add(c0812l);
        ArrayList arrayList = (ArrayList) this.purchase.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C6172l) arrayList.get(size)).loadAd(this, c0812l);
            }
        }
        this.loadAd.loadAd(this, c0812l);
    }

    public final C0812l mopub(String str, long j, long j2) {
        C0812l c0812l;
        long j3;
        C1013l c1013lM958super = this.crashlytics.m958super(str);
        if (c1013lM958super == null) {
            return new C0812l(str, j, j2, -9223372036854775807L, null);
        }
        while (true) {
            C0812l c0812l2 = new C0812l(c1013lM958super.loadAd, j, -1L, -9223372036854775807L, null);
            TreeSet treeSet = c1013lM958super.crashlytics;
            c0812l = (C0812l) treeSet.floor(c0812l2);
            if (c0812l == null || c0812l.f2436l + c0812l.f2435l <= j) {
                C0812l c0812l3 = (C0812l) treeSet.ceiling(c0812l2);
                if (c0812l3 != null) {
                    long jMin = c0812l3.f2436l - j;
                    if (j2 != -1) {
                        jMin = Math.min(jMin, j2);
                    }
                    j3 = jMin;
                } else {
                    j3 = j2;
                }
                c0812l = new C0812l(c1013lM958super.loadAd, j, j3, -9223372036854775807L, null);
            }
            if (!c0812l.f2439l) {
                break;
            }
            File file = c0812l.f2438l;
            file.getClass();
            if (file.length() == c0812l.f2435l) {
                break;
            }
            smaato();
        }
        return c0812l;
    }

    public final synchronized C0812l remoteconfig(String str, long j, long j2) {
        amazon();
        C0812l c0812lMopub = mopub(str, j, j2);
        if (c0812lMopub.f2439l) {
            return vip(str, c0812lMopub);
        }
        C1013l c1013lM914instanceof = this.crashlytics.m914instanceof(str);
        long j3 = c0812lMopub.f2435l;
        ArrayList arrayList = c1013lM914instanceof.amazon;
        for (int i = 0; i < arrayList.size(); i++) {
            C14798l c14798l = (C14798l) arrayList.get(i);
            long j4 = c14798l.yandex;
            if (j4 <= j) {
                long j5 = c14798l.loadAd;
                if (j5 == -1 || j4 + j5 > j) {
                    return null;
                }
            } else {
                if (j3 == -1 || j + j3 > j4) {
                    return null;
                }
            }
        }
        arrayList.add(new C14798l(j, j3));
        return c0812lMopub;
    }

    public final void smaato() {
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableCollection(((HashMap) this.crashlytics.f3603l).values()).iterator();
        while (it.hasNext()) {
            for (C0812l c0812l : ((C1013l) it.next()).crashlytics) {
                File file = c0812l.f2438l;
                file.getClass();
                if (file.length() != c0812l.f2435l) {
                    arrayList.add(c0812l);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            firebase((C0812l) arrayList.get(i));
        }
    }

    public final C0812l vip(String str, C0812l c0812l) {
        boolean z;
        File file;
        long j = c0812l.f2435l;
        File file2 = c0812l.f2438l;
        if (!this.mopub) {
            return c0812l;
        }
        file2.getClass();
        String name = file2.getName();
        long j2 = c0812l.f2435l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C10023l c10023l = this.amazon;
        if (c10023l != null) {
            try {
                c10023l.m2828native(name, j2, jCurrentTimeMillis);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                AbstractC6427l.vip("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C1013l c1013lM958super = this.crashlytics.m958super(str);
        c1013lM958super.getClass();
        TreeSet treeSet = c1013lM958super.crashlytics;
        AbstractC12442l.subscription(treeSet.remove(c0812l));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileCrashlytics = C0812l.crashlytics(parentFile, c1013lM958super.yandex, c0812l.f2436l, jCurrentTimeMillis);
            if (file2.renameTo(fileCrashlytics)) {
                file = fileCrashlytics;
            } else {
                AbstractC6427l.vip("CachedContent", "Failed to rename " + file2 + " to " + fileCrashlytics);
                file = file2;
            }
        } else {
            file = file2;
        }
        AbstractC12442l.subscription(c0812l.f2439l);
        C0812l c0812l2 = new C0812l(c0812l.f2437l, c0812l.f2436l, c0812l.f2435l, jCurrentTimeMillis, file);
        treeSet.add(c0812l2);
        ArrayList arrayList = (ArrayList) this.purchase.get(c0812l.f2437l);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C6172l c6172l = (C6172l) arrayList.get(size);
                c6172l.yandex.remove(c0812l);
                c6172l.loadAd -= j;
                c6172l.loadAd(this, c0812l2);
            }
        }
        C6172l c6172l2 = this.loadAd;
        c6172l2.yandex.remove(c0812l);
        c6172l2.loadAd -= j;
        c6172l2.loadAd(this, c0812l2);
        return c0812l2;
    }
}
