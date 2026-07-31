package defpackage;

/* JADX INFO: renamed from: lؚۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7601l implements InterfaceC16996l {
    public final int loadAd;

    public C7601l(int i) {
        this.loadAd = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC16996l.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC16996l)) {
            return false;
        }
        InterfaceC16996l interfaceC16996l = (InterfaceC16996l) obj;
        return this.loadAd == interfaceC16996l.zza() && EnumC16612l.f32586l.equals(interfaceC16996l.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.loadAd ^ 14552422) + (EnumC16612l.f32586l.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.loadAd + "intEncoding=" + EnumC16612l.f32586l + ')';
    }

    @Override // defpackage.InterfaceC16996l
    public final int zza() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC16996l
    public final EnumC16612l zzb() {
        return EnumC16612l.f32586l;
    }
}
