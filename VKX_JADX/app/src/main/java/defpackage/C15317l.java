package defpackage;

/* JADX INFO: renamed from: lٔۦۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15317l implements InterfaceC6924l {
    public final int loadAd;

    public C15317l(int i) {
        this.loadAd = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC6924l.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC6924l)) {
            return false;
        }
        InterfaceC6924l interfaceC6924l = (InterfaceC6924l) obj;
        return this.loadAd == interfaceC6924l.tag() && EnumC16766l.f32775l.equals(interfaceC6924l.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.loadAd ^ 14552422) + (EnumC16766l.f32775l.hashCode() ^ 2041407134);
    }

    @Override // defpackage.InterfaceC6924l
    public final EnumC16766l intEncoding() {
        return EnumC16766l.f32775l;
    }

    @Override // defpackage.InterfaceC6924l
    public final int tag() {
        return this.loadAd;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.loadAd + "intEncoding=" + EnumC16766l.f32775l + ')';
    }
}
