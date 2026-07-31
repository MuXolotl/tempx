package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lؕٛۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3512l {
    public Object amazon;
    public Object billing;
    public final Object crashlytics;
    public boolean loadAd;
    public Object mopub;
    public Object purchase;
    public boolean yandex;

    public C3512l(C8508l c8508l, AbstractC9963l abstractC9963l) {
        int i;
        C2211l c2211l;
        int i2 = c8508l.mopub;
        InterfaceC17619l interfaceC17619l = c8508l.crashlytics;
        this.crashlytics = c8508l;
        this.amazon = abstractC9963l;
        Object obj = c8508l.purchase;
        this.purchase = obj == null ? C2580l.f5619l : obj;
        InterfaceC6228l interfaceC6228l = c8508l.adcel;
        if (interfaceC6228l != null) {
            String str = c8508l.loadAd;
            if (str == null) {
                c2211l = new C2211l(new C10023l(this, interfaceC6228l));
            } else {
                C10023l c10023l = new C10023l(this, interfaceC6228l);
                int iInmobi = AbstractC5020l.inmobi(i2);
                if (iInmobi == 1) {
                    i = 1;
                } else {
                    if (iInmobi != 2) {
                        C11983l.subscription(39, AbstractC4338l.m1527catch(i2), "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int iInmobi2 = AbstractC5020l.inmobi(i2);
                if (iInmobi2 != 1 && iInmobi2 != 2) {
                    C11983l.subscription(39, AbstractC4338l.m1527catch(i2), "Can't get max number of writers for journal mode '");
                    throw null;
                }
                c2211l = new C2211l(c10023l, str, i);
            }
            this.billing = c2211l;
        } else {
            if (interfaceC17619l == null) {
                C8339l.metrica("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            this.billing = new C4392l(new C16543l(27, interfaceC17619l.yandex(new C4619l(c8508l.yandex, c8508l.loadAd, new C14785l(this, abstractC9963l.yandex), false, false))));
        }
        boolean z = i2 == 3;
        InterfaceC11449l interfaceC11449lCrashlytics = crashlytics();
        if (interfaceC11449lCrashlytics != null) {
            interfaceC11449lCrashlytics.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void loadAd(InterfaceC0684l interfaceC0684l) {
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("PRAGMA busy_timeout");
        try {
            interfaceC14742lMo668l.mo827l();
            long j = interfaceC14742lMo668l.getLong(0);
            AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            if (j < 3000) {
                AbstractC13628l.amazon(interfaceC0684l, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th);
                throw th2;
            }
        }
    }

    public static final void yandex(C3512l c3512l, InterfaceC0684l interfaceC0684l) throws Throwable {
        Object c18435l;
        AbstractC9963l abstractC9963l = (AbstractC9963l) c3512l.amazon;
        C8508l c8508l = (C8508l) c3512l.crashlytics;
        if (c8508l.mopub == 3) {
            AbstractC13628l.amazon(interfaceC0684l, "PRAGMA journal_mode = WAL");
        } else {
            AbstractC13628l.amazon(interfaceC0684l, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c8508l.mopub == 3) {
            AbstractC13628l.amazon(interfaceC0684l, "PRAGMA synchronous = NORMAL");
        } else {
            AbstractC13628l.amazon(interfaceC0684l, "PRAGMA synchronous = FULL");
        }
        loadAd(interfaceC0684l);
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("PRAGMA user_version");
        try {
            interfaceC14742lMo668l.mo827l();
            int i = (int) interfaceC14742lMo668l.getLong(0);
            AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            int i2 = abstractC9963l.yandex;
            if (i != i2) {
                AbstractC13628l.amazon(interfaceC0684l, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        c3512l.amazon(interfaceC0684l);
                    } else {
                        c3512l.purchase(interfaceC0684l, i, i2);
                    }
                    AbstractC13628l.amazon(interfaceC0684l, "PRAGMA user_version = " + i2);
                    c18435l = Unit.INSTANCE;
                } catch (Throwable th) {
                    c18435l = new C18435l(th);
                }
                if (!(c18435l instanceof C18435l)) {
                    AbstractC13628l.amazon(interfaceC0684l, "END TRANSACTION");
                }
                Throwable thYandex = C1171l.yandex(c18435l);
                if (thYandex != null) {
                    AbstractC13628l.amazon(interfaceC0684l, "ROLLBACK TRANSACTION");
                    throw thYandex;
                }
            }
            c3512l.billing(interfaceC0684l);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th2);
                throw th3;
            }
        }
    }

    public void amazon(InterfaceC0684l interfaceC0684l) {
        AbstractC9963l abstractC9963l = (AbstractC9963l) this.amazon;
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (interfaceC14742lMo668l.mo827l() && interfaceC14742lMo668l.getLong(0) == 0) {
                z = true;
            }
            AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            abstractC9963l.yandex(interfaceC0684l);
            if (!z) {
                C10997l c10997lMopub = abstractC9963l.mopub(interfaceC0684l);
                if (!c10997lMopub.loadAd) {
                    C11983l.advert(c10997lMopub.crashlytics, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            mopub(interfaceC0684l);
            abstractC9963l.crashlytics();
            Iterator it = ((List) this.purchase).iterator();
            while (it.hasNext()) {
                ((C5350l) it.next()).getClass();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th);
                throw th2;
            }
        }
    }

    public void billing(InterfaceC0684l interfaceC0684l) throws Throwable {
        Object c18435l;
        AbstractC9963l abstractC9963l = (AbstractC9963l) this.amazon;
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = interfaceC14742lMo668l.mo827l() && interfaceC14742lMo668l.getLong(0) != 0;
            AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            if (z) {
                InterfaceC14742l interfaceC14742lMo668l2 = interfaceC0684l.mo668l("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strMo826implements = interfaceC14742lMo668l2.mo827l() ? interfaceC14742lMo668l2.mo826implements(0) : null;
                    AbstractC1214l.yandex(interfaceC14742lMo668l2, null);
                    if (!abstractC9963l.loadAd.equals(strMo826implements) && !abstractC9963l.crashlytics.equals(strMo826implements)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + abstractC9963l.loadAd + ", found: " + strMo826implements).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1214l.yandex(interfaceC14742lMo668l2, th);
                        throw th2;
                    }
                }
            } else {
                AbstractC13628l.amazon(interfaceC0684l, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    C10997l c10997lMopub = abstractC9963l.mopub(interfaceC0684l);
                    if (!c10997lMopub.loadAd) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + c10997lMopub.crashlytics).toString());
                    }
                    abstractC9963l.purchase();
                    mopub(interfaceC0684l);
                    c18435l = Unit.INSTANCE;
                    if (!(c18435l instanceof C18435l)) {
                        AbstractC13628l.amazon(interfaceC0684l, "END TRANSACTION");
                    }
                    Throwable thYandex = C1171l.yandex(c18435l);
                    if (thYandex != null) {
                        AbstractC13628l.amazon(interfaceC0684l, "ROLLBACK TRANSACTION");
                        throw thYandex;
                    }
                } catch (Throwable th3) {
                    c18435l = new C18435l(th3);
                }
            }
            abstractC9963l.amazon(interfaceC0684l);
            for (C5350l c5350l : (List) this.purchase) {
                c5350l.getClass();
                if (interfaceC0684l instanceof C15802l) {
                    C11442l c11442l = ((C15802l) interfaceC0684l).f31025l;
                    switch (c5350l.yandex) {
                        case 0:
                            c11442l.yandex();
                            try {
                                StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                                ((C6565l) c5350l.loadAd).getClass();
                                sb.append(System.currentTimeMillis() - 86400000);
                                sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                c11442l.adcel(sb.toString());
                                c11442l.signatures();
                                c11442l.vip();
                            } catch (Throwable th4) {
                                c11442l.vip();
                                throw th4;
                            }
                            break;
                        default:
                            ((C16931l) c5350l.loadAd).invoke(c11442l);
                            break;
                    }
                }
            }
            this.yandex = true;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th5);
                throw th6;
            }
        }
    }

    public InterfaceC11449l crashlytics() {
        InterfaceC2636l interfaceC2636l = (InterfaceC2636l) this.billing;
        C4392l c4392l = interfaceC2636l instanceof C4392l ? (C4392l) interfaceC2636l : null;
        if (c4392l != null) {
            return (InterfaceC11449l) c4392l.f8923l.f32482l;
        }
        return null;
    }

    public void mopub(InterfaceC0684l interfaceC0684l) {
        AbstractC13628l.amazon(interfaceC0684l, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        AbstractC13628l.amazon(interfaceC0684l, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((AbstractC9963l) this.amazon).loadAd + "')");
    }

    /* JADX WARN: Code duplicated, block: B:120:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[LOOP:4: B:9:0x0025->B:124:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    public void purchase(InterfaceC0684l interfaceC0684l, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        C8195l c8195l;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        boolean z2;
        AbstractC9963l abstractC9963l = (AbstractC9963l) this.amazon;
        C8508l c8508l = (C8508l) this.crashlytics;
        C0099l c0099l = c8508l.amazon;
        if (i == i2) {
            iterable = C2580l.f5619l;
        } else {
            boolean z3 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z3) {
                    if (i3 < i2) {
                        linkedHashMap = c0099l.loadAd;
                        if (z3) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                c8195l = null;
                            } else {
                                c8195l = new C8195l(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                c8195l = null;
                            } else {
                                c8195l = new C8195l(treeMap, treeMap.keySet());
                            }
                        }
                        if (c8195l == null) {
                            Map map = (Map) c8195l.f17098l;
                            it = ((Iterable) c8195l.f17097l).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z3) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        arrayList.add(map.get(Integer.valueOf(iIntValue)));
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    arrayList.add(map.get(Integer.valueOf(iIntValue)));
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = c0099l.loadAd;
                    if (z3) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            c8195l = null;
                        } else {
                            c8195l = new C8195l(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            c8195l = null;
                        } else {
                            c8195l = new C8195l(treeMap, treeMap.keySet());
                        }
                    }
                    if (c8195l == null) {
                        Map map2 = (Map) c8195l.f17098l;
                        it = ((Iterable) c8195l.f17097l).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z3) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        if (iterable != null) {
            abstractC9963l.billing(interfaceC0684l);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((AbstractC8590l) it2.next()).loadAd(interfaceC0684l);
            }
            C10997l c10997lMopub = abstractC9963l.mopub(interfaceC0684l);
            if (!c10997lMopub.loadAd) {
                C11983l.advert(c10997lMopub.crashlytics, "Migration didn't properly handle: ");
                return;
            } else {
                abstractC9963l.purchase();
                mopub(interfaceC0684l);
                return;
            }
        }
        if (i <= i2 || !c8508l.smaato) {
            Set set = c8508l.remoteconfig;
            if (!c8508l.firebase || (set != null && set.contains(Integer.valueOf(i)))) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c8508l.startapp) {
            InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                C10227l c10227lAdmob = AbstractC14055l.admob();
                while (interfaceC14742lMo668l.mo827l()) {
                    String strMo826implements = interfaceC14742lMo668l.mo826implements(0);
                    if (!AbstractC16648l.isVip(strMo826implements, "sqlite_", false) && !strMo826implements.equals("android_metadata")) {
                        c10227lAdmob.add(new C8195l(strMo826implements, Boolean.valueOf(AbstractC8576l.yandex(interfaceC14742lMo668l.mo826implements(1), "view"))));
                    }
                }
                C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
                AbstractC1214l.yandex(interfaceC14742lMo668l, null);
                ListIterator listIterator = c10227lPurchase.listIterator(0);
                while (true) {
                    C13376l c13376l = (C13376l) listIterator;
                    if (!c13376l.hasNext()) {
                        break;
                    }
                    C8195l c8195l2 = (C8195l) c13376l.next();
                    String str = (String) c8195l2.f17098l;
                    if (((Boolean) c8195l2.f17097l).booleanValue()) {
                        AbstractC13628l.amazon(interfaceC0684l, "DROP VIEW IF EXISTS " + str);
                    } else {
                        AbstractC13628l.amazon(interfaceC0684l, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1214l.yandex(interfaceC14742lMo668l, th);
                    throw th2;
                }
            }
        } else {
            abstractC9963l.loadAd(interfaceC0684l);
        }
        Iterator it3 = ((List) this.purchase).iterator();
        while (it3.hasNext()) {
            ((C5350l) it3.next()).getClass();
        }
        abstractC9963l.yandex(interfaceC0684l);
    }

    public C3512l(C8508l c8508l, C5266l c5266l) {
        this.crashlytics = c8508l;
        this.amazon = new C11740l("", -1, "");
        List list = c8508l.purchase;
        C2580l c2580l = C2580l.f5619l;
        this.purchase = list == null ? c2580l : list;
        AbstractC16901l.m4218final(new C5350l(1, new C16931l(12, this)), list == null ? c2580l : list);
        throw new C13165l();
    }

    public C3512l(Context context) {
        this.crashlytics = context;
        C8193l c8193l = C8193l.billing;
    }
}
