package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lَ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10600l extends AbstractC2837l implements Collection, InterfaceC5461l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f21514l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f21515l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C15084l f21516l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0046l f21517l;

    public C10600l(C15084l c15084l) {
        this.f21516l = c15084l;
        this.f21515l = c15084l.f29618l;
        this.f21514l = c15084l.f29617l;
        this.f21517l = c15084l.f29616l.builder();
    }

    public final C15084l ad() {
        C7090l c7090lBuild = this.f21517l.build();
        C15084l c15084l = this.f21516l;
        if (c7090lBuild != c15084l.f29616l) {
            c15084l = new C15084l(this.f21515l, this.f21514l, c7090lBuild);
        }
        this.f21516l = c15084l;
        return c15084l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        C0046l c0046l = this.f21517l;
        if (c0046l.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f21515l = obj;
            this.f21514l = obj;
            c0046l.put(obj, new C10966l());
            return true;
        }
        c0046l.put(this.f21514l, new C10966l(((C10966l) c0046l.get(this.f21514l)).yandex, obj));
        c0046l.put(obj, new C10966l(this.f21514l));
        this.f21514l = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f21517l.clear();
        C11140l c11140l = C11140l.f22372l;
        this.f21515l = c11140l;
        this.f21514l = c11140l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f21517l.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2502l(this);
    }

    @Override // defpackage.AbstractC2837l
    public final int pro() {
        return this.f21517l.amazon();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0046l c0046l = this.f21517l;
        C10966l c10966l = (C10966l) c0046l.remove(obj);
        if (c10966l == null) {
            return false;
        }
        Object obj2 = c10966l.loadAd;
        Object obj3 = c10966l.yandex;
        C11140l c11140l = C11140l.f22372l;
        if (obj3 != c11140l) {
            c0046l.put(obj3, new C10966l(((C10966l) c0046l.get(obj3)).yandex, obj2));
        } else {
            this.f21515l = obj2;
        }
        if (obj2 != c11140l) {
            c0046l.put(obj2, new C10966l(obj3, ((C10966l) c0046l.get(obj2)).loadAd));
            return true;
        }
        this.f21514l = obj3;
        return true;
    }
}
