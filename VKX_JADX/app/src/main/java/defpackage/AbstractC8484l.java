package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lٌٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8484l extends CancellationException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17531l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC8484l(String str, int i) {
        super(str);
        this.f17531l = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f17531l) {
            case 0:
                setStackTrace(AbstractC17541l.yandex);
                break;
            case 1:
                setStackTrace(AbstractC9690l.yandex);
                break;
            default:
                setStackTrace(AbstractC13402l.yandex);
                break;
        }
        return this;
    }
}
