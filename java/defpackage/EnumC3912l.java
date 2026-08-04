package defpackage;

/* JADX INFO: renamed from: lؖؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3912l implements InterfaceC15912l {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f8066l;

    EnumC3912l(int i) {
        this.f8066l = i;
    }

    @Override // defpackage.InterfaceC15912l
    public final int yandex() {
        return this.f8066l;
    }
}
