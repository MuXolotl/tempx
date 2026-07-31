package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًًۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7869l extends AbstractC10453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f16413l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7869l(String str, int i) {
        super(str);
        this.f16413l = i;
    }

    @Override // defpackage.AbstractC10453l
    public final InterfaceC2167l yandex(C7502l c7502l, List list) {
        int i = this.f16413l;
        C10910l c10910l = InterfaceC2167l.f4805l;
        switch (i) {
            case 0:
                return c10910l;
            case 1:
            case 2:
                return this;
            case 3:
                return new C14259l(Double.valueOf(0.0d));
            default:
                return c10910l;
        }
    }
}
