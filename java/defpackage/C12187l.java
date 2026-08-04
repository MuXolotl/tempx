package defpackage;

import java.text.BreakIterator;

/* JADX INFO: renamed from: lِۡۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12187l extends AbstractC7822l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final BreakIterator f24207l;

    public C12187l(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f24207l = characterInstance;
    }

    @Override // defpackage.AbstractC7822l
    public final int firebase(int i) {
        return this.f24207l.preceding(i);
    }

    @Override // defpackage.AbstractC7822l
    public final int isPro(int i) {
        return this.f24207l.following(i);
    }
}
