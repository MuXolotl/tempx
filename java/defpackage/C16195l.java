package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16195l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ DialogC7656l f31690l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31691l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16195l(DialogC7656l dialogC7656l, int i) {
        super(1);
        this.f31691l = i;
        this.f31690l = dialogC7656l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f31691l;
        DialogC7656l dialogC7656l = this.f31690l;
        switch (i) {
            case 0:
                dialogC7656l.show();
                return new C9582l(2, dialogC7656l);
            default:
                if (dialogC7656l.f15787l.yandex) {
                    dialogC7656l.f15785l.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
