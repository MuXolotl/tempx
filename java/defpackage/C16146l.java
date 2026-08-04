package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16146l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C3384l[] f31616l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16146l(C3384l[] c3384lArr, int i) {
        super(2);
        this.f31617l = i;
        this.f31616l = c3384lArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31617l;
        C3384l[] c3384lArr = this.f31616l;
        switch (i) {
            case 0:
                return Float.valueOf(AbstractC4047l.yandex((AbstractC9601l) obj, true, c3384lArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC4047l.yandex((AbstractC9601l) obj, false, c3384lArr, ((Number) obj2).floatValue()));
        }
    }
}
