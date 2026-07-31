package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lٔۖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15084l extends AbstractC13455l implements InterfaceC5598l, Collection, InterfaceC2356l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15084l f29615l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7090l f29616l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f29617l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f29618l;

    static {
        C11140l c11140l = C11140l.f22372l;
        f29615l = new C15084l(c11140l, c11140l, C7090l.f14856l);
    }

    public C15084l(Object obj, Object obj2, C7090l c7090l) {
        this.f29618l = obj;
        this.f29617l = obj2;
        this.f29616l = c7090l;
    }

    public final C15084l ad(Object obj) {
        C7090l c7090l = this.f29616l;
        if (c7090l.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C15084l(obj, obj, c7090l.crashlytics(obj, new C10966l()));
        }
        Object obj2 = this.f29617l;
        return new C15084l(this.f29618l, obj, c7090l.crashlytics(obj2, new C10966l(((C10966l) c7090l.get(obj2)).yandex, obj)).crashlytics(obj, new C10966l(obj2)));
    }

    public final C15084l advert(Object obj) {
        C7090l c7090lCrashlytics = this.f29616l;
        C10966l c10966l = (C10966l) c7090lCrashlytics.get(obj);
        if (c10966l == null) {
            return this;
        }
        Object obj2 = c10966l.yandex;
        Object obj3 = c10966l.loadAd;
        C7250l c7250l = c7090lCrashlytics.f14858l;
        C7250l c7250lLicense = c7250l.license(obj != null ? obj.hashCode() : 0, 0, obj);
        if (c7250l != c7250lLicense) {
            c7090lCrashlytics = c7250lLicense == null ? C7090l.f14856l : new C7090l(c7250lLicense, c7090lCrashlytics.f14857l - 1);
        }
        C11140l c11140l = C11140l.f22372l;
        if (obj2 != c11140l) {
            c7090lCrashlytics = c7090lCrashlytics.crashlytics(obj2, new C10966l(((C10966l) c7090lCrashlytics.get(obj2)).yandex, obj3));
        }
        if (obj3 != c11140l) {
            c7090lCrashlytics = c7090lCrashlytics.crashlytics(obj3, new C10966l(obj2, ((C10966l) c7090lCrashlytics.get(obj3)).loadAd));
        }
        Object obj4 = obj2 != c11140l ? this.f29618l : obj3;
        if (obj3 != c11140l) {
            obj2 = this.f29617l;
        }
        return new C15084l(obj4, obj2, c7090lCrashlytics);
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f29616l.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C17991l(this.f29618l, this.f29616l);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        C7090l c7090l = this.f29616l;
        c7090l.getClass();
        return c7090l.f14857l;
    }
}
