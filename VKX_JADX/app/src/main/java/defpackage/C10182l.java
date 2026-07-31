package defpackage;

/* JADX INFO: renamed from: lٌَ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10182l implements InterfaceC16073l {
    public final int loadAd;

    public C10182l(int i) {
        this.loadAd = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC16073l.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC16073l)) {
            return false;
        }
        InterfaceC16073l interfaceC16073l = (InterfaceC16073l) obj;
        return this.loadAd == interfaceC16073l.zza() && EnumC15592l.f30446l.equals(interfaceC16073l.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.loadAd ^ 14552422) + (EnumC15592l.f30446l.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.loadAd + "intEncoding=" + EnumC15592l.f30446l + ')';
    }

    @Override // defpackage.InterfaceC16073l
    public final int zza() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC16073l
    public final EnumC15592l zzb() {
        return EnumC15592l.f30446l;
    }
}
