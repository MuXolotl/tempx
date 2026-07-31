package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؘؙؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5519l {
    public static final C5519l crashlytics = new C5519l(0);
    public boolean loadAd;
    public final C13639l yandex = new C13639l();

    public C5519l(int i) {
        amazon();
        amazon();
    }

    public static boolean admob(Map.Entry entry) {
        ((AbstractC1552l) entry.getKey()).getClass();
        throw null;
    }

    public static final int subs(Map.Entry entry) {
        AbstractC1552l abstractC1552l = (AbstractC1552l) entry.getKey();
        entry.getValue();
        abstractC1552l.getClass();
        throw null;
    }

    public static int yandex(AbstractC1552l abstractC1552l, Object obj) {
        abstractC1552l.getClass();
        C9747l.yandex(0 << 3);
        if (EnumC1865l.f4284l == null) {
            Charset charset = AbstractC11565l.yandex;
        }
        EnumC1275l enumC1275l = EnumC1275l.f3310l;
        throw null;
    }

    public final void amazon() {
        if (this.loadAd) {
            return;
        }
        C13639l c13639l = this.yandex;
        int i = c13639l.f26665l;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c13639l.crashlytics(i2).f2552l;
            if (obj instanceof AbstractC15603l) {
                AbstractC15603l abstractC15603l = (AbstractC15603l) obj;
                abstractC15603l.getClass();
                C13940l.crashlytics.yandex(abstractC15603l.getClass()).yandex(abstractC15603l);
                abstractC15603l.mopub();
            }
        }
        if (!c13639l.f26668l) {
            for (int i3 = 0; i3 < c13639l.f26665l; i3++) {
                ((AbstractC1552l) c13639l.crashlytics(i3).f2553l).getClass();
            }
            Iterator it = c13639l.yandex().iterator();
            while (it.hasNext()) {
                ((AbstractC1552l) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        if (!c13639l.f26668l) {
            c13639l.f26664l = c13639l.f26664l.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c13639l.f26664l);
            c13639l.f26669l = c13639l.f26669l.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c13639l.f26669l);
            c13639l.f26668l = true;
        }
        this.loadAd = true;
    }

    public final boolean billing() {
        C13639l c13639l = this.yandex;
        int i = c13639l.f26665l;
        for (int i2 = 0; i2 < i; i2++) {
            if (!admob(c13639l.crashlytics(i2))) {
                return false;
            }
        }
        Iterator it = c13639l.yandex().iterator();
        while (it.hasNext()) {
            if (!admob((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator crashlytics() {
        C13639l c13639l = this.yandex;
        return c13639l.isEmpty() ? Collections.emptyIterator() : ((C6542l) c13639l.entrySet()).iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5519l) {
            return this.yandex.equals(((C5519l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    /* JADX INFO: renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final C5519l clone() {
        C5519l c5519l = new C5519l();
        C13639l c13639l = this.yandex;
        int i = c13639l.f26665l;
        for (int i2 = 0; i2 < i; i2++) {
            C0900l c0900lCrashlytics = c13639l.crashlytics(i2);
            c5519l.purchase((AbstractC1552l) c0900lCrashlytics.f2553l, c0900lCrashlytics.f2552l);
        }
        for (Map.Entry entry : c13639l.yandex()) {
            c5519l.purchase((AbstractC1552l) entry.getKey(), entry.getValue());
        }
        return c5519l;
    }

    public final void mopub(Map.Entry entry) {
        AbstractC1552l abstractC1552l = (AbstractC1552l) entry.getKey();
        entry.getValue();
        abstractC1552l.getClass();
        throw null;
    }

    public final void purchase(AbstractC1552l abstractC1552l, Object obj) {
        abstractC1552l.getClass();
        Charset charset = AbstractC11565l.yandex;
        obj.getClass();
        EnumC1865l enumC1865l = EnumC1865l.f4284l;
        EnumC1275l enumC1275l = EnumC1275l.f3310l;
        throw null;
    }

    public C5519l() {
    }
}
