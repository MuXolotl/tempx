package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘۙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5944l implements AutoCloseable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13541l f12518l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8426l f12519l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f12522l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f12515l = new Object();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f12521l = 1;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f12524l = Long.MIN_VALUE;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f12516l = Long.MIN_VALUE;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f12517l = Long.MIN_VALUE;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f12523l = Long.MIN_VALUE;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final ArrayList f12520l = new ArrayList();

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final LinkedHashMap f12525l = new LinkedHashMap();

    public C5944l(C8426l c8426l, C13541l c13541l) {
        this.f12519l = c8426l;
        this.f12518l = c13541l;
    }

    public final void billing(long j, Object obj) throws Exception {
        C5944l c5944l;
        Object c14845l;
        ArrayList<C9216l> arrayList;
        Object next;
        synchronized (this.f12515l) {
            try {
                if (this.f12522l || this.f12518l.yandex(this.f12523l, j)) {
                    c5944l = this;
                    c14845l = new C14845l(obj);
                } else {
                    Iterator it = this.f12520l.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!this.f12518l.yandex(((C9216l) next).purchase, j));
                    C9216l c9216l = (C9216l) next;
                    if (c9216l != null) {
                        c5944l = this;
                        ArrayList arrayListVip = c5944l.vip(c9216l.amazon, c9216l.purchase, c9216l.yandex);
                        c9216l.yandex(j, obj);
                        c5944l.f12520l.remove(c9216l);
                        arrayList = arrayListVip;
                        c14845l = null;
                    } else {
                        c5944l = this;
                        c5944l.f12525l.put(Long.valueOf(j), new C14845l(obj));
                        if (c5944l.f12525l.size() > 3) {
                            c14845l = c5944l.f12525l.remove(Long.valueOf(((Number) AbstractC16901l.m4248volatile(c5944l.f12525l.keySet())).longValue()));
                        } else {
                            c14845l = null;
                            arrayList = null;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                arrayList = null;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C14845l c14845l2 = (C14845l) c14845l;
        if (c14845l2 != null) {
            Object obj2 = c14845l2.yandex;
            Object obj3 = C14845l.yandex(obj2) ? obj2 : null;
            if (obj3 != null) {
                c5944l.f12519l.yandex(obj3);
            }
        }
        if (arrayList != null) {
            for (C9216l c9216l2 : arrayList) {
                c9216l2.getClass();
                c9216l2.yandex(-1L, new C3722l(12));
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        synchronized (this.f12515l) {
            if (this.f12522l) {
                return;
            }
            this.f12522l = true;
            ArrayList arrayList = new ArrayList(this.f12525l.values());
            this.f12525l.clear();
            ArrayList<C9216l> arrayList2 = new ArrayList(this.f12520l);
            this.f12520l.clear();
            Unit unit = Unit.INSTANCE;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj = ((C14845l) it.next()).yandex;
                C8426l c8426l = this.f12519l;
                if (!C14845l.yandex(obj)) {
                    obj = null;
                }
                c8426l.yandex(obj);
            }
            for (C9216l c9216l : arrayList2) {
                c9216l.getClass();
                c9216l.yandex(-1L, new C3722l(11));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:81:0x016d A[LOOP:2: B:79:0x0167->B:81:0x016d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0185  */
    /* JADX WARN: Code duplicated, block: B:85:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ac  */
    public final void mopub(long j, long j2, long j3, InterfaceC9014l interfaceC9014l) throws Exception {
        Object obj;
        Object next;
        C5944l c5944l;
        Object next2;
        C14845l c14845l;
        ArrayList<C9216l> arrayListVip;
        Object objRemove;
        boolean z;
        C14845l c14845l2;
        Object c3722l;
        Object obj2;
        Object obj3;
        Object next3;
        Object obj4 = this.f12515l;
        synchronized (obj4) {
            try {
                Iterator it = this.f12520l.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((C9216l) next).loadAd == j));
                C9216l c9216l = (C9216l) next;
                if (c9216l == null) {
                    boolean z2 = this.f12522l;
                    long j4 = this.f12521l;
                    this.f12521l = j4 + 1;
                    try {
                        if (!z2 && this.f12517l != j && this.f12523l != j3) {
                            boolean z3 = j < this.f12516l;
                            if (!z3) {
                                this.f12516l = j;
                            }
                            boolean z4 = j3 < this.f12524l;
                            if (!z4) {
                                this.f12524l = j3;
                            }
                            boolean z5 = z3 || z4;
                            Iterator it2 = this.f12525l.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = obj4;
                                    next3 = null;
                                    break;
                                } else {
                                    next3 = it2.next();
                                    obj = obj4;
                                    if (this.f12518l.yandex(j3, ((Number) next3).longValue())) {
                                        break;
                                    } else {
                                        obj4 = obj;
                                    }
                                }
                            }
                            Long l = (Long) next3;
                            if (l != null) {
                                objRemove = this.f12525l.remove(l);
                                arrayListVip = vip(j4, j3, z5);
                                c5944l = this;
                                c14845l = null;
                            } else {
                                c5944l = this;
                                c5944l.f12520l.add(new C9216l(z5, j, j2, j4, j3, interfaceC9014l));
                                z = false;
                                c14845l = null;
                                arrayListVip = null;
                                objRemove = null;
                            }
                            Unit unit = Unit.INSTANCE;
                            if (arrayListVip != null) {
                                for (C9216l c9216l2 : arrayListVip) {
                                    c9216l2.getClass();
                                    c9216l2.yandex(-1L, new C3722l(12));
                                }
                            }
                            if (c14845l != null) {
                                obj2 = c14845l.yandex;
                                if (C14845l.yandex(obj2)) {
                                    obj3 = obj2;
                                } else {
                                    obj3 = null;
                                }
                                if (obj3 != null) {
                                    c5944l.f12519l.yandex(obj3);
                                }
                            }
                            if (z) {
                                if (z2) {
                                    c3722l = new C3722l(11);
                                } else {
                                    c14845l2 = (C14845l) objRemove;
                                    if (c14845l2 != null) {
                                        c3722l = c14845l2.yandex;
                                    } else {
                                        c3722l = new C3722l(10);
                                    }
                                }
                                interfaceC9014l.mo272l(c3722l);
                                return;
                            }
                            return;
                        }
                        obj = obj4;
                        c5944l = this;
                        Iterator it3 = c5944l.f12525l.keySet().iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (!c5944l.f12518l.yandex(j3, ((Number) next2).longValue()));
                        Long l2 = (Long) next2;
                        c14845l = l2 != null ? (C14845l) c5944l.f12525l.remove(l2) : null;
                        arrayListVip = null;
                        objRemove = null;
                        z = true;
                        Unit unit2 = Unit.INSTANCE;
                        if (arrayListVip != null) {
                            while (r1.hasNext()) {
                                c9216l2.getClass();
                                c9216l2.yandex(-1L, new C3722l(12));
                            }
                        }
                        if (c14845l != null) {
                            obj2 = c14845l.yandex;
                            if (C14845l.yandex(obj2)) {
                                obj3 = obj2;
                            } else {
                                obj3 = null;
                            }
                            if (obj3 != null) {
                                c5944l.f12519l.yandex(obj3);
                            }
                        }
                        if (z) {
                            if (z2) {
                                c3722l = new C3722l(11);
                            } else {
                                c14845l2 = (C14845l) objRemove;
                                if (c14845l2 != null) {
                                    c3722l = c14845l2.yandex;
                                } else {
                                    c3722l = new C3722l(10);
                                }
                            }
                            interfaceC9014l.mo272l(c3722l);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                Log.w("CXCP", "onOutputStarted was invoked multiple times with a previously started output!onOutputStarted with " + ((Object) C1266l.yandex(j)) + ", " + ((Object) ("CameraTimestamp(value=" + j2 + ')')) + ", " + j3 + ". Previously started output: " + c9216l + ". Ignoring.");
            } catch (Throwable th2) {
                th = th2;
                obj = obj4;
            }
        }
    }

    public final ArrayList vip(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f12520l;
        for (Object obj : arrayList2) {
            C9216l c9216l = (C9216l) obj;
            if (c9216l.yandex == z && c9216l.amazon < j && c9216l.purchase < j2) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }

    public final void yandex(long j) {
        synchronized (this.f12515l) {
            try {
                if (this.f12522l) {
                    return;
                }
                this.f12517l = j;
                Iterator it = this.f12520l.iterator();
                C9216l c9216l = null;
                boolean z = false;
                Object obj = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (z) {
                            break;
                        }
                    } else {
                        Object next = it.next();
                        if (((C9216l) next).loadAd == j) {
                            if (!z) {
                                obj = next;
                                z = true;
                            }
                        }
                    }
                    obj = null;
                    break;
                }
                C9216l c9216l2 = (C9216l) obj;
                if (c9216l2 != null) {
                    this.f12523l = c9216l2.purchase;
                    this.f12520l.remove(c9216l2);
                    Unit unit = Unit.INSTANCE;
                    c9216l = c9216l2;
                }
                if (c9216l != null) {
                    c9216l.yandex(-1L, new C3722l(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
