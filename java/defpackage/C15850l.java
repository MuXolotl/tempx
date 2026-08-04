package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٕٟٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٕٟٕ;", "Llَّؓ;", "Llٍٖۙ;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class C15850l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C18113l f31103l;

    public C15850l(C18113l c18113l) {
        this.f31103l = c18113l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C16604l c16604l = (C16604l) abstractC14971l;
        C11362l c11362l = c16604l.f32581l.yandex;
        C1625l c1625l = c16604l.f32583l;
        boolean zContains = c11362l.contains(c1625l);
        if (zContains) {
            c16604l.f32581l.yandex.remove(c1625l);
        }
        C18113l c18113l = this.f31103l;
        c16604l.f32581l = c18113l;
        if (zContains) {
            c18113l.yandex.add(c1625l);
        }
        c1625l.crashlytics.subs(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15850l) && this.f31103l == ((C15850l) obj).f31103l && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return AbstractC9029l.mopub(this.f31103l.hashCode() * 31, 0.0f, 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C16604l(this.f31103l);
    }

    public final String toString() {
        return "HazeSourceElement(state=" + this.f31103l + ", zIndex=0.0, key=null)";
    }
}
