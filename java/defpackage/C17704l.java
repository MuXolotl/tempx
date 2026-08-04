package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lّ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17704l implements Set, InterfaceC5281l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34498l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12376l f34499l;

    public C17704l(C12376l c12376l, int i) {
        this.f34498l = i;
        this.f34499l = c12376l;
    }

    private final boolean amazon(Collection collection) {
        InterfaceC16176l interfaceC16176l;
        int i;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        Collection<Map.Entry> collection2 = collection;
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(collection2, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C12376l c12376l = this.f34499l;
        boolean z = false;
        do {
            synchronized (AbstractC15344l.yandex) {
                C18710l c18710l = (C18710l) AbstractC9620l.admob(c12376l.f24467l);
                interfaceC16176l = c18710l.crashlytics;
                i = c18710l.amazon;
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC5567l interfaceC5567lBuilder = interfaceC16176l.builder();
            Object it = c12376l.f24466l.iterator();
            while (((AbstractC0576l) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((C13293l) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC8576l.yandex(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    interfaceC5567lBuilder.remove(entry2.getKey());
                    z = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            InterfaceC16176l interfaceC16176lBuild = interfaceC5567lBuilder.build();
            if (AbstractC8576l.yandex(interfaceC16176lBuild, interfaceC16176l)) {
                break;
            }
            C18710l c18710l2 = c12376l.f24467l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = C12376l.yandex(c12376l, (C18710l) AbstractC9620l.ad(c18710l2, c12376l, abstractC18620lIsPro), i, interfaceC16176lBuild);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, c12376l);
        } while (!zYandex);
        return z;
    }

    private final boolean billing(Collection collection) {
        InterfaceC16176l interfaceC16176l;
        int i;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        Set setM4229l = AbstractC16901l.m4229l(collection);
        C12376l c12376l = this.f34499l;
        boolean z = false;
        do {
            synchronized (AbstractC15344l.yandex) {
                C18710l c18710l = (C18710l) AbstractC9620l.admob(c12376l.f24467l);
                interfaceC16176l = c18710l.crashlytics;
                i = c18710l.amazon;
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC5567l interfaceC5567lBuilder = interfaceC16176l.builder();
            Object it = c12376l.f24466l.iterator();
            while (((AbstractC0576l) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C13293l) it).next();
                if (!setM4229l.contains(entry.getKey())) {
                    interfaceC5567lBuilder.remove(entry.getKey());
                    z = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            InterfaceC16176l interfaceC16176lBuild = interfaceC5567lBuilder.build();
            if (AbstractC8576l.yandex(interfaceC16176lBuild, interfaceC16176l)) {
                break;
            }
            C18710l c18710l2 = c12376l.f24467l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = C12376l.yandex(c12376l, (C18710l) AbstractC9620l.ad(c18710l2, c12376l, abstractC18620lIsPro), i, interfaceC16176lBuild);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, c12376l);
        } while (!zYandex);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f34498l) {
            case 0:
                AbstractC15344l.admob();
                throw null;
            case 1:
                AbstractC15344l.admob();
                throw null;
            default:
                AbstractC15344l.admob();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f34498l) {
            case 0:
                AbstractC15344l.admob();
                throw null;
            case 1:
                AbstractC15344l.admob();
                throw null;
            default:
                AbstractC15344l.admob();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f34499l.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f34498l;
        C12376l c12376l = this.f34499l;
        switch (i) {
            case 0:
                if (!AbstractC9464l.smaato(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC8576l.yandex(c12376l.get(entry.getKey()), entry.getValue());
            case 1:
                return c12376l.containsKey(obj);
            default:
                return c12376l.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f34498l;
        C12376l c12376l = this.f34499l;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!c12376l.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!c12376l.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f34499l.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f34498l;
        C12376l c12376l = this.f34499l;
        switch (i) {
            case 0:
                return new C13293l(c12376l, ((InterfaceC5598l) ((C7090l) c12376l.purchase().crashlytics).entrySet()).iterator(), 0);
            case 1:
                return new C13293l(c12376l, ((InterfaceC5598l) ((C7090l) c12376l.purchase().crashlytics).entrySet()).iterator(), 1);
            default:
                return new C13293l(c12376l, ((InterfaceC5598l) ((C7090l) c12376l.purchase().crashlytics).entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x002e: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:10:0x002d, B:27:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r3v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f34498l
            r1 = 0
            r2 = 1
            lّؕٔ r5 = r5.f34499l
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            lّ٘ؗ r0 = r5.f24466l
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            lؑۚۜ r3 = (defpackage.AbstractC0576l) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            lُْۘ r3 = (defpackage.C13293l) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = defpackage.AbstractC8576l.yandex(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = defpackage.AbstractC9464l.smaato(r6)
            if (r0 != 0) goto L4a
            goto L57
        L4a:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L57
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17704l.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        InterfaceC16176l interfaceC16176l;
        int i;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        boolean z = false;
        switch (this.f34498l) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f34499l.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.f34499l.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
            default:
                Set setM4229l = AbstractC16901l.m4229l(collection);
                C12376l c12376l = this.f34499l;
                do {
                    synchronized (AbstractC15344l.yandex) {
                        C18710l c18710l = (C18710l) AbstractC9620l.admob(c12376l.f24467l);
                        interfaceC16176l = c18710l.crashlytics;
                        i = c18710l.amazon;
                        Unit unit = Unit.INSTANCE;
                    }
                    InterfaceC5567l interfaceC5567lBuilder = interfaceC16176l.builder();
                    Object it3 = c12376l.f24466l.iterator();
                    while (((AbstractC0576l) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C13293l) it3).next();
                        if (setM4229l.contains(entry.getValue())) {
                            interfaceC5567lBuilder.remove(entry.getKey());
                            z = true;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    InterfaceC16176l interfaceC16176lBuild = interfaceC5567lBuilder.build();
                    if (!AbstractC8576l.yandex(interfaceC16176lBuild, interfaceC16176l)) {
                        C18710l c18710l2 = c12376l.f24467l;
                        synchronized (AbstractC9620l.crashlytics) {
                            abstractC18620lIsPro = AbstractC9620l.isPro();
                            zYandex = C12376l.yandex(c12376l, (C18710l) AbstractC9620l.ad(c18710l2, c12376l, abstractC18620lIsPro), i, interfaceC16176lBuild);
                        }
                        AbstractC9620l.metrica(abstractC18620lIsPro, c12376l);
                    }
                    return z;
                } while (!zYandex);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        InterfaceC16176l interfaceC16176l;
        int i;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        switch (this.f34498l) {
            case 0:
                return amazon(collection);
            case 1:
                return billing(collection);
            default:
                Set setM4229l = AbstractC16901l.m4229l(collection);
                C12376l c12376l = this.f34499l;
                boolean z = false;
                do {
                    synchronized (AbstractC15344l.yandex) {
                        C18710l c18710l = (C18710l) AbstractC9620l.admob(c12376l.f24467l);
                        interfaceC16176l = c18710l.crashlytics;
                        i = c18710l.amazon;
                        Unit unit = Unit.INSTANCE;
                    }
                    InterfaceC5567l interfaceC5567lBuilder = interfaceC16176l.builder();
                    Object it = c12376l.f24466l.iterator();
                    while (((AbstractC0576l) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C13293l) it).next();
                        if (!setM4229l.contains(entry.getValue())) {
                            interfaceC5567lBuilder.remove(entry.getKey());
                            z = true;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    InterfaceC16176l interfaceC16176lBuild = interfaceC5567lBuilder.build();
                    if (!AbstractC8576l.yandex(interfaceC16176lBuild, interfaceC16176l)) {
                        C18710l c18710l2 = c12376l.f24467l;
                        synchronized (AbstractC9620l.crashlytics) {
                            abstractC18620lIsPro = AbstractC9620l.isPro();
                            zYandex = C12376l.yandex(c12376l, (C18710l) AbstractC9620l.ad(c18710l2, c12376l, abstractC18620lIsPro), i, interfaceC16176lBuild);
                        }
                        AbstractC9620l.metrica(abstractC18620lIsPro, c12376l);
                    }
                    return z;
                } while (!zYandex);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f34499l.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC18648l.billing(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC18648l.mopub(this, objArr);
    }
}
