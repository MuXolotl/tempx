package defpackage;

/* JADX INFO: renamed from: lؑ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0624l extends AbstractC6968l {
    public final C11644l admob;

    public C0624l(C11644l c11644l, C2782l c2782l) {
        isPro(c11644l, c2782l);
        this.admob = c11644l;
    }

    public static void isPro(C11644l c11644l, C2782l c2782l) {
        C18176l c18176l = (C18176l) c11644l.f23361l;
        if (c18176l == C18176l.f35614l || c18176l == C18176l.f35616l) {
            C2782l.advert(c2782l);
        }
    }

    @Override // defpackage.AbstractC6968l
    public final Integer amazon() {
        return (Integer) this.admob.f23362l;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        C11644l c11644l = this.admob;
        return new C18000l((String) c11644l.f23358l, (C9358l) c11644l.f23360l);
    }

    public final C0346l subs() {
        C11644l c11644l = this.admob;
        C9358l c9358l = (C9358l) c11644l.f23360l;
        Integer num = (Integer) c11644l.f23362l;
        if (c9358l.equals(C9358l.purchase)) {
            return C0346l.yandex(new byte[0]);
        }
        if (c9358l.equals(C9358l.crashlytics)) {
            return AbstractC17168l.loadAd(num.intValue());
        }
        if (c9358l == C9358l.amazon || c9358l == C9358l.billing) {
            return AbstractC17168l.yandex(num.intValue());
        }
        C18262l.ads("Unknown output prefix type");
        return null;
    }
}
