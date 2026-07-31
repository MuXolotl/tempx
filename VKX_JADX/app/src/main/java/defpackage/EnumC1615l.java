package defpackage;

/* JADX INFO: renamed from: lؓؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1615l implements InterfaceC15912l {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f3943l;

    EnumC1615l(int i) {
        this.f3943l = i;
    }

    @Override // defpackage.InterfaceC15912l
    public final int yandex() {
        return this.f3943l;
    }
}
