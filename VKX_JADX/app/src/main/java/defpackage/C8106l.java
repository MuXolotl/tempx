package defpackage;

/* JADX INFO: renamed from: lًٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8106l extends Throwable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f16891l;

    public C8106l(boolean z, boolean z2, C18416l c18416l, Object obj) {
        this.f16891l = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z + ",didLookahead=" + z2 + ",anchors=" + c18416l + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f16891l;
    }
}
