package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٌۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٌۣؔ;", "Llَّؓ;", "Llًْٖ;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C2995l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0633l f6495l;

    public C2995l(C0633l c0633l) {
        this.f6495l = c0633l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C8030l c8030l = (C8030l) abstractC14971l;
        C0633l c0633l = c8030l.f16717l;
        C0633l c0633l2 = this.f6495l;
        if (c0633l2 != c0633l) {
            c0633l.f2089l.setValue(Boolean.FALSE);
            c8030l.f16717l = c0633l2;
            c0633l2.f2089l.setValue(Boolean.valueOf(c8030l.f29462l));
            if (c8030l.f29462l) {
                C5138l c5138l = AbstractC15033l.yandex;
                C0633l c0633l3 = c8030l.f16717l;
                C7779l c7779l = c8030l.f16719l;
                if (c7779l == C4761l.loadAd) {
                    AbstractC0081l.yandex("In order to provide locals you must override providedValues: ModifierLocalMap");
                }
                if (!c7779l.crashlytics(c5138l)) {
                    AbstractC0081l.yandex("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + c5138l + " was not found.");
                }
                c7779l.smaato(c5138l, c0633l3);
                c8030l.f16717l.f2096l = (C0633l) AbstractC15560l.yandex(c8030l, c5138l);
                c8030l.m2254l(null);
                c8030l.f16716l = false;
                c8030l.f16717l.f2093l = c8030l;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2995l) && this.f6495l == ((C2995l) obj).f6495l;
    }

    public final int hashCode() {
        return this.f6495l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C8030l(this.f6495l);
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.f6495l + ")";
    }
}
