package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙُُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6383l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4993l f13362l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13363l;

    public /* synthetic */ C6383l(C4993l c4993l, int i) {
        this.f13363l = i;
        this.f13362l = c4993l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f13363l;
        C4993l c4993l = this.f13362l;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null) {
                    c4993l.yandex(th);
                }
                break;
            case 1:
                if (th != null && !c4993l.admob()) {
                    c4993l.yandex(th);
                }
                break;
            default:
                if (th != null && !c4993l.remoteconfig()) {
                    c4993l.yandex(th);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
