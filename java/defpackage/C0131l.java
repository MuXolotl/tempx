package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؑؗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0131l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6111l f1034l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1035l;

    public /* synthetic */ C0131l(C6111l c6111l, int i) {
        this.f1035l = i;
        this.f1034l = c6111l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1035l;
        C7635l c7635l = C7635l.yandex;
        C6111l c6111l = this.f1034l;
        switch (i) {
            case 0:
                c6111l.m4125private(new C9430l());
                break;
            case 1:
                new C17986l(c7635l, null).Signature(c6111l.isVip());
                break;
            case 2:
                C6111l.m1938l(c6111l, null, 1);
                break;
            case 3:
                c6111l.m4125private(new C17003l());
                break;
            default:
                new C17986l(c7635l, null).Signature(c6111l.isVip());
                break;
        }
        return Unit.INSTANCE;
    }
}
