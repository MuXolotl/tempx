package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚٟؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7424l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3095l f15373l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15374l;

    public /* synthetic */ C7424l(C3095l c3095l, int i) {
        this.f15374l = i;
        this.f15373l = c3095l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15374l;
        C3095l c3095l = this.f15373l;
        switch (i) {
            case 0:
                AbstractC6873l.crashlytics(c3095l.amazon, new C8578l(28));
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(AbstractC8576l.yandex(((C10853l) c3095l.purchase.admob()).yandex.yandex, C14369l.INSTANCE));
            case 2:
                c3095l.amazon.yandex(new C10612l(3, C14369l.INSTANCE), new C16419l(7));
                return Unit.INSTANCE;
            case 3:
                c3095l.amazon.yandex(new C10612l(1, C14369l.INSTANCE), new C16419l(5));
                return Unit.INSTANCE;
            case 4:
                c3095l.amazon.yandex(new C10612l(2, C1598l.INSTANCE), new C16419l(6));
                return Unit.INSTANCE;
            case 5:
                AbstractC6873l.crashlytics(c3095l.amazon, new C8578l(22));
                return Unit.INSTANCE;
            default:
                AbstractC6873l.crashlytics(c3095l.amazon, new C8578l(23));
                return Unit.INSTANCE;
        }
    }
}
