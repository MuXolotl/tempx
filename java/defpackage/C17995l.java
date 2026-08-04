package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: l٘ٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll٘ٙؔ;", "Llَّؓ;", "Llۣۗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C17995l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16173l f35184l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17812l f35185l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14624l f35186l;

    public C17995l(C14624l c14624l, C17812l c17812l, C16173l c16173l) {
        this.f35186l = c14624l;
        this.f35185l = c17812l;
        this.f35184l = c16173l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) throws Throwable {
        C18524l c18524l = (C18524l) abstractC14971l;
        if (c18524l.f29462l) {
            c18524l.f36158l.amazon();
            c18524l.f36158l.firebase(c18524l);
        }
        C14624l c14624l = this.f35186l;
        c18524l.f36158l = c14624l;
        if (c18524l.f29462l) {
            if (c14624l.yandex != null) {
                AbstractC14825l.crashlytics("Expected textInputModifierNode to be null");
            }
            c14624l.yandex = c18524l;
        }
        c18524l.f36156l = this.f35185l;
        c18524l.f36157l = this.f35184l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17995l) {
            C17995l c17995l = (C17995l) obj;
            return AbstractC8576l.yandex(this.f35186l, c17995l.f35186l) && this.f35185l == c17995l.f35185l && this.f35184l == c17995l.f35184l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35184l.hashCode() + ((this.f35185l.hashCode() + (this.f35186l.hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C18524l(this.f35186l, this.f35185l, this.f35184l);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f35186l + ", legacyTextFieldState=" + this.f35185l + ", textFieldSelectionManager=" + this.f35184l + ")";
    }
}
