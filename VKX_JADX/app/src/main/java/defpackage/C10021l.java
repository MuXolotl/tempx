package defpackage;

/* JADX INFO: renamed from: lَؑ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10021l extends Throwable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20415l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10021l(String str, int i) {
        super(str);
        this.f20415l = i;
    }

    private final synchronized Throwable crashlytics() {
        return this;
    }

    private final synchronized Throwable loadAd() {
        return this;
    }

    private final synchronized Throwable yandex() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f20415l) {
            case 0:
                yandex();
                return this;
            case 1:
                loadAd();
                return this;
            case 2:
                crashlytics();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
