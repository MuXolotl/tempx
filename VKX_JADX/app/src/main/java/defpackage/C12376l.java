package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lّؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12376l implements InterfaceC2763l, Map, InterfaceC17350l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C17704l f24465l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17704l f24466l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C18710l f24467l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C17704l f24468l;

    public C12376l() {
        C7090l c7090l = C7090l.f14856l;
        AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
        C18710l c18710l = new C18710l(abstractC18620lIsPro.mopub(), c7090l);
        if (!(abstractC18620lIsPro instanceof C18661l)) {
            c18710l.loadAd = new C18710l(1L, c7090l);
        }
        this.f24467l = c18710l;
        this.f24466l = new C17704l(this, 0);
        this.f24465l = new C17704l(this, 1);
        this.f24468l = new C17704l(this, 2);
    }

    public static void crashlytics(C18710l c18710l) {
        C7090l c7090l = C7090l.f14856l;
        synchronized (AbstractC15344l.yandex) {
            c18710l.crashlytics = c7090l;
            c18710l.amazon++;
        }
    }

    public static final boolean yandex(C12376l c12376l, C18710l c18710l, int i, InterfaceC16176l interfaceC16176l) {
        boolean z;
        synchronized (AbstractC15344l.yandex) {
            int i2 = c18710l.amazon;
            if (i2 == i) {
                c18710l.crashlytics = interfaceC16176l;
                z = true;
                c18710l.amazon = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f24467l;
    }

    @Override // defpackage.InterfaceC2763l
    public final /* synthetic */ AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC18620l abstractC18620lIsPro;
        if (C7090l.f14856l != ((C18710l) AbstractC9620l.admob(this.f24467l)).crashlytics) {
            C18710l c18710l = this.f24467l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                crashlytics((C18710l) AbstractC9620l.ad(c18710l, this, abstractC18620lIsPro));
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return purchase().crashlytics.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return purchase().crashlytics.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f24466l;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return purchase().crashlytics.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C7090l) purchase().crashlytics).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f24465l;
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        this.f24467l = (C18710l) abstractC7498l;
    }

    public final C18710l purchase() {
        return (C18710l) AbstractC9620l.Signature(this.f24467l, this);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        InterfaceC16176l interfaceC16176l;
        int i;
        Object objPut;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        do {
            synchronized (AbstractC15344l.yandex) {
                C18710l c18710l = (C18710l) AbstractC9620l.admob(this.f24467l);
                interfaceC16176l = c18710l.crashlytics;
                i = c18710l.amazon;
                Unit unit = Unit.INSTANCE;
            }
            C0046l c0046l = (C0046l) interfaceC16176l.builder();
            objPut = c0046l.put(obj, obj2);
            InterfaceC16176l interfaceC16176lBuild = c0046l.build();
            if (AbstractC8576l.yandex(interfaceC16176lBuild, interfaceC16176l)) {
                break;
            }
            C18710l c18710l2 = this.f24467l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = yandex(this, (C18710l) AbstractC9620l.ad(c18710l2, this, abstractC18620lIsPro), i, interfaceC16176lBuild);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zYandex);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        InterfaceC16176l interfaceC16176l;
        int i;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        do {
            synchronized (AbstractC15344l.yandex) {
                C18710l c18710l = (C18710l) AbstractC9620l.admob(this.f24467l);
                interfaceC16176l = c18710l.crashlytics;
                i = c18710l.amazon;
                Unit unit = Unit.INSTANCE;
            }
            C0046l c0046l = (C0046l) interfaceC16176l.builder();
            c0046l.putAll(map);
            InterfaceC16176l interfaceC16176lBuild = c0046l.build();
            if (AbstractC8576l.yandex(interfaceC16176lBuild, interfaceC16176l)) {
                return;
            }
            C18710l c18710l2 = this.f24467l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = yandex(this, (C18710l) AbstractC9620l.ad(c18710l2, this, abstractC18620lIsPro), i, interfaceC16176lBuild);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zYandex);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        InterfaceC16176l interfaceC16176l;
        int i;
        Object objRemove;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        do {
            synchronized (AbstractC15344l.yandex) {
                C18710l c18710l = (C18710l) AbstractC9620l.admob(this.f24467l);
                interfaceC16176l = c18710l.crashlytics;
                i = c18710l.amazon;
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC5567l interfaceC5567lBuilder = interfaceC16176l.builder();
            objRemove = interfaceC5567lBuilder.remove(obj);
            InterfaceC16176l interfaceC16176lBuild = interfaceC5567lBuilder.build();
            if (AbstractC8576l.yandex(interfaceC16176lBuild, interfaceC16176l)) {
                break;
            }
            C18710l c18710l2 = this.f24467l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = yandex(this, (C18710l) AbstractC9620l.ad(c18710l2, this, abstractC18620lIsPro), i, interfaceC16176lBuild);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zYandex);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        C7090l c7090l = (C7090l) purchase().crashlytics;
        c7090l.getClass();
        return c7090l.f14857l;
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((C18710l) AbstractC9620l.admob(this.f24467l)).crashlytics + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f24468l;
    }
}
