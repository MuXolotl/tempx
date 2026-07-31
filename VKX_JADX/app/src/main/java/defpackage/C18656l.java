package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C18656l {
    public final String crashlytics;
    public final C11362l firebase;
    public final C11362l isPro;
    public final C18656l loadAd;
    public final C10086l smaato;
    public final C10086l subs;
    public final C14783l yandex;
    public final C10086l amazon = AbstractC8020l.smaato(crashlytics());
    public final C10086l purchase = AbstractC8020l.smaato(null);
    public final C10086l billing = AbstractC8020l.smaato(new C10117l(crashlytics(), crashlytics()));
    public final C10703l mopub = new C10703l(0);
    public final C10703l admob = new C10703l(Long.MIN_VALUE);

    public C18656l(C14783l c14783l, C18656l c18656l, String str) {
        this.yandex = c14783l;
        this.loadAd = c18656l;
        this.crashlytics = str;
        Boolean bool = Boolean.FALSE;
        this.subs = AbstractC8020l.smaato(bool);
        this.isPro = new C11362l();
        this.firebase = new C11362l();
        this.smaato = AbstractC8020l.smaato(bool);
        AbstractC8020l.mopub(new C3769l(this, 1));
        c14783l.getClass();
    }

    public final void admob(long j, boolean z) {
        C10703l c10703l = this.admob;
        long jAdmob = c10703l.admob();
        C14783l c14783l = this.yandex;
        if (jAdmob == Long.MIN_VALUE) {
            c10703l.subs(j);
            c14783l.yandex.setValue(Boolean.TRUE);
        } else if (!((Boolean) c14783l.yandex.getValue()).booleanValue()) {
            c14783l.yandex.setValue(Boolean.TRUE);
        }
        this.subs.setValue(Boolean.FALSE);
        C11362l c11362l = this.isPro;
        int size = c11362l.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            C9459l c9459l = (C9459l) c11362l.get(i);
            C10086l c10086l = c9459l.f19325l;
            C10086l c10086l2 = c9459l.f19325l;
            if (!((Boolean) c10086l.getValue()).booleanValue()) {
                long jLoadAd = z ? c9459l.crashlytics().loadAd() : j;
                c9459l.purchase(c9459l.crashlytics().billing(jLoadAd));
                c9459l.f19328l = c9459l.crashlytics().amazon(jLoadAd);
                C5810l c5810lCrashlytics = c9459l.crashlytics();
                c5810lCrashlytics.getClass();
                if (AbstractC5020l.purchase(c5810lCrashlytics, jLoadAd)) {
                    c10086l2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c10086l2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        C11362l c11362l2 = this.firebase;
        int size2 = c11362l2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C18656l c18656l = (C18656l) c11362l2.get(i2);
            if (!AbstractC8576l.yandex(c18656l.amazon.getValue(), c18656l.crashlytics())) {
                c18656l.admob(j, z);
            }
            if (!AbstractC8576l.yandex(c18656l.amazon.getValue(), c18656l.crashlytics())) {
                z2 = false;
            }
        }
        if (z2) {
            subs();
        }
    }

    public final boolean amazon() {
        C11362l c11362l = this.isPro;
        int size = c11362l.size();
        for (int i = 0; i < size; i++) {
            ((C9459l) c11362l.get(i)).getClass();
        }
        C11362l c11362l2 = this.firebase;
        int size2 = c11362l2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((C18656l) c11362l2.get(i2)).amazon()) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceC17460l billing() {
        return (InterfaceC17460l) this.billing.getValue();
    }

    public final Object crashlytics() {
        return this.yandex.loadAd.getValue();
    }

    public final void firebase(Object obj) {
        C10086l c10086l = this.amazon;
        if (AbstractC8576l.yandex(c10086l.getValue(), obj)) {
            return;
        }
        this.billing.setValue(new C10117l(c10086l.getValue(), obj));
        if (!AbstractC8576l.yandex(crashlytics(), c10086l.getValue())) {
            this.yandex.loadAd.setValue(c10086l.getValue());
        }
        c10086l.setValue(obj);
        if (this.admob.admob() == Long.MIN_VALUE) {
            this.subs.setValue(Boolean.TRUE);
        }
        C11362l c11362l = this.isPro;
        int size = c11362l.size();
        for (int i = 0; i < size; i++) {
            ((C9459l) c11362l.get(i)).f19329l.subs(-2.0f);
        }
    }

    public final void isPro(Object obj, Object obj2) {
        this.admob.subs(Long.MIN_VALUE);
        C14783l c14783l = this.yandex;
        c14783l.yandex.setValue(Boolean.FALSE);
        boolean zMopub = mopub();
        C10086l c10086l = this.amazon;
        if (!zMopub || !AbstractC8576l.yandex(crashlytics(), obj) || !AbstractC8576l.yandex(c10086l.getValue(), obj2)) {
            if (!AbstractC8576l.yandex(crashlytics(), obj) && (c14783l instanceof C14783l)) {
                c14783l.loadAd.setValue(obj);
            }
            c10086l.setValue(obj2);
            this.smaato.setValue(Boolean.TRUE);
            this.billing.setValue(new C10117l(obj, obj2));
        }
        C11362l c11362l = this.firebase;
        int size = c11362l.size();
        for (int i = 0; i < size; i++) {
            C18656l c18656l = (C18656l) c11362l.get(i);
            if (c18656l.mopub()) {
                c18656l.isPro(c18656l.crashlytics(), c18656l.amazon.getValue());
            }
        }
        C11362l c11362l2 = this.isPro;
        int size2 = c11362l2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C9459l) c11362l2.get(i2)).amazon();
        }
    }

    public final long loadAd() {
        C11362l c11362l = this.isPro;
        int size = c11362l.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((C9459l) c11362l.get(i)).f19324l.admob());
        }
        C11362l c11362l2 = this.firebase;
        int size2 = c11362l2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((C18656l) c11362l2.get(i2)).loadAd());
        }
        return jMax;
    }

    public final boolean mopub() {
        return ((Boolean) this.smaato.getValue()).booleanValue();
    }

    public final long purchase() {
        C18656l c18656l = this.loadAd;
        return c18656l != null ? c18656l.purchase() : this.mopub.admob();
    }

    public final void subs() {
        this.admob.subs(Long.MIN_VALUE);
        C14783l c14783l = this.yandex;
        if (c14783l instanceof C14783l) {
            c14783l.loadAd.setValue(this.amazon.getValue());
        }
        if (this.loadAd == null) {
            this.mopub.subs(0L);
        }
        c14783l.yandex.setValue(Boolean.FALSE);
        C11362l c11362l = this.firebase;
        int size = c11362l.size();
        for (int i = 0; i < size; i++) {
            ((C18656l) c11362l.get(i)).subs();
        }
    }

    public final String toString() {
        C11362l c11362l = this.isPro;
        int size = c11362l.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((C9459l) c11362l.get(i)) + ", ";
        }
        return str;
    }

    public final void yandex(Object obj, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c6956l.billing(obj) : c6956l.admob(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            c6956l.m2124else();
        } else if (mopub()) {
            c6956l.m2123default(467722849);
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(466062241);
            firebase(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z || objM2132native == c13863l) {
                objM2132native = AbstractC8020l.mopub(new C3769l(this, i3));
                c6956l.m2147try(objM2132native);
            }
            if (((Boolean) ((InterfaceC12244l) objM2132native).getValue()).booleanValue()) {
                c6956l.m2123default(466470356);
                Object objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = AbstractC12311l.isPro(c6956l);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native2;
                boolean zAdmob = c6956l.admob(interfaceC2262l) | (i4 == 32);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob || objM2132native3 == c13863l) {
                    objM2132native3 = new C10207l(interfaceC2262l, this, 26);
                    c6956l.m2147try(objM2132native3);
                }
                AbstractC12311l.yandex(interfaceC2262l, this, (Function1) objM2132native3, c6956l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(467712929);
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(this, obj, i, 23);
        }
    }
}
