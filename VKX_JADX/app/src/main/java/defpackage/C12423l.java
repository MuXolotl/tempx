package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lؘّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12423l extends CancellationException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24531l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12423l(String str, int i) {
        super(str);
        this.f24531l = i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f24531l) {
            case 1:
                setStackTrace(AbstractC10478l.yandex);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
