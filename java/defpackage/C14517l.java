package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓۤؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14517l implements Closeable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final Map f28397l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Map f28398l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18662l f28399l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C9598l f28400l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C11644l f28401l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Map f28402l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Map f28403l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14437l f28404l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public List f28405l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public Map f28406l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public volatile boolean f28407l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C15390l f28408l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f28409l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f28410l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C15390l f28411l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Object f28412l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC2262l f28413l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C9598l f28414l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C18474l f28415l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public Map f28416l;

    public C14517l(C14437l c14437l, Map map, Map map2, ArrayList arrayList, ArrayList arrayList2, InterfaceC2262l interfaceC2262l, AbstractC1872l abstractC1872l) {
        this.f28404l = c14437l;
        this.f28403l = map;
        this.f28398l = map2;
        this.f28410l = arrayList;
        this.f28409l = arrayList2;
        this.f28413l = interfaceC2262l;
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(abstractC1872l, new C0499l("CXCP-GraphLoop")));
        this.f28399l = c18662lYandex;
        int i = 0;
        int i2 = 0;
        C11644l c11644l = new C11644l(new C17847l(1, this, C14517l.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", i2, i, 15), new C14959l(2, this, C14517l.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, i, 5));
        InterfaceC14029l interfaceC14029l = null;
        if (!((C18474l) c11644l.f23361l).yandex()) {
            C8339l.smaato("ProcessingQueue cannot be re-started!");
            throw null;
        }
        if (AbstractC10999l.mopub(c18662lYandex, null, 0, new C17972l(c11644l, interfaceC14029l, 5), 3).isCancelled()) {
            c11644l.m3158l(null);
        }
        this.f28401l = c11644l;
        this.f28412l = new Object();
        C14054l c14054l = C14054l.f27396l;
        this.f28397l = c14054l;
        this.f28415l = AbstractC1805l.yandex(true);
        this.f28402l = c14054l;
        this.f28406l = c14054l;
        this.f28416l = map2;
        this.f28405l = arrayList;
    }

    public final void adcel(List list, int i, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 >= i3) {
                if (!z || (i2 = i + 1) >= list.size()) {
                    return;
                }
                InterfaceC12641l interfaceC12641l = (InterfaceC12641l) list.get(i2);
                if (interfaceC12641l instanceof AbstractC2137l) {
                    vip(list, i2, (AbstractC2137l) interfaceC12641l, false);
                    return;
                } else {
                    if (interfaceC12641l instanceof C1879l) {
                        signatures(list, i2, (C1879l) interfaceC12641l);
                        return;
                    }
                    return;
                }
            }
            InterfaceC12641l interfaceC12641l2 = (InterfaceC12641l) list.get(i3);
            if (interfaceC12641l2 instanceof C12253l) {
                C15390l c15390l = ((C12253l) interfaceC12641l2).yandex;
                if (billing(Collections.singletonList(c15390l), C14054l.f27396l, true)) {
                    this.f28408l = c15390l;
                    list.remove(i3);
                    while (i4 < i3) {
                        if (((InterfaceC12641l) list.get(i4)) instanceof C12253l) {
                            list.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
            }
            i3--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bd -> B:37:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:36:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e5 -> B:39:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ads(java.util.List r18, int r19, defpackage.C10916l r20, defpackage.InterfaceC14029l r21) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14517l.ads(java.util.List, int, lٌٍُ, lٌؚٓ):java.lang.Object");
    }

    public final boolean billing(List list, Map map, boolean z) throws Throwable {
        Map mapCrashlytics;
        C9598l c9598l = this.f28400l;
        if (c9598l == null) {
            return false;
        }
        Map map2 = this.f28402l;
        if (map.isEmpty()) {
            mapCrashlytics = this.f28416l;
        } else {
            C17963l c17963l = new C17963l();
            c17963l.putAll(this.f28406l);
            c17963l.putAll(map);
            c17963l.putAll(this.f28398l);
            Unit unit = Unit.INSTANCE;
            mapCrashlytics = c17963l.crashlytics();
        }
        boolean zM2700throw = c9598l.m2700throw(z, list, this.f28403l, map2, mapCrashlytics, this.f28405l);
        if (!zM2700throw) {
            if (z) {
                Log.w("CXCP", "Failed to repeat with " + AbstractC16901l.m4208abstract(list));
                return zM2700throw;
            }
            if (map.isEmpty()) {
                Log.w("CXCP", "Failed to submit capture with " + list);
                return zM2700throw;
            }
            Log.w("CXCP", "Failed to trigger with " + AbstractC16901l.m4208abstract(list) + " and " + map);
        }
        return zM2700throw;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f28412l) {
            try {
                if (this.f28407l) {
                    return;
                }
                this.f28407l = true;
                C9598l c9598l = this.f28414l;
                int i = 0;
                InterfaceC14029l interfaceC14029l = null;
                if (c9598l != null) {
                    AbstractC10999l.mopub(this.f28413l, null, 0, new C5064l(c9598l, interfaceC14029l, i), 3);
                }
                this.f28414l = null;
                this.f28401l.m3144l(C15305l.crashlytics);
                int size = this.f28409l.size();
                while (i < size) {
                    ((InterfaceC12762l) this.f28409l.get(i)).loadAd();
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean inmobi() {
        Boolean boolValueOf;
        C9598l c9598l = this.f28400l;
        if (c9598l == null) {
            return false;
        }
        C15390l c15390l = this.f28408l;
        if (c15390l != null) {
            boolValueOf = Boolean.valueOf(c9598l.m2700throw(true, Collections.singletonList(c15390l), this.f28403l, this.f28402l, this.f28416l, this.f28405l));
        } else {
            boolValueOf = null;
        }
        return AbstractC8576l.yandex(boolValueOf, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc A[PHI: r2 r8 r11
  0x00cc: PHI (r2v5 int) = (r2v3 int), (r2v8 int) binds: [B:32:0x0092, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r8v7 java.util.List) = (r8v6 java.util.List), (r8v8 java.util.List) binds: [B:32:0x0092, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r11v6 int) = (r11v5 int), (r11v7 int) binds: [B:32:0x0092, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0092 -> B:48:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b7 -> B:47:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c7 -> B:47:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object isVip(java.util.List r11, defpackage.InterfaceC14029l r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14517l.isVip(java.util.List, lٌؚٓ):java.lang.Object");
    }

    public final C15390l mopub() {
        C15390l c15390l;
        synchronized (this.f28412l) {
            c15390l = this.f28411l;
        }
        return c15390l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m3861package(C9598l c9598l) {
        synchronized (this.f28412l) {
            C9598l c9598l2 = this.f28414l;
            this.f28414l = c9598l;
            if (this.f28407l) {
                InterfaceC14029l interfaceC14029l = null;
                this.f28414l = null;
                if (c9598l != null) {
                    AbstractC10999l.mopub(this.f28413l, null, 0, new C5064l(c9598l, interfaceC14029l, 1), 3);
                }
                return;
            }
            if (c9598l2 != c9598l) {
                this.f28401l.m3144l(new C10916l(c9598l2, c9598l));
            }
            Unit unit = Unit.INSTANCE;
            if (c9598l == null) {
                int size = this.f28409l.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC12762l) this.f28409l.get(i)).yandex();
                }
            }
        }
    }

    public final void signatures(List list, int i, C1879l c1879l) {
        C15390l c15390l = this.f28408l;
        if (c15390l == null && i == 0) {
            list.remove(i);
            return;
        }
        if (this.f28415l.loadAd() && c15390l != null && billing(Collections.singletonList(c15390l), c1879l.yandex, false)) {
            list.remove(i);
            return;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (((InterfaceC12641l) list.get(i2)) instanceof C12253l) {
                adcel(list, i2, false);
            } else {
                C8339l.smaato("Check failed.");
            }
        }
    }

    public final String toString() {
        return "GraphLoop(" + this.f28404l + ')';
    }

    public final void vip(List list, int i, AbstractC2137l abstractC2137l, boolean z) {
        if (this.f28415l.loadAd() && billing(null, C14054l.f27396l, false)) {
            list.remove(i);
            return;
        }
        if (!z || i <= 0) {
            return;
        }
        int i2 = i - 1;
        if (((InterfaceC12641l) list.get(i2)) instanceof C12253l) {
            adcel(list, i2, false);
        } else {
            C8339l.smaato("Check failed.");
        }
    }

    public final void yandex(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15390l c15390l = (C15390l) arrayList.get(i);
            int size2 = this.f28405l.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC9492l) this.f28405l.get(i2)).mo1760switch(c15390l);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C15390l c15390l2 = (C15390l) arrayList.get(i3);
            int size4 = c15390l2.amazon.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((InterfaceC9492l) c15390l2.amazon.get(i4)).mo1760switch(c15390l2);
            }
        }
    }
}
